package com.piz;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	
	
	
	List<Pizza> listPizza = new ArrayList <Pizza>();
	
	@Override
	public String toString() {
		return "Pizza [code=" + code + ", designation=" + designation + ", Prix=" + Prix + ", listPizza=" + listPizza
				+ "]";
	}

	String code;
	String designation;
	float Prix;
	
			
		
	public Pizza(String code, String designation, float prix) {
		super();
		this.code = code;
		this.designation = designation;
		Prix = prix;
	}
	
	
	public void affiche(Pizza[] tabPizza)
	{
		System.out.println(tabPizza);
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public float getPrix() {
		return Prix;
	}


	public void setPrix(float prix) {
		Prix = prix;
	}


	public void remove(Object codePizza) {
		// TODO Auto-generated method stub
		
	}
	


}
