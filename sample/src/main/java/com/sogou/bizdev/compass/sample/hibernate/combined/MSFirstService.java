package com.sogou.bizdev.compass.sample.hibernate.combined;

import com.sogou.bizdev.compass.sample.common.po.Plan;

/**先执行主从库sevrice的混合模式样例
 * @author gly
 * @since 1.0.0
 */
public interface MSFirstService {
	/**先执行主从库sevrice的混合模式
	 * @param accountId
	 * @param planId
	 * @return
	 */
	public Plan getMSAndShardPlan(Long accountId, Long planId);
}
