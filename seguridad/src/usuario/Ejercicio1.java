package usuario;
import java.util.Scanner;
/* la clase publica debe llamarse igual que el */
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //*Declaración de byte (enteros pequeños)
        byte x;
        //*asignacion de valor byte 
        x=25;
        //*decalracion de int(enteros medianos)
        int y;
        //*asignacion de valor a int
        y=300;
        //*declaracion de float(decimales)
        double z;
        //*Asignacion de valor float
        z=578.90;
        //*Declaracion de char(una sola letra o caracter)
        char est_usu;
        //*Valor del char
        est_usu='A';
        //*declaracion de string(una palabra o texto)
        String ali_usu;
        //*Valor del string
        ali_usu="";
        //*declaracion de boolean(true o false)
        boolean apr_dip;
        //*valor del boolean
        apr_dip=true;

        Scanner lector=new Scanner(System.in);

        System.out.println("Bienvenido al Modulo de Java");
        System.out.print("Que comiencen los juegos...");
        System.out.print("Suerte...");
        System.out.print("Ingrese un byte: ");
            x=lector.nextByte();
        System.out.print("Ingrese un entero: ");
            y=lector.nextInt();
        System.out.print("Ingrese un Decimal: ");
            z=lector.nextDouble();
        System.out.print("Ingrese un char: ");
            est_usu=lector.next().charAt(0);
        System.out.print("Ingrese una cadena: ");
            ali_usu=lector.next();
        System.out.print("El alumno fue aprobado?: ");
            apr_dip=lector.nextBoolean();

        lector.close();
    }
}
