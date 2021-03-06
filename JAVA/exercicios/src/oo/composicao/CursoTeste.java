package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Carol");
		Aluno aluno2 = new Aluno("Dayana");
		Aluno aluno3 = new Aluno("Raquel");
	
	Curso curso1 = new Curso("Java");
	Curso curso2 = new Curso("Kotlin");
	Curso curso3 = new Curso("React Native");
	Curso curso4 = new Curso("C#");
	
	curso1.adicionarAluno(aluno1);
	curso1.adicionarAluno(aluno2);
	
	curso2.adicionarAluno(aluno1);
	curso2.adicionarAluno(aluno2);
	
	aluno1.adicionarCurso(curso3);
	aluno2.adicionarCurso(curso3);
	aluno3.adicionarCurso(curso3);
	
	curso4.adicionarAluno(aluno3);
	
	
	for(Aluno aluno : curso3.alunos){
		System.out.println("Estou Matriculado no Curso" + curso3.nome + "..");
		System.out.println("Me Chamo = " + aluno.nome + "..");
		System.out.println();
	}
	
	System.out.println(aluno2.cursos.get(0).alunos);
	
	Curso cursoEncontrado = aluno3.obterCursoPorNome("C#");
	if(cursoEncontrado != null){
		System.out.println(cursoEncontrado.nome);
		System.out.println(cursoEncontrado.alunos);
	}
	
	}

}
