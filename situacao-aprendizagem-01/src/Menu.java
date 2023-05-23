import java.util.Scanner;

public class Menu {
	
	DadosPessoais objdadospessoais = new DadosPessoais();
	DadosContato objdadoContato = new DadosContato();
	DadosEndereco objdadoendereco = new DadosEndereco();
	
	public void ExibirMenu() {
		
			int opcao = 0;
			Scanner objScan = new Scanner(System.in);
		
			while(opcao != 5) {
			
			System.out.println("Escolha a Opção pelo Numero: ");
			System.out.println("1 - Cadastrar Dados Pessoais");
			System.out.println("2 - Cadastrar Dados Contato");
			System.out.println("3 - Cadastrar Dados Endereço");
			System.out.println("4 - Exibir Dados");
			System.out.println("5 - Sair");
			
			opcao = objScan.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite seu nome: ");
				objdadospessoais.setNome(objScan.next());
				
				System.out.println("Digite seu Sobrenome: ");
				objdadospessoais.setSobrenome(objScan.next());
				
				System.out.println("Digite a Data de Nascimento assim XX/XX/XXXX: ");
				objdadospessoais.setData(objScan.next());
				
				System.out.println("Digite seu genero: ");
				objdadospessoais.setGenero(objScan.next());
				
				break;
			
			case 2:
				
				System.out.println("Digite seu Email");
				objdadoContato.setEmail(objScan.next());
				
				System.out.println("Digite seu telefone assim (MM)MMMMM-MMM-M");
		        objdadoContato.setTelefone(objScan.next());
		        break;
		        
			case 3:
				
		        System.out.println("Digite o seu Cep: ");
		        objdadoendereco.setCep(objScan.next());
		        
		        System.out.println("Digite o seu Logradouro: ");
		        objdadoendereco.setLogradouro(objScan.next());
		        
		        System.out.println("Digite o seu Numero: ");
		        objdadoendereco.setNumero(objScan.next());
		        
		        System.out.println("Digite o seu Bairro: ");
		        objdadoendereco.setBairro(objScan.next());
		        
		        System.out.println("Digite o sua Cidade: ");
		        objdadoendereco.setCidade(objScan.next());
		        
		        System.out.println("Digite o seu Estado: ");
		        objdadoendereco.setEstado(objScan.next());
		        break;
		        
			case 4:
				
				System.out.println("Exibir Dados");
				
				System.out.println("Nome: " + objdadospessoais.getNome());
				System.out.println("Sobrenome: " + objdadospessoais.getSobrenome());
				System.out.println("Data de Nascimeno: " + objdadospessoais.getData());
				System.out.println("Genero: " + objdadospessoais.getGenero());
				
				System.out.println("Email: " + objdadoContato.getEmail());
				System.out.println("Telefone: " + objdadoContato.getTelefone());
				
				System.out.println("CEP: " + objdadoendereco.getCep());
				System.out.println("Logradouro: " + objdadoendereco.getLogradouro());
				System.out.println("Numero: " + objdadoendereco.getNumero());
				System.out.println("Bairro: " + objdadoendereco.getBairro());
				System.out.println("Cidade: " + objdadoendereco.getCidade());
				System.out.println("Estado: " + objdadoendereco.getEstado());
				break;
			
			case 5:
				
				System.out.println("--<3-- Obrigado por usar nosso Programa--<3 --");				
				break;
			
				
			default:
				
				System.out.println("Opção Invalida");
				break;				
				
			}
		}
		
	}

}
