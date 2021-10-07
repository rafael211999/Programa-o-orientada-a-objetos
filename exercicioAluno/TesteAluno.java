package exerciciosParaEntregar;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {

	public static void main(String[] args) {
		Alunos aluno1 = new Alunos("Leandro", 10, 9);
		Alunos aluno2 = new Alunos("Gilnei", 8, 9);
		Alunos aluno3 = new Alunos("Rafael", 10, 9);
		Alunos aluno4 = new Alunos("Carol", 9, 8);
		
		List<Alunos> alunoLista = new ArrayList<Alunos>();
		alunoLista.add(aluno1);
		alunoLista.add(aluno2);
		alunoLista.add(aluno3);
		alunoLista.add(aluno4);
		

		for (int i = 0; i < alunoLista.size(); i++) {
    		try{
          		Alunos estudante = (Alunos)alunoLista.get(i);
          		System.out.println(estudante.toString() + " Média: " 
          		+ aluno1.calcularMedia());
         	}
         	catch(AlunoException log){
                	System.err.println(log.getMessage());
         	}

	}

	}
}
