package org.springboot.sample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * 打包测试
 * @author pc
 *
 */
@RunWith(Suite.class)
@SuiteClasses({StudentTest.class, ParameterTest.class})
public class SuiteTest {
	// 类中不需要编写代码
}
