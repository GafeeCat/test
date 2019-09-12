package pAndc;

/**
 * Created by leeqi on 2019/9/2.
 */
public class TakeThread extends Thread {
    AppleBow appleBow;
    public TakeThread(AppleBow appleBow){
        this.appleBow = appleBow;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            appleBow.takeApple();
        }
    }
}
