package com.nd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}


	public static void main(String[] args) {
		String allClassName = "com.nd.fepapi.service.domain.adminuser.AdminUserRepository";
		System.out.println("当前扫描的类路径是" + allClassName);
		System.out.println(allClassName.startsWith("com.nd.fepapi.service.domain"));
	}
}
