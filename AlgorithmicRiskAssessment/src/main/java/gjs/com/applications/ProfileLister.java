package gjs.com.applications;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gjs.com.dao.ProfileDetails;

public class ProfileLister {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-rgf-config.xml");
		ProfileDetails jc = (ProfileDetails) context.getBean("profileDetails"); 
		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();
	}
}
