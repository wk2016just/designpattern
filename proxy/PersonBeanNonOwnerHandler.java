package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 不是自己处理器(非拥有者) 可以获取信息 可以设置其他人的评分 但是不能设置其他人的其他信息
 *
 */
public class PersonBeanNonOwnerHandler implements InvocationHandler {

	Person personBean;
	
	
	public PersonBeanNonOwnerHandler(Person personBean) {
		super();
		this.personBean = personBean;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		if(method.getName().startsWith("get")){
			return method.invoke(personBean, args);
		}else if (method.getName().equals("setScore")) {
			return method.invoke(personBean, args);
		}else if (method.getName().startsWith("set")) {
			throw new IllegalAccessException("你不能设置其他人的其他信息");
		}
		return null;
	}

}
