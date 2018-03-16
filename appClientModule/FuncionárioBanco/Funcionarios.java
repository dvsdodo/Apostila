package FuncionárioBanco;

public class Funcionarios {
	String Nome;
	String Departamento;
	Data DataAdmicao;
	double Salario;
	String RG;	
	double ganhoTotal;
	
	public void salarioCargo (String funcao){
	
		switch (funcao) {
			case "gerente":
				Salario = 5000;
				break;
			case "tecnico":
				Salario = 1800;
				break;
			case "analista":
				Salario = 3000;
				break;
			default:
				Salario = 1700;
				break;
		
		}
	
	}
	
	public void ganhoAnual() {
		
		
		ganhoTotal = this.Salario*12;
		
	}
	
	public void recebeAumento(double valor) {
		
		this.Salario+=valor;
		
	}
	
	public void mostra() {
		System.out.println("Funcionário " + this.Nome + " com o salário de " + this.Salario + " e ganho anual de " + this.ganhoTotal);
	}
	
}

class Data {
	int dia;
	int mes;
	int ano;
}