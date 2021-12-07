package assistants;

import interfaces.PermitirAcesso;

/*Somente receber alguem que tenha o contrato de interface-PermitirAcesso e chamar autenticar*/

public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autentique() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
	
					
}

