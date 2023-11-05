public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("Hello World");

    String[] names = new String[]
    {
    "A", "B", "C", "D"};
    int[] CS_mark = new int[]{ 40, 98, 91, 90 };
    int[] English_mark = new int[]{ 60, 94, 81, 28 };
    int[] Math_mark = new int[]{ 77, 91, 84, 23 };
    int passmark = 50;
    int GradeA = 90;
    int GradeB = 80;

    int n = names.length;
    for (int i = 0; i < n; i++)
      {
	if ((CS_mark[i] > GradeA && English_mark[i] > GradeA
	     && Math_mark[i] > GradeA) || (CS_mark[i] > GradeA
					     && English_mark[i] > GradeB
					     && Math_mark[i] > GradeB)
	    || (CS_mark[i] > GradeB && English_mark[i] > GradeA
		&& Math_mark[i] > GradeB) || (CS_mark[i] > GradeB
						&& English_mark[i] > GradeB
						&& Math_mark[i] > GradeA))
	  {
	    System.out.println (names[i]);
	  }
      }
  }
}
/*Output:
B C
*/
