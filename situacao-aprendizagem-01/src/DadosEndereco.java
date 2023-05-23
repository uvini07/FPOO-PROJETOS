
public class DadosEndereco {

	private String cep;	
	private String logradouro;	
	private String numero;	
	private String bairro;	
	private String cidade;	
	private String estado;
	
	//Começo da classe Cep
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		
		if(cep.isEmpty()) { 
			System.out.println("CAMPO OBRIGATÓRIO");
			System.exit(0);
			}else { 
			int tamanho = cep.length(); {
			if(tamanho < 3) {
				System.out.println("MINIMO DE TRÊS CARACTERES");
				System.exit(0);
				}else {	
				this.cep = cep;	
				}
			}		
		}
		
		
		
		//Fim da classe Cep
	}
	//Começo da classe Logradouro
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		
		if(logradouro.isEmpty()) { 
			System.out.println("CAMPO OBRIGATORIO");
			System.exit(0);
			}else { 
			int tamanho = logradouro.length(); {
			if(tamanho < 3) {
				System.out.println("MINIMO DE TRÊS CARACTERES");
				System.exit(0);
				}else {	
				this.logradouro = logradouro;	
				}
			}		
		}
		
		
	//Fim da classe Logradouro	
	}
	
	//Começo da classe Número
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		
		if(numero.isEmpty()) { 
			System.out.println("CAMPO OBRIGATÓRIO");
			System.exit(0);
			}else {
			this.numero = numero;	
		}
		
		
		//Fim da classe Número
	}
	
	//Começo da classe Bairro	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		
		if(bairro.isEmpty()) { 
			System.out.println("CAMPO OBRIGATÓRIO");
			System.exit(0);
			}else {
			this.bairro = bairro;	
		}
		
		
//Fim da classe Bairro
	}
	
	//Começo da classe Cidade
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		
		if(cidade.isEmpty()) { 
			System.out.println("CAMPO OBRIGATÓRIO");
			System.exit(0);	
			}else {
				this.cidade = cidade;	
		}
		
		
		//Fim da classe Cidade
	}
	
	//Começo da classe Estado
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		
		if(estado.isEmpty()) { 
			System.out.println("CAMPO OBRIGATÓRIO");
			System.exit(0);
			}else { 
			int tamanho = estado.length(); {
			if(tamanho < 2) {
				System.out.println("INFORME SEU ESTADO USANDO SILGAS (2 caracteres)");
				System.exit(0);
				}else {
				this.estado = estado;	
				}
			}		
		}
		
		
		
		//Fim da classe Estado
	}	
	
	//fim do Código
}
