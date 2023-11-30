import java.util.Arrays;
import java.util.*;
public class Pattern
{
	public static void main(String[] args) {
		
		int num =1;
		List<Integer> arr1=new ArrayList<>();
		List<Integer> arr2=new ArrayList<>();
		
		arr1.add(num);
	
		for(int i=0;i<5;i++){
		    
		    for(int a=5;a>i;a--){
		        System.out.print(" ");
		    }
		    if(i==0){
		        System.out.println(num);
		        continue;
		    }
		    if(i==1){
		        arr1.add(num);
		        for(int j=0;j<arr1.size();j++){
		            System.out.print(arr1.get(j)+" ");
		        }
		        System.out.println();
		       continue;
		    }
		   
		    for(int j=0;j<arr1.size()-1;j++){
		        arr2.add(arr1.get(j)+arr1.get(j+1));
		    }
      
		     System.out.print(num+" ");
		     for(int k=0;k<arr2.size();k++){
		         System.out.print(arr2.get(k)+" ");
		     }
		     System.out.println(num+" ");
      
		    arr1.clear();
		    arr1.add(num);
		    arr1.addAll(arr2);
		    arr1.add(num);
		    arr2.clear();
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
