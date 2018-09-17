package com.pakzad.fyd.repository;

import com.pakzad.fyd.model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ramin pakzad (rpakzadmanesh@gmail.com) on 7/13/2018.
 */
public interface GoalRepository extends JpaRepository<Goal, Long> {
}
