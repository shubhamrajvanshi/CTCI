package ArrayList;

import java.util.Scanner;

public class PalindromePermutation {

	public boolean palindromepermutationstring(String s){
		int[] stringval= new int[Character.getNumericValue('z') - 
		                         	Character.getNumericValue('a')];
	    int oddcount = 0;
		char[] chars = s.toLowerCase().toCharArray();
		System.out.println(chars);
		
		for(char c:chars){
			int x = Character.getNumericValue(c);
			if(x!= -1){
			stringval[x-Character.getNumericValue('a')]++;
			}
			if (stringval[x-Character.getNumericValue('a')]%2 ==1){
				oddcount++;
			}
			else{
				oddcount--;
			}	
		}
		return oddcount <= 1;
	}
	
	public static void main(String args[]){
		PalindromePermutation p = new PalindromePermutation();
		
		Scanner input = new Scanner(System.in);
		boolean result;
		result=p.palindromepermutationstring(input.nextLine());
		if(result)
			System.out.println("String is permutation of a palindrome string");
		else
			System.out.println("String is not a permutation of a palindrome string");
	}
}
