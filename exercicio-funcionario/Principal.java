import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String cpf = "";
		String nome = "";
		double salario = 0.0;

		Funcionario func = new Funcionario();

		cpf = JOptionPane.showInputDialog(null, "Digite o CPF do funcion�rio");
		func.setCpf(cpf);

		nome = JOptionPane.showInputDialog(null, "Digite o nome do funcion�rio");
		func.setNome(nome);

		salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o sal�rio do funcion�rio"));
		func.setSalario(salario);

		JOptionPane.showMessageDialog(null, "O sal�rio do funcion�rio � de " + func.getSalario("R$"));
	}
}