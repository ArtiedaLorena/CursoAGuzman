import javax.sound.midi.Soundbank;

public class EjemploStringExtensionDeArchivo {
    public static void main(String[] args) {
        String archivo= "algunaImagen.jpg";
        int i =archivo.indexOf(".");

        System.out.println("archivo.lenght()= "+ archivo.length());
        System.out.println("Extension archivo = " + archivo.substring(i+1));
    }
}
