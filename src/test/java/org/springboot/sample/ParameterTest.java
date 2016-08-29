package org.springboot.sample;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 参数化测试
 * @author pc
 *
 */
@RunWith(Parameterized.class)
public class ParameterTest {
	
	private String name;
	private boolean result;
	
	/**
	 * 该构造方法的参数与下面@Parameters注解的方法中的Object数组中值的顺序对应
	 * @param name
	 * @param result
	 */
	public ParameterTest(String name, boolean result) {
		super();
		this.name = name;
		this.result = result;
	}
	
	@Test
	public void test() {
		Assert.assertTrue(name.contains("莉") == result);
	}
	
	/**
	 * 该方法返回Collection
	 * @return
	 */
	@Parameters
	public static Collection<?> data() {
		 // Object 数组中值的顺序注意要和上面的构造方法ParameterTest的参数对应
		return Arrays.asList(new Object[][] {
			{"小明2", false},
			{"坏", false},
			{"莉莉", true}
		});
	}

}
