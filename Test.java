public class Test{
	private String name;
	private String surname;
	public static void main(String ...args){
		Test taku = new Test();
		taku.setName("Taku");
		taku.setSurname("Chikwanda");
		System.out.println(taku);
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name ){
		this.name = name;
	}
	public String getSurname(){
		return surname;
	}
	
	public void setSurname(String surname ){
		this.surname = surname;
	}
	public String toString(){
		return name+surname;
	}
}
