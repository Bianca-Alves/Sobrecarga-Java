import java.text.DecimalFormat;

public class Funcionario {
	// Atributos da classe
	private String nome;
	private String cpf;
	private double salario;

	DecimalFormat df = new DecimalFormat("#,###.00");

	// Função 1 - Método construtor
	public Funcionario() {

	}

	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	// Métodos acessores
	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}

	public String getSalario(String moeda) {
		return moeda + " " + df.format(this.salario);
	}

	public String getNome() {
		return nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNome(String nome, boolean caixaalta) { // Sobrecarga do setNome
		if (caixaalta) {
			nome = nome.toUpperCase();
		} else {
			nome = nome.toLowerCase();
		}
	}

	public void setNome(String nome, boolean caixaalta, String primeirapalavra) { // Sobrecarga do setNome
		if (caixaalta) {
			nome = nome.toUpperCase(); // Deixa a caixa alta utilizando sobrecarga
		} else {
			nome = nome.toLowerCase(); // Deixa a caixa baixa utilizando sobrecarga
		}

		if (primeirapalavra == "S") {
			this.nome = nome.split(" ")[0]; // Pega a primeira palavra antes do espaço utilizando sobrecarga
		}
	}

	public void setNome(String nome, String primeirapalavra) { // Sobrecarga do setNome
		if (primeirapalavra == "S") {
			this.nome = nome.split(" ")[0]; // Pega a primeira palavra antes do espaço utilizando sobrecarga
		}
	}

	// Função 2 - Mostrar
	public void imprimirFuncionario() {
		System.out.println(this.getNome());
		System.out.println(this.getCpf());
		System.out.println(this.getSalario());
	}
}