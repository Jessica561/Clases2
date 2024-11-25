
package espoch.edu.ec.colasimple;

import espoch.edu.ec.clases.Queue;

public class Colasimple {

    public static void main(String[] args) {
        Queue queue=new Queue(3);
        
        //Agregar elementos
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        queue.enqueue(40);
        
        System.out.println("elemento al inicio de la cola:"+queue.peek());
        //elimar
        System.out.println("Eliminar cola"+queue.dequeue());
        System.out.println("Eliminar cola"+queue.dequeue());
        System.out.println("Eliminar cola"+queue.dequeue());
        System.out.println("Eliminar cola"+queue.dequeue());
        
        //Agregar otro elemento
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
       
        System.out.println("front of queue:"+queue.peek());
        
        
    }
}
