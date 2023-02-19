
public class MainMatrices {

	public static void main(String[] args) {
		
		Matriz matriz1 = new Matriz(2, 3);
        matriz1.setValor(0, 0, 1);
        matriz1.setValor(0, 1, 2);
        matriz1.setValor(0, 2, 3);
        matriz1.setValor(1, 0, 4);
        matriz1.setValor(1, 1, 5);
        matriz1.setValor(1, 2, 6);

        // Crear la segunda matriz
        Matriz matriz2 = new Matriz(3, 2);
        matriz2.setValor(0, 0, 7);
        matriz2.setValor(0, 1, 8);
        matriz2.setValor(1, 0, 9);
        matriz2.setValor(1, 1, 10);
        matriz2.setValor(2, 0, 11);
        matriz2.setValor(2, 1, 12);

        // Multiplicar las matrices
        Matriz matrizResultado = matriz1.multiplicar(matriz2);

        // Imprimir la matriz resultante
        System.out.println("La matriz resultante es:");
        for (int i = 0; i < matrizResultado.getFilas(); i++) {
            for (int j = 0; j < matrizResultado.getColumnas(); j++) {
                System.out.print(matrizResultado.getValor(i, j) + " ");
            }
            System.out.println();
        }
	}

}
