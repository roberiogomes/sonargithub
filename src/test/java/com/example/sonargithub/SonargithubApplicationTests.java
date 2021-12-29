package com.example.sonargithub;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SonargithubApplicationTests {
	@Autowired
    private FirstController firstController;

	@Test
	void contextLoads() {
		assertThat(firstController).isNotNull();
	}
}
