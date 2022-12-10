
public class Member {
	
	private String FirstName,SecondName,Phone,Email,Password,Gender;

	public Member(String FirstName, String SecondName, String Phone, String Email, String Password, String Gender) {
		super();
		this.FirstName = FirstName;
		this.SecondName = SecondName;
		this.Phone = Phone;
		this.Email = Email;
		this.Password = Password;
		this.Gender = Gender;
	}

	public Member() {
		super();
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getSecondName() {
		return SecondName;
	}

	public void setSecondName(String SecondName) {
		this.SecondName = SecondName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String Phone) {
		this.Phone = Phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	
}
