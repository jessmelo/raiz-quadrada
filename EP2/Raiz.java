/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   Turma 04 - Norton Trevisan Roman                              **/
/**                                                                 **/
/**   Segundo Exercício-Programa                                    **/
/**                                                                 **/
/**   Jéssica da Paixão Melo               Nº USP: 10875986         **/
/**                                                                 **/
/**   03/05/2020                                                    **/
/*********************************************************************/

/*
	Cálculo para raiz quadrada
*/

public class Raiz {

	/* 
		Método que retorna o valor absoluto de um número
	*/
	
	static double valorAbs (double num){
		double abs;

		if (num > 0){
			abs = num;
		} else {
			abs = num * -1;
		}
		return abs;
	}

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
		
        double xi = a / 2.0; // x0
		double abs = 1.0;  // variavel que guarda valor absoluto

		double raiz = 1.0; // variavel que guarda a raiz

		while (abs >= epsilon){
			raiz = xi;
			double xAnt = xi;
            xi = 1/2.0 * (xi + (a/xi));
			double num = xAnt - xi;    
			abs = valorAbs(num);
        }
		
		return raiz;
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