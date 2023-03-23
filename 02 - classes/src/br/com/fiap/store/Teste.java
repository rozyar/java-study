package br.com.fiap.store;

public class Teste {
	
	//Criar o método que começa a execução do programa Java
	//main - CTRL + espaço

	public static void main(String[] args) {
		
		//Criar um objeto do tipo Editora (Instanciar a classe)
		Editora abril = new Editora();
		abril.nome = "Editora Abril";
		abril.endereco = "Marginal Tiete";
		abril.cnpj = "133.131.323/0001-12";
		
		//Criar um outro objeto do tipo Editora
		Editora rocco = new Editora();
		
		//Colocar informações dentro do objeto
		rocco.nome = "Rocco";
		rocco.endereco = "Fim do mundo";
		rocco.cnpj = "133.131.323/0001-12";
		
		//Criar um objeto do tipo Ebook
		Ebook harryPotter = new Ebook();
		
		//colocar informações dentro  do objeto
		harryPotter.nome = "Harry Potter e a Pedra Filosofal";
		harryPotter.genero = "Romance, Literatura fantástica, Literatura infantil, Alta fantasia";
		harryPotter.idioma = "Português(Brasil)";
		harryPotter.quantidadepagina = 264;
		harryPotter.valor = 30.99;
		harryPotter.Resumo  = "Harry Potter é um garoto órfão que vive infeliz com seus tios, os Dursleys. Ele recebe uma carta contendo um convite para ingressar em Hogwarts, uma famosa escola especializada em formar jovens bruxos. Inicialmente, Harry é impedido de ler a carta por seu tio, mas logo recebe a visita de Hagrid, o guarda-caça de Hogwarts, que chega para levá-lo até a escola. Harry adentra um mundo mágico que jamais imaginara, vivendo diversas aventuras com seus novos amigos, Rony Weasley e Hermione Granger.";
		harryPotter.rating = 4.9;
		harryPotter.editora = rocco;
		//Exibir o nome da editora que esta na variavel abril
		//sysoit -> CTRL + espaço
		System.out.println(rocco.nome);
		//Exibir o nome, valor e o nome da editora do ebbok
		System.out.println("Nome da livro: " + harryPotter.nome + " Valor:" + harryPotter.valor + " Editora:" + rocco.nome);		
		
		//Objeto Contato(rayzor)
		Contato contatoRayzor = new Contato();
		
		//informações Contato
		contatoRayzor.nome = "Rayzor Anael Mamedio Arboleya da Silva";
		contatoRayzor.telefone = "(11)23452-3000";
		
		//Objeto Cliente
		Cliente rayzor = new Cliente();
		
		//informações
		rayzor.nome = "Rayzor Anael Mamedio Arboleya da Silva";
		rayzor.email = "rayzor@arboleya.me";
		rayzor.senha = "123456";
		rayzor.cpf = "111.111.111-11";
		rayzor.cnpj = "111.111.111/1111-11";
		rayzor.contato = contatoRayzor;
		
		//Objeto CarrinhoCompras
		CarrinhoCompras carrinho = new CarrinhoCompras();
		
		//informações CarrinhoCompras
		carrinho.cliente = rayzor;
		carrinho.ebook = harryPotter;
		carrinho.formaEnvio = "Correios";
		carrinho.valorTotal = 30.99;
		carrinho.quantidadeEbook = 1;
	}
	
}
