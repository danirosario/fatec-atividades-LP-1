public class Cursos {
	
	public static void main (String[] args) {
		//System.out.println("F01\tLogica de Programacao");
		//System.out.println("F02\tLinguagem de Programacao");
		//System.out.println("F03\tProgramacao Orientada a Objetos");
		
		String [] cursos = {"Logica de Programacao", "Linguagem de Programacao", "Programacao Orientada a Objetos"};
		int i = 1;
		
		for (String curso : cursos)
		{
			System.out.println("F0" + i + "\t" + curso);
			i++;
		}
	}
}

