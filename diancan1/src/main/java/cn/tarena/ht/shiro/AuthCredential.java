package cn.tarena.ht.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

import cn.tarena.ht.tool.Md5HashPassword;

public class AuthCredential extends  SimpleCredentialsMatcher{

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		UsernamePasswordToken loginToken = (UsernamePasswordToken) token;
		String password = String.valueOf(loginToken.getPassword());
		String username = loginToken.getUsername();
		password = Md5HashPassword.getMd5Hash(password, username);
		loginToken.setPassword(password.toCharArray());
		return super.doCredentialsMatch(loginToken, info);
	}
	
	

}
