package java8features.java8features;




@FunctionalInterface
public interface Jntuk {
	
	void collegeName();
	
	default void collegeDetails()
	{
		System.out.println("Jntuk is Located In kakinada");
	}
	
	static void collegeContact()
	{
		System.out.println("Jntuk Contact Details");
	}

}
