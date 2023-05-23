public class Enunciado5 {
	
public int Operação(int num11, int num21, String operador) {
	
	int resultado = 0;
	
      switch (operador) {
      case "+":
    	  resultado = num11 + num21;
          break;
      case "-":
    	  resultado = num11 - num21;
          break;
      case "*":
    	  resultado = num11 * num21;
          break;
      case "/":
    	  resultado = num11 / num21;
          break;
      default:
          System.out.println("Operador inválido.");
  }
  return resultado;
}

}









