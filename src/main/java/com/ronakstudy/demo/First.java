package com.ronakstudy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ronakstudy.model.CoreTeamMembers;
import com.ronakstudy.model.TestInterface;


@Controller
public class First {

	@Autowired
	private CoreTeamMembers coreTeamMembers;
	
	
	private TestInterface testInterface;
	
	
	
	public TestInterface getTestInterface() {
		return testInterface;
	}


	@Autowired
	@Qualifier("implementation1")
	public void setTestInterface(TestInterface testInterface) {
		this.testInterface = testInterface;
	}



	@RequestMapping("/")
	@ResponseBody
	public CoreTeamMembers check() {
		testInterface.display();
		System.out.println("ronak");
		coreTeamMembers.setTeamMemId(1);
		coreTeamMembers.setTeamMemName("Nikhil");
		coreTeamMembers.setTeamMemDesig("Director");
		return coreTeamMembers;
	}
}
