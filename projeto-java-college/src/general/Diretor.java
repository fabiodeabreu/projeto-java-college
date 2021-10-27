package general;

public class Diretor extends Pessoa {
	
	private String registroEducacao;
	private String tempoDirecao;
	private String titulacao;
	
	/*getters and setters*/
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public String getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(String tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	/*equals and hashCode*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((registroEducacao == null) ? 0 : registroEducacao.hashCode());
		result = prime * result + ((tempoDirecao == null) ? 0 : tempoDirecao.hashCode());
		result = prime * result + ((titulacao == null) ? 0 : titulacao.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diretor other = (Diretor) obj;
		if (registroEducacao == null) {
			if (other.registroEducacao != null)
				return false;
		} else if (!registroEducacao.equals(other.registroEducacao))
			return false;
		if (tempoDirecao == null) {
			if (other.tempoDirecao != null)
				return false;
		} else if (!tempoDirecao.equals(other.tempoDirecao))
			return false;
		if (titulacao == null) {
			if (other.titulacao != null)
				return false;
		} else if (!titulacao.equals(other.titulacao))
			return false;
		return true;
	}
	@Override
	public double salario() {
		
		return 3900.78;
	}

	
	
	
}