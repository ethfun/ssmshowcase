package com.ssm.manager;

import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author liuchen
 * @date 2018/10/9
 */
@Slf4j
@Component
public class ComponentDemo {

	@Value("${dataSource.driverClass}")
	private String driverClass;

	@PostConstruct
	public void init() {
		log.info("driverClass is {}", driverClass);
	}
}
