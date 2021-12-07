package executable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import assistants.FuncaoAutenticacao;
import general.Aluno;
import general.Disciplina;
import general.Secretario;
import interfaces.PermitirAcesso;
import statics.StatusAluno;

public class PrimeiraClasseJava {
	public static void main (String[] args) {	
		
		
		try {
			
		lerArquivo();	
						
		String login = JOptionPane.showInputDialog("Login");
		String senha = JOptionPane.showInputDialog("Senha");
		
		
	PermitirAcesso permitirAcesso =	 new Secretario(login, senha);
	
	if(new FuncaoAutenticacao(permitirAcesso).autentique()) {
			
						
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	HashMap<String, List<Aluno>> maps = new  HashMap<String, List<Aluno>>();
	
	
	/*List<Aluno> alunosAprovados = new ArrayList<Aluno>();
	  List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
	  List<Aluno> alunosReprovados = new ArrayList<Aluno>();
    */
	
	
	for(int qtd = 1; qtd <= 2; qtd ++) {
		Aluno aluno = new Aluno();
		
		String name = JOptionPane.showInputDialog("Nome do Aluno");
		String age = JOptionPane.showInputDialog("Idade");
		/*String born = JOptionPane.showInputDialog("Data de Nascimento");
		String email = JOptionPane.showInputDialog("e-mail");
		String fatherName = JOptionPane.showInputDialog("Nome do Pai");
		String motherName = JOptionPane.showInputDialog("Nome da Mãe");
		String registrationDate = JOptionPane.showInputDialog("Data Matrícula");
		String schoolName = JOptionPane.showInputDialog("Nome da Escola");
		String registrationSerie = JOptionPane.showInputDialog("Série do Aluno");*/
		
		
		aluno.setName(name);
		aluno.setAge(Integer.valueOf(age));
		/*aluno.setBorn(born);
		aluno.setEmail(email);
		aluno.setFatherName(fatherName);
		aluno.setMotherName(motherName);
		aluno.setRegistrationDate(registrationDate);
		aluno.setSchoolName(schoolName);
		aluno.setRegistrationSerie(registrationSerie);*/
		
		for(int quant = 1; quant <=2; quant ++) {
			
			Disciplina disciplina = new Disciplina();
			
			String materia = JOptionPane.showInputDialog("Materia");
			String nota = JOptionPane.showInputDialog("NOTA");
			
			disciplina.setMateria(materia);
			disciplina.setNota(Double.valueOf(nota));
			
			aluno.getDisciplinas().add(disciplina);
		}
		
		
	
	
	int removerMateria = JOptionPane.showConfirmDialog(null, "Deseja excluir matéria");

	if (removerMateria == 0) {
		int pos = 1;
		int continuarRemocao = 0;

		while (continuarRemocao == 0) {
			String qualQuerExcluir = JOptionPane.showInputDialog("Qual a Materia 1, 2, 3, 4");
			aluno.getDisciplinas().remove(Integer.valueOf(qualQuerExcluir).intValue() - pos);

			continuarRemocao = JOptionPane.showConfirmDialog(null, "Continuar Remocao");
			pos++;
		}

	}
	
	alunos.add(aluno);
	
	}
	
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for(Aluno aluno : alunos) {
			
			if(aluno.getSituationAluno().equalsIgnoreCase(StatusAluno.SENSACIONAL)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			
			}else if(aluno.getSituationAluno().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			
			}else if(aluno.getSituationAluno().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			
			}else if(aluno.getSituationAluno().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}		
		
		System.out.println("--Lista Geral dos Alunos Matrículados--");	
		for(Aluno aluno : alunos) {
				
			System.out.println(aluno.getName());
		}	
					
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("------Alunos Aprovados------");
		for(Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println(aluno.getName());
			System.out.println(aluno.getMediaNotas());
			System.out.println(aluno.getSituationAluno());
		}
				
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("------Alunos Recuperação------");
		for(Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println(aluno.getName());
			System.out.println(aluno.getMediaNotas());
			System.out.println(aluno.getSituationAluno());
		}
		
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("------Alunos Reprovados------");
		for(Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println(aluno.getName());
			System.out.println(aluno.getMediaNotas());
			System.out.println(aluno.getSituationAluno());
		
		}
					
		
		}else {
				JOptionPane.showMessageDialog(null, "ERRO Login  e/ou Senha");
		}
	
			
	
			
		  }catch(Exception e) {
			  StringBuilder saida = new StringBuilder();
				
				/*print erro in console*/
				e.printStackTrace();
				
				/*Message erro or cause*/
				System.out.println("Message: null, cast, fileNot etc... --> " + e.getMessage());
				
				/*Pane show*/		
				JOptionPane.showMessageDialog(null, "Message: --> " + e.getMessage());
				
				
				/*e.getStackTrace()[] is Array - Its need one "for" */
				for(int i = 0; i < e.getStackTrace().length; i++) {
					saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());
					saida.append("\n Method with erro: " + e.getStackTrace()[i].getMethodName());
					saida.append("\n Line with erro: " + e.getStackTrace()[i].getLineNumber());
					saida.append("\n Class: " + e.getClass());
				}
 			
				JOptionPane.showMessageDialog(null, "msg customizada erro de coversão de número  " + saida.toString());
				
				
			
			
			}finally {/*always to execute if happening an erro or not*/
				JOptionPane.showMessageDialog(null, "Estou aprendendo Java");
			}
		
		}	
			
			public static void lerArquivo() throws FileNotFoundException  {
		
				File fil = new File("c://lines.txt");
				Scanner scanner = new Scanner(fil);
			}
 
		
 	
}//end
