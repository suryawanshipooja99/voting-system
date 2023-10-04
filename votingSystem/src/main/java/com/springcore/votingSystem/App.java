package com.springcore.votingSystem;
import com.springcore.controller.*;

public class App {
    public static void main(String[] args) {
        VotingController votingController = new VotingController();
        votingController.run();
    }
}
