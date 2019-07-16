package person;

public class Main {

	public static void main(String[] args) {
		System.out.println("salam");
//		Profesor  p = new 
		Professor p = new Professor(711065, "sogol", "sabetfar", "java", "00806323456"); // or  Person p = new Professor(711065, "sogol", "sabetfar", "java", "00806323456");
		
		System.out.println(p.toString());
		p.setSkill("C++");                                                              // agar  az class person tarif kardim digar be methode setSkill dastresi nakhahim dasht
		System.out.println(p.toString());
		p.setActive(false);                                                            // inja methode class professor 
	}

}
