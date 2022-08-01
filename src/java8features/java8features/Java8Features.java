package java8features.java8features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.util.Set;
import java.util.*;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;







import java8features.java8features.model.Student;
public class Java8Features {

	public static void main(String args[]) {
		// Student Object Manual Creation
		Student stu1 = new Student(1, "Malli");
		Student stu2 = new Student(2, "Vishnu");
		Student stu3 = new Student(3, "Sri");
		Student stu5 = new Student(1, "Malli");

		// List

		
		  List<Student> listofstudetails = new ArrayList<Student>(); // Arraylist  Object Creation
		 
		  
		  Collections.addAll(listofstudetails, stu1, stu2, stu3); // Adding Student object to Student ArraList
		  
		  
		  System.out.println("List Implementation Using Arralist");
		  listofstudetails.stream() .forEach(studetails ->
		  System.out.println(studetails.getId() + "-" + studetails.getName()));
		 
		// Set Implementation Using Hashset

		
		  Set<Student> setofstudentdetails = new HashSet<Student>();
		  
		  Student stu4 = new Student(3, "Sri");
		  
		// Adding Student object to Student ArraList
		  
		  Collections.addAll(setofstudentdetails, stu1, stu2, stu3, stu4); 
		  
		  
		  System.out.println("Set Implementation Using hashset");
		  
		  setofstudentdetails.stream().forEach( setstudentdetails ->
		  System.out.println(setstudentdetails.getId() + "-" +
		  setstudentdetails.getName()));
		  
		  System.out.println("Set Implementation Using hashset&stream API");
		  
		  setofstudentdetails.stream().map(studetails ->
		  studetails.getName()).forEach(System.out::println);
		  
		  System.out.println("Set Implementation Using hashset,stream API&Collectors");
		  
		  List<String> studentnames = setofstudentdetails.stream().map(studetails ->
		  studetails.getName()) .collect(Collectors.toList());
		  
		  for (String name : studentnames) 
		  { 
			  System.out.println(name);
		  
		  } 
		  
		// Map Implementation using HashMap
		  
		  System.out.println("Map Implementation Using HashMap");
		  
		  HashMap<String, Integer> names = new HashMap<String, Integer>();
		  names.put("Malli", 1); names.put("Vishnu", 2);
		  
		  names.entrySet().stream().forEach(System.out::println);
		  
		  // Calling Functional Interface with implementation class::Qis
		  System.out.println("Functional Interface Implementation With Normal Process"); 
		  QisCollege clg = new QisCollege(); 
		  clg.collegeName();
		  
		  // Implementing Functional Interface Using Lambda 
		  System.out.println("Functional Interface Implementation using Lambda Expression");
		  Jntuk university = () -> System.out.println("Jntuk"); university.collegeName();
		  
		  // Calling overridden Default Method
		  System.out.println("Overidden Default Method"); 
		  university.collegeDetails();
		  
		  // Equals,==&hashcode System.out.println("Equals,==&hashcode concepts"); 
		  if(stu1 == stu2) 
			  System.out.println("stu1&stu2 objects reference is same");
		  else 
			  System.out.println("stu1&stu2 objects reference is not same");
		  
		  System.out.println(stu1.equals(stu2)); System.out.println(stu2.hashCode());
		  
		  
		 // String s1="Malli"; String s2="Malli"; System.out.println(s1==s2);
		  
		  
		  if(stu1.equals(stu5)) 
			  System.out.println("TRUE");
		  
		  /*System.out.println(stu1.hashCode()); System.out.println(stu5.hashCode());
		  
		  String sa1=new String("Malli"); String sa2=new String("Malli");
		  System.out.println(sa1.hashCode()); System.out.println(sa2.hashCode());*/
		  
		  
		  // Filter
		  
		  
		  listofstudetails.stream().filter(stuobj -> stuobj.getName().equals("Malli")).forEach(stuobj ->System.out.println(stuobj.getName()));

		  System.out.println(listofstudetails.stream().findAny().get().getName());
		
		System.out.println("ok");
			System.out.println("ok");
		
			

	}

}
