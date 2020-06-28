
public class TestaConta3 {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 123123);
		cc.depositar(2000, cc);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());		
		
		ContaCorrente cd = new ContaCorrente(231,232323);
		cd.setSaldo(-200);
		
		// ver sobre excecao
		
		System.out.println(cd.getSaldo());

	}

}
