import java.util.Arrays;
import java.util.Collections;

public class OrdenamientoBurbuja {
    public static void arregloInverso(String[]arreglo){
        int total= arreglo.length;
        int total2= arreglo.length;
        for(int i = 0; i<total2;i++){
            String actual= arreglo[i];
            String inverso= arreglo[total2-1-i];
            arreglo[i]= inverso;
            arreglo[total-1-i]=actual;
            total2--;
        }
    }
    public static void main(String[] args) {
        //Instanciacion
        //String[] productos = new String[7];
        String [] productos = {"Memoria Kingston","Samsung Galaxy",
                "Macbook air","Chromecast 4ta gen",
                "Usb 64gb","Notebook Acer","Camara Iqual"
        };
        int total = productos.length;

        //Metodo Burbuja
        for (int i=0; i<total; i++){
            for(int j=0;j<total; j++){
                if(productos[i].compareTo(productos[j])<0){
                    String auxiliar= productos[i];
                    productos[i]=productos[j];
                    productos[j]=auxiliar;
                }
            }
        }

        //Clase helper Arrays
        //Arrays.sort(productos);
        //arregloInverso(productos);
        System.out.println("Usando for");
        for(int i = 0; i< total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);

        }
       //Usando collections// Collections.reverse(Arrays.asList(productos));
        
}
}
