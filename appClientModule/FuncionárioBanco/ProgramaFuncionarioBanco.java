package Funcion�rioBanco;

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
		
		System.out.println("Data de admiss�o do " + a.Nome + "foi " +a.DataAdmicao.dia+ "/" +a.DataAdmicao.mes+ "/" +a.DataAdmicao.ano);
		
		a.salarioCargo("gerente");
		a.ganhoAnual();
		b.salarioCargo("analista");
		b.ganhoAnual();
		
		a.mostra();
		b.mostra();
				
		//a.recebeAumento(500);
		
		//System.out.println("Novo sal�rio: " + a.Salario);
				
		if ( a == b) {
			System.out.println("Funcion�rios iguais.");
		} else {
			System.out.println("Funcion�rios diferentes");
		}
	}

}
