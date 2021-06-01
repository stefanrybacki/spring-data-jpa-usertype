package com.example.jpausertype;

import java.util.List;

import org.hibernate.annotations.TypeDef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DemoEntityRepository extends JpaRepository<DemoEntity, Integer> {

  @Query(value = "SELECT * FROM demo_entity WHERE demo_id=:demoId", nativeQuery = true)
  List<DemoEntity> findByDemoId(@Param("demoId") DemoId demoId);

}
