package aulas.aula08.exemplo04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoUtil {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Aluno> lista = new ArrayList<Aluno>();
		int op;
		
		do {
			mostrarMenu();
			System.out.print("Digite operação desejada [1|2]: ");
			op = Integer.parseInt(scanner.nextLine());			
			
			switch(op) {
				case 1:
					String nome, sexo, curso;
					int matricula, anoIngresso, semestreIngresso;

					System.out.println("DIGITE DADOS DO NOVO ALUNO");
					System.out.print("Matrícula...........: ");
					matricula = Integer.parseInt(scanner.nextLine());
					System.out.print("Nome................: ");
					nome = scanner.nextLine();
					System.out.print("Sexo [F|M]..........: ");
					sexo = scanner.nextLine();
					System.out.print("Curso...............: ");
					curso = scanner.nextLine();
					System.out.print("Ano de Ingresso.....: ");
					anoIngresso = Integer.parseInt(scanner.nextLine());
					System.out.print("Semestre de Ingresso: ");
					semestreIngresso = Integer.parseInt(scanner.nextLine());
					
					Aluno novoAluno = new Aluno(matricula, nome, sexo, 
							curso, anoIngresso, semestreIngresso);

					lista.add(novoAluno);
					System.out.println("Aluno acaba de ser inserido!");
					System.out.println("Total de alunos cadastrados: " + lista.size());
					break;
				case 2:
					break;
			}
			
		} while (op != 3);
		
		scanner.close();
	}
	
	public static void consultarCurso(List<Aluno> lista, Scanner scanner) {
		
	}

	public static void mostrarMenu() {
		System.out.println();
		System.out.println("********* OPERAÇÕES *********");
		System.out.println("* 1 -> Inserir              *");
		System.out.println("* 2 -> Consultar por Curso  *");
		System.out.println("* 3 -> Encerrar             *");
		System.out.println("*****************************");		
	}
	
}
