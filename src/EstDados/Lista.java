package EstDados;

import java.util.ArrayList;
import java.util.List;


public class Lista {

   /**
    * @param args
    */
   public static void main(String[] args) {
	   
	   Object[] vetor = new Object[10];

         List<Carro> carros = new ArrayList<Carro>();
         List<Carro> carrosNovos = new ArrayList<Carro>();

         Carro carro = new Carro();

         //adiciona um carro a nossa lista
         carros.add(carro);

         //adiciona um carro a uma posição exata da lista
         carros.add(10, carro);

         /*
          * Imagine que desejamos adicionar uma lista de
           * carros novos a nossa lista de carros,
          * podemos adicionar todos de uma só vez, usando o 'addAll'
          * */
         carros.addAll(carrosNovos);

         /* Caso prefira, pode usar um for para adicionar
          * os carrosNovos.Nosso laço FOR abaixo, tem a mesma
           * função do addAll.
         */
         for(int i = 0 ; i < carrosNovos.size(); i++){
                carros.add(carrosNovos.get(i));
         }

         /*
          * Verifica se o carro está na lista de carros.
           * Mas como essa verificação é feita ?
          * Através do método 'equals' do seu objeto carro.
           * Sendo assim, na implementação do
          * seu bean 'Carro', é muito importante que você
           * sobreescreva o método 'equals' dizendo
          * como as comparações devem ser realizadas.
          * */
         carros.contains(carro);

         //Remove todos os elementos da lista
         carros.clear();

   }

}