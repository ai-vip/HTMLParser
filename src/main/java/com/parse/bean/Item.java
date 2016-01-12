package com.parse.bean;

import java.util.List;

public class Item extends ListItemInfo {
	private String phoneNumber;
	private String alias;
	private String openingHours;
	private List<Tag> tags;
	private List<Comment> comments;
	public static void main(String[] args){
		ListItemInfo listItem=new Item();
		Item item =(Item) listItem;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Item [phoneNumber=" + phoneNumber + "]"+super.toString();
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getAlias() {
		return alias;
	}



	public void setAlias(String alias) {
		this.alias = alias;
	}



	public String getOpeningHours() {
		return openingHours;
	}



	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}



	public List<Tag> getTags() {
		return tags;
	}



	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}



	public List<Comment> getComments() {
		return comments;
	}



	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	 
}
