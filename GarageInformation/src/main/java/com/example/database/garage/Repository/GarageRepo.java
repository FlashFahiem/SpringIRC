package com.example.database.garage.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.database.Info.GarageInfo;

import jakarta.transaction.Transactional;
@Repository
public interface GarageRepo extends JpaRepository<GarageInfo, Integer> {

@Query(value="select * from ginfo",nativeQuery = true)	
public List<GarageInfo> getAllData();	

@Query(value="select * from ginfo where garageid=:id",nativeQuery=true)
public List<GarageInfo> byOwnerName(@Param("id") int gid);

@Query(value="select * from ginfo where garageid between :start and :end",nativeQuery=true)
public List<GarageInfo> startEnd(@Param("start") int start,@Param("end") int end);

@Modifying
@Transactional
@Query(value="delete from ginfo where garageid=?1 and owner_name=?2",nativeQuery = true)
Integer deleteDet(@Param("id")int gid,@Param("name") String oname);

//JPQL uses Model Names
@Query(value="select c from GarageInfo c")
List<GarageInfo> getAll();

@Query(value="select c from GarageInfo c where c.garageId=?1")
public List<GarageInfo> jpql(@Param("id") int gid);


}
