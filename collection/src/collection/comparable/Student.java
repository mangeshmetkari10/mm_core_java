package collection.comparable;

@SuppressWarnings("rawtypes")
public class Student implements Comparable {

	private Integer id;

	private String name;

	public Student() {
		super();
	}

	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object object) {

		Student student = (Student) object;
		return this.id.compareTo(student.id);

	}

}
