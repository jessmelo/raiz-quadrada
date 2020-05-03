/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   <turma> - <nome do professor>                                 **/
/**                                                                 **/
/**   Segundo Exercício-Programa                                    **/
/**                                                                 **/
/**   Jéssica da Paixão Melo               Nº USP: 10875986         **/
/**                                                                 **/
/**   <data de entrega>                                             **/
/*********************************************************************/

/*
	Cálculo para raiz quadrada
*/

import java.lang.Math;

public class Raiz {
	/*
		Calcula a raiz quadrada de um valor, com uma determinada
		precisão. Retorna esse valor, ou -1 quando:
		
		* a < 0
		* epsilon <= 0
		* epsilon >= 1
		
		Parâmetro:
			a - valor cuja raiz quadrada será calculada
			epsilon - precisão do cálculo
	*/
	static double raizQuadrada(double a, double epsilon) {
        // escreva seu código aqui
        if(a < 0 || epsilon >= 1 || epsilon <= 0){
            return -1;
        } 
        double xi = a/2;
        double abs = 0;
        while(abs >= epsilon){
            xi = 1/2 * (xi + (a / xi));
            abs = Math.abs(xi + 1 - xi);
        }
        return xi;
	}


	/*
		Apenas para seus testes. ISSO SERÁ IGNORADO NA CORREÇÃO
	*/
	public static void main(String[] args) {
		// escreva seu código (para testes) aqui

		// Exemplo de teste:
		double valor = 63;
		double precisao = 0.001;
		System.out.println("Raiz de : "+valor+" = "+raizQuadrada(valor, precisao));
	}
}