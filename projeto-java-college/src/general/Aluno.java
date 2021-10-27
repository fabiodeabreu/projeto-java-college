package general;

import java.util.ArrayList;
import java.util.List;

import statics.StatusAluno;

public class Aluno extends Pessoa{
	
	private String registrationDate;
	private String schoolName;
	private String registrationSerie;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	/*getters and setters*/
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getRegistrationSerie() {
		return registrationSerie;
	}
	public void setRegistrationSerie(String registrationSerie) {
		this.registrationSerie = registrationSerie;
	}
	
	/*equals and hashCode*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((registrationDate == null) ? 0 : registrationDate.hashCode());
		result = prime * result + ((registrationSerie == null) ? 0 : registrationSerie.hashCode());
		result = prime * result + ((schoolName == null) ? 0 : schoolName.hashCode());
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
		Aluno other = (Aluno) obj;
		if (registrationDate == null) {
			if (other.registrationDate != null)
				return false;
		} else if (!registrationDate.equals(other.registrationDate))
			return false;
		if (registrationSerie == null) {
			if (other.registrationSerie != null)
				return false;
		} else if (!registrationSerie.equals(other.registrationSerie))
			return false;
		if (schoolName == null) {
			if (other.schoolName != null)
				return false;
		} else if (!schoolName.equals(other.schoolName))
			return false;
		return true;
	}
	
	public double getMediaNotas() {
		double soma = 0.00;
		for (Disciplina disciplina : disciplinas) {
			soma += disciplina.getNota();
		}
		return soma / disciplinas.size();
	}

	public String getSituationAluno() {
		double media = this.getMediaNotas();
		if (media >= 50) {
			if (media >= 70) {
				if (media >= 90) {
						return StatusAluno.SENSACIONAL;
				} else {
						return StatusAluno.APROVADO;
				}
			} else {
					return StatusAluno.RECUPERACAO;
			}
		} else {
				return StatusAluno.REPROVADO;
		}

	}

	public boolean getSituation2() {
		double media = this.getMediaNotas();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean pessoaMaiorIdade() {
		return age >= 21;
	}

	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Pessoa de Maior ok" : "Pessoa Menor Idade ueue";
	}

	@Override
	public double salario() {

		return 1500.00;
	}
	
}
