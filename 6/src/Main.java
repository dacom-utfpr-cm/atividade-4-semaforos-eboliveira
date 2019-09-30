// Autor: Eduardo Barbosa de Oliveira       24/09/2019

// Descrição: Threds em um laço executam uma série de passos e sincronizam em uma barreira a cada passo.
// Faça um código que implemente uma barreira reusável que feche a si própria após todas as threads passarem.


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
