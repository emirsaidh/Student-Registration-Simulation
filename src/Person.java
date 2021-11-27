
public class Person {
	private Double ssn;
	private String name;
	private String lastname;
	private String email;

	
	public Person() {
		
	}
	
	public Person(Double ssn, String name, String lastname,
			String email, int birthDate, int age) {
		this.ssn=ssn;
		this.name=name;
		this.lastname=lastname;
		this.email=email;
		
	}
	
	public Double getSsn() {
		return ssn;
	}
	public void setSsn(Double ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [email=" + email + ", lastname=" + lastname + ", name=" + name + ", ssn=" + ssn + "]";
	}

	
}
