package person;

public class Student extends Person
{
	public void finalize() throws Throwable{
		super.finalize();
	}
}
