
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Gustava");
        nomes.add("Carlos");
        nomes.add("Talles");
        nomes.add("Taisa");
        nomes.add("Julia");
        
        nomes.remove(1);     
        
        System.out.println("Nomes após remover o segundo nome ");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        nomes.remove(2);
        
        System.out.println("\nNomes após remover o terceiro nome:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        if (nomes.size() > 0 && nomes.get(0).equals("Talles")) {
            System.out.println("\nO primeiro nome é Talles.");
        } else {
            System.out.println("\nO primeiro nome não é Talles.");
        }
    }
}

