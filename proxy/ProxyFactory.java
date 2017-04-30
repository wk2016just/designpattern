package proxy;

import java.lang.reflect.Proxy;

/**
 * 简单工厂  
 * 利用JDK内置的代理 创建代理对象
 *
 */
public class ProxyFactory {
	
	public static Person getOwnerPersonBean(Person personBean){
		return (Person) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new PersonBeanOwnerHandler(personBean));
	}
	
	public static Person getNonOwnerPersonBean(Person personBean){
		return (Person) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new PersonBeanNonOwnerHandler(personBean));
	}
	
}
