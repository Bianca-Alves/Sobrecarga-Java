import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String cpf = "";
		String nome = "";
		double salario = 0.0;

		Funcionario func = new Funcionario();

		cpf = JOptionPane.showInputDialog(null, "Digite o CPF do funcionário");
		func.setCpf(cpf);

		nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionário");
		func.setNome(nome);

		salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário do funcionário"));
		func.setSalario(salario);

		JOptionPane.showMessageDialog(null, "O salário do funcionário é de " + func.getSalario("R$"));
	}
}