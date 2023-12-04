import java.util.Scanner;

public class Theatre_ticket {
		public static void main(String[] args) {
			
			String[][] seat= new String[5][10];
			int tickets=0;
			
			char alpha='A';
			for(int i=0;i<5;i++) {
				for(int j=0;j<10;j++) {
					seat[i][j]=Character.toString(alpha)+Integer.toString(j+1);
				}
				alpha++;
			}
			seatingprint(seat);
			
			while(tickets<=10) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ticket count :");
			int count=sc.nextInt();
			
			System.out.println("Enter the row");
			int row=sc.nextInt();
			System.out.println("Enter the Seat no:");
			int place=sc.nextInt();
			
			String check=seatcheck(count, row, place, seat);
			if(check.equals("Seat is already booked!")) {
				System.out.println(check);
				seatingprint(seat);
				break;
			}else {
				System.out.println(check);
			}
			
			tickets+=count;
			seatingprint(seat);
			}
		}
		private static void seatingprint(String seat[][]) {
			for(int i=0;i<5;i++) {
				for(int j=0;j<10;j++) {
					if(j==3 || j==7) 
						System.out.print(" | ");
					
					System.out.print(seat[i][j]+" ");
				}
				System.out.println();		
			}
		}
		
		private static String seatcheck(int count,int row,int place,String[][] seat) {
			String s="";
		for(int i=0;i<count;i++) {
			if(seat[row-1][place-1].equals("**")) {
				return "Seat is already booked!";
			}else {
				s+=seat[row-1][place-1]+" ";
				seat[row-1][place-1]="**";
				place++;
			}
		}
		System.out.println("---------------------------");
		System.out.println("\t Your seats are Booked! \n \t Here are the your tickets!");
		System.out.println("\t "+s);
		System.out.println("---------------------------");
		return "Enjoy your cinematic experience!";
		}
}
