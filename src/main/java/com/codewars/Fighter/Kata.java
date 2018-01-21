package com.codewars.Fighter;

// Python
//  declare_winner(Fighter("Lew", 10, 2), Fighter("Harry", 5, 4), "Lew") => "Lew"
//
//          Lew attacks Harry; Harry now has 3 health.
//          Harry attacks Lew; Lew now has 6 health.
//          Lew attacks Harry; Harry now has 1 health.
//          Harry attacks Lew; Lew now has 2 health.
//          Lew attacks Harry: Harry now has -1 health and is dead. Lew wins.
public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        whoWins(fighter1, fighter2, firstAttacker);

        if (fighter1.health > 0 && fighter2.health <= 0) {
            return fighter1.name;
        }
        if (fighter2.health > 0 && fighter1.health <= 0) {
            return fighter2.name;
        }

        return "";
    }

    private static void whoWins(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (fighter1.name.equals(firstAttacker)) {
            if (!isWinner(fighter1, fighter2)) {
                whoWins(fighter1, fighter2, fighter2.name);
            }

        } else if (fighter2.name.equals(firstAttacker)) {
            if (!isWinner(fighter2, fighter1)) {
                whoWins(fighter1, fighter2, fighter1.name);
            }
        }
    }

    private static boolean isWinner(Fighter fighter1, Fighter fighter2) {
        System.out.print(fighter1.name + " attacks " + fighter2.name + "; ");
        fighter2.health = fighter2.health - fighter1.damagePerAttack;
        if (isDead(fighter2)) {
            System.out.println(fighter1.name + " wins.");
            return true;
        } else {
            return false;
        }
    }

    private static boolean isDead(Fighter fighter) {
        String msg = fighter.name + " now has " + fighter.health + " health";
        if (fighter.health > 0) {
            System.out.println(msg + ".");
            return false;
        } else {
            System.out.print(msg + " and is dead. ");
            return true;
        }
    }


    public static void main(String[] args) {
//        System.out.print(declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
//        System.out.print(declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
//        System.out.println(declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));
        System.out.println(Kata.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
//        System.out.println(Kata.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
    }
}
