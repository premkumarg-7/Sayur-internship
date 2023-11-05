public class Main
{
	public static void main(String[] args) {
		String[] name=new String[]{"Prem","Kesavan","Jeroban","Dinesh"};
		int[] marks=new int[]{80,89,43,55};
		int n= marks.length;
		for (int i=0;i<n;i++){
		    if(marks[i]>50){
		        System.out.println("Pass");
		        System.out.println(name[i]+":"+marks[i]);
		    }else{
		        System.out.println("Fail");
		         System.out.println(name[i]+":"+marks[i]);
		    }
		} 
	}
}
