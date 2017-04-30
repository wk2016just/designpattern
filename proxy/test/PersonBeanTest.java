package proxy.test;



import java.lang.reflect.InvocationHandler;

import proxy.Person;
import proxy.PersonBeanImpl;
import proxy.ProxyFactory;

public class PersonBeanTest {


	public static void main(String[] args) {
		PersonBeanImpl personBean = new PersonBeanImpl("科比", "篮球", "职业素养最好的运动员");
		System.out.println(personBean);
		//创建拥有者
		Person personBeanOwner = ProxyFactory.getOwnerPersonBean(personBean);
		System.out.println(personBeanOwner.getName());
		personBeanOwner.setDescription(personBeanOwner.getDescription()
				+ ",老将中的战斗机");
		System.out.println(personBeanOwner.getDescription());
		System.out.println(personBean);
		try {
			// 自己给自己评分 会发生异常
			personBeanOwner.setScore(100);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(personBean);
		}
		//创建非拥有者
		Person personNonOwner=ProxyFactory.getNonOwnerPersonBean(personBean);
		System.out.println(personNonOwner.getDescription());
		personNonOwner.setScore(100);
		System.out.println(personBean);
		try {
			//设置别人的信息 会发生异常
			personNonOwner.setDescription("足球踢得非常好");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(personBean);
		}
	}

}
