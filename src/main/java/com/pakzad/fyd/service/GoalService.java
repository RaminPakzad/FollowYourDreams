package com.pakzad.fyd.service;

import com.pakzad.fyd.repository.GoalRepository;
import com.pakzad.fyd.repository.GoalTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 7/13/2018.
 */
@Service
public class GoalService {
    private final GoalRepository goalRepository;
    private final GoalTypeRepository goalTypeRepository;


    @Autowired
    public GoalService(GoalRepository goalRepository, GoalTypeRepository goalTypeRepository) {
        this.goalRepository = goalRepository;
        this.goalTypeRepository = goalTypeRepository;
    }
}
