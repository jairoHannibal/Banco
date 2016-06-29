
public class principal {

	public static void main(String[] args) {
		/*Pessoa jairo = new Pessoa("jairo","1234567");
		Pessoa flavia = new Pessoa("flavia","66666666666");
		Pessoa jose = new Pessoa("jose","66666666666");
		
		Conta contajairo = new Conta(jairo,2000, 321);
		Conta contaflavia = new Conta(flavia,2000, 456);
		Conta contajose = new Conta(flavia,2000, 456);
		
		contaflavia.transfere(contajairo, 100);
		contaflavia.deposita(2345);
		
		System.out.println(contajairo.getSaldo());
		System.out.println(contaflavia.getSaldo());
		System.out.println(contaflavia.getNumero());
		System.out.println(contajairo.getNumero());
		
		Desenvolvedor joao = new Desenvolvedor("joao", 100.0,12345);
		Gerente jose = new Gerente("jose",100,23456);
		SomaBonus soma = new SomaBonus();
		SistemaInterno sistema = new SistemaInterno();
		
		soma.adciona(joao);
		soma.adciona(joao);*/
		Pessoa joao = new Pessoa("joao", "12345");
		Conta contajoao = new Conta(joao,100.0, 12345);
		
		try { contajoao.saca(13);
		}catch (Exception e){
			System.out.println("saldo insuficiente");
		}
		
			System.out.println(contajoao.getSaldo());
		}
		
		
		
	}


