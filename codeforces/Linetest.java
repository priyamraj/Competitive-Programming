import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
public class Linetest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		Point2D pt1=new Point2D.Double(); pt1.setLocation(1,3);
		Point2D pt2=new Point2D.Double(); pt2.setLocation(5,7);
		Line2D ln=new Line2D.Double();
		ln.setLine(pt1,pt2);
		Point2D pt3=new Point2D.Double(); pt3.setLocation(4,6);
		System.out.println(ln.ptSegDist(pt3));
	}
}