package cn.tarena.ht.service;

import java.util.List;

import cn.tarena.ht.pojo.Dept;

public interface DeptService {
	public List<Dept> findAll();

	public void deleteDepts(String[] deptId);

	public void updateState(String[] deptId, int state);

	public List<Dept> findParentList();

	public void saveDept(Dept dept);

	public Dept findDeptById(String deptId);

	public void updateDept(Dept dept);

	public List<Dept> findParentListById(String deptId);

}
