/*
 *  In the input, find the first A and last A, print all the letters between these two A. 
  If there is no A or 2nd A is not found, find the first B  and last B and print all the letters between these two B. 
  If there is no B or 2nd B is not found, find the first C and last C and print all the letters between these two C. 
 */
public class A_function2 { 
		public static void main(String[] args) {
		String s="A blind man walking on the road. An ant is ready to bite a man. The site is the safest one of the most visited site ";
		String[] arr=s.split(" ");
		String result="";
			
		if(!find_word(arr,"a").isEmpty()) {
			result=find_word(arr,"a");
			System.out.println("A between passage :"+result);
		}else if(!find_word(arr,"B").isEmpty()) {
			result=find_word(arr,"B");
			System.out.println("B between passage :"+result);
		}else if(!find_word(arr,"c").isEmpty()) {
			result=find_word(arr,"c");
			System.out.println("C between passage :"+result);
		}

	}
	private static String find_word(String[] arr, String letter) {
		String Aword="";
		String res="";
		int flag=0;
		for(String str:arr) {
			if(str.equalsIgnoreCase(letter)) {
				if(flag==1) {
					flag=0;
					res=Aword;
				}else{ 
					flag=1;
				}
			}
			if(flag==1) {
				Aword+=str+" ";
			}
		}
		return res;
	}

}
/*
 * Output-
 * A between passage :A blind man walking on the road. An ant is ready to bite 
 */
