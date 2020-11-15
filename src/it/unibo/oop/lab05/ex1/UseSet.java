package it.unibo.oop.lab05.ex1;

import java.util.*;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

	private static final int ELEMS = 20;

	private UseSet() {
	}

	/**
	 * @param args ignored
	 */
	public static void main(final String[] args) {

		Set<String> prova = new TreeSet<>();
		for (int i = 1; i <= ELEMS; i++) {
			prova.add(Integer.toString(i));
		}
		System.out.println(prova);

		Set<String> divisibili = new TreeSet<>();

		for (String i : prova) {
			if (Integer.parseInt(i) % 3 == 0) {
				divisibili.add(i);
			}
		}
		prova.removeAll(divisibili);
		/*
		 * Iterator<String> iter = prova.iterator(); while(iter.hasNext()) {
		 * if(Integer.parseInt(iter.next()) % 3 == 0){ iter.remove(); } }/
		 **/

		for (String i : prova) {
			System.out.print(i + " ");
		}

		/*
		 * Considering the content of "UseCollection, write a program which, in order:
		 * 
		 * 1) Builds a TreeSet containing Strings
		 * 
		 * 2) Populates such Collection with all the Strings ranging from "1" to "20"
		 * 
		 * 3) Prints its content
		 * 
		 * 4) Removes all those strings whose represented number is divisible by three
		 * 
		 * 5) Prints the content of the Set using a for-each costruct
		 * 
		 * 6) Verifies if all the numbers left in the set are even
		 */

	}
}
