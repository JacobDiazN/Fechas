import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario las fechas
        System.out.println("Ingrese la primera fecha como DD/MM/AAAA:");
        String fecha1 = sc.nextLine();
        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA:");
        String fecha2 = sc.nextLine();

        // Separando en partes la primera y segunda fecha
        String[] Fecha1 = fecha1.split("/");
        int DD1   = Integer.parseInt(Fecha1[0]);
        int MM1   = Integer.parseInt(Fecha1[1]);
        int AAAA1 = Integer.parseInt(Fecha1[2]);

        String[] Fecha2 = fecha2.split("/");
        int DD2   = Integer.parseInt(Fecha2[0]);
        int MM2   = Integer.parseInt(Fecha2[1]);
        int AAAA2 = Integer.parseInt(Fecha2[2]);

        /*Calcularé cuál fecha es mayor empezando
        por la condición entre los anios*/
        if (AAAA1 < AAAA2) {
            System.out.println("persona 1 es mayor");
        } else if (AAAA1 > AAAA2) {
            System.out.println("persona 2 es mayor");
        /*Si no se cumple ninguna condición anterior
        porque los anios son iguales, pasa a la
        siguiente condición comparando por los meses*/
        } else {
            if (MM1 < MM2) {
                System.out.println("persona 1 es mayor");
            } else if (MM1 > MM2) {
                System.out.println("persona 2 es mayor");
            /*Si no se cumple ninguna condición anterior
            porque los meses son iguales, pasa a la
            siguiente condición comparando por los dias*/
            } else {
                if (DD1 < DD2) {
                    System.out.println("persona 1 es mayor");
                } else if (DD1 > DD2) {
                    System.out.println("persona 2 es mayor");
                } else {
                    System.out.println("Tienen la misma edad");
                }
            }
        }

        sc.close();//Es una buena práctica cerrar el objeto Scanner.
    }
}
