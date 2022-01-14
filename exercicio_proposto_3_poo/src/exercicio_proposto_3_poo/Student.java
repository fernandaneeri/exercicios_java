package exercicio_proposto_3_poo;

public class Student {
	
	public String nome;
	public double n1, n2, n3;
	
	public double soma() {
		return n1 + n2 + n3;
	}
	
	public double faltouPontos () {
		return 60 - soma();
	}
	

}
