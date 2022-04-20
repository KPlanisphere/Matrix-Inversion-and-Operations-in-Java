//------------> InversaMatriz
//SOLO TIENE LA LOGICA PARA TRANSFORMARLO A POO, VER TOpMatricesRacionales.java

import java.util.Scanner;

class InversaMatriz{
	public static void main(String[] args){
		double matriz[][],ma[][],pivote;
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que clacula la inversa de una matriz nxn");
		System.out.print("Dame el tamanio de n: ");
		
		n = sc.nextInt();
		matriz = new double [n][n];
		ma = new double [n][2*n];
		
		System.out.println("Ingresa los datos de la matriz");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.printf("Matriz[%d][%d]: ",(i+1),(j+1));
				matriz[i][j] = sc.nextDouble();
				ma[i][j] = matriz[i][j]; //COPIA DE LA PRIMERA MITAD DE LA MATRIZ AMPLIADA
			}
			System.out.println();
		}
		
		//CONSTRUIMOS LA SEGUNDA PARTE DE LA MATRIZ AMPLIADA
		for(int i=0;i<n;i++){
			for(int j=n;j<2*n;j++){
				ma[i][j] = 0;
			}
			ma[i][i+n] = 1;
		}
		
		//METODO DE GAUSS-JORDAN (MATRIZ ESCALONADA)
		//HACE LA MATRIZ TRIANGULAR INFERIOR DE CEROS
		for(int k=0;k<n-1;k++){
			for(int i=k+1;i<n;i++){
				pivote = -ma[i][k]/ma[k][k];
				for(int j=k;j<2*n;j++){
					ma[i][j] = pivote*ma[k][j] + ma[i][j];
				}
			}
		}
		//HACE LA MATRIZ TRIANGULAR SUPERIOR DE CEROS
		for(int k=n-1;k>=0;k--){
			for(int i=k-1;i>=0;i--){
				pivote = -ma[i][k]/ma[k][k];
				for(int j=k;j<2*n;j++){
					ma[i][j] = pivote*ma[k][j] + ma[i][j];
				}
			}
		}
		
		//HACER UNOS EN LA DIAGONAL
		for(int i=0;i<n;i++){
			for(int j=n; j<2*n;j++){
				ma[i][j] = ma[i][j]/ma[i][i];
			}
			ma[i][i] = ma[i][i]/ma[i][i];
		}
		
		//IMPRECION DE LA MATRIZ AMPLIADA
		for(int i=0;i<n;i++){
			for(int j=0;j<2*n;j++){
				System.out.printf("%f\t", ma[i][j]);
			}
			System.out.println();
		}
	}//FIN MAIN

}//FIN CLASE InversaMatriz
