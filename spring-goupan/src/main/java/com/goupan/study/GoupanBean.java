package com.goupan.study;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author 应癫
 * @create 2019/12/3 11:46
 */
public class GoupanBean implements InitializingBean, ApplicationContextAware {


	/**
	 * 构造函数
	 */
	public GoupanBean(){
		System.out.println("GoupanBean 构造器...");
	}


	/**
	 * InitializingBean 接口实现
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("GoupanBean afterPropertiesSet...");
	}

	public void print() {
		System.out.println("print方法业务逻辑执行");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext....");
	}
}
