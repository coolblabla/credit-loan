package com.sixliu.credit.product.api;

import com.sixliu.credit.product.ProductDTO;

/**
 * @author:MG01867
 * @date:2018年7月9日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public interface ProductManagerClient {

	/**
	 * 通过产品id获取产品
	 * 
	 * @param productId
	 * @return
	 */
	ProductDTO get(String productId);

	/**
	 * 生成产品快照
	 * 
	 * @param productId
	 *            产品id
	 * @return 返回产品快照id
	 */
	String generateProductSnapshot(String productId);
}
