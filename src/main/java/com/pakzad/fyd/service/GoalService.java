package com.pakzad.fyd.service;

import com.pakzad.fyd.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 7/13/2018.
 */
@Service
public class GoalService {
    private final GoalRepository goalRepository;
    private final GoalTypeService goalTypeService;

    @Autowired
    public GoalService(GoalRepository goalRepository, GoalTypeService goalTypeService) {
        this.goalRepository = goalRepository;
        this.goalTypeService = goalTypeService;
    }
}
