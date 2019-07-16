package person;

public class Professor extends Person{
	private  int Profcode ;
	private String Skill;
	
	
	public Professor() {
	
	}
	public Professor( int pcode , String Name , String Family ,String skill ,String melliCode) {
		
		super(Name, Family, melliCode);   // in khat ra bejaye 3 khat paeen  mitavan nevesht
		
//		this.Name = Name;
//		this.Family = Family;
//		this.MeliCode = melliCode;
		this.Skill = skill;
	}
	

	@Override
	public String toString() {
		return "profesor :[profcode =  " + Profcode + "   , Name: " + Name + "  , Family: " + Family + "  , Mellicode : " + MeliCode + "  , Skill: " + Skill  +"]";
	}
	
	public void setSkill(String newSkill) {// ezafe kardan skill be skilli ke dashtim
		this.Skill += "," + newSkill;
	}
	@Override
	public void setActive(boolean isActive) {
		if(Name.length() == 0)
			super.setActive(false);
		
	}
	
	
	public void finalize() throws Throwable{
		super.finalize();
	}

}
