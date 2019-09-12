package pAndc.upgrade;

import pAndc.AppleBow;

/**
 * Created by leeqi on 2019/9/3.
 */
public class Consumer implements Runnable {
    AppleBow appleBow;
    public Consumer(AppleBow appleBow){
        this.appleBow = appleBow;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(appleBow.takeApple()){
                break;
            }
        }
    }
}
