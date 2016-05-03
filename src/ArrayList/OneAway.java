package ArrayList;

import java.util.Scanner;

public class OneAway {
	public boolean edits(String a, String b){
		String s1,s2;
		int count=0;
		//Check if there is difference of only one edit
		if((Math.abs(a.length()-b.length())>1) )
				return false;	
		
		if(a.length()>b.length()){
			s1= a;
			s2=b;
		}
		else{
			s1 = b;
			s2 = a;
		}
		
		for (int i = 0;i<s1.length();i++ ){	
		if(	!s2.contains(String.valueOf(s1.charAt(i)))){
			count++;
		}
		if(count > 1){
		return false;
			}
		}
	return true;
	}
	
	public static void main(String args[]){
		OneAway oneaway = new OneAway();
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String b = input.next();
		if (oneaway.edits(a, b)){
			System.out.println("Strings "+ a+" "+b + " are 1 edit away");
		}
		else
			System.out.println("Strings "+ a+" "+b + " are not 1 edit away");
	}
}
