import java.util.List;
import java.util.Arrays;

public class MetodoBurbuja_Anny{

    public void metodoBurbuja(List<Integer> list) {

        System.out.println("METODO BURBUJA");
        System.out.println("Original: "+ list);
        
        for(int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                int temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
                System.out.println("Intercambio: " + list);
                i = -1; // Reiniciar el ciclo
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,2,1,5,6,3,3,4);
        MetodoBurbuja_Anny mb = new MetodoBurbuja_Anny();
        mb.metodoBurbuja(list);
        System.out.println("Orden Final: "+list);
    }
}
