
public class Person {
	private String ssn;
	private String firstName;
	private String lastname; 
	private String email;

	
	public Person() {
		
	}
	
	public Person(String ssn, String name, String lastname,
			String email) {
		this.ssn=ssn;
		this.firstName=name;
		this.lastname=lastname;
		this.email=email;
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return firstName;
	}
	public void setName(String name) {
		this.firstName = name;
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
		return "Person [email=" + email + ", lastname=" + lastname + ", name=" + firstName + ", ssn=" + ssn + "]";
	}

	
}
