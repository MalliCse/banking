package java8features.java8features.model;

public class Student {

	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		Student sample = (Student) obj;
		if (obj == null)
			return false;
		else if (obj instanceof Student && ((id == sample.id) && (name == sample.name))) {
			return true;
		}

		return false;
	}

}
