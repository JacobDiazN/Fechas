import java.sql.SQLOutput;
import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario la primera fecha
        System.out.println("Ingrese la primera fecha como DD/MM/AAAA:");
        String fecha1 = sc.nextLine();
        // Solicitar al usuario la segunda fecha
        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA:");
        String fecha2 = sc.nextLine();

        //Primera fecha
        String DD1   = fecha1.substring(0 , 2);
        System.out.println(DD1);
        String MM1   = fecha1.substring(3 , 5);
        System.out.println(MM1);
        String AAAA1 = fecha1.substring(6 , 10);
        System.out.println(AAAA1);
        //Segunda fecha
        String DD2   = fecha2.substring(0 , 2);
        System.out.println(DD2);
        String MM2   = fecha2.substring(3 , 5);
        System.out.println(MM2);
        String AAAA2 = fecha2.substring(6 , 10);
        System.out.println(AAAA2);

        //Parseo a las variables de tipo String a Int
        int dia1   = Integer.parseInt(DD1);
        int mes1   = Integer.parseInt(MM1);
        int anio1 = Integer.parseInt(AAAA1);

        int dia2   = Integer.parseInt(DD2);
        int mes2   = Integer.parseInt(MM2);
        int anio2 = Integer.parseInt(AAAA2);

        //En esta condición se compara cuál fecha es mayor, empezando
        //entre los anios
        if (anio1 < anio2) {
            System.out.println("persona 1 es mayor");
        } else if (anio1 > anio2) {
            System.out.println("persona 2 es mayor");
        /*Si no se cumple ninguna condición anterior
        porque los anios son iguales, pasa a la
        siguiente condición comparando por los meses*/
        } else {
            if (mes1 < mes2) {
                System.out.println("persona 1 es mayor");
            } else if (mes1 > mes2) {
                System.out.println("persona 2 es mayor");
            /*Si no se cumple ninguna condición anterior
            porque los meses son iguales, pasa a la
            siguiente condición comparando por los dias*/
            } else {
                if (dia1 < dia2) {
                    System.out.println("persona 1 es mayor");
                } else if (dia1 > dia2) {
                    System.out.println("persona 2 es mayor");
                } else {
                    System.out.println("Tienen la misma edad");//Si las fechas son idénticas
                }
            }
        }

        sc.close();//Es una buena práctica cerrar el objeto Scanner.
    }
}
