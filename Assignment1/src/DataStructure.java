
public class DataStructure<E>{
	private E[] data;
	private int size = 100;
	private int next = 0;
	
	@SuppressWarnings("unchecked")
	public DataStructure(){
		data = (E[]) new Object[size];
	}
	
	@SuppressWarnings("unchecked")
	public DataStructure(int NumberofListings){
		data =(E[]) new Object[NumberofListings];
	}
	
	public void addListing(E newListing){
		data[next] = newListing;
		next = next + 1;
	}
	
	public void showListing(){
		for(int x = next-1; x>=0; x--){
			System.out.println(data[x].toString());
		}
	}
	
}
