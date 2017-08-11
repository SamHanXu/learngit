package cn.tarena.ht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tarena.ht.mapper.TableMapper;
import cn.tarena.ht.pojo.Table;

@Service
public class TableServiceImpl implements TableService {
	@Autowired
	private TableMapper tableMapper;

	@Override
	public List<Table> findAll() {
		return tableMapper.findAll();
	}

	@Override
	public void saveTable(Table table) {
		tableMapper.saveTable(table);
		
	}

	@Override
	public Table findTableById(String id) {
		return tableMapper.findTableById(id);
		
	}

	@Override
	public void updateTable(Table table) {
		tableMapper.updateTable(table);
		
	}

	@Override
	public void deleteTable(String[] ids) {
		tableMapper.deleteTable(ids);
		
	}



}
