public
 class Main {
    public static void main(String[] args) {
    
        System.out.println( "numeros de 1 a 50:");
        for  ( int i = 1; i <= 50; i++ )
           System.out.println(i);
           
        System.out.println(" quais sao os numeros pares?");
        System.out.println("Números pares entre 1 e 50 são:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
              System.out.println(i);
            }
        }
    }
}



