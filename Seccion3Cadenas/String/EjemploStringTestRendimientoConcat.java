public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a="a";
        String b= "b";
        String c=a;
        long inicio= System.currentTimeMillis();
        StringBuilder sb= new StringBuilder(a); //es mutable

        for (int i=0;i<500; i++){
            //c= c.concat(a).concat(b).concat("\n");//500 =>2 segundos
            c+= a+b+"\n"; //=> 19 milisegundos
            sb.append(a);
            sb.append(b);
            sb.append("\n"); //SB 0 milisegundos
        }

        long fin= System.currentTimeMillis();

        System.out.println(fin-inicio);
    }
}
