package com.java8.defaultpkg;

public class DefaultMethodImpl implements DefaultMethod {
	String color;

	public static void main(String[] args) {
		DefaultMethodImpl defaultMethodImpl = new DefaultMethodImpl();
		defaultMethodImpl.setColor("RED");
		System.out.println(defaultMethodImpl.isValid());

	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

}
