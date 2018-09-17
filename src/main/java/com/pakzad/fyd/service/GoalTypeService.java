package com.pakzad.fyd.service;

import com.pakzad.fyd.repository.GoalTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ramin Pakzad
 */
@Service
public class GoalTypeService {
    private final GoalTypeRepository goalTypeRepository;
@Autowired
    public GoalTypeService(GoalTypeRepository goalTypeRepository) {
        this.goalTypeRepository = goalTypeRepository;
    }
}
