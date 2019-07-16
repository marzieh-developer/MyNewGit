package person;

public class Person {
	protected String Family;
	protected String Name;
	protected String MeliCode;
	private boolean isActive;
		
	
	public Person() {
		Name ="";
		Family = "";
		MeliCode = "";
	}
	public Person(String Name , String Family , String MeliCode) {
		this.Name = Name;
		this.Family = Family;
		this.MeliCode = MeliCode;
		
	}
	
	
	public void finalize() throws Throwable{
//		super.finalize();
	}
	
	////////////////////////////////////  Getter
	public String getFamily() {
		return Family;
	}
	public String getName() {
		return Name;
	}
	public String getMeliCode() {
		return MeliCode;
	}
	
	///////////////////////////////////// setter
	public void setFamily(String family) {
		Family = family;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public void setMeliCode(String meliCode) {
		MeliCode = meliCode;
	}
	///////////////////////////
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isActive() {
		return isActive;
	}

}
