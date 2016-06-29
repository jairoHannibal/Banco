
public class Gerente extends Funcionario 
{
		
	
		protected Gerente(String nome, double salario, int senha) {
			super(nome, salario, senha);
		
	}

		public double getBonus(){
			return this.getSalario() * 0.3;
		}
		
		public void cobraEntrega(){
			System.out.println("esta pronto");
		}
		
		
		

		

}
