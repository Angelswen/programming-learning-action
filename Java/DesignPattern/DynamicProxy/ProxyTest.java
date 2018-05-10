package com.vechace.DynamicProxy;

public class ProxyTest {

	public static void main(String[] args) {
		Service service = new UserServiceImpl();
		MyInvocationHandler handler = new MyInvocationHandler(service);
		Service serviceProxy = (Service)handler.getProxy();
		serviceProxy.add();

	}

}
