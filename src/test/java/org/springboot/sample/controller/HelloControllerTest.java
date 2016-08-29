package org.springboot.sample.controller;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springboot.sample.SpringBootSampleApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * 使用Junit测试HTTP的API接口
 * @author pc
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootSampleApplication.class)
@WebAppConfiguration	// 使用@WebIntegrationTest注解需要将@WebAppConfiguration注释掉
//@WebIntegrationTest("server.port:0")	// 使用0表示端口号随机，也可以具体指定如8888这样的固定端口
public class HelloControllerTest {
	
	private TestRestTemplate template = new TestRestTemplate();
	
	/**
    @Value("${local.server.port}")// 注入端口号
    private int port;
	 */
	
	@Test
	public void info() {
		String url = "http://127.0.0.1:8080/hello/info";
		MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
		map.add("name", "Tom");
		map.add("name1", "Lily");
		String result = template.postForObject(url, map, String.class);
		System.out.println("----------------------------" + result);
		Assert.assertNotNull(result);
		Assert.assertThat(result, Matchers.containsString("Tom"));
	}

}
