
public class Main {
	private static Fila fila = new Fila(5);

	public static void main(String[] args) {
		menu();
	}

	public static void addAluno() {
		if (fila.size() != 5) {
			String nome = SysIn.inString("Digite o nome do Aluno:");
			int idade;
			do {
				idade = SysIn.inInt("Digite a idade do aluno:", "Digite uma idade v�lida!");
				if(idade < 0) System.out.println("Digite uma idade v�lida!");
			} while (idade < 0);
			double nota;
			do {
				nota = SysIn.inDouble("Digite a nota do aluno:", "Digite uma nota v�lida!");
				if(nota < 0 || nota > 10) System.out.println("Digite uma nota v�lida!");
			} while (nota < 0 || nota > 10);
			fila.add(new Aluno(nome, nota, idade));
		} else {
			System.out.println("Fila cheia!");
		}
	}

	public static void atenderAluno() {
		Object alu = fila.remove();
		if (alu != null) {
			System.out.println("O proximo aluno a ser atendido �:");
			System.out.println(alu.toString() + "\n");
		}
	}

	public static void menu() {
		int op;
		do {
			System.out.println("\nO que voc� deseja Fazer?\n");
			System.out.println("1- Atender um aluno;");
			System.out.println("2- Adicionar um Aluno � Fila;");
			System.out.println("3- Listar alunos da Fila;");
			System.out.println("0- Encerrar");
			op = SysIn.inInt("\nQual sua op��o?");

			switch (op) {
			case 1:
				atenderAluno();
				break;
			case 2:
				addAluno();
				break;
			case 3:
				fila.print();
				break;
			case 0:
				System.out.println("Programa encerrado!");
				break;
			default:
				System.out.println("Digite uma das op��es!");
			}
		} while (op != 0);
	}
}
