package com.piz;

import java.util.ArrayList;

import java.util.List;

public class PizzaEmDao  implements IpizzaDAo{

	
		
		
		
		private static final List<Pizza> listPizza = null;
		public List<Pizza> listePizza = null;

		
		public PizzaEmDao() {
			
			super();
			
			List<Pizza> listePizza = new ArrayList <Pizza>();
			
			Pizza pizza = new Pizza("MAR", "MARGARITA", 10.5f);
			listePizza.add(pizza);
			
			Pizza pizza2 = new Pizza("FRO", "4FROMAGES", 12.5f);
			listePizza.add(pizza2);
			
			Pizza pizza3 = new Pizza("VEG", "VEGETARIENNE", 14.5f);
			listePizza.add(pizza3);
		
	}
	
		@Override
		public List<Pizza> findAllPizzas() {
			
		
			
			
			return listePizza;
			
			
			
			
		}
		
	@Override
	public void saveNewPizza(Pizza pizza) {
		
		Pizza pizzanew = new Pizza("BOLO","Bolognaise", 15);

		System.out.println(pizzanew);
	
		 listPizza.add(pizza);
		
	}

	
	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		
    Pizza pizzaOld = findPizzaByCode(codePizza);
		
		if (pizzaOld != null)
		{
			
			
			listPizza.remove(pizzaOld);
			listPizza.add(pizza);
		}
		
	}

	@Override
	public void deletePizza(String codePizza) {
		
      Pizza pizza = findPizzaByCode(codePizza);
		
		if (pizza != null)
		{
			listPizza.remove(pizza);
		}  
		
	}

	
	

	public PizzaEmDao(List<Pizza> listePizza) {
		super();
		this.listePizza = listePizza;
	}

	
	

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		
		  listePizza = null;
		    
		for(int i = 0; i<listePizza.size(); i++)
			
		{
			Pizza user1 = (Pizza) listePizza.get(i);
			
			System.out.println(user1);
		}
		
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		
       Pizza pizza = findPizzaByCode(codePizza);
		
		if (pizza != null) {
			
		return true;
		
		}
		
	
		return false;
		
		
		
	}

	@Override
	public String toString() {
		
		String result = new String();
		
		for (Pizza pizza : listPizza) {
			result += pizza.toString() + "\r\n";
		}
		
		return result + "\r\n" + "\r\n";
	}
	
}
