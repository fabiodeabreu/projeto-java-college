package assistants;

import interfaces_package.PermitirAcesso;

/*Somente receber algu�m que tenha o contrato da interface-PermitirAcesso e chamar autenticar*/

public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autentique() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
	
					
}

