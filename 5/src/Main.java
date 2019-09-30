// Autor: Eduardo Barbosa de Oliveira       24/09/2019

// Descrição: Após n threads sincronizarem em um ponto em comum,
// um trecho específico (ponto crítico) pode ser executado por cada uma delas.
// Faça um código que possibilite barrar N threads em um ponto específico de execução e, após todas alcançarem o ponto,
// todas devem executar o trecho de código após esse ponto.



public class Main {
    public static void main(String[] args) {
        Barrier barrier = new Barrier(3);
        new Thread(() ->{
            try {
                barrier.methodWithBarrier();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() ->{
            try {
                barrier.methodWithBarrier();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() ->{
            try {
                barrier.methodWithBarrier();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
