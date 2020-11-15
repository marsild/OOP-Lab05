package it.unibo.oop.lab05.ex3;

import java.util.*;

public class WarehouseImpl implements Warehouse {
	
	Set<Product> allProducts;

	public WarehouseImpl() {
		this.allProducts = new LinkedHashSet<>();;
	}

	public void addProduct(Product p) {
		
		allProducts.add(p);
		
	}

	public Set<String> allNames() {
		Set<String> returnSet = new TreeSet<>();
		for(Product p : allProducts) {
			returnSet.add(p.getName());
		}
		return returnSet;
	}

	public Set<Product> allProducts() {
		return new LinkedHashSet<>(allProducts);
	}

	public boolean containsProduct(Product p) {
		for(Product pe : allProducts) {
			if(pe.equals(p)) {
				return true;
			}
		}
		return false;
	}

	public double getQuantity(String name) {
		for(Product pe : allProducts) {
			if(pe.getName()==name) {
				return pe.getQuantity();
			}
		}
		return -1;
	}

}
