package pAndc;

/**
 * Created by leeqi on 2019/9/2.
 */
public class ApplePie {
    public static void main(String[] args) {
        AppleBow appleBow = new AppleBow();
        PutThread putThread = new PutThread(appleBow);
        TakeThread takeThread = new TakeThread(appleBow);

        putThread.start();
        takeThread.start();
    }
}
