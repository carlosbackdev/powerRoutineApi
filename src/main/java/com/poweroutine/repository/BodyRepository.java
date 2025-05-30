package com.poweroutine.repository;

import com.poweroutine.model.BodyModel;
import com.poweroutine.model.EjerciceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyRepository  extends JpaRepository<BodyModel, Integer> {
}
