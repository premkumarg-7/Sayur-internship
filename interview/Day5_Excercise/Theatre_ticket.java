import java.util.Scanner;

public class Theatre_ticket {
		public static void main(String[] args) {
			
			char[][] seat= new char[5][10];
			int tickets=0;

			for(int i=0;i<5;i++) {
				for(int j=0;j<10;j++) {
					seat[i][j]='*';		
				}
			}
			seatingprint(seat);
			
			while(tickets<10) {
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
		private static void seatingprint(char seat[][]) {
			char alpha =65;
			for(int i=0;i<5;i++) {
				for(int j=0;j<10;j++) {
					if(j==3 || j==7) {
						System.out.print(" | ");
					}
					System.out.print(alpha+""+(j+1));
					System.out.print(seat[i][j]+" ");
				}
				System.out.println();
				alpha++;
			}
		}
		
		private static String seatcheck(int count,int row,int place,char[][] seat) {
		for(int i=0;i<count;i++) {
			if(seat[row-1][place-1]=='B') {
				return "Seat is already booked!";
			}else {
			seat[row-1][place-1]='B';
			place++;
			}
		}
		return "Seat Booked!";
		}
}
