package Java_8_Features;

public class Thread_Demo {

    public static void main(String [] args){

        Runnable thread1 =()->{
            for (int i =0; i<10; i++){
                System.out.println("value of i is :"+i);

                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(thread1);

        thread.setName("azhar");
        thread.start();
        System.out.println("First thread started ");

        Runnable thread2 =()->{
            for (int i =10; i<20; i++){
                System.out.println("value of i is :"+i);

                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread thread0 = new Thread(thread2);


        thread0.setName("syed");
        thread0.start();
        System.out.println("second thread started ");

    }
}
