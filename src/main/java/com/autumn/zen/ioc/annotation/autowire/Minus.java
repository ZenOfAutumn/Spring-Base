package com.autumn.zen.ioc.annotation.autowire;

import org.springframework.stereotype.Service;

@Service("minus")
public class Minus implements Function {

	@Override
	public long apply(int x, int y) {
		return x-y;
	}

}
