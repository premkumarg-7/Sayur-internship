/*
 * In your college Python is taught in 3 different departments by the same professor. 
For each dept, get the no of students studying Python and their marks in the final exam 
Get the input as comma seperated string

Find the top 3 marks in each class
Find the top 3 marks if all classes are combined.
Find the avg mark of students with passing mark in each class and the classes combined.
Find which class has the best average mark and least number of failed students.
 */
import java.util.Arrays;
import java.util.Scanner;

public class program5 {
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

	//find the best average class
	best_avg(deptA, deptB, deptC);
  }

  private static int[] getDeptMarks(String deptName) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of students in " + deptName + ":");
    int n = sc.nextInt();
    int[] marks = new int[n];

    System.out.println("Enter their marks separated by commas:");
    String input = sc.next(); // get the marks form user
    String[] values = input.split(","); //split the marks by , comma

    for (int i = 0; i < n; i++) {
      try {
        marks[i] = Integer.parseInt(values[i]); //typecasting the String values into marks integer
      } catch (Exception e) {
        System.out.println(e);
      }
    }

    System.out.println("----------------------------------------------------------");
    return marks;
  }
  
  //find the topmark in class method
  private static void topmarks(int[] array,String str) {
	  Arrays.sort(array); // sort the marks in ascendig order
	  int marks=array.length-1;
	  System.out.print("Dept of "+str+" Top marks :");
	  for(int i=0;i<3;i++) {
		  System.out.print(array[marks--]+", "); //print the last 3marks since it is a top marks of the class
	  }
	  System.out.println();
	  System.out.println("----------------------------------------------------------");
  }
  
  //find the top marks in total depts methods
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

  private static void best_avg(int[] array1,int[] array2,int[] array3){
	double ttlmark1=0;
	double ttlmark2=0;
	double ttlmark3=0;

	 for (int i : array1) {
		ttlmark1+=i;
	 }
	 for (int i : array2) {
		ttlmark2+=i;
	 }
	 for (int i : array3) {
		ttlmark3+=i;
	 }

	 double avg1=ttlmark1/array1.length;
	 double avg2=ttlmark2/array2.length;
	 double avg3=ttlmark3/array3.length;

	 if((avg1 > avg2) && (avg1 > avg3)){
		System.out.println("Best average mark class is Dept A");
	 }else if ((avg2 >avg1)&& (avg2>avg3)) {
		System.out.println("Best average mark class is Dept B");
	 }else if ((avg3 > avg1) && (avg3 > avg2)) {
		System.out.println("Best average mark class is Dept C");
	 }

	  System.out.println("----------------------------------------------------------");
  }
  
}

/*Output:
Enter the number of students in A:
5
Enter their marks separated by commas:
70,56,78,59,80
----------------------------------------------------------
Enter the number of students in B:
5
Enter their marks separated by commas:
90,78,88,90,77
----------------------------------------------------------
Enter the number of students in C:
5
Enter their marks separated by commas:
44,76,88,49,99
----------------------------------------------------------
Dept of A Top marks :80, 78, 70, 
----------------------------------------------------------
Dept of B Top marks :90, 90, 88,
----------------------------------------------------------
Dept of C Top marks :99, 88, 76,
----------------------------------------------------------
Total class Top marks :80, 90, 99
----------------------------------------------------------
Average mark of the dept A:68 Passing marks :343
----------------------------------------------------------
Average mark of the dept B:84 Passing marks :423
----------------------------------------------------------
Average mark of the dept C:71 Passing marks :356
----------------------------------------------------------
Average of Total dept Students :74
----------------------------------------------------------
Best average mark class is Dept B
----------------------------------------------------------
*/
