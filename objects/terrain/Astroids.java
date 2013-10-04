package objects.terrain;

public class Astroids extends Terrain{
	
	public Astroids(char shape, int number, int sx, int sy, int sz, int range, int seed){
		this.type = "astroids";
		this.shape = shape;
		this.number = number;
		this.sx = sx;
		this.sy = sy;
		this.sz = sz;
		this.range = range;
		this.seed = seed;
	}
	
	

}
