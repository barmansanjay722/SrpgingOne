package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class BootDemoAppApplicationTests {

	private Calculator c = new Calculator();
	@Test
	void contextLoads() {
	}

	@Test
	void testSum(){
		//expected
		int expecteResult = 20;

		//actual
		int actualResult = c.doSum(12,3,2);

		assertThat(actualResult).isEqualTo(expecteResult);
	}

}
