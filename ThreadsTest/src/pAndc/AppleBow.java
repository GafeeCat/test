package pAndc;

/**
 * Created by leeqi on 2019/9/2.
 * 当apple数量小于0时，不能拿
 * 当apple数量大于10时，不能拿
 */
public class AppleBow {
    private int number;
    //最大值，默认为10
    private int maxOccupancy = 10;

    public AppleBow(){
        this.number = 5;
    }

    public AppleBow(int number, int maxOccupancy){
        this.number = number;
        this.maxOccupancy = maxOccupancy;
    }

    //put方法
    public synchronized boolean putApple(){
        while(number >= maxOccupancy){
           /* try {
                wait();
                System.err.println("put waiting..." + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.err.println("apple is full.");
           return true;
        }
        number++;
        System.out.println("put: " + number);
        notify();
        return false;
    }
    //take方法
    public synchronized boolean takeApple(){
        while (number <= 0){
            /*try {
                wait();
                System.err.println("take waiting..." + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.err.println("apple is empty.");
            return true;
        }
        number--;
        System.out.println("take: " + number);
        notify();
        return false;
    }
}
