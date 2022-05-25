package com.chegg.banking;

public class Item {
	//fields
	private String title;
	private String type;
	private String totalPlayingTime;

	
	//Getter methods
	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	public String getTotalPlayingTime() {
		return totalPlayingTime;
	}

	//Setter methods
	public void setTitle(String title) {
		this.title = title;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTotalPlayingTime(String totalPlayingTime) {
		this.totalPlayingTime = totalPlayingTime;
	}

	@Override
	public String toString() {
		return "title=" + title + "\ttype=" + type + "\ttotalPlayingTime=" + totalPlayingTime ;
	}
}
