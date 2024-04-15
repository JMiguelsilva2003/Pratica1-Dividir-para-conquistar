import java.util.Arrays;

public class BuscaBinariaIterativa {
    public static void main(String[] args) throws Exception {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int elemento = 100;
        int indice = buscaBinariaIterativa(array, elemento);
        if (indice != -1) {
            System.out.println("O número foi encontrado na índice " + indice);
        } else {
            System.out.println("O número não foi encontrado");
        }
    }

    public static int buscaBinariaIterativa(int array[], int elemento) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (array[meio] == elemento)
                return meio;

            if (array[meio] < elemento)
                esquerda = meio + 1;
            else
                direita = meio - 1;
        }

        return -1;
    }
}
