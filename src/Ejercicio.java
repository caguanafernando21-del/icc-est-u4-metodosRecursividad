



public class Ejercicio{
    public Ejercicio(){
        
    }
    public int sumaConsecutivos(int numero){
        
        // CASO BASE
        System.out.println("El num es: " + numero);
        if(numero==1)
            return numero;
        // PARTE RECURSIVA
        return numero + sumaConsecutivos(numero - 1);
        
    }
    public int sumaConsecutivosPasos(int numero){
        
        // CASO BASE
        if(numero==1)
            return numero;
        // PARTE RECURSIVA
        int resultadoRecursivo = sumaConsecutivosPasos( numero - 1);
        int resultadoOperacion = numero + resultadoRecursivo;
        
        System.out.println("ResultadoOp= " + numero + " + " + "sumaConsecutivosPasos("+resultadoRecursivo + ")");

        return resultadoOperacion;
    }  



    public int getPotenciaNumero(int base, int exponente){
        if(exponente == 1)
            return base;   // base^ 1 = base
        return  base * getPotenciaNumero(base,exponente-1);
        
    }
    public int getPotenciaNumeroImpreso(int base, int exponente){
        if(exponente == 1)
            return base;   // base^ 1 = base
        int resultadoExponencialRecursivo = getPotenciaNumeroImpreso(base, exponente-1);
        int resultadoOperacion = base + resultadoExponencialRecursivo;
        System.out.println("ResultadoExpo " + resultadoOperacion + ": " + base + " getPotenciaNumero("+
        resultadoExponencialRecursivo+")");

        return  base * getPotenciaNumero(base,exponente-1);
        
    }


    public int sumaDigitos(int numero){
        // caso base
        if(numero < 10)
            return numero;
        // caso recursivo
        return (numero % 10) + sumaDigitos(numero/10);
    
    }

    
    public int sumaDigitosImpresion(int numero){
        // caso base
        if(numero < 10)
            return numero;
        // caso 
        int resultadoSumaDividir = sumaDigitosImpresion(numero/10);
        int resultadoOperacionF = numero + resultadoSumaDividir;
        System.out.println("Resultado suma: " + resultadoSumaDividir + " : " + numero + " sumaDigitosImpresion(" + 
        resultadoOperacionF + ")"
        );

        return (numero % 10) + sumaDigitos(numero/10);
    
    }
}