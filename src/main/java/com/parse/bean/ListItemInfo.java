package com.parse.bean;

public class ListItemInfo {
	private int id;
	private String imageUrl;
	private String title;
	private String itemUrl;
	private String star;
	private String commentCount;
	private String avgPrice;
	private String type;
	private String area;
	private String detailedAddress;
	private String flavorScore;
	private String envirmentScore;
	private String serviceScore;
	
	@Override
	public String toString() {
		return "\nListItemInfo [imageUrl=" + imageUrl + ", title=" + title + ", itemUrl=" + itemUrl + ", star=" + star
				+ ", commentCount=" + commentCount + ", avgPrice=" + avgPrice + ", type=" + type + ", area=" + area
				+ ", detailedAddress=" + detailedAddress + ", flavorScore=" + flavorScore + ", envirmentScore="
				+ envirmentScore + ", serviceScore=" + serviceScore + "]\n";
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getItemUrl() {
		return itemUrl;
	}
	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public String getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(String commentCount) {
		this.commentCount = commentCount;
	}
	public String getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDetailedAddress() {
		return detailedAddress;
	}
	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}
	public String getFlavorScore() {
		return flavorScore;
	}
	public void setFlavorScore(String flavorScore) {
		this.flavorScore = flavorScore;
	}
	public String getEnvirmentScore() {
		return envirmentScore;
	}
	public void setEnvirmentScore(String envirmentScore) {
		this.envirmentScore = envirmentScore;
	}
	public String getServiceScore() {
		return serviceScore;
	}
	public void setServiceScore(String serviceScore) {
		this.serviceScore = serviceScore;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
