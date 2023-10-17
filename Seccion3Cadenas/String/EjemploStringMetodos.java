public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre= "Andres";
        System.out.println(nombre.length());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.equalsIgnoreCase(\"Andres\") = " + nombre.equalsIgnoreCase("Andres"));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));

        }
}
