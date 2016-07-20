package Game.players;

import Game.util.RandInt;

/**
 * Created by perrythomson on 7/11/16.
 */
public class Alien extends Player {

    private int clawMaxDamage = 18;
    private int clawRangeProtection = 6;
    private int laserMaxDamage = 4;
    private int laserRangeProtection = 14;
    public int maxHitsPerRoll = 4;
    private int accuracy = 3;
    private int spaceRoids = 4;

    private int getClawMaxDamage() {
        int damage = RandInt.randomInt(1, clawMaxDamage);
        return damage;
    }
    private int getLaserMaxDamage() {
        int damage = RandInt.randomInt(1, laserMaxDamage);
        return damage;
    }
    public int getRandomHitsPerRoll() {
        int damage = RandInt.randomInt(1, maxHitsPerRoll);
        return damage;
    }
    private int getRandomAccuracy() {
        int damage = RandInt.randomInt(1, accuracy);
        return damage;
    }
    private int getClawRangeProtection() {
        int damage = RandInt.randomInt(1, clawRangeProtection);
        return damage;
    }
    private int getLaserRangeProtection() {
        int damage = RandInt.randomInt(1, laserRangeProtection);
        return damage;
    }
    private int getSpaceRoids() {
        int damage = 0;

        if (getBattleLocation().equalsIgnoreCase("space")) {
            damage = RandInt.randomInt(0, spaceRoids);
        }
        return damage;
    }

    public int alienDamageGivenCalculator() {
        int damage = 1;
        int protection = 0;
        if(getPlayerWeapon().equalsIgnoreCase("claw")) {
            damage = getClawMaxDamage() * getRandomHitsPerRoll() * getRandomAccuracy() ;
        } else {
            damage = getLaserMaxDamage() * getRandomHitsPerRoll() * getRandomAccuracy() ;
        }
//        return damage + getSpaceRoids(); now in player
        return getSpecialDamage(damage) ;

    }
   public int alienDamageReceivedCalculator(int rawDamageDealt) {
        int damage = 0;
        int protection = 1;

        if(getPlayerWeapon().equalsIgnoreCase("claw")) {
            damage = rawDamageDealt - (getClawRangeProtection() * getRandomAccuracy()) * getSpaceRoids();
        } else {
            damage = rawDamageDealt - (getLaserRangeProtection() * getRandomAccuracy()) * getSpaceRoids();
        }

        rawDamageDealt += this.getSharkAttack();
        if(rawDamageDealt > protection) {
           damage = rawDamageDealt - protection;
        }
        if(rawDamageDealt > protection) {
            damage = rawDamageDealt - protection;
        }
        this.removeHealth(damage);
        return damage ;
    }


}

