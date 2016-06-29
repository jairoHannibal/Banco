
public class Desenvolvedor extends Funcionario{

	protected Desenvolvedor(String nome, double salario,int senha) {
		super(nome, salario, senha);
	}
		
		public double getBonus(){
			
			return this.getSalario() * 0.25;
		}
	
	
	

}
