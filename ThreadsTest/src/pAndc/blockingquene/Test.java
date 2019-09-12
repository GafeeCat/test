package pAndc.blockingquene;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by leeqi on 2019/9/3.
 */
public class Test {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(5);
        Productor productor = new Productor(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        int i = 0;
        while(i < 500){
            i++;
            productor.setProduct("product" + i);
            executorService.submit(productor);
            executorService.submit(consumer);
        }
        //executorService.shutdown();
    }
}
