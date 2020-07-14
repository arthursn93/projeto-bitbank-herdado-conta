package br.com.bitbank.banco.teste.util;

import java.util.Arrays;

public class TesteSortArrays {

	public static void main(String[] args) {

		int[] numeros = new int[] { 23, 10, 40, 50, 60, 8 };
		
		Arrays.sort(numeros); // método utilitário sort
		
		System.out.println(Arrays.toString(numeros)); // método utilitário toString
	}
}
