package pAndc.blockingquene;

import java.util.concurrent.BlockingQueue;

/**
 * Created by leeqi on 2019/9/3.
 */
public class Consumer implements Runnable {
    BlockingQueue blockingQueue;
    public Consumer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            String product =  (String) blockingQueue.take();
            System.err.println("消费产品: " + product + " <> " + Thread.currentThread().getName());
            Thread.sleep(500);
            //notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
