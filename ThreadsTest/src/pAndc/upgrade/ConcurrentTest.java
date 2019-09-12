package pAndc.upgrade;

import pAndc.AppleBow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by leeqi on 2019/9/3.
 */
public class ConcurrentTest {
    public static void main(String[] args) {
        AppleBow appleBow = new AppleBow();
        Productor productor = new Productor(appleBow);
        Consumer consumer = new Consumer(appleBow);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(productor);
        executorService.submit(consumer);

        executorService.shutdown();
    }
}
