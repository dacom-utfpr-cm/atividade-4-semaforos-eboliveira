// Autor: Eduardo Barbosa de Oliveira       24/09/2019

// Descrição: Enviar sinalização para um ponto de encontro entre threads.
// Faça um código que uma thread t1 e t2 são inicializadas e t1 espera por t2 e vice-versa.


public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        new Thread(new MyThread(counter)).start();
        new Thread(new MyThread(counter)).start();
        new Thread(new MyThread(counter)).start();
        new Thread(new MyThread(counter)).start();
        new Thread(new MyThread(counter)).start();
        new Thread(new MyThread(counter)).start();
        new Thread(new MyThread(counter)).start();
        new Thread(new MyThread(counter)).start();

    }
}
