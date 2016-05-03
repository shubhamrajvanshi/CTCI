package ArrayList;
import java.util.ArrayList; 
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet; 
import java.util.List; 
import java.util.Set; 

/** * Java Program to remove repeated elements from ArrayList in Java. * 
* @author WINDOWS 8 */ 

public class ArrayListDuplicateDemo{ 
	public static void main(String args[]){ // creating ArrayList with duplicate elements 
		List<Integer> primes = new ArrayList<Integer>();
		List<Integer> primes2 = new ArrayList<Integer>();
		primes.add(2); primes.add(3); primes.add(5); primes.add(7); 
		//duplicate 
		primes.add(7); 
		primes.add(11); 
		primes.add(23);
		primes.add(11);
		primes.add(13);
		// let's print arraylist with duplicate 
		System.out.println("list of prime numbers : " + primes); 
		
		// Now let's remove duplicate element without affecting order 
		// LinkedHashSet will guaranteed the order and since it's set 
		// it will not allow us to insert duplicates. 
		// repeated elements will automatically filtered. 
		
		Set<Integer> primewithduplicates = new HashSet<Integer>(primes);
		primes2.addAll(primewithduplicates);
		System.out.println("List of primes using HashSet "+primes2);
		
		Set<Integer> primesWithoutDuplicates = new LinkedHashSet<Integer>(primes); 
		
		// now let's clear the ArrayList so that we can copy all elements from LinkedHashSet 
		primes.clear(); 
		
		// copying elements but without any duplicates 
		primes.addAll(primesWithoutDuplicates); 
		System.out.println("list of primes without duplicates using LinkedHashSet: " + primes); 
		
		Collections.reverse(primes);
		System.out.println("list of primes without duplicates after 1st reverse: " + primes);
		Collections.reverse(primes);
		System.out.println("list of primes without duplicates after 2nd: " + primes);
		} 
	}
	

