

public class ListingArray {
	private Listing[] list = new Listing[3];
	
	public ListingArray(){
		for(int x = 0;x<3;x++){
			list[x]= new Listing();
			list[x].input();
			
		}
		output();
	}
	
	public Listing getList(int x){
		return list[x];
	}
	
	public void output(){
		for(int x = 2;x>=0;x--){
			System.out.println(list[x].toString());
		}
	}
}
