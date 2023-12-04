/*
 *  In the input, find the first A and last A, print all the letters between these two A. 
  If there is no A or 2nd A is not found, find the first B  and last B and print all the letters between these two B. 
  If there is no B or 2nd B is not found, find the first C and last C and print all the letters between these two C. 
 */
public class A_function2 { 
	public static void main(String[] args) {
		String s="A blind man walking on the road. An ant is ready to bite a man. A site is the safest one of the most visited site ";
		String[] arr=s.split(" ");
		String result="";
		if(!find_Aword(arr).isEmpty()) {
			result=find_Aword(arr);
			System.out.println("A between passage :"+result);
		}else if(!find_Bwords(arr).isEmpty()) {
			result=find_Bwords(arr);
			System.out.println("B between passage :"+result);
		}else if(!find_Cwords(arr).isEmpty()) {
			result=find_Cwords(arr);
			System.out.println("C between passage :"+result);
		}
	}
	private static String find_Aword(String[] arr) {
		String Aword="";
		String res="";
		int flag=0;
		for(String str:arr) {
			if(str.equalsIgnoreCase("a")) {
				if(flag==1) {
					flag=0;
					res=Aword;
				}else 
					flag=1;	
			}
			if(flag==1) {
				Aword+=str+" ";
			}
		}
		return res;
	}
	private static String find_Bwords(String[] arr) {
		String Aword="";
		String res="";
		int flag=0;
		for(String str:arr) {
			if(str.equalsIgnoreCase("b")) {
				if(flag==1) {
					flag=0;
					res=Aword;
				}else {
					flag=1;
					
				}
			}
			if(flag==1) {
				Aword+=str+" ";
			}
		}
		return res;
	}
	private static String find_Cwords(String[] arr) {
		String Aword="";
		String res="";
		int flag=0;
		for(String str:arr) {
			if(str.equalsIgnoreCase("c")) {
				if(flag==1) {
					flag=0;
					res=Aword;
				}else {
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
