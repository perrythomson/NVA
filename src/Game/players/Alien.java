package Game.players;

/**
 * Created by perrythomson on 7/11/16.
 */
public class Alien extends Player {

    private int clawMaxDamage = 18;
    private int clawRangeProtection = 6;
    private int laserMaxDamage = 4;
    private int laserRangeProtection = 14;
    private int maxHitsPerRole = 4;
    private int accuracy = 3;

    public int alienDamageGivenCalculator() {
        int damage = 0;
        if(getPlayerWeapon().equalsIgnoreCase("claw")) {
            damage = clawMaxDamage * maxHitsPerRole * accuracy;
        } else {
            damage = laserMaxDamage * maxHitsPerRole * accuracy;
        }
        return damage;
    }

    public int alienDamageReceivedCalculator(int rawDamageDealt) {
        int damage = 0;
        if(getPlayerWeapon().equalsIgnoreCase("claw")) {
            damage = rawDamageDealt - (clawRangeProtection * accuracy);
        } else {
            damage = rawDamageDealt - (laserRangeProtection * accuracy);
        }
        this.removeHealth(damage);
        return damage;
    }

}

