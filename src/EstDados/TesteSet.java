package EstDados;
import java.util.HashSet;
import java.util.Set;
 
public class TesteSet {
    public static void main(String[] args) {
        Set<String> colecaoSet = new HashSet<String>();
        colecaoSet.add("Site");
        colecaoSet.add("Varallos");
        colecaoSet.add("Fóruns Varallos");
         
        //dados duplicados não são inseridos no Set
        colecaoSet.add("Varallos1");
        colecaoSet.add("Site1");
 
        System.out.println("Tamanho coleção Set: "+colecaoSet.size());
        int count = 0;
        for(String valor : colecaoSet){
            System.out.println(++count + " -> " + valor);
        }
    }
}
