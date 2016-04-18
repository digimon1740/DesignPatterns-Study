package singleton;

import java.lang.reflect.Constructor;

public class SingletonTest {

	public static void main(String[] args) throws Exception {
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1);
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2);

		Constructor<?> constructor = Singleton.class.getDeclaredConstructors()[0];
		constructor.setAccessible(true);
		Singleton singleton3 = (Singleton) constructor.newInstance();
		System.out.println(singleton3);

		EffectiveSingleton effectiveSingleton = EffectiveSingletonFactory.getInstance();
		effectiveSingleton.init();

//		Class<?> clazz = Class.forName("singleton.Singleton");
//		Method[] methods = clazz.getDeclaredMethods();
//		for (Method method : methods) {
//			System.out.println("method name : " + method.getName());
//			Object obj = method.invoke(null, null);
//			System.out.println(obj);
//
//
//		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//		if(classLoader == null)
//			classLoader = Singleton.class.getClassLoader();
//		Class<?> clazz2 = classLoader.loadClass("singleton.Singleton");
//		Method[] methods2 = clazz2.getDeclaredMethods();
//		for (Method method : methods2) {
//			System.out.println("method name : " + method.getName());
//			Object obj = method.invoke(null, null);
//			System.out.println(obj);
//		}
		//Singleton singleton3 = (Singleton)clazz.newInstance();
		//Singleton singleton4 = (Singleton)clazz.newInstance();
		//System.out.println(singleton3);
		//System.out.println(singleton4);


	}
}
