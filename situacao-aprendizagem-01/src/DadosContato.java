
public class DadosContato {
	
	private String email;
	private String telefone;
	
	//começo email
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		
		if(email.isEmpty()) { 
			System.out.println("NOME OBRIGATÓRIO");
			System.exit(0);
			}else {
		this.email = email;}
		
		//fim email
		
		
		//começo telefone
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		
		if(telefone.isEmpty()) { 
			System.out.println("CAMPO OBRIGATÓRIO");
			System.exit(0);
			}else { 
			int tamanho = telefone.length(); {
			if(tamanho < 15) {
				System.out.println("INFORME O NÚMERO DE TELEFONE COMPLETO");
				System.exit(0);
				}else {
				this.telefone = telefone;
					
				}
			}		
		}
		
		
		//fim email
	}
	
	//fim do código
}
