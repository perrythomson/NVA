//package Game.players;
//
///**
// * Created by perrythomson on 7/12/16.
// */
//public class Predator extends Player {
//    private int shouldercannonMaxDamage = 35;
//    private int shouldercannonProtection = 50;
//    private int razerboomerangMaxDamage = 45;
//    private int razerboomerangProtection = 35;
//    private int maxHitsPerRole = 2;
//    private int accuracy = 1;
//
//    public int ninjaDamageGivenCalculator() {
//        int damage = 0;
//        if(getPlayerWeapon().equalsIgnoreCase("shouldercanon")) {
//            damage = shouldercannonMaxDamage * maxHitsPerRole * accuracy;
//        } else {
//            damage = razerboomerangMaxDamage * maxHitsPerRole * accuracy;
//        }
//        return damage;
//    }
//
//    public int ninjaDamageReceivedCalculator(int rawDamageDealt) {
//        int damage = 0;
//        if(getPlayerWeapon().equalsIgnoreCase("razerboomerang")) {
//            damage = rawDamageDealt - (shouldercannonProtection * accuracy);
//        } else {
//            damage = rawDamageDealt - (razerboomerangProtection * accuracy);
//        }
//        this.removeHealth(damage);
//        return damage;
//    }
//}
