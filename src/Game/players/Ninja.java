package Game.players;

import Game.util.RandInt;

/**
 * Created by perrythomson on 7/11/16.
 */
public class Ninja extends Player {

    private int bladeMaxDamage = 5;
    private int bladeRangeProtection = 2;
    private int starMaxDamage = 3;
    private int starRangeProtection = 4;
    private int maxHitsPerRole = 4;
    private int accuracy = 4;

    public int ninjaDamageGivenCalculator() {
        int damage = 0;
        if(getPlayerWeapon().equalsIgnoreCase("blade")) {
            damage = bladeMaxDamage * maxHitsPerRole * accuracy;
        } else {
            damage = starMaxDamage * maxHitsPerRole * accuracy;
        }
        return damage;
    }

    public int ninjaDamageReceivedCalculator(int rawDamageDealt) {
        int damage = 0;
        if(getPlayerWeapon().equalsIgnoreCase("blade")) {
            damage = rawDamageDealt - (bladeRangeProtection * accuracy);
        } else {
            damage = rawDamageDealt - (starRangeProtection * accuracy);
        }
        this.removeHealth(damage);
        return damage;
    }

    private int getRandomBladeDamage() {
        bladeMaxDamage = RandInt.randomInt(1,bladeMaxDamage);
        return bladeMaxDamage;
    }

    private int getRandomStarDamage() {
        starMaxDamage = RandInt.randomInt(1,starMaxDamage);
        return starMaxDamage;
    }

    private int getRandomHitsPerRole() {
        maxHitsPerRole = RandInt.randomInt(1,maxHitsPerRole);
        return maxHitsPerRole;
    }

    private int getRandomAccuracy() {
        accuracy = RandInt.randomInt(1,accuracy);
        return accuracy;
    }

    private int getRandomBladeProtection() {
        bladeRangeProtection = RandInt.randomInt(1,bladeRangeProtection);
        return bladeRangeProtection;
    }

    private int getRandomStarProtection() {
        starRangeProtection = RandInt.randomInt(1,starRangeProtection);
        return starRangeProtection;
    }
}
