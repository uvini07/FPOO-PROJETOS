
public class TipoTriangulo {
     
    	 private int A;
		private int B;
		private int C;
		private int resultado;

		public void Cauculos(int i) {
			
    	 }

		public int getA() {
			return A;
		}

		public void setA(int A) {
			this.A = A;
		}

		public int getC() {
			return C;
		}

		public void setC(int C) {
			this.C = C;
		}

		public int getB() {
			return B;
		}

		public void setB(int B) {
			this.B = B;
		}

		public int getResultado() {
			return resultado;
		}

		public void setResultado(int resultado) {
			
			  if (A == B && B == C) {
			        System.out.println("Este é um triângulo equilátero");
			    } else { if (A == B && A != C)  {
			        System.out.println("Este é um triângulo isósceles");
			    } else {
			        System.out.println("Este é um triângulo escaleno");
			    }
			
			this.resultado = resultado;
		}
		}
}