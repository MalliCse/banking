package java8features.java8features;

import java.util.HashMap;




public class QisCollege implements Jntuk{
	
	@Override
	public void collegeName()
	{
		System.out.println("Qis College");
		
		// Calling Static Method which can't be overidden
		Jntuk.collegeContact();
		
	}
	
	// Overriding Default Methods
	@Override
	public void collegeDetails()
	{
		System.out.println("Qis College Is located in Ongole");
	}
	



}
