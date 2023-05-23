public class Enunciado3 {

	private double n1;
	private double n2;
	private double n3;
	private double n4;
	private double n5;
	private double Media1;
	private double  Media2;
	
	public void CalcularMedia1() {
		if (Media1() >= 7) {
			System.out.println("APROVADO");
			
		}
	}
	public void CalcularMedia2() {
		if (Media2()>= 7) {
			System.out.println("APROVADO");
		}else {
			System.out.println("REPROVADO");
		}
	}
	public double Media1() {
		Media1 = (getN1()+ getN2()+ getN3()+ getN4())/4;
		return Media1;
	}
	public double Media2() {
		Media2 = (getN1()+ getN2()+ getN3()+ getN4()+ getN5())/5;
		return Media2;
	}

	
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public double getN4() {
		return n4;
	}
	public void setN4(double n4) {
		this.n4 = n4;
	}
	public double getN5() {
		return n5;
	}
	public void setN5(double n5) {
		this.n5 = n5;
	}
}