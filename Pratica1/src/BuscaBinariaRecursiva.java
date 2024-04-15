import java.util.Arrays;

public class BuscaBinariaRecursiva {
    public static void main(String[] args) throws Exception {
        int array[] = {3, 5, 6, 7, 10, 12, 1, 2};
        Arrays.sort(array);
        int elemento = 7;


        int resultado = buscaBinariaRecursiva(array, elemento);
        if (resultado < 0) {
            System.err.println("Elemento não encontrado");
        } else {
            System.out.println("| Elemento encontrado no índice: " + resultado + " | na posição: " + (resultado + 1) + " |");
        }
    }
    
    public static int buscaBinariaRecursiva(int array[], int elemento) {
        return buscaRecursiva(array, elemento, 0, array.length - 1);
    }

    public static int buscaRecursiva(int array[], int elemento, int menor, int maior) {
        if (menor > maior) {
            return -1;
        }
        int media = (menor + maior) / 2;
        if (array[media] == elemento) {
            return media;
        }
        if (array[media] < elemento) {
            return buscaRecursiva(array, elemento, media + 1, maior);
        } else {
            return buscaRecursiva(array, elemento, menor, media - 1);
        }
    }
}
