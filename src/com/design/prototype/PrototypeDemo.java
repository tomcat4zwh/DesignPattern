package com.design.prototype;

import java.util.LinkedList;

/*
 * 原型模式  克隆对象  属性相同 地址不同 （浅拷贝）
 */
public class PrototypeDemo {

	public static void main(String[] args) {
		
		Sheep sheep = new Sheep("Dorry", 2, "white");
		sheep.friend = new Sheep("Tom", 2, "black");
		
		Sheep sheep1 = (Sheep)sheep.clone();
		Sheep sheep2 = (Sheep)sheep.clone();
		Sheep sheep3 = (Sheep)sheep.clone();
		
		System.out.println(sheep1+",sheep1.friend:"+sheep1.friend.hashCode());
		System.out.println(sheep2+",sheep2.friend:"+sheep2.friend.hashCode());
		System.out.println(sheep3+",sheep3.friend:"+sheep3.friend.hashCode());
		
	}

}
