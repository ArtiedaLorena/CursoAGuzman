import java.util.Arrays;

public class ArreglosForInverso {
    public static void main(String[] args) {
        //Instanciacion
        //String[] productos = new String[7];
        String [] productos = {"Memoria Kingston","Samsung Galaxy",
                "Macbook air","Chromecast 4ta gen",
                "Usb 64gb","Notebook Acer","Camara Iqual"
        };
        int total = productos.length;


        /*productos[0] = "Memoria Kingston";
        productos[1] = "Samsung Galaxy";

        productos[2] = "Macbook air";
        productos[3] = "Chromecast 4ta gen";
        productos[4] = "Usb 64gb";
        productos[5] = "Notebook Acer";
        productos[6] = "Camara Iqual";

         */

        //Clase helper Arrays
        Arrays.sort(productos);
        System.out.println("Usando for");
        for(int i = 0; i< total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);

        }
        System.out.println("Usando for inverso");
        for ( int i= 0; i<total; i++) {
            System.out.println("Para i " + (total - 1 - i) + " valor: " + productos[total - 1 - i]);
        }
        System.out.println("Usando for inverso 2");
        for ( int i= total - 1; i>=0; i--) {
            System.out.println("Para i " + i + " valor: " + productos[i]);
        }
}
}
