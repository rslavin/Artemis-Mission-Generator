package objects.terrain;

import objects.MapObject;

/**
 * Parent class of all immobile objects
 * @author Rocky
 *
 */
public abstract class Terrain extends MapObject{
	String type = null;
	int shape; // 0 = line; 1 = circle; 2 = arc
	
	// number of objects in range
	int number;
	
	// start point
	int sx;
	int sy;
	int sz;
	
	// end point
	int ex;
	int ey;
	int ez;	
	
	int radius;
	
	// arc params
	int sDegree;
	int eDegree;
	
	int range;
	
	int seed;
	
	public void setLine(int ex, int ey, int ez){
		this.ex = ex;
		this.ey = ey;
		this.ez = ez;
	}
	
	public void setCircle(int radius){
		this.radius = radius;
	}
	
	public void setArc(int sDegree, int eDegree, int radius){
		this.sDegree = sDegree;
		this.eDegree = eDegree;
		this.radius = radius;
	}
	
	/************* implement generators that create shapes with reasonable bounds *****/
	

}
