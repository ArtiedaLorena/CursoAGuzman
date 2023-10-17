public class EjemploStringValidad {
    public static void main(String[] args) {
        String curso= null;
        boolean esNulo= curso== null;
        System.out.println("Es nulo: "+ esNulo);

        if(esNulo){
            curso="Programacion Java";
            System.out.println(curso.toLowerCase());
        }
        boolean esVacio= curso.length()== 0;
        System.out.println("Es vacio: "+esVacio);
        boolean esVacio2= curso.isEmpty();
        boolean esBlanco =curso.isBlank();

        if(curso.isEmpty()==false) {
            System.out.println("Bienvenido al curso".concat(curso));
            //El metodo concat se usa cuando el objeto tiene una referencia sino usar +
        }
        //La forma mas segura de validar es isBlank
    }

}
