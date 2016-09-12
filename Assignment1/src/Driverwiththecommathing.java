import java.util.Scanner;

public class Driverwiththecommathing {
	public static void main(String [] args){
		DataStructure data1 = new DataStructure();
		System.out.println("Input data as Name,Age");
		Scanner scan = new Scanner(System.in);
		String buff;
		int com;
		while(scan.hasNext()){
			buff=scan.nextLine().trim();
			com=buff.indexOf(",");
			data1.addListing(new Listing(buff.substring(0, com),Integer.parseInt(buff.substring(com+1, buff.length()))));

			
		}
		data1.showListing();
		
	}
	
	
}
