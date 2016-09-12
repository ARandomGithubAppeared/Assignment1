import java.util.Scanner;

public class Listing {
	private String name;
	private  int age;

	public Listing(String name,int age){
		this.name= name;
		this.age=age;
	}
	public Listing(){
		this.name= " ";
		this.age= 0;
	}
	
	public String toString(){
		String info= "Name: "+this.getName()+"  "+"Age: "+this.getAge(); 
		return info; 
	}
	
	public void input(){ // 
		Scanner scan  = new Scanner(System.in); 
		System.out.println("Input Name: ");	
		setName(scan.nextLine());		
		System.out.println("Input Age: ");
		setAge(scan.nextLine());
		

	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setAge(String age){
		this.age= Integer.parseInt(age);
	}
	
	public String getName(){
		String name= this.name;
		return name;
	}
	
	public int getAge(){
		int age = this.age;
		return age;
	}
}
