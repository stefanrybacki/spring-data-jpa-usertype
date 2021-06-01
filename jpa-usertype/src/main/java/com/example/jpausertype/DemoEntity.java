package com.example.jpausertype;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.TypeDef;

import lombok.Data;

@TypeDef(name = "demoIdType", typeClass = DemoIdUserType.class, defaultForType = DemoId.class)
@Table(name = "demo_entity")
@Entity
@Data
public class DemoEntity {
  @Id
  @GeneratedValue
  private Integer id;

  @Column
  private DemoId demoId;
}
