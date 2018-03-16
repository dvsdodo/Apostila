class Programa {
		public static void main (String[] args) {
			Conta minhaConta;
			minhaConta = new Conta();
			Cliente davison = new Cliente();
			minhaConta.titular = davison;
			
			minhaConta.saldo = 20000;
			davison.Nome = "Davison";
			
			System.out.println("Saldo da conta "+davison.Nome+" é de "+minhaConta.saldo);
			
			boolean transacao = minhaConta.saca(20000);
			if (transacao) {
				System.out.println("Transação realizada.");
			} else {
				System.out.println("Transação superior da permitida.");
			}
			
			System.out.println("Saldo da conta "+davison.Nome+" é de "+minhaConta.saldo);
			
			minhaConta.deposita(5000);
			
			System.out.println("Saldo da conta "+davison.Nome+" é de "+minhaConta.saldo);
			
			Conta c1;
			c1 = new Conta();
			Cliente ciny = new Cliente();
			c1.titular = ciny;
			
			c1.saldo = 1000;
			ciny.Nome = "Ciny";
			
			System.out.println("Saldo da conta "+c1.titular.Nome+" é de "+c1.saldo);
			
			boolean transferencia = minhaConta.transferePara(c1,500);
			
			if (transferencia == false) {
				System.out.println("Saldo insuficiente.");
			} else {
				System.out.println("Transferência realizada com sucesso!");
			}
			
			System.out.println("Saldo da conta "+davison.Nome+" é de "+minhaConta.saldo);
			System.out.println("Saldo da conta "+c1.titular.Nome+" é de "+c1.saldo);
		}
	}
