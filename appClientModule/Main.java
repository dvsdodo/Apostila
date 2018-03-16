	class Conta {
		
		int numero;
		double saldo;
		double limite;
		Cliente titular;
		
		boolean saca (double valor) {
			if (this.saldo < valor) {
				return false;
			} else {
				this.saldo = this.saldo - valor;
				return true;
			}
		}
		
		public void deposita (double quantidade) {
			this.saldo += quantidade;
		}
		
		boolean transferePara (Conta destino, double valor) {
			boolean retirou = this.saca(valor);
			if (retirou == false) {
				return false;
			} else {
				destino.deposita(valor);
				return true;
			}
			
		}
				
	}
	
	class Cliente {
		String Nome;
		String CPF;
		String Sobrenome;
	}