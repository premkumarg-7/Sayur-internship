
public class A_function2 {
	public static void main(String[] args) {
		String s=" blind man walking on the road. An ant is ready to bite  man. A site is the safest one of the most visited site ";
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
		System.out.println(result);
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
