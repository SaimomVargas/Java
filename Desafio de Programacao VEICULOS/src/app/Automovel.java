package app;

public class Automovel extends Veiculo {
	public Automovel(String nome, int anoFabricacao, int capacidade, String nomeFabricante, String paisDeOrigem,
			int DiametroRoda) {
		super(nome, anoFabricacao, capacidade, nomeFabricante, paisDeOrigem);
		this.DiametroRoda = DiametroRoda;

	}

	// objetos da classe
	private int DiametroRoda;

	// metodo da classe
	public String AbrirPortaMalas() {
		return "O porta malas abriu";
	}

	// get e sets da classe
	public int getDiametroRoda() {
		return DiametroRoda;
	}

	public void setDiametroRoda(int diametroRoda) {
		DiametroRoda = diametroRoda;
	}

	@Override
	public String toString() {
		return " Diametro da roda = " + DiametroRoda + super.toString();
	}

}
