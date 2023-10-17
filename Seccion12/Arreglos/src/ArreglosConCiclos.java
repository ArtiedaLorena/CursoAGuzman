import java.util.Arrays;

public class ArreglosConCiclos {
    public static void main(String[] args) {
        //Instanciacion
        String[] productos = new String[7];
        int total = productos.length;


        productos[0] = "Memoria Kingston";
        productos[1] = "Samsung Galaxy";

        productos[2] = "Macbook air";
        productos[3] = "Chromecast 4ta gen";
        productos[4] = "Usb 64gb";
        productos[5] = "Notebook Acer";
        productos[6] = "Camara Iqual";

        //Clase helper Arrays
        Arrays.sort(productos);
        System.out.println("Usando for");
        for(int i = 0; i< total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);

        }
        System.out.println("Usando foreach");
        for(String prod: productos){
            System.out.println("prod = " + prod);
        }
        int i=0;
        System.out.println("Usando while");
        while(i<total){
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }
        int j= 0;
        System.out.println("Usando do while");
        do{
            System.out.println("productos = " + productos[j]);
            j++;
        }while(j<total);


        int[] numeros = new int[10];
        int totalNumeros = numeros.length;
        for (int k=0; k<totalNumeros; k++){
            numeros[k]= k*3;
        }

        for(int k=0; k<totalNumeros;k++){
            System.out.println("numeros "+ numeros[k]);
        }
    }
}
