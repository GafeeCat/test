package pAndc.upgrade;

import pAndc.AppleBow;

/**
 * Created by leeqi on 2019/9/3.
 */
public class Productor implements Runnable {
    AppleBow appleBow;
    public Productor(AppleBow appleBow){
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
            boolean b = appleBow.putApple();
            if(b){
                break;
            }
        }
    }
}
