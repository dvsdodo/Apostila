package FuncionárioBanco;

public class ProgramaFuncionarioBanco {
	
	public static void main(String[] args) {
		Funcionarios a = new Funcionarios();
		a.Nome = "Davison";
		a.Departamento = "adm";
		Funcionarios b = new Funcionarios();
		b.Nome = "Ciny";
		b.Departamento = "fiscal";
		
		Data data = new Data();
		a.DataAdmicao = data;
		a.DataAdmicao.dia = 10;
		a.DataAdmicao.mes = 04;
		a.DataAdmicao.ano = 2018;
		
		System.out.println("Data de admissão do " + a.Nome + "foi " +a.DataAdmicao.dia+ "/" +a.DataAdmicao.mes+ "/" +a.DataAdmicao.ano);
		
		a.salarioCargo("gerente");
		a.ganhoAnual();
		b.salarioCargo("analista");
		b.ganhoAnual();
		
		a.mostra();
		b.mostra();
				
		//a.recebeAumento(500);
		
		//System.out.println("Novo salário: " + a.Salario);
				
		if ( a == b) {
			System.out.println("Funcionários iguais.");
		} else {
			System.out.println("Funcionários diferentes");
		}
	}

}
