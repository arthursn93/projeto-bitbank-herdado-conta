
public class TestaConta4 {

	public static void main(String[] args) {
		
		ContaCorrente ccArthur = new ContaCorrente(123,123123);
		ContaCorrente ccRicardo = new ContaCorrente(233,423123);
		
		ccArthur.setSaldo(2000);
		//ccRicardo.setSaldo(250);
		//ccArthur.depositar(250, ccArthur);
		
		System.out.println("Arthur: " + ccArthur.getSaldo()); // ok!
		
		ccArthur.sacar(133); // ok!
		
		System.out.println("Arthur depois de sacar: " + ccArthur.getSaldo());
		
		ccArthur.transfere(100, ccRicardo); // ok!
		
		System.out.println("Ricardo c/ transferencia: " + ccRicardo.getSaldo());
		
		ccRicardo.depositar(300); // ok!
		
		System.out.println("Ricardo c/ deposito recebido: " + ccRicardo.getSaldo());
	}

}
