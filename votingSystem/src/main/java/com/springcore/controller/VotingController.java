package com.springcore.controller;
import java.util.List;
import java.util.Scanner;
import com.springcore.entity.*;
import com.springcore.service.VotingService;



public class VotingController {

	
	private VotingService votingService = new VotingService();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("1. Add candidate");
            System.out.println("2. Vote for candidate");
            System.out.println("3. View results");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addCandidate();
                    break;
                case 2:
                    voteForCandidate();
                    break;
                case 3:
                    viewResults();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

    private void addCandidate() {
        System.out.println("Enter candidate name:");
       // String name = scanner.next();
        Candidate candidate = new Candidate();
        // set properties
        votingService.addCandidate(candidate);
        
      
    }

    private void voteForCandidate() {
        System.out.println("Enter candidate ID:");
        int id = scanner.nextInt();
        votingService.voteForCandidate(id);
    }

    private void viewResults() {
        List<Candidate> candidates = votingService.getAllCandidates();
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getName() + ": " + candidate.getVotes());
        }
    }

	
}
