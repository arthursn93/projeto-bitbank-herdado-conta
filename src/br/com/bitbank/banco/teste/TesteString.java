package br.com.bitbank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		//String nome = "Bitbank"; //-> object literal

		//String vazio3 = "     Bitbank       ";
		//System.out.println(vazio3.contains("Bit")); //verifica se possui caracteres relacionado a string
		
		//String vazio2 = ""; // vari�vel est� sem char e espa�o
		//System.out.println(vazio2.isEmpty()); // retorna um booleano sem espa�o e char, true
		
		//String vazio1 = " "; // vari�vel est� com espa�o
		//System.out.println(vazio1.isEmpty()); // retorna um booleano com espa�o ativo, false
		
		//String vazio = " Bit     "; // vari�vel est� com espa�o
		//String outroVazio = vazio.trim(); // trim anula espa�o
		//System.out.println(outroVazio.isEmpty()); // retorna um booleano que ignora espa�o, true
				
		//String outro = new String("Bitbank"); //-> errado, n�o segue as devidas conven��es...

		//String outra = nome.replace("Bi", "bI");
		
		//char cPosicao = nome.charAt(2); // -> saber a posi��o do caracter, char...
		//System.out.println(cPosicao);
		
		//int index = nome.indexOf("an");
		//System.out.println(index);
		
		//String subpos = nome.substring(2); // -> conta a string a partir do indice apontado
		//System.out.println(subpos);
		
		//System.out.println(nome.length());
		//for (int i = 0; i < nome.length(); i++) {
		//	System.out.println(nome.charAt(i));
		//}

		//String outra = nome.replace('B', 'b'); //-> utilizamos aspas simples para 1 caracter, char...
		
		//String outra = nome.toUpperCase();
		
		// string nome declara Bitbank, � imutavel, n�o � poss�vel mudar seu replace
		//System.out.println(nome);
		// por�m, se outra string recebe esse replace, � poss�vel realizar a altera��o
		//System.out.println(outra);
	}

}
