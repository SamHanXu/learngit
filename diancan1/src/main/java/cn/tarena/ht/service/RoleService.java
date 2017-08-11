package cn.tarena.ht.service;

import java.util.List;

import cn.tarena.ht.pojo.Role;

public interface RoleService {
	
	public List<Role> findAll();

	public void saveRole(Role role);

	public List<String> findRoleIdByUserId(String userId);

	public List<String> findRoleModuleList(String roleId);

	public void savaRoleModule(String roleId, String[] moduleIds);

	public Role findRoleById(String roleId);

	public void updateRole(Role role);

	public void deleteRole(String[] roleIds);

}
