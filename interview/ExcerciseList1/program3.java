/*
 * You have a list of student names. you have one list each for their marks in CS, Math and English. 
hard code the values. no need to get it as input
Pass mark is 50.
Grade A is, mark 90 or above
Grade B is 80 or above
Fail is < 50
Print the name of the students who got A in all subjects or atleast one A and the rest B.
Try to use only one if statement.
 */
public class program3
{
  public static void main (String[]args)
  {

    String[] names = new String[]
    {"Aravind", "Bala", "Chandru", "Daniel"}; //initailize students names
    int[] CS_mark = new int[]{ 40, 98, 91, 90 }; // cs marks
    int[] English_mark = new int[]{ 60, 94, 80, 28 }; // English marks
    int[] Math_mark = new int[]{ 77, 91, 84, 23 }; // Maths marks
    int passmark = 50; 
    int GradeA = 90; 
    int GradeB = 80;
    int n = names.length; // length of the list names

    for (int i = 0; i < n; i++) // check until end of the names
      {
	if ((CS_mark[i] >= GradeA && English_mark[i] >= GradeA && Math_mark[i] >= GradeA) || // Got the A grade in all subjects
  (CS_mark[i] >= GradeA && English_mark[i] >= GradeB && Math_mark[i] >= GradeB)  || //Got the A grade in cs and the rest of B
  (CS_mark[i] >= GradeB && English_mark[i] >= GradeA && Math_mark[i] >= GradeB) || //Got the A grade in English and the rest of B
  (CS_mark[i] >= GradeB && English_mark[i] >= GradeB && Math_mark[i] >= GradeA)) //Got the A grade in Maths and the rest of B
	  {
	    System.out.println (names[i]); // student who met the above requirement print their names
	  }
      }
  }
}
/*Output:
Bala
Chandru
*/
