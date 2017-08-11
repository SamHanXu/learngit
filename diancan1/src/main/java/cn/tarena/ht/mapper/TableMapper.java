package cn.tarena.ht.mapper;

import java.util.List;

import cn.tarena.ht.pojo.Table;

public interface TableMapper {
	public List<Table> findAll();

	public void saveTable(Table table);

	public Table findTableById(String id);

	public void updateTable(Table table);

	public void deleteTable(String[] ids);


}
