
package espoch.edu.ec.clases;
public class Queue {
    private int[]elementos;//tipo de arreglo de la cola
    private int front;//indice del primer elemento
    private int rear;//indice del ultimo elemento
    private int size;//tamaño vector
    private int capacity;//tamaño donde almacena el vector
 
    //Constructor
    public Queue(int capacity) {
        this.capacity = capacity;
        elementos = new int [capacity];
        front=0;
        rear =-1;
        size = 0; 
    }
    //encolar
    public void enqueue(int dato){
        if(isFull()){
            System.out.println("La cola esta llena");
            return;//funciona como un break
        }
        rear++;
        elementos[rear]=dato;
        size++;  
        
    }
    //desencolar(eliminar
    public int dequeue(){
        if (isEmpty()|| (front==capacity)){
            System.out.println("Queue is empty.cannot de");
            return -1;//usa el -1 para indicar error
        }
        int item=elementos[front];//Obtener el elemento
        elementos[front]=0;
        front++;//Mover el frente al siguiente elemento
        return item;
    }
    //Mstrar el elemento al frente sin eliminarlo
    public int peek(){
        if (isEmpty()|| (front==capacity)){
            System.out.println("No esta vacia, esta llena");
            return -1;
        }
        return elementos[front];
           
    }
    //verificar si la cola esta vacia
    public boolean isEmpty(){
        return size ==0;
    }
    //verificar si la cola esta llena
    public boolean isFull(){
        return size==capacity;
    }
    
    
}
