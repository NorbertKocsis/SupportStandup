package com.test.faces.model;

public class ListItems {
	
	private String itemId;
	private String name;
	
	
	
	public ListItems(String itemId, String name) {
		super();
		this.itemId = itemId;
		this.name = name;
	}
	
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
