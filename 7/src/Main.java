// Autor: Eduardo Barbosa de Oliveira       24/09/2019

// Descrição: Semáforos podem ser usadas para representar uma fila.
// Faça um código que implemente duas filas (F1 e F2) com semáforos.
// As threads colocadas na F1 só podem executar se tiver um par na F2.
// Nesse caso, ambas as threads na primeira fila são executadas.



public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueuesController queuesController = new QueuesController();
        Thread t1_1 = new Thread(() ->{
            System.out.println("Thread da fila 1 executada");
        });
        Thread t1_2 = new Thread(() ->{
            System.out.println("Thread da fila 2 executada");
        });
        Thread t2_1 = new Thread(() ->{
            System.out.println("Thread da fila 1 executada");
        });
        Thread t2_2 = new Thread(() ->{
            System.out.println("Thread da fila 2 executada");
        });
        Thread t3_1 = new Thread(() ->{
            System.out.println("Thread da fila 1 executada");
        });
        Thread t3_2 = new Thread(() ->{
            System.out.println("Thread da fila 2 executada");
        });
        new Thread(queuesController).start();
        queuesController.enterOnQueue(1, t1_1);
        Thread.sleep(1000);
        queuesController.enterOnQueue(2, t1_2);
        Thread.sleep(1000);
        queuesController.enterOnQueue(1, t2_1);
        Thread.sleep(1000);
        queuesController.enterOnQueue(2, t2_2);
        Thread.sleep(1000);
        queuesController.enterOnQueue(1, t3_1);
        Thread.sleep(1000);
        queuesController.enterOnQueue(2, t3_2);
        Thread.sleep(1000);
        while (true){

        }
    }
}
