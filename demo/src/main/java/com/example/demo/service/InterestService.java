package com.example.demo.service;

import com.example.demo.entity.Interest;
import com.example.demo.repository.InterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterestService {
    @Autowired
    private InterestRepository interestRepository;

    public Interest save(Interest interest){
        return interestRepository.save(interest);
    }

    public void deleteInterest(Interest interest){
        interestRepository.delete(interest);
    }

    public List<Interest> findAll(){
        return interestRepository.findAll();
    }
}
