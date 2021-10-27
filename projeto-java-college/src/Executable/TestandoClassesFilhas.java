package Executable;

import general.Aluno;
import general.Diretor;
import general.Pessoa;
import general.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		
		System.out.println("-----Testando Aluno-----");
		Aluno aluno = new Aluno();
		aluno.setName("João");
		aluno.setSchoolName("ILAC");
		aluno.setAge(19);
		System.out.println("Aluno: " +"-"+ aluno.getName() +"-"+ aluno.getSchoolName() +"-"+ aluno.getAge());
		System.out.println("Salário R$ " + aluno.salario());
		
		System.out.println("-----Testando Diretor-----");
		Diretor diretor = new Diretor();
		diretor.setName("Santos");
		diretor.setTitulacao("titulação desde 2019");
		diretor.setAge(45);
		System.out.println("Diretor: " +"-"+ diretor.getName() +"-"+ diretor.getTitulacao() +"-"+ diretor.getAge());
		System.out.println("Salário R$ " + diretor.salario());
		
		System.out.println("-----Testando Secretário-----");
		Secretario secretario = new Secretario();
		secretario.setName("Luiz");
		secretario.setNivelCargo("nível concursado");
		secretario.setAge(26);
		System.out.println("Secretário: " +"-"+ secretario.getName() +"-"+ secretario.getNivelCargo() +"-"+ secretario.getAge());
		System.out.println("Salário R$ " + secretario.salario());
		
		System.out.println("----------");
		System.out.println("---Teste maior idade---");
		
		//aluno.pessoaMaiorIdade();
		//diretor.pessoaMaiorIdade();
		//secretario.pessoaMaiorIdade();
		System.out.println("Aluno - idade" +" - "+ aluno.pessoaMaiorIdade() +" - "+ aluno.msgMaiorIdade());
		System.out.println("Secretario - idade" +" - "+ secretario.pessoaMaiorIdade());
		System.out.println("Diretor - idade" +" - "+ diretor.pessoaMaiorIdade());
		
		teste(aluno);
		teste(diretor);
		teste(secretario); 
		
		
	}/*fim do main()*/
	
	public static void teste (Pessoa pessoa) {
		System.out.println("Pessoa pessoa" +" -> "+ pessoa.getName() +" -> "+ pessoa.salario());
	}
		
}/*fim do TestandoClasseFilhas*/	
	
			
