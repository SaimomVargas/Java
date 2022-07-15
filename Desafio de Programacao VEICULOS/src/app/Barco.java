package app;

public class Barco extends Veiculo {

	public Barco(String nome, int anoFabricacao, int capacidade, String nomeFabricante, String paisDeOrigem,
			int NumVelas) {
		super(nome, anoFabricacao, capacidade, nomeFabricante, paisDeOrigem);
		this.NumVelas = NumVelas;
	}

	private int NumVelas;

	public String IcarVelas() {
		return "Velas Içadas";

	}

	public String RecolherVelas() {
		return "Velas Recolhidas";
	}

	public int getNumVelas() {
		return NumVelas;
	}

	public void setNumVelas(int numVelas) {
		NumVelas = numVelas;
	}

	@Override
	public String toString() {
		return " Numero de velas = " + NumVelas + super.toString();
	}

}
