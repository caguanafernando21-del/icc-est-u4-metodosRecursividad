public class App {
    public static void main(String[] args) throws Exception {
    Ejercicio ejercicios = new Ejercicio();
    
    int n = ejercicios.sumaConsecutivos(5);
    System.out.println("------------Ejercicio 1---------------------- " );

    System.out.println("Impresion");
    int pasos = ejercicios.sumaConsecutivosPasos(5);
    System.out.println(pasos);

    System.out.println("----------------Ejercicio 2 --------------------");

    int expo = ejercicios.getPotenciaNumero(2, 5);
    System.out.println(expo);

    int impresionExpo = ejercicios.getPotenciaNumeroImpreso(2, 5);
    System.out.println(impresionExpo);

    System.out.println("------------Ejercicio 3--------------------");
    int sumaDividir = ejercicios.sumaDigitos(456);
    System.out.println(sumaDividir);

    int impresionDividir = ejercicios.sumaDigitosImpresion(456);
    System.out.println(impresionDividir);

    }
}
