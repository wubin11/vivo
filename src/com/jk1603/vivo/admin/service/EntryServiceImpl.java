package com.jk1603.vivo.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk1603.vivo.admin.dao.EntryDao;
import com.jk1603.vivo.admin.pojo.Entry;

@Service
public class EntryServiceImpl implements EntryService {

	@Autowired
	EntryDao entryDao;
	
	@Override
	public List<Entry> get(Entry e) {
		List<Entry> result = entryDao.get(e);
		return result;
	}
	
}
