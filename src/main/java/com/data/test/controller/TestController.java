package com.data.test.controller;

import com.data.test.dao.TestDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class TestController {
  private Logger logger = Logger.getLogger(TestController.class);

  @Autowired
  TestDao testDao;

  @GetMapping("/test")
  public List<Map> getData(){
    for(int i=0;i<1000;i++){
      logger.debug("debug"+i);
      logger.info("info"+i);
      logger.warn("warn"+i);
      logger.error("error"+i);
      logger.fatal("fatal"+i);
    }
    return testDao.getData();
  }
}
