package toolbox;

import java.util.Random;
/**
 * Created by perrythomson on 7/14/16.
 */
public class RandomGenerator {

    //static int kev = 2;

    public static int randomInt(int min, int max){
        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((max - min ) + 1) +  min;
        return randomNumber;
    }

//    public static void main(String [] args) {
//        randomInt(kev, 12);
//
//        System.out.println(randomInt(2,11));
//
//        kev = 2;
//    }
}
