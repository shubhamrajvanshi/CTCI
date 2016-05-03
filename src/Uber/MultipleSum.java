package Uber;

/*
Finding the sum of multiples of X and Y

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Challenge: 
Find the sum of all the multiples of X or Y below a certain number.

Examples: 
sum_all_multiples([3,5], 10) = 23
*/

public class MultipleSum{
    
    public int sum_all_multiples(int arr[], int max){
     int sum =0;
    
     int a[] = arr;
     
     int length = a.length;
     for(int i=0; i< length;i++){
        sum = sum + multiplesum(a[i],max);
     }
     return sum;
    }
    
    private int multiplesum(int x, int y){
        int sum = 0;
        for(int i=0; i< y/2;i++){
            if((x*i)<y){
                sum=sum+(x*i);
            }
            
        }   
        return sum;
    }
    
    public static void main (String args[]){
        int test[] = {3,7,11};
        int max = 15;
        int finalsum=0;
        MultipleSum mul = new MultipleSum ();
        finalsum=mul.sum_all_multiples(test,max);
        System.out.println("The sum is "+ finalsum);
    }
    
}


