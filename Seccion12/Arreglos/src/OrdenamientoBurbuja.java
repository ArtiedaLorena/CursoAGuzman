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
    public static void sortBurbuja(Object[]arreglo){
        int total = arreglo.length;
        int contador = 0;
        for (int i=0; i<total; i++){
            for(int j=0;j<total-1-i; j++){
                //Cast a Comparable
                if( ((Comparable) arreglo[j+1]).compareTo(arreglo[j])<0){
                    Object auxiliar= arreglo[i];
                    arreglo[i]=arreglo[j+1];
                    arreglo[j]=auxiliar;
                }
                contador ++;
            }
        }
        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {
        //Instanciacion
        //String[] productos = new String[7];
        String [] productos = {"Memoria Kingston","Samsung Galaxy",
                "Macbook air","Chromecast 4ta gen",
                "Usb 64gb","Notebook Acer","Camara Iqual"
        };
        int total = productos.length;
        sortBurbuja(productos);


        //Metodo Burbuja Optimizado
        /*for (int i=0; i<total-1; i++){
            for(int j=0;j<total-1-i; j++){
                if(productos[i].compareTo(productos[j])<0){
                    String auxiliar= productos[i];
                    productos[i]=productos[j+1];
                    productos[j]=auxiliar;
                }
                contador ++;
            }
        }*/
        //System.out.println("contador = " + contador);

        //Clase helper Arrays
        //Arrays.sort(productos);
        //arregloInverso(productos);
        System.out.println("Usando for");
        for(int i = 0; i< total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);

        }
       //Usando collections// Collections.reverse(Arrays.asList(productos));
        int[] numeros = new int[4];

        numeros[0]= 1;
        numeros[1]= 2;
        numeros[2]= 3;
        numeros[3]= 4;


    for(int i = 0; i< numeros.length;i++){
        System.out.println("i= " + i + " : "+ numeros[i]);
    }
    }

}
