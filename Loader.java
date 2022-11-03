package rockpaparscissor;

public class Loader {
    Loader(char c){
        Thread t1 = new Thread(new Runnable() {

            public void run() {
               try {
                   for (int i = 0; i < 30; i++) {
                       System.out.print(c);
                       Thread.sleep(100);
                   }

                   System.out.println();

               } catch (Exception e) {
                   e.printStackTrace();
               }
                System.out.println("enter your choice");
            }
        });
        t1.start();
    }
}
