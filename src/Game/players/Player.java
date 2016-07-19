package Game.players;

import Game.util.RandInt;
import java.awt.event.ActionEvent;
/**
 * Created by perrythomson on 7/11/16.
 */
public abstract class Player {


    private int health = 1000;
    private String playerName;
    private String playerWeapon;
    private String battleLocation;
    private String specialGift;
    private boolean isPain = false;
    private boolean sharkAttack = false;
//    private int tTT = 1000; //totalturnstaken
//
//
//    public int getTTT() {
//        return tTT;
//    }
//
//    public void incrementTTT(int tTT) {
//        tTT += tTT;
//    }


    public boolean getIsPain() {  //this is for the random special pain
        return isPain;
    }

    public void setIsPain(boolean isPain) {
        this.isPain = isPain;
    }

    public int getHealth() {
        return health;
    }

    public void removeHealth(int hit) {
        health -= hit;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


    public String getPlayerWeapon() {
        return playerWeapon;
    }

    public void setPlayerWeapon(String playerWeapon) {
        this.playerWeapon = playerWeapon;
    }


    public String getBattleLocation() {
        return battleLocation;
    }

    public void setBattleLocation(String battleLocation) {
        this.battleLocation = battleLocation;
    }


    public String getSpecialGift() {
        return specialGift;
    }

    public void setSpecialGift(String specialGift) {
        this.specialGift = specialGift;
    }


    public int getSpecialDamage(int damage) {            // this is the damage associated to both players
        double extDamage = 1;
        int randNum = RandInt.randomInt(0, 100);

        if (getSpecialGift().equalsIgnoreCase("speed") && randNum < 75) {
            extDamage = (extDamage) * 1.2;
        } else if (getSpecialGift().equalsIgnoreCase("power") && randNum < 50) {
            extDamage = 1.5;
        } else if (getIsPain() || getSpecialGift().equalsIgnoreCase("pain") && randNum < 10) {
            setIsPain(true);
            damage -= 3;
            if (damage < 1) {
                damage = 1;
            }
        }
        extDamage = extDamage * damage;         //changing a double into an int
        Double d = new Double(extDamage);
        return d.intValue();
    }

    public int getSharkAttack() {
        int biteDamage = 0;
        int randNum = RandInt.randomInt(0, 100);

        if (getBattleLocation().equalsIgnoreCase("ocean") && randNum < 25) {
            biteDamage = 100;
            System.out.println("shark attack");
        }
        return biteDamage;
    }

//    public int tTT() {
//        while (counter != limit) {
//            if (counter < limit) {
//                if (counter + inc <= limit) {
//                    counter = counter + inc;
//                    System.out.println(counter);
//                } else {
//                    break;
//                }
//            } else if (counter > limit) {
//                if (counter - inc >= limit) {
//                    counter = counter - inc;
//                    System.out.println(counter);
//                } else {
//                    break;
//                }
//            }
//        }
//    return count;
//    }
}




//    public int getSharkAttack() {
//        int shark = 0;
//        int randNum = RandInt.randomInt(0, 100);
//
//        if (randnum <= 5) {
//            shark = 100;
//            System.out.println("bitten");
//        }
//        return shark;
//    }

