package exercicio_1;

public class Teste {

	public static void main(String[] args) {
		Partido a = new Partido("Partido Igualit�rio", "PI", 20, "Igualdade e equidade");
		Candidato b = new Candidato("Rog�rio", a);
		b.mostrar();
	}

}
