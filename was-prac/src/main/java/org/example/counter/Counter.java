package org.example.counter;

public class Counter implements Runnable{
    private int count = 0;

    public void increment(){
        count++;
    }

    public void decremant(){
        count--;
    }

    public int getValue(){
        return count;
    }

    @Override
    public void run(){
        synchronized (this){
            this.increment();
            System.out.println("Value for Thread After increment " + Thread.currentThread().getName()+" " +this.getValue());
            this.decremant();
            System.out.println("Value for Thread at last " + Thread.currentThread().getName()+" " +this.getValue());

        }

    }
}
