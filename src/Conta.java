
public class Conta {
	private int numero;
	private Pessoa titular;
	private double saldo;
	private int agencia;
	static int totalDeContas = 1;

	public Conta(Pessoa titular, double saldo, int agencia) {
		this.numero = totalDeContas;
		totalDeContas++;
		this.titular = titular;
		this.saldo = saldo;
		this.agencia = agencia;
	}

	public void deposita(double valorASerDepositado) {

		this.saldo += valorASerDepositado;

	}

	public void saca(double valorASerSacado) throws Exception {
		if (valorASerSacado <= this.saldo){
			this.saldo -= valorASerSacado;
		
		}
		else {
			throw new Exception("saldo insuficiente");

		}
	}

	public void transfere(Conta destino, double valorASerTransferido) {
		this.saldo -= valorASerTransferido;
		destino.saldo += valorASerTransferido;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

}
