package com.winter.app.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Robot {
	//팔, 왼쪽, 오른쪽
	@Autowired
	private LeftArm leftArm;
	@Autowired
	private RightArm rightArm;

	public LeftArm getLeftArm() {
		return leftArm;
	}

	public void setLeftArm(LeftArm leftArm) {
		this.leftArm = leftArm;
	}

	public RightArm getRightArm() {
		return rightArm;
	}

	public void setRightArm(RightArm rightArm) {
		this.rightArm = rightArm;
	}
	
	
	
	//직접 객체 생성방법
	public Robot() {
		
		
		
		//기본
//		this.leftArm=new LeftArm();
//		this.rightArm=new RightArm();
	}
	
	//매개변수 생성방법
	public Robot(LeftArm leftArm,RightArm rightArm) {
		this.leftArm=leftArm;
		this.rightArm=rightArm;
	}


	
	
	
	//다리
	
	
}
