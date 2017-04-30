package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 自己处理器(拥有者) 自己可以维护自己的信息 除了评分以外
 *
 */
public class PersonBeanOwnerHandler implements InvocationHandler {

	Person personBean;
	
	
	public PersonBeanOwnerHandler(Person personBean) {
		super();
		this.personBean = personBean;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		if(method.getName().startsWith("get")){//获取自己的其他信息
			return method.invoke(personBean, args);
		}else if(method.getName().equals("setScore")){
			throw new IllegalAccessException("你不能自己给自己评分");
		}else if(method.getName().startsWith("set")){ //设置自己的其他信息
			return method.invoke(personBean, args);
		}
		return null;
	}

}
