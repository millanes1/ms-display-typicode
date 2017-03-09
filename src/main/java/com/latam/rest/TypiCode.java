package com.example.demo.rest;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "REST_DB_TYPICODE")
@NamedQueries({ @NamedQuery(name = "TypiCode.findAll", query = "SELECT type FROM TypiCode type") })
@XmlRootElement
public class TypiCode implements Serializable {
	private static final long serialVersionUID = 1L;

	public TypiCode() {
	}

	private int userId;
	@Id
	private int id;

	private String title;

	private boolean completed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;

	}

	public boolean getCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}