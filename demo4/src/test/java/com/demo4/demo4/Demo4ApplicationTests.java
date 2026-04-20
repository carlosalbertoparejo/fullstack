package com.demo4.demo4;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class Demo4ApplicationTests {

	@Test
	void contextLoads() {
	}

}
