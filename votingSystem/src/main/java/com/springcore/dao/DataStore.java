package com.springcore.dao;
import java.util.ArrayList;
import java.util.List;
import com.springcore.entity.*;

public class DataStore {
	
	

	    private List<Candidate> candidates = new ArrayList<Candidate>();

	    public void addCandidate(Candidate candidate) {
	        candidates.add(candidate);
	    }

	    public List<Candidate> getAllCandidates() {
	        return candidates;
	    }

	    public Candidate getCandidateById(int id) {
	    	 return candidates.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
	    }

	    public void voteForCandidate(int id) {
	        Candidate candidate = getCandidateById(id);
	        if (candidate != null) {
	            candidate.setVotes(candidate.getVotes() + 1);
	        }
	    }
	}



