package objects.terrain;

public class Nebula extends Terrain{
	
	public Nebula(char shape, int number, int sx, int sy, int sz, int range, int seed){
		this.type = "nebulas";
		this.shape = shape;
		this.number = number;
		this.sx = sx;
		this.sy = sy;
		this.sz = sz;
		this.range = range;
		this.seed = seed;
	}
	

}
