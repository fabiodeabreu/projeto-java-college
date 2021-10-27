package general;

public abstract class Pessoa {
	
	
	protected String name;
	protected int age;
	protected String born;
	protected String email;
	protected String numberCPF;
	protected String fatherName;
	protected String motherName;
	
	public abstract double salario();
	
	/*getters and setters*/
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBorn() {
		return born;
	}
	public void setBorn(String born) {
		this.born = born;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumberCPF() {
		return numberCPF;
	}
	public void setNumberCPF(String numberCPF) {
		this.numberCPF = numberCPF;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((born == null) ? 0 : born.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result + ((motherName == null) ? 0 : motherName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numberCPF == null) ? 0 : numberCPF.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (age != other.age)
			return false;
		if (born == null) {
			if (other.born != null)
				return false;
		} else if (!born.equals(other.born))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fatherName == null) {
			if (other.fatherName != null)
				return false;
		} else if (!fatherName.equals(other.fatherName))
			return false;
		if (motherName == null) {
			if (other.motherName != null)
				return false;
		} else if (!motherName.equals(other.motherName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberCPF == null) {
			if (other.numberCPF != null)
				return false;
		} else if (!numberCPF.equals(other.numberCPF))
			return false;
		return true;
	}
	
	/*retorne true acima 18*/
	public boolean pessoaMaiorIdade() {
		return age > 18;
	}
	
}
