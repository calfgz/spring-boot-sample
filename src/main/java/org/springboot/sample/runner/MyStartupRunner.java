package org.springboot.sample.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyStartupRunner implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		 System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作MyStartupRunner.java<<<<<<<<<<<<<");
	}

}
