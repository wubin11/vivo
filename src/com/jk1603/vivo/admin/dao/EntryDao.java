package com.jk1603.vivo.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.jk1603.vivo.admin.pojo.Entry;

public interface EntryDao {
	@Select("select entry.id,goods.goodsname,entry.goodsquantity,goods.price,entry.state,admin.id as adminid from entry,goods,admin where entry.adminid=admin.id and entry.goodsid=goods.id")
	List<Entry> get(Entry e);
}
