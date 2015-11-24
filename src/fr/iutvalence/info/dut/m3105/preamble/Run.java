package fr.iutvalence.info.dut.m3105.preamble;

public final class Run {

	public static void main(String[] args) {
		Shape c1 = new Circle(1);
		c1.draw(new Position(1,0));
		Shape c1wb1 = new ShapeBorder(c1, 5);
		c1wb1.draw(new Position(1, 0));
		
		Shape verif1 = new CircleBuilder(1).addBorder(5).getCircle();
		verif1.draw(new Position(1, 0));
		
		Figure simple = new FigureSimple(c1, new Position(1,0));
		simple.draw();
		
		Figure complexe = 
	}

}
