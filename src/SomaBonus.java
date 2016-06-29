
public class SomaBonus {
	
	double total = 0;
	
	public void adciona(Funcionario f){
		
		total = total + f.getBonus();
	}

	public double getTotal(){
		return this.total;
	}
	

}
