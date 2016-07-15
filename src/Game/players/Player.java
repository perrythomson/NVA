package Game.players;

import Game.util.RandInt;

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


    public boolean getIsPain() {
        return isPain;
    }

    public void setIsPain(boolean isPain) {
        this.isPain = isPain;
    }


    public int getHealth(){
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

    public int getSpecialDamage(int damage){
        double extDamage = 1;
        int randNum = RandInt.randomInt( 0 , 100);
        if (getSpecialGift().equalsIgnoreCase("speed") && randNum < 75) {
            extDamage = 1.2;
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
}

