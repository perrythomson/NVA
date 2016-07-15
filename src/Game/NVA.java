package Game;


import Game.players.Alien;
import Game.players.Ninja;




/**
 * Created by perrythomson on 7/11/16.
 */
public class NVA {


    private String name = "";
    private String playerType = "";
    private Ninja ninja = new Ninja(); //instantiation of a new reference
    private Alien alien = new Alien(); //instantiation of a new reference
    private String weapon = "";
    private String location = "";
    private String special = "";




    public void setName() {
        System.out.println("What is your name?");
        name = PlayNVA.scanner.nextLine();
        System.out.println("Welcome, "+name);

    }


    public void setPlayerType() {
        while (!(playerType.equalsIgnoreCase("ninja") || playerType.equalsIgnoreCase("alien") || playerType.equalsIgnoreCase("predator"))) {
            System.out.println("Are you a Ninja, Alien or Predator? [ninja/alien/predator]");
            playerType = PlayNVA.scanner.nextLine();

            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Noble choice, the Ninja is stealthy and fast.");
            } else if (playerType.equalsIgnoreCase("alien")) {
                System.out.println("Powerful choice, the Alien is scary and strong.");
            } else if (playerType.equalsIgnoreCase("predator")) {
                System.out.println("The best choice, the Predator is invincible!");
            } else {
                System.out.println("Invalid player type");
            }
        }

    }

    public void setWeapon() {
        while(!((playerType.equalsIgnoreCase("ninja") && ((weapon.equalsIgnoreCase("blade")) || (weapon.equalsIgnoreCase("star")))) ||
                ((playerType.equalsIgnoreCase("alien") && ((weapon.equalsIgnoreCase("claw")) || (weapon.equalsIgnoreCase("laser"))))))) {
            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Okay ninja, choose your weapon [blade/star]");
            } else if (playerType.equalsIgnoreCase("alien")){
                System.out.println("Okay alien, choose your weapon[claw/laser]");

            }
            weapon = PlayNVA.scanner.nextLine();
            if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("blade")) {
                System.out.println("The ninja blad is good at close range, but deals more damage.");
            } else if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("star")) {
                System.out.println("The ninja star does less damage, but keeps you at a safer range.");
            } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("claw")) {
                System.out.println("The alien claw is close range, but deals more damage.");
            } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("laser")) {
                System.out.println("The alien laser does less damage, but keeps you at a safer range.");
                System.out.println("The predator razor boomerang is most destructive in close combat.");
            } else {
                System.out.println("Invalid weapon!");
            }
        }
    }

    public void setLocation(){

        while (!(location.equalsIgnoreCase("forest") || location.equalsIgnoreCase("space") || location.equalsIgnoreCase("jungle"))) {
            System.out.println("Choose your location? [forest/space/jungle]");
            location = PlayNVA.scanner.nextLine();

            if (location.equalsIgnoreCase("forest")) {
                System.out.println("The forest gives the ninja a slight stealth advantage.");
            } else if (location.equalsIgnoreCase("space")) {
                System.out.println("Space gives the alien a slight strength advantage.");

            } else {
                System.out.println("Invalid location type");
            }
        }
    }


    public void setSpecial() {
        while (!(special.equalsIgnoreCase("speed") || playerType.equalsIgnoreCase("power") || special.equalsIgnoreCase("pain"))) {
            System.out.println("Choose your special attack? [speed/power/pain]");
            special = PlayNVA.scanner.nextLine();

            if (special.equalsIgnoreCase("speed")) {
                System.out.println("Speed gives the the player a high chance of making a second hit at 20% damage of the first hit.");
            } else if (special.equalsIgnoreCase("power")) {
                System.out.println("Power gives the the player a medium chance of doing an additional 50% damage on a hit.");
            } else if (special.equalsIgnoreCase("pain")) {
                System.out.println("Pain has a small chance of inflicting a permanent penalty on the opponent, decreasing their overall effectiveness by 10%.");
            } else {
                System.out.println("Invalid special type");
            }
        }
    }


    public void startBattle() {

        if(playerType.equalsIgnoreCase("ninja")) {
            ninja.setPlayerName(name);
            ninja.setPlayerWeapon(weapon);
            alien.setPlayerName("Twinkle Toes");
            alien.setPlayerWeapon("laser");
        } else {
            alien.setPlayerName(name);
            alien.setPlayerWeapon(weapon);
            ninja.setPlayerName("Mr Fuzzy Jingles");
            ninja.setPlayerWeapon("star");
        }
        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println("Time to play!");
        System.out.println(" ");
        while(alien.getHealth() > 0 && ninja.getHealth() > 0) {
            int alienDamageReceived = alien.alienDamageReceivedCalculator(ninja.ninjaDamageGivenCalculator());
            System.out.println(ninja.getPlayerName()+" attacks with the "+ninja.getPlayerWeapon()+" and deals "+alienDamageReceived+" points of damage.");
            int ninjaDamageReceived = ninja.ninjaDamageReceivedCalculator(alien.alienDamageGivenCalculator());
            System.out.println(alien.getPlayerName()+" attacks with the "+alien.getPlayerWeapon()+" and deals "+ninjaDamageReceived+" points of damage.");
            System.out.println(ninja.getPlayerName()+" Heath: "+ninja.getHealth()+"  vs  "+alien.getPlayerName()+" Health: "+alien.getHealth());

            System.out.println(" ");
            System.out.println("Press [enter] to take another turn.");
            String turn = PlayNVA.scanner.nextLine();
            System.out.println(" ");
        }

        System.out.println("**********************************************");
        if(ninja.getHealth() > 0) {
            System.out.println(ninja.getPlayerName()+" Wins!!!");
            System.out.println("Health Remaining: "+ninja.getPlayerName());
        } else if(alien.getHealth() > 0) {
            System.out.println(alien.getPlayerName()+" Wins!!!");
            System.out.println("Health Remaining: "+alien.getPlayerName());
        } else {
            System.out.println("Everyone Died!!!");
            System.out.println(ninja.getPlayerName()+" and "+alien.getPlayerName()+" both lose.");
        }
        System.out.println("**********************************************");
    }


}
