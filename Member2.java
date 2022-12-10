
public class Member2 {
	
	private String Usn,Name,Game,Sem,Sec,Phone;

	public Member2(String Usn, String Name,String Game,String Sem,String Sec, String Phone) {
		super();
		this.Usn = Usn;
		this.Name = Name;
		this.Phone = Phone;
		this.Sem = Sem;
		this.Sec= Sec;
		this.Game = Game;
	}

	public Member2() {
		super();
	}

	public String getUsn() {
		return Usn;
	}

	public void setUsn(String Usn) {
		this.Usn = Usn;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
	public String getGame() {
		return Game;
	}

	public void setGame(String Game) {
		this.Game = Game;
	}
	

	public String getSem() {
		return Sem;
	}

	public void setSem(String Sem) {
		this.Sem = Sem;
	}

	public String getSec() {
		return Sec;
	}

	public void setSec(String Sec) {
		this.Sec = Sec;
	}



	public String getPhone() {
		return Phone;
	}

	public void setPhone(String Phone) {
		this.Phone = Phone;
	}
}
