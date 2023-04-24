package com.example.database.garage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.Info.GarageInfo;
@Repository
public interface GarageRepo extends JpaRepository<GarageInfo, Integer> {

}
