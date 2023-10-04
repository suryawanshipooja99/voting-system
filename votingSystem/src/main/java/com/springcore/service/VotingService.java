package com.springcore.service;
import java.util.List;

import com.springcore.entity.*;

import com.springcore.dao.*;


public class VotingService {
	    private DataStore dataStore = new DataStore();

	    public void addCandidate(Candidate candidate) {
	        dataStore.addCandidate(candidate);
	    }

	    public List<Candidate> getAllCandidates() {
	        return dataStore.getAllCandidates();
	    }

	    public void voteForCandidate(int id) {
	        dataStore.voteForCandidate(id);
	    }
	}



