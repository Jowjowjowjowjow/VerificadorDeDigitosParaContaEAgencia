package UNIRIO.VerificadorBancos;

public class Main {

	public static void main(String[] args) {
		Verificador verificador = new Verificador();
		try {
			System.out.println(verificador.VerificaAgencia("1584-9"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(verificador.VerificaConta("00210169-6"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
