package com.github.ipan97.training.spring.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TrainingSpringBootApplication.class)
public class TrainingSpringBootApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("Hello spring");
	}

}
