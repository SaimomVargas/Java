package app;
// Classe PAI
public abstract class Veiculo {
	// objetos da classe
	protected String nome;
	protected int anoFabricacao;
	protected int capacidade;
	protected String nomeFabricante;
	protected String paisDeOrigem;

	// contrutor da classe
	public Veiculo(String nome, int anoFabricacao, int capacidade, String nomeFabricante, String paisDeOrigem) {
		super();
		this.nome = nome;
		this.anoFabricacao = anoFabricacao;
		this.capacidade = capacidade;
		this.nomeFabricante = nomeFabricante;
		this.paisDeOrigem = paisDeOrigem;
	}

	// metodos da classe
	public String acelerar() {
		return "Acelerou";
	}

	// metodos da classe
	public String MostrarDetalhes() {
		return null;
	}

	// get e sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getNomeFabricante() {
		return nomeFabricante;
	}

	public void setNomeFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
	}

	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}

	@Override
	// To string da classe PAI
	public String toString() {
		return "\n Nome = " + nome + "\n Ano de fabricacao = " + anoFabricacao + "\n Capacidade = " + capacidade
				+ "\n Nome fabricante = " + nomeFabricante + "\n PaisDeOrigem = " + paisDeOrigem;
	}

}
