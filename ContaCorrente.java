
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int Agencia, int numero) {
		super(Agencia, numero);
	}
	
	@Override	
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

}
