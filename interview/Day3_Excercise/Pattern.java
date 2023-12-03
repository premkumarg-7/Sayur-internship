package Day3_Excercise;
/*
 * Print the following pattern
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1

Observe how the nunmbers in the triangle are calculated. 
Do it in two steps. Work on the generating the numbers first in right angle triangle
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1

 */


import java.util.*;
public class Pattern
{
	public static void main(String[] args) {
		
		int num =1;
		int n=5;
		ArrayList<Integer> arr1=new ArrayList<>();
		ArrayList<Integer> arr2=new ArrayList<>();
		arr1.add(num);
		for(int i=0;i<n;i++){ //initialize forloop for rows
		    for(int a=n;a>i;a--){		//initialize this loop for spaces
		        System.out.print(" ");
		    }
		    if(i==0){	//if it is a first num print the number and continue to another one
		        System.out.println(num);
		        continue;
		    }
		    if(i==1){ //if it is second num add a value to arr1
		        arr1.add(num);
		        for(Integer  val:arr1) {	//print the values from arr1
		        	System.out.print(val+" ");
		        }
		        System.out.println();
		       continue; //using jump statement no need to execute below codes
		    }
		    for(int j=0;j<arr1.size()-1;j++){ 
		        arr2.add(arr1.get(j)+arr1.get(j+1)); //add the values into arr2[j]=(arr1[j]+arr1[j+1])
		    }
		     System.out.print(num+" ");
		     for(Integer val:arr2) {
		    	 System.out.print(val+" ");
		     }
		     System.out.println(num+" ");
      
		    arr1.clear(); //clear the values in arr1
		    arr1.add(num); //add the num in arr1
		    arr1.addAll(arr2); //add total values from arr2 to arr1
		    arr1.add(num); //add num in arr1
		    arr2.clear(); //clear the total value in arr2
		}
	}
}

/*Output-
     1
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
*/
