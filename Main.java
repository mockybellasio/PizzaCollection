package com.piz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pizza pizzanew = new Pizza("BOLO","Bolognaise", 15);

		System.out.println(pizzanew);
		
			
		PizzaEmDao pizzaDao = new PizzaEmDao();
		
		System.out.println(pizzaDao);
		
		
		Pizza pizza = null;
		pizzaDao.deletePizza(pizza.getCode());
		
		System.out.println(pizzaDao.toString());
		
	}

	
	}

