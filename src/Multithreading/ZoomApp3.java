package Multithreading;

public class ZoomApp3 {
    public static void main(String[] args) {
        VideoBroadcast t1 = new VideoBroadcast();
        NetworkStablizer t2 = new NetworkStablizer();
        VideoEnhancer t3 = new VideoEnhancer();
        t1.start();
        t2.start();
        t3.start();
    }
}
class VideoBroadcast extends Thread{
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
class NetworkStablizer extends Thread{
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
class VideoEnhancer extends Thread{
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
