package model;

import java.util.Date;

public class JavaBeans {
	private String id_budget;
	private String description;
	private String category;
	private String value;
	private String status;
	private String date;
	
	
	
	public JavaBeans() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	


	public JavaBeans(String id_budget, String description, String category, String value, String status, String date) {
		super();
		this.id_budget = id_budget;
		this.description = description;
		this.category = category;
		this.value = value;
		this.status = status;
		this.date = date;
	}





	public String getId_budget() {
		return id_budget;
	}



	public void setId_budget(String id_budget) {
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



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}


	
	
	
	
}
