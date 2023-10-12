import java.util.Arrays;

public class met_ord_burbuja {
    public static void main(String[] args) {
        int [] list_nums = {3,5,2,4,1,7,6};
        int aux = -1;
        boolean exchange = false;
        for (int j = 0; j<list_nums.length; j++) {
            for (int i = 0; i<list_nums.length; i++) {
                System.out.println(list_nums[i]);
                if(i == list_nums.length -1 ) {
                    System.out.println("Fin del ordenamiento");
                }
                else if (list_nums[i] > list_nums[i+1]) {
                    aux = list_nums[i];
                    list_nums[i] = list_nums[i+1];
                    list_nums[i+1] = aux;
                    exchange = true;
                    System.out.println(exchange);

                }
            }
        }

        // Convertir el array en una cadena y luego imprimirlo
        String arrayAsString = Arrays.toString(list_nums);
        System.out.println("Array ordenado: " + arrayAsString);

    }
}
