package com.academy.lecture06;

public class Main {
    public static void main(String[] args) {
        checkPeopleRights(21);

    }

    public static void checkPeopleRights(int age) {
        boolean isAllowedToDrive = false;
        boolean hasRightsToDrink = false;
        boolean isAllowedToVote = false;

        if (age < 18) {
            System.out.println("Nothing is allowed");
        } else if (age > 18 && age < 21) {
            isAllowedToVote = true;
            isAllowedToDrive = true;
            System.out.println("isAllowedToVote: " + isAllowedToVote + " hasRightToDrink: " + hasRightsToDrink +
                    " isAllowedToDrive: " + isAllowedToDrive);
        } else {
            isAllowedToDrive = true;
            isAllowedToVote = true;
            hasRightsToDrink = true;
            System.out.println("isAllowedToVote: " + isAllowedToVote +  " hasRightToDrink: " + hasRightsToDrink +
                    " isAllowedToDrive: " + isAllowedToDrive);
        }
    }
}
