package UNIRIO.VerificadorBancos;

public class Verificador {

	public boolean VerificaAgencia(String agencia) throws Exception {
		char[] digitosAgencia = null;
		digitosAgencia = agencia.toCharArray();
		int somaDigitos = 0;
		int multiplicador = 5;
		int digito = -1;
		
		if(digitosAgencia[4] != '-' || digitosAgencia.length != 6) {
			throw new Exception("Agencia Inválida.");
		}
		
		
		for (int i = 0; i <= 3; i++) {
			somaDigitos += Integer.parseInt(String.valueOf(digitosAgencia[i])) * multiplicador;
			multiplicador--;
		}
		digito = 11 - (somaDigitos%11);
		if(digito == 10) {
			if(String.valueOf(digitosAgencia[5]).equalsIgnoreCase("x")) {
				return true;
			}else {
				return false;
			}
		}else {
			if(Integer.parseInt(String.valueOf(digitosAgencia[5])) == digito){
				return true;
			}else {
				return false;
			}
		}
	}
	
	public boolean VerificaConta(String conta) throws Exception {
		char[] digitosConta = null;
		digitosConta = conta.toCharArray();
		int somaDigitos = 0;
		int multiplicador = 9;
		int digito = -1;
		
		if(digitosConta[8] != '-' || digitosConta.length != 10) {
			throw new Exception("Conta Inválida.");
		}
		
		for (int i = 0; i <= 7; i++) {
			somaDigitos += Integer.parseInt(String.valueOf(digitosConta[i])) * multiplicador;
			multiplicador--;
		}
		digito = 11 - (somaDigitos%11);
		if(digito == 10) {
			if(String.valueOf(digitosConta[9]).equalsIgnoreCase("x")) {
				return true;
			}else {
				return false;
			}
		}else {
			if(Integer.parseInt(String.valueOf(digitosConta[9])) == digito){
				return true;
			}else {
				return false;
			}
		}
	}
}
