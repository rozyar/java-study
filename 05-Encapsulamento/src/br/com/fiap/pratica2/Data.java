package br.com.fiap.pratica2;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	
	//Crie um método para retornar a data como string no formato: dd/mm/aaaa;
	public String retornarData() {   
		return retornarDia() + "/" + retornarMes() + "/" + retornarAno() + " E o mes por extenso -> " + retornarNomeMes();
	}
	
	//Crie um mé́todo para validar o dia. Ele deve estar entre 1 e 31.
	//Caso contrário inicializar o atributo com o valor 1;
	
	public int validarDia(int dia) {
		if(dia >= 1 && dia <= 31) {
			return this.dia = dia;
		}else {
			return this.dia = 1;
		}
	}
	
	//Crie um método para validar o mês. Ele deve estar entre 1 e 12.
	//Caso contrário inicializar o atributo com 1;
	public int validarMes(int mes){
		if(mes >=1 && mes <= 12) {
			return this.mes = mes;
		}else {
			return this.mes = 1;
		}
	}
	
	//Crie um método para validar o ano. Ele não deve ser negativo.
	//Caso contrá rio inicializar o atributo com 2023;
	public int validarAno(int ano) {
		if (ano < 0) {
			return this.ano = 2023;
		}else {
			return this.ano = ano;
		}
	}
	
	//Atribuir dia
	public int atribuirDia(int dia) {
		return this.dia = validarDia(dia);
	}
	
	//Atribuir mes
	public int atribuirMes(int mes) {
		return this.mes = validarMes(mes);
	}
	//atribuir ano
	public int atribuirAno(int ano) {
		return this.ano = validarAno(ano);
	}
	
	//criar um metodo para retornar Dia
	public int retornarDia() {
		return this.dia;
	}
	
	//criar um metodo para retornar Mes
	public int retornarMes() {
		return this.mes;
	}
	
	//criar um metodo para retornar Ano
	public int retornarAno() {
		return this.ano;
	}
	
	//criar um metodo que retorne o nome do mês de acordo com o numero
	//que está armazenado no atributo mês;
	public String retornarNomeMes() {
		
		Month mes = Month.of(this.mes); 
		//A classe Month possui um método chamado (of) que permite criar uma instância do mês a partir de um valor numérico de 1 a 12,
		//correspondente aos meses do ano.
		
		
		String nomeMes = mes.getDisplayName(TextStyle.FULL, new Locale("pt", "Br"));
		//O método getDisplayName é um método da classe java.time.temporal.TemporalAccessor que retorna uma string com o 
		//nome formatado de um campo de tempo. Esse método é geralmente usado para obter uma representação legível para humanos 
		//de um valor de data ou hora, como nesse exemplo o nome completo do mês, mas poderia ser o nome do dia ou o nome do fuso horario.
				
		//O "TextStyle" significa o estilo que o texto ira voltar para a gente e nos podemos definir ele por completo ou na forma curta
		//como SHORT ou FULL.
				
		//Já o locale nos retorna para a localidade e a lingua que queremos que a String seja escrita como mostra abaixo seria em portugues no local do Brasil 
		//mas poderia ser em qualquer lingua ou localidade que tenha na api no java
		
		//e estamos salvando isso tudo na variavel nomeMes para no final retornarmos o nome do mes;
		return nomeMes;	
	}

}

	
