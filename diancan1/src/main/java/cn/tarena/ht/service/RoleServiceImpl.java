package cn.tarena.ht.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tarena.ht.mapper.RoleMapper;
import cn.tarena.ht.pojo.Role;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public List<Role> findAll() {
		
		return roleMapper.findAll();
	}

	@Override
	public void saveRole(Role role) {
		String roleId = UUID.randomUUID().toString();
		role.setRoleId(roleId);
		role.setCreateTime(new Date());
		roleMapper.saveRole(role);
		
	}

	@Override
	public List<String> findRoleIdByUserId(String userId) {
		return roleMapper.findRoleIdByUserId(userId);
	}

	@Override
	public List<String> findRoleModuleList(String roleId) {
		return roleMapper.findRoleModuleList(roleId);
	}

	@Override
	public void savaRoleModule(String roleId, String[] moduleIds) {
		roleMapper.deleteRoleModule(roleId);
		for(String moduleId:moduleIds){
			roleMapper.saveRoleModule(roleId,moduleId);
		}
	}

	@Override
	public Role findRoleById(String roleId) {
		return roleMapper.findRoleById(roleId);
	}

	@Override
	public void updateRole(Role role) {
		role.setUpdateTime(new Date());
		roleMapper.updateRole(role);
		
	}

	@Override
	public void deleteRole(String[] roleIds) {
		roleMapper.deleteRolesModule(roleIds);
		roleMapper.deleteRole(roleIds);
		
	}

}
