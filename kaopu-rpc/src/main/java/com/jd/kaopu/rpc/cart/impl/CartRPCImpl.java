package com.jd.kaopu.rpc.cart.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.jd.cart.client.domain.CartContextParam;
import com.jd.cart.client.domain.CartResult;
import com.jd.cart.client.domain.OrderFrom;
import com.jd.cart.client.service.CartService;
import com.jd.dongxin.common.util.LogHelper;
import com.jd.kaopu.rpc.cart.CartRPC;

@Service("cartRPCImpl")
public class CartRPCImpl implements CartRPC {

	private final static Logger logger = Logger.getLogger(CartRPCImpl.class);
	
	@Resource(name = "cartService")
	private CartService cartService;
	
	@Override
	public CartResult getCart(String pin, OrderFrom orderFrom,CartContextParam cartContextParam, boolean checkFlag) {
		CartResult cartResult = new CartResult();
        try {
            cartResult = cartService.getCart(pin, orderFrom, cartContextParam, checkFlag);
            if (cartResult == null || cartResult.getCartVO() == null) {
            	LogHelper.error(logger, new Object[]{"method","message","pin","orderFrom","cartContextParam","checkFlag","cartResult"}, 
            			new Object[]{"getCart","购物车返回数据为空！",pin,orderFrom,cartContextParam,checkFlag,cartResult});
            }
        } catch (Exception e) {
        	LogHelper.error(logger, new Object[]{"method","message","pin","orderFrom","cartContextParam","checkFlag"}, 
        			new Object[]{"getCart","调用购物车发生异常！",pin,orderFrom,cartContextParam,checkFlag},e);
        }
        return cartResult;
	}

	public CartService getCartService() {
		return cartService;
	}

	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}

}
