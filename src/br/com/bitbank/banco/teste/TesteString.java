package br.com.bitbank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		//String nome = "Bitbank"; //-> object literal

		//String vazio3 = "     Bitbank       ";
		//System.out.println(vazio3.contains("Bit")); //verifica se possui caracteres relacionado a string
		
		//String vazio2 = ""; // variável está sem char e espaço
		//System.out.println(vazio2.isEmpty()); // retorna um booleano sem espaço e char, true
		
		//String vazio1 = " "; // variável está com espaço
		//System.out.println(vazio1.isEmpty()); // retorna um booleano com espaço ativo, false
		
		//String vazio = " Bit     "; // variável está com espaço
		//String outroVazio = vazio.trim(); // trim anula espaço
		//System.out.println(outroVazio.isEmpty()); // retorna um booleano que ignora espaço, true
				
		//String outro = new String("Bitbank"); //-> errado, não segue as devidas convenções...

		//String outra = nome.replace("Bi", "bI");
		
		//char cPosicao = nome.charAt(2); // -> saber a posição do caracter, char...
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
		
		// string nome declara Bitbank, é imutavel, não é possível mudar seu replace
		//System.out.println(nome);
		// porém, se outra string recebe esse replace, é possível realizar a alteração
		//System.out.println(outra);
	}

}
