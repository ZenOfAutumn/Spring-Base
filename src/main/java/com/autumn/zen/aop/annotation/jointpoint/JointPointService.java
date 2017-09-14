package com.autumn.zen.aop.annotation.jointpoint;

import org.springframework.stereotype.Component;

@Component
public class JointPointService {

	public String joint(String arg1, int arg2) {
		return "joint";
	}

	public Double point(double x, double y) {
		return x + y;
	}

	public String args(String arg1, int arg2, int arg3) {
		return "args";
	}
}
