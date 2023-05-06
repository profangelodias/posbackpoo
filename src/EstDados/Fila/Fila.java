package EstDados.Fila;

//implementação de uma fila com 100 elementos

import javax.swing.*;

class Fila{
 int inicio;
 int fim;
 int tamanho;
 int qtdeElementos;
 int f[];

 public Fila(){
	 //Fila Vazia
     inicio = fim = -1;
     //tamanho total da fila
     tamanho = 100;
     //inicializando o vetor Fila
     f = new int[tamanho];
     //Ele tem 0 elementos
     qtdeElementos = 0;
 }

 public boolean estaVazia(){
	 //isEmpty
     if (qtdeElementos == 0){
         return true;
     }
     return false;
 }

 public boolean estaCheia(){
     if (qtdeElementos == tamanho - 1){
         return true;
     }
     return false;
 }

 public void adicionar(int e){
     if (! estaCheia()){
         if (inicio == -1){
             inicio = 0;
         }
         fim++;
         f[fim] = e;
         qtdeElementos++;
     }
 }

 public void remover(){
     if (! estaVazia() ){
         inicio++;
         qtdeElementos--;
     }
 }

 public void mostrar(){
     String elementos = "";
         for (int i = inicio; i<=fim; i++) {
             elementos += f[i]+ " - ";
         }
         JOptionPane.showMessageDialog(null, elementos);
 }
}


