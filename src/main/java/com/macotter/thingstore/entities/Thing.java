package com.macotter.thingstore.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "THING")
public class Thing {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "THING_ID")
	Integer thingId;

	@Column(name = "TITLE")
	String title;

	@Column(name = "CREATE_DATE")
	Date createDate;

	public Integer getThingId() {
		return thingId;
	}

	public void setThingId(Integer thingId) {
		this.thingId = thingId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
