public class Main
{
	public static void main(String[] args) {	
	String str1="123456";
	String str2="412356";
	String s=twoString(str1,str2);
	System.out.println(s);
	}

    public static String twoString (String str1,String str2){
	int n=str1.length();
	int pos=0;
	
	if(str1.length()!=str2.length())
	    return "Not Same";
	   
	   char[] st1=new char[str1.length()];
	   char[] st2=new char[str2.length()];
	   
	   for (int i=0;i<n;i++){
	       st1[i]+=str1.charAt(i);
	       st2[i]+=str2.charAt(i);
	   } 
	   
	   for (int i=0;i<st1.length;i++){
	       if(st1[0]==st2[i]){
	           pos=i;
	           break;
	       }
	   }
	   String res="";
	   
	   for(int i=pos;i<n;i++){
	       res+=st2[i];
	   }
	   for(int i=0;i<pos;i++){
	       res+=st2[i];
	   }

      /*Output:
      Not Same
        */
	   if(str1.equals(res)){
	       return "Same";
	   }
	   return "Not same";
	}
}
