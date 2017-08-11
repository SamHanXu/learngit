package cn.tarena.ht.tool;

import org.apache.shiro.crypto.hash.Md5Hash;

import com.google.common.annotations.VisibleForTesting;

public class Md5HashPassword {
	
	public static String getMd5Hash(String password,String username){
		return new Md5Hash(password,username,3).toString();
	}
	
	
	

}
