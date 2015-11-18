package com.sogou.bizdev.compass.sample.hibernate.combined.test;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.sogou.bizdev.compass.sample.common.po.Plan;
import com.sogou.bizdev.compass.sample.hibernate.combined.MSFirstService;

/**
 * 多套库的情况
 * 
 * @author xr
 * @version 1.0.0
 * @since 1.0.0
 */
@ContextConfiguration(locations = { "classpath*:/conf/hibernate/test-shard-*.xml","classpath*:/datasource/shard/test-shard-*.xml","/conf/hibernate/test-masterslave-*.xml","classpath*:/datasource/masterslave/test-masterslave-*.xml" })
public class MSFirstServiceTest extends AbstractJUnit4SpringContextTests{
	
	@Test
	public void testGetMSAndShardPlan(){
		MSFirstService shardFirstService = (MSFirstService)applicationContext.getBean("mSFirstService");
		Plan plan = shardFirstService.getMSAndShardPlan(375832L, 99999999L);

		System.out.println(plan);
	}

	
}