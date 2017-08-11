package cn.tarena.ht.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tarena.ht.pojo.Dept;

public interface DeptMapper {
	/**
	 * 部门列表的查询
	 * @return
	 */
	public List<Dept> findAll();

	public void deleteDepts(String[] deptId);

	public void updateState(@Param("deptIds")String[] deptId, @Param("state")int state);

	public List<Dept> findParentList();

	public void saveDept(Dept dept);

	public Dept findDeptById(String deptId);

	public void updateDept(Dept dept);

	public List<Dept> findParentListById(String deptId); 

}
