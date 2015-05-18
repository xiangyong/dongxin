package com.kaopu.rpc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jd.cart.client.domain.CartContextParam;
import com.jd.cart.client.domain.CartResult;
import com.jd.cart.client.domain.OrderFrom;
import com.jd.dongxin.common.util.JsonUtil;
import com.jd.kaopu.rpc.cart.CartRPC;
import com.jd.kaopu.rpc.cart.impl.CartRPCImpl;

public class CartRPCTest {
	
	private static CartRPC cartRPC;
	
	static{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		cartRPC = (CartRPCImpl)ctx.getBean("cartRPCImpl");
	}
	
	public static void main(String[] args){
		System.out.println("**********************测试方法执行开始************************");
		cartRPCTest();
		System.out.println("**********************测试方法执行结束************************");
	}
	
	private static void cartRPCTest(){
		OrderFrom from = new OrderFrom();
		from.setFlowId(1);
		from.setOriginId(1);
		from.setSiteId(1);
		from.setWebOriginId(1);
		CartContextParam contextParam = new CartContextParam();
		contextParam.setIp("192.168.66.88");
		CartResult cartResult = cartRPC.getCart("testnewuser", from, contextParam, true);
		System.out.println(JsonUtil.toJson(cartResult));
	}
	
}
