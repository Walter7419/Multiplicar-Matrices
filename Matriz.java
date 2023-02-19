public class Matriz {
    private int[][] matriz;
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new int[filas][columnas];
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int getValor(int fila, int columna) {
        return matriz[fila][columna];
    }

    public void setValor(int fila, int columna, int valor) {
        matriz[fila][columna] = valor;
    }

    public Matriz multiplicar(Matriz Matriz2) {
        if (columnas != Matriz2.getFilas()) {
            System.out.println("Las matrices no se pueden multiplicar");
        }
        
        Matriz resultado = new Matriz(filas, Matriz2.getColumnas());

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < Matriz2.getColumnas(); j++) {
                int valor = 0;
                for (int k = 0; k < columnas; k++) {
                    valor += matriz[i][k] * Matriz2.getValor(k, j);
                }
                resultado.setValor(i, j, valor);
            }
        }

        return resultado;
    }
}