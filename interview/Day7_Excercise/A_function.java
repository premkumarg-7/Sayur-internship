import java.util.Arrays;

public class A_function {
	public static void main(String[] args) {
		String s="A blind man walking on the road. An ant is ready to bite a man. the site is the safest one ";
		String[] arr=s.split(" ");
		String Aword="";
		String res="";
		int flag=0;
		for(String str:arr) {
			if(str.equalsIgnoreCase("a")) {
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
		System.out.println(res);
	}
}
