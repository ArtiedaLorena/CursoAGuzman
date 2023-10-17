public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalenguas= "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());//metodo
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[]arreglo= trabalenguas.toCharArray();
        int largo= arreglo.length;//atributo
        for(int i=0;i<largo; i++){
            System.out.println("arreglo[i] = " + arreglo[i]);
        }

        System.out.println("trabalenguas = " + trabalenguas.split("a"));
    }
}
