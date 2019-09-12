package pAndc;

/**
 * Created by leeqi on 2019/9/2.
 */
public class PutThread extends Thread {
    private AppleBow appleBow;
    public PutThread(AppleBow appleBow){
        this.appleBow = appleBow;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            appleBow.putApple();
        }
    }
}
