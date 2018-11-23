package UEC;

public class combat implements combate {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitoria,derota,empate;
	
	
	
	public combat(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria,
			int derota, int empate) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.categoria = categoria;
		this.vitoria = vitoria;
		this.derota = derota;
		this.empate = empate;
	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getNacionalidade() {
		return nacionalidade;
	}



	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}



	public float getPeso() {
		return peso;
	}



	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}



	public String getCategoria() {
		return categoria;
	}



	private void setCategoria() {
		if(this.peso<52.2) {
			this.categoria = "Invalido";
		}else if(this.peso <= 70.3) {
			this.categoria = "Leve";
		}else if(this.peso <= 83.9) {
			this.categoria = "Medio";
		}else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Invalido";
		}
		
	}



	public int getVitoria() {
		return vitoria;
	}



	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}



	public int getDerota() {
		return derota;
	}



	public void setDerota(int derota) {
		this.derota = derota;
	}



	public int getEmpate() {
		return empate;
	}



	public void setEmpate(int empate) {
		this.empate = empate;
	}

	@Override
	public void Apresentar() {
		System.out.println("===============================================================================================================");
		System.out.println("Chegou a hora, apresentamos o lutador " + this.getNome());
		System.out.println("diretamente de " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " m");
		System.out.println("pesando " + this.getPeso() + " KG ");
		System.out.println("com " + this.getVitoria() + " Vitoria | " + this.getEmpate() + " Empate | " + this.getDerota() + " Derrota |");
		System.out.println("===============================================================================================================");
	}
	@Override
	public void Status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitoria());
		System.out.println("Empatou " + this.getEmpate());
		System.out.println("Perdeu " + this.getDerota());
	}
	@Override
	public void ganharLuta() {
		this.setVitoria(this.getVitoria() + 1);
	}
	@Override
	public void perderLuta() {
		this.setDerota(this.getDerota() + 1);
	}
	@Override
	public void empatarLuta() {
		this.setEmpate(this.getEmpate() + 1);
	}
	
}
