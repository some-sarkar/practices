class ThreadHelper{

    int i=1, n=20;
    public synchronized void  printOdd(){
        while(i<=n){
            if(i%2!=0) {
                System.out.println("odd: " + i);
                i++;
                notify();
            }
            else {
               try{
                   wait();
               }
               catch (InterruptedException e){
                   System.out.println(e);
               }
            }

        }
    }

    public synchronized void printEven(){
        while(i<=n){
            if(i%2==0){
                System.out.println("even: "+i);
                i++;
                notify();
            }
            else {
                try {
                    wait();
                }
                catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
}


public class EvenOddThread {


    public static  void main(String[] args){
        int i=1,n=20;
        ThreadHelper h = new ThreadHelper();
        Thread even = new Thread(()-> h.printEven());
        Thread odd = new Thread(()-> h.printOdd());
        even.start();
        odd.start();
    }
}
