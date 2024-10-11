public class Matematica {
    public static int fatorial(int numero){
        if( numero == 0)
            return 1;
        for(int i = numero; i > 1 ; i--){
            numero = numero * (i-1);
        }
        return numero;
    }
}
