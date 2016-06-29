
public abstract class Funcionario {
	protected String nome;
	protected double salario;
	private int senha;
	
	protected Funcionario(String nome, double salario, int senha){
		this.nome = nome;
		this.senha = senha;
		this.salario = salario;
		
	}
	
	public abstract  double getBonus();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	

	
	
	

}
