package Game;

import java.util.Scanner;

/**
 * Created by perrythomson on 7/11/16.
 */
public class PlayNVA {

    private static NVA nva; //is this making the new NVA nva private?

    public static void main(String[] args) {
        nva = new NVA(); //instantiate a new NVA reference name it nva and private??

        Scanner scanner = new Scanner(System.in); //accepts input from the user

        System.out.println("Lets play a game.");
        System.out.println("What is your name?");

        String name = scanner.nextLine(); //collect input for the player's name from above
        System.out.println("Welcome, "+name);

       // System.out.println("Are you a Ninja or Alien? [ninja/alien]");
       // String playerType = scanner.nextLine();

       // if(playerType.equalsIgnoreCase("ninja")) {
       //     System.out.println("Noble choice, the Ninja is stealthy and fast.");
       // }   else if(playerType.equalsIgnoreCase("alien")) {
       //     System.out.println("Powerful choice, the Alien is scary and strong and full of roids.");
       // }   else {
       //     System.out.println("Invalid player type");
       // }

        String playerType = "";
        while (!(playerType.equalsIgnoreCase("ninja") || playerType.equalsIgnoreCase("alien"))) {
            System.out.println("Are you a Ninja or an Alien? [ninja/alien]");
            playerType = scanner.nextLine();

            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Noble choice, the Ninja is stealthy and fast.");
            } else if (playerType.equalsIgnoreCase("alien")) {
                System.out.println("Powerful choice, the Alien is scary and strong.");
            } else {
                System.out.println("Invalid player type");
            }
        }

        //if(playerType.equalsIgnoreCase("ninja")) {
        //    System.out.println("Okay ninja, choose your weapon [blade/star]");
        //} else {
        //    System.out.println("Invalid weapon.");
        //}


        //String weapon = scanner.nextLine();
        //if(playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("blade")) {
         //   System.out.println("The ninja blad is good at close range, but deals more damage.");
        //} else if(playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("star")) {
         //   System.out.println("The ninja star does less damage, but keeps you at a safer range.");
        //} else if(playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("claw")) {
         //   System.out.println("The alien claw is close range, but deals more damage.");
        //} else if(playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("laser")) {
         //   System.out.println("The alien laser does less damage, but keeps you at a safer range.");
        //} else {
         //   System.out.println("Invalid weapon!");
        //}

        String weapon = "";
        while(!((playerType.equalsIgnoreCase("ninja") && ((weapon.equalsIgnoreCase("blade")) || (weapon.equalsIgnoreCase("star")))) ||
                ((playerType.equalsIgnoreCase("alien") && ((weapon.equalsIgnoreCase("claw")) || (weapon.equalsIgnoreCase("laser"))))))) {
            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Okay ninja, choose your weapon [blade/star]");
            } else {
                System.out.println("Okay alien, choose your weapon[claw/laser]");
            }
            weapon = scanner.nextLine();
            if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("blade")) {
                System.out.println("The ninja blad is good at close range, but deals more damage.");
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

        // System.out.println("Choose your location? [forest/space]");
        // String location = scanner.nextLine();

        String location = "";
        while (!(playerType.equalsIgnoreCase("forest") || playerType.equalsIgnoreCase("space"))) {
            System.out.println("Choose your location? [forest/space]");
            playerType = scanner.nextLine();

            if (playerType.equalsIgnoreCase("forest")) {
                System.out.println("The forest gives the ninja a slight stealth advantage.");
            } else if (playerType.equalsIgnoreCase("space")) {
                System.out.println("Space gives the alien a slight strength advantage.");
            } else {
                System.out.println("Invalid location type");
            }
        }

        // System.out.println("Choose your special attack? [speed/power/pain]");
        // String special = scanner.nextLine();

        String special = "";
        while (!(playerType.equalsIgnoreCase("speed") || playerType.equalsIgnoreCase("power") || playerType.equalsIgnoreCase("pain"))) {
            System.out.println("Choose your special attack? [speed/power/pain]");
            playerType = scanner.nextLine();

            if (playerType.equalsIgnoreCase("speed")) {
                System.out.println("Speed gives the the player a high chance of making a second hit at 20% damage of the first hit.");
            } else if (playerType.equalsIgnoreCase("power")) {
                System.out.println("Power gives the the player a medium chance of doing an additional 50% damage on a hit.");
            } else if (playerType.equalsIgnoreCase("pain")) {
                System.out.println("Pain has a small chance of inflicting a permanent penalty on the opponent, decreasing their overall effectiveness by 10%.");
            } else {
                System.out.println("Invalid special type");
            }
        }

    }
}
