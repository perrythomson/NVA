package toolbox;

import java.util.Random;
/**
 * Created by perrythomson on 7/14/16.
 */
public class RandomGenerator {

    public static int randomInt(int min, int max){
        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((max - min ) + 1) +  min;
        return randomNumber;
    }



}
