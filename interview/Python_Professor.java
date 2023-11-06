package sayur_tech;

import java.util.Arrays;
import java.util.Scanner;

public class Python_Professor {
  public static void main(String[] args) {
	  //get inputs marks in each department
    int[] deptA = getDeptMarks("A");
    int[] deptB = getDeptMarks("B");
    int[] deptC = getDeptMarks("C");
    
    //find top marks each class
    topmarks(deptA,"A");
    topmarks(deptB,"B");
    topmarks(deptC,"C");
    
    //find top marks whole class
    wholeTop(deptA, deptB, deptC);
    
    //find the average marks each class
    avgMarks(deptA,"A");
    avgMarks(deptB, "B");
    avgMarks(deptC, "C");
    
    //find the average marks in whole class
    whole_avg(deptA, deptB, deptC);
  }

  private static int[] getDeptMarks(String deptName) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of students in " + deptName + ":");
    int n = sc.nextInt();
    int[] marks = new int[n];

    System.out.println("Enter their marks separated by commas:");
    String input = sc.next();
    String[] values = input.split(",");

    for (int i = 0; i < n; i++) {
      try {
        marks[i] = Integer.parseInt(values[i]);
      } catch (Exception e) {
        System.out.println(e);
      }
    }

    System.out.println("----------------------------------------------------------");
    return marks;
  }
  
  private static void topmarks(int[] array,String str) {
	  Arrays.sort(array);
	  int marks=array.length-1;
	  System.out.print("Dept of "+str+" Top marks :");
	  for(int i=0;i<3;i++) {
		  System.out.print(array[marks--]+", ");
	  }
	  System.out.println();
	  System.out.println("----------------------------------------------------------");
  }
  
  private static void wholeTop(int[] arr1,int[] arr2, int[] arr3) {
	  
	  int max1=Integer.MIN_VALUE;
	  for(int i=0;i<arr1.length;i++) {
		  if(arr1[i]>max1) {
			  max1=arr1[i];
		  }
	  }
	  System.out.print("Total class Top marks :"+max1+", ");
	  
	  int max2=Integer.MIN_VALUE;
	  for(int i=0;i<arr2.length;i++) {
		  if(arr2[i]>max2) {
			  max2=arr2[i];
		  }
	  }
	  System.out.print(max2+", ");
	  
	  int max3=Integer.MIN_VALUE;
	  for(int i=0;i<arr3.length;i++) {
		  if(arr3[i]>max3) {
			  max3=arr3[i];
		  }
	  }
	  System.out.println(max3);
	  
	  System.out.println("----------------------------------------------------------");
  }
  
  private static void avgMarks(int[] arr,String s) {
	  int val=0;
	  int avg=0;
	  for(int i=0;i<arr.length;i++) {
		  val+=arr[i];
	  }
	  avg=val/arr.length;
	  System.out.println("Average mark of the dept "+s+":"+avg +" Passing marks :"+val);
	  System.out.println("----------------------------------------------------------");
  }
  
  private static void whole_avg(int[] arr1,int[] arr2,int[] arr3) {
	  int n=arr1.length+arr2.length+arr3.length;
	  int marks=0;
	  int avg;
	for (int i : arr1) {
		marks+=i;
	}
	for (int i : arr2) {
		marks+=i;
	}
	for (int i : arr3) {
		marks+=i;
	}
	avg=marks/n;
	
	System.out.println("Average of Total dept Students :"+avg);
	
	 System.out.println("----------------------------------------------------------");
  }
  
}

/*Output:
Enter the number of students in A:
10
Enter their marks separated by commas:
98,87,77,76,65,54,34,21,54,77
----------------------------------------------------------
Enter the number of students in B:
8
Enter their marks separated by commas:
76,88,55,23,28,52,90,33
----------------------------------------------------------
Enter the number of students in C:
9
Enter their marks separated by commas:
23,77,90,97,26,71,70,50,43
----------------------------------------------------------
Dept of A Top marks :98, 87, 77, 
----------------------------------------------------------
Dept of B Top marks :90, 88, 76, 
----------------------------------------------------------
Dept of C Top marks :97, 90, 77, 
----------------------------------------------------------
Total class Top marks :98, 90, 97
----------------------------------------------------------
Average mark of the dept A:64 Passing marks :643
----------------------------------------------------------
Average mark of the dept B:55 Passing marks :445
----------------------------------------------------------
Average mark of the dept C:60 Passing marks :547
----------------------------------------------------------
Average of Total dept Students :60
----------------------------------------------------------
*/
