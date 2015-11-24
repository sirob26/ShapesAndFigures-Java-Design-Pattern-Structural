package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle implements Shape{
	private int height;
	private int width;
	
	@Override
	public void draw(Position position) {
		System.out.printf("Rectangle draw in position ",position.getX()," ",position.getY()," whith a size of ", this.height, "x", this.width);
	}
	
}
