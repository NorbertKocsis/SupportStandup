package com.test.faces.beans;

import com.test.faces.model.ListItems;

import java.util.ArrayList;

public class FacesTestBean {
	private ArrayList<ListItems> items;
	private String text;
	
	
	public FacesTestBean() {
		this.text = "FacesTest Text";
		this.items = new ArrayList<ListItems>();
		this.items.add(new ListItems("id1", "name1"));
		this.items.add(new ListItems("id2", "name2"));
		this.items.add(new ListItems("id3", "name3"));
		this.items.add(new ListItems("id4", "igyot"));
		this.items.add(new ListItems("id3", "piac"));
	}

	public ArrayList<ListItems> getItems() {
		return items;
	}

	public void setItems(ArrayList<ListItems> items) {
		this.items = items;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}
