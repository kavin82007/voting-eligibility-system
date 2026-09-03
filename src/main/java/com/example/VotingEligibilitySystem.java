package com.example;

import java.util.ArrayList;
import java.util.List;

public class VotingEligibilitySystem {

    public static void main(String[] args) {

        List<Voter> voters = new ArrayList<>();

        // Sample voters for automated testing
        voters.add(new Voter(
                "Kavin",
                21,
                "India",
                "IND12345",
                true
        ));

        voters.add(new Voter(
                "Arun",
                16,
                "India",
                "IND67890",
                true
        ));

        voters.add(new Voter(
                "John",
                25,
                "USA",
                "USA12345",
                true
        ));

        voters.add(new Voter(
                "Priya",
                30,
                "India",
                "IND54321",
                false
        ));

        System.out.println("===== VOTING ELIGIBILITY SYSTEM =====");

        for (Voter voter : voters) {
            checkEligibility(voter);
        }
    }

    public static void checkEligibility(Voter voter) {

        boolean eligible = true;

        System.out.println("\n--------------------------------");
        System.out.println("Voter Name: " + voter.getName());
        System.out.println("Age: " + voter.getAge());
        System.out.println("Citizenship: " + voter.getCitizenship());
        System.out.println("Voter ID: " + voter.getVoterId());
        System.out.println("Voter ID Valid: " + voter.isVoterIdValid());

        if (voter.getAge() < 18) {
            System.out.println("Reason: Underage.");
            eligible = false;
        }

        if (!voter.getCitizenship().equalsIgnoreCase("India")) {
            System.out.println("Reason: Not an Indian citizen.");
            eligible = false;
        }

        if (!voter.isVoterIdValid()) {
            System.out.println("Reason: Invalid voter ID.");
            eligible = false;
        }

        if (eligible) {
            System.out.println("Result: " + voter.getName()
                    + " is ELIGIBLE to vote.");
        } else {
            System.out.println("Result: " + voter.getName()
                    + " is NOT ELIGIBLE to vote.");
        }
    }
}