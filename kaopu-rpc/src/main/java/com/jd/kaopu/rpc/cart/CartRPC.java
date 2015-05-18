package com.jd.kaopu.rpc.cart;

import com.jd.cart.client.domain.CartContextParam;
import com.jd.cart.client.domain.CartResult;
import com.jd.cart.client.domain.OrderFrom;

public interface CartRPC {
	
	/**
	 * 获取购物车
	 * @param pin 用户pin
	 * @param orderFrom 来源
	 * @param cartContextParam 可选参数
	 * @param checkFlag 是否需要修改购物车为全选中状态,true需要，false不需要
	 * @return
	 */
	CartResult getCart(String pin, OrderFrom orderFrom, CartContextParam cartContextParam, boolean checkFlag);
	
}
