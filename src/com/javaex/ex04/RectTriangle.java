package com.javaex.ex04;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle() {

	}

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() { // 넓이
		return width * height * 0.5;
	}

	public double getPerimeter() { // 둘레
		return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}