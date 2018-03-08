package poo;

public class DivideInteiros {

    /**
     * Executa a divisão de dois números inteiros passados como parâmetro.
      * @param a numerador da divisão.
     * @param b denomindor da divisão;
     * @return retorna double divisao como resultado da operação.
     */
   public double divide(int a,int b){
       if(b == 0)
       {
           return 1;
       }else
       {
           return (double) a / b;
       }
   }
}
