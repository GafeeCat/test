package pAndc.blockingquene;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/**
 * Created by leeqi on 2019/9/3.
 */
public class Productor implements Runnable {
    List<String> savedList = new ArrayList<String>();
    BlockingQueue blockingQueue;
    public Productor(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    public void setProduct(String product){
        savedList.add(product);
    }

    @Override
    public void run() {
        try {
            //notifyAll();
            if(!savedList.isEmpty()){
                for(String value : savedList){
                    System.out.println("生产产品: " + value);
                    blockingQueue.put(value + " -- " + Thread.currentThread().getName());
                    //savedList.remove(value);
                }
                Thread.sleep(1 * 1000);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
