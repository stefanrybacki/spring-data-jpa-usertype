package com.example.jpausertype;

import static org.mockito.ArgumentMatchers.isNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@Transactional
@SpringBootTest
class DemoEntityRepositoryTest {

  @Autowired
  private DemoEntityRepository repo;

  @Test
  void userType() {
    repo.findByDemoId(new DemoId(5));
  }

  @Test
  void addEntity() {
    var e = new DemoEntity();
    e.setDemoId(new DemoId(5));
    e = repo.saveAndFlush(e);

    assertThat(e.getId(), notNullValue());
  }

}
