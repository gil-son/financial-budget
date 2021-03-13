package model;

import java.util.Date;

public class JavaBeans {
	private int id_budget;
	private String description;
	private String category;
	private String value;
	private String status;
	private Date date;
	
	
	
	public JavaBeans() {
		super();
		// TODO Auto-generated constructor stub
	}


	public JavaBeans(int id_budget, String description, String category, String value, String status, Date date) {
		super();
		this.id_budget = id_budget;
		this.description = description;
		this.category = category;
		this.value = value;
		this.status = status;
		this.date = date;
	}
	
	
	public int getId_budget() {
		return id_budget;
	}
	public void setId_budget(int id_budget) {
		this.id_budget = id_budget;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
