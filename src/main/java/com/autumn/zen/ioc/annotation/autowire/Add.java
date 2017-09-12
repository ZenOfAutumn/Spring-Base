package com.autumn.zen.ioc.annotation.autowire;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service("add")
@Lazy
public class Add implements Function {

	@Override
	public long apply(int x, int y) {
		return x+y;
	}

}
