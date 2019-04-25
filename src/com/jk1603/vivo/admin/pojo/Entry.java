package com.jk1603.vivo.admin.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Entry {
	private int Id;
	private Goods goods;
	private int goodsQuantity;
//	private BigDecimal goodsPrice;
//	private Date entryTime;
	private Admin admin;
	private String state;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public int getGoodsQuantity() {
		return goodsQuantity;
	}
	public void setGoodsQuantity(int goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}
//	public BigDecimal getGoodsPrice() {
//		return goodsPrice;
//	}
//	public void setGoodsPrice(BigDecimal goodsPrice) {
//		this.goodsPrice = goodsPrice;
//	}
//	public Date getEntryTime() {
//		return entryTime;
//	}
//	public void setEntryTime(Date entryTime) {
//		this.entryTime = entryTime;
//	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
