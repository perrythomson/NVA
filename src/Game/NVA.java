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
        System.out.println("Welcome, " + name);

    }


    public void setPlayerType() {
        while (!(playerType.equalsIgnoreCase("ninja") || playerType.equalsIgnoreCase("alien"))) {
            System.out.println("Are you a Ninja or Alien? [ninja/alien]");
            playerType = PlayNVA.scanner.nextLine();

            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Noble choice, the Ninja is stealthy and fast.");
            } else if (playerType.equalsIgnoreCase("alien")) {
                System.out.println("Powerful choice, the Alien is scary and strong.");
            } else {
                System.out.println("Invalid player type");
            }
        }

    }

    public void setWeapon() {
        while (!((playerType.equalsIgnoreCase("ninja") && ((weapon.equalsIgnoreCase("blade")) || (weapon.equalsIgnoreCase("star")))) ||
                ((playerType.equalsIgnoreCase("alien") && ((weapon.equalsIgnoreCase("claw")) || (weapon.equalsIgnoreCase("laser"))))))) {
            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Okay ninja, choose your weapon [blade/star]");
            } else if (playerType.equalsIgnoreCase("alien")) {
                System.out.println("Okay alien, choose your weapon[claw/laser]");
            }

            weapon = PlayNVA.scanner.nextLine();

            if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("blade")) {
                System.out.println("The ninja blade is good at close range, but deals more damage.");
            } else if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("star")) {
                System.out.println("The ninja star does less damage, but keeps you at a safer range.");
            } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("claw")) {
                System.out.println("The alien claw is close range, but deals more damage.");
            } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("laser")) {
                System.out.println("The alien laser does less damage, but keeps you at a safer range.");
            } else {
                System.out.println("Invalid weapon!");
            }
        }
    }

    public void setLocation() {

        while (!(location.equalsIgnoreCase("forest") || location.equalsIgnoreCase("ocean") || location.equalsIgnoreCase("space"))) {
            System.out.println("Choose your location? [forest/space]");

            location = PlayNVA.scanner.nextLine();

            if (location.equalsIgnoreCase("forest")) {
                System.out.println("The forest gives the ninja a stealth advantage.");
            } else if (location.equalsIgnoreCase("space")) {
                System.out.println("Space gives the alien a slight strength advantage.");
            } else if (location.equalsIgnoreCase("ocean")) {
                System.out.println("Ocean leaves you vulnerable for a shark attack.");
            } else {
                System.out.println("Invalid location type!");
            }
        }
    }


    public void setSpecial() {
        while (!(special.equalsIgnoreCase("speed") || special.equalsIgnoreCase("power") || special.equalsIgnoreCase("pain"))) {
            System.out.println("Choose your special attack? [speed/power/pain]");
            special = PlayNVA.scanner.nextLine();
            if (special.equalsIgnoreCase("speed")) {
                System.out.println("Speed gives the the player a high chance of making a second hit at 20% damage of the first hit.");
            } else if (special.equalsIgnoreCase("power")) {
                System.out.println("Power gives the the player a medium chance of doing an additional 50% damage on a hit.");
            } else if (special.equalsIgnoreCase("pain")) {
                System.out.println("Pain has a small chance of inflicting a permanent penalty on the opponent, decreasing their overall effectiveness by 10%.");
            } else {
                System.out.println("Invalid special type!");
            }
        }
    }


    public void startBattle() {
        int count = 1;
        int startHealth = 1000;
        int ninjawin = 0;
        int alienwin = 0;

        if (playerType.equalsIgnoreCase("ninja")) {
            ninja.setPlayerName(name);
            ninja.setPlayerWeapon(weapon);
            ninja.setBattleLocation(location);
            ninja.setSpecialGift(special);
            alien.setPlayerName("Twinkle Toes");
            alien.setPlayerWeapon("laser");
            alien.setBattleLocation(location);
            alien.setSpecialGift(special);
        } else {
            alien.setPlayerName(name);
            alien.setPlayerWeapon(weapon);
            alien.setBattleLocation(location);
            alien.setSpecialGift(special);
            ninja.setPlayerName("Mr Fuzzy Jingles");
            ninja.setPlayerWeapon("star");
            ninja.setBattleLocation(location);
            ninja.setSpecialGift(special);
        }
        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println("Time to play!");
        System.out.println(" ");
        while (alien.getHealth() > 0 && ninja.getHealth() > 0) {

            int alienDamageReceived = alien.alienDamageReceivedCalculator(ninja.ninjaDamageGivenCalculator());
                System.out.println(ninja.getPlayerName() + " attacks with the " + ninja.getPlayerWeapon() + " and deals " + alienDamageReceived + " points of damage."); {


                        System.out.println("This is the number of turns: "+ count);
                        count++;

                    int ninjaDamageReceived = ninja.ninjaDamageReceivedCalculator(alien.alienDamageGivenCalculator());
                        System.out.println(alien.getPlayerName() + " attacks with the " + alien.getPlayerWeapon() + " and deals " + ninjaDamageReceived + " points of damage.");

                        System.out.println(ninja.getPlayerName() + " Heath: " + ninja.getHealth() + "  vs  " + alien.getPlayerName() + " Health: " + alien.getHealth());
                        System.out.println(" ");

                        if (ninjaDamageReceived > alienDamageReceived) {
                            ninjawin++;
                        }   else {
                            alienwin++;
                        }
                        System.out.println("Alien has this many wins: " + alienwin);
                        System.out.println("Ninja has this many wins: " + ninjawin);


                        System.out.println("The average damage per hit is: " + (startHealth - alien.getHealth())/(count)    );
                        System.out.println("The average damage per hit is: " + (startHealth - ninja.getHealth())/(count)    );

                        System.out.println("Press [enter] to take another turn.");
                        String turn = PlayNVA.scanner.nextLine();
                        System.out.println(" ");

            }

            System.out.println("**********************************************");


            }

            if (ninja.getHealth() > 0) {
                System.out.println(ninja.getPlayerName() + " Wins!!!");
                System.out.println("Health Remaining: " + ninja.getPlayerName());
            } else if (alien.getHealth() > 0) {
                System.out.println(alien.getPlayerName() + " Wins!!!");
                System.out.println("Health Remaining: " + alien.getPlayerName());
            } else {
                System.out.println("Everyone Died!!!");
                System.out.println(ninja.getPlayerName() + " and " + alien.getPlayerName() + " both lose.");
            }
            System.out.println("**********************************************");

//        while (count > 0) {
//            System.out.println("Total turns taken :" + count);                // TODO this is where I will print out the attackCounter
//            count++;
//            return count;
        }

    }

//    private int maxNumber() {
//        int maxNumber = 1000;
//        return maxNumber;
//    }



