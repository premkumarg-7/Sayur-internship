public class Main
{
	public static void main(String[] args) {
		String[] name=new String[]{"Prem","Kesavan","Jeroban","Dinesh"};
		int[] marks=new int[]{80,89,43,55};
		int n= marks.length;
		int count =0;
		int pass=50;
		for (int i=0;i<n;i++){
		    if(marks[i]>pass){
		        System.out.print(name[i]+":"+marks[i]);
			    System.out.println("Pass");
		    }else{
		        count++;
		    }
		}
			System.output.println("Failed students:"+count);
	}
}
