import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
        //Instanciacion
        String [] productos= new String[7];
        productos[0]= "Memoria Kingston";
        productos[1]= "Samsung Galaxy";

        productos[2]="Macbook air";
        productos[3]= "Chromecast 4ta gen";
        productos[4]= "Usb 64gb";
        productos[5]= "Notebook Acer";
        productos[6]= "Camara Iqual";

        //Clase helper Arrays
        Arrays.sort(productos);

        String prod1= productos[0];
        String prod2= productos[1];
        String prod3= productos[2];
        String prod4= productos[3];
        String prod5= productos[4];
        String prod6= productos[5];
        String prod7= productos[6];



        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod4 = " + prod4);
        System.out.println("prod5 = " + prod5);
        System.out.println("prod6 = " + prod6);
        System.out.println("prod7 = " + prod7);

        int[] numeros = new int [4];

        numeros[0]= 1;
        numeros[1]= 2;
        numeros[2]= 3;
        numeros[3]= 4;
        //Lanza una excepcion
        //numeros[4] = 5;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
