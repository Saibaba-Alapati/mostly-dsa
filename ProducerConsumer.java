import java.util.Vector;
class Producer extends Thread {
    static final int MAX = 7;
    private Vector<String> messages = new Vector<String>();
    @Override
    public void run(){
        try{
            while(true){
                putMessage();
            }
        }catch(InterruptedException e){

        }
    }
    private synchronized void putMessage()
    throws InterruptedException
    {
        while(messages.size()==MAX){
            wait();
        }
        messages.addElement(new java.util.Date().toString());
        notify();
    }
    public synchronized String getMessage()
        throws InterruptedException
    {
        notify();
        while(messages.size()==0){
            wait();
        }
        String message = (String)messages.firstElement();
        messages.removeElement(message);
        return message;
    }
}

class ProducerConsumer extends Thread{
    Producer producer;
    ProducerConsumer(Producer p){
        producer = p;
    }
    @Override
    public void run(){
        try{
            while(true){
                String message = producer.getMessage();
                System.out.println("Got message:"+message);
                sleep(2000);
            }
        }catch(InterruptedException e){
        }
    }
    public static void main(String args[]) {
        Producer producer =  new Producer();
        producer.start();
        new ProducerConsumer(producer).start();
    }

}