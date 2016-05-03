package ArrayList;

import java.util.Scanner;

public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Take a string and see if it has all unique characters without using any other datastructure 
		int count=0;
		Scanner input = new Scanner(System.in);
		String instring = input.next();
		System.out.println("String length is "+ instring.length());
		//Convert it to char array
		int x = instring.charAt(1);
		System.out.println(x);
		char chars[] = instring.toCharArray();
		// Compare each char to other excluding the one that has been checked already
outer:	for(int i=0;i<chars.length;i++){
			for(int j=i+1;j<chars.length;j++){
				if (chars[i]==chars[j]){
					System.out.println("String "+ instring +" does not has unique characters");
					count++;
					break outer;
				}
			}
			
		}
		if(count<1)
			System.out.println("String "+ instring +" has unique characters");
		}
		
	}


