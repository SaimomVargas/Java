package app;

public class Aviao extends Veiculo {

	public Aviao(String nome, int anoFabricacao, int capacidade, String nomeFabricante, String paisDeOrigem,
			int numTurbinas) {
		super(nome, anoFabricacao, capacidade, nomeFabricante, paisDeOrigem);
		NumTurbinas = numTurbinas;
	}

	private int NumTurbinas;

	public String Decolar() {
		return "O avião decolou";

	}

	public String Pousar() {
		return "O avião pousou";

	}

	public int getNumTurbinas() {
		return NumTurbinas;
	}

	public void setNumTurbinas(int numTurbinas) {
		NumTurbinas = numTurbinas;
	}

	@Override
	public String toString() {
		return " Numero de Turbinas = " + NumTurbinas + super.toString();
	}

}
