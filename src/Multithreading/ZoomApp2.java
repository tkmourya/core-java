package Multithreading;

public class ZoomApp2 {
        public static void main(String[] args) {
            VideoBroadcast1 t1 = new VideoBroadcast1();  // first execute
            NetworkStablizer1 t2 = new NetworkStablizer1();
            VideoEnhancer1 t3 = new VideoEnhancer1();
            t2.setDaemon(true);
            t3.setDaemon(true);
            t2.setPriority(1);
            t3.setPriority(1);
            t1.start();
            t2.start();
            t3.start();
        }
    }
    class VideoBroadcast1 extends Thread{
        public void run(){
            for(int i=1;i<=5;i++) {
                System.out.println("Video is broadcasting");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    class NetworkStablizer1 extends Thread{
        public void run(){
            for (int i=1;i<=5;i++){
                System.out.println("Stablizing network..");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    class VideoEnhancer1 extends Thread{
        public void run(){
            for (int i=1;i<=5;i++){
                System.out.println("Enhancing video..");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

