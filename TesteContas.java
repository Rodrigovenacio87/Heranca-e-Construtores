
public class TesteContas {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposito(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposito(200);
		
		cc.transferencia(10.0 ,cp);
		
		System.out.println(" conta corrente " + cc.getSaldo());
		System.out.println(" conta poupanca " + cc.getSaldo());


	}
}