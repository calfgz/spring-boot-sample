package org.springboot.sample.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务配置
 * @author pc
 *
 */
@Configuration
@EnableScheduling //启用定时任务
public class SchedulingConfiguration {
	
	private static Logger logger = LoggerFactory.getLogger(SchedulingConfiguration.class);
	
	@Scheduled(cron = "0/20 * * * * ?") //每20秒执行一次
	public void scheduler() {
		logger.info(">>>>>>>>>>>>> scheduled ... ");
	}

}
