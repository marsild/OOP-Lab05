package it.unibo.oop.lab05.ex3;

import java.util.*;

public class WarehouseImpl implements Warehouse {
	
	Set<Product> allProducts;

	public WarehouseImpl() {
		this.allProducts = new HashSet<>();;
	}

	public void addProduct(Product p) {
		
		this.allProducts.add(p);
		
	}

	public Set<String> allNames() {
		Set<String> returnSet = new HashSet<>();
		for(Product p : this.allProducts) {
			returnSet.add(p.getName());
		}
		return returnSet;
	}

	public Set<Product> allProducts() {
		return new HashSet<>(this.allProducts);
	}

	public boolean containsProduct(Product p) {
		/*for(Product pe : allProducts) {
			if(pe.equals(p)) {
				return true;
			}
		}
		return false;*/
		return this.allProducts.contains(p);
	}

	public double getQuantity(String name) {
		for(Product pe : this.allProducts) {
			if(pe.getName().equals(name)) {
				return pe.getQuantity();
			}
		}
		return -1;
	}

}
