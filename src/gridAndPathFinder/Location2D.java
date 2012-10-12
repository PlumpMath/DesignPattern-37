package gridAndPathFinder;

public class Location2D
{
	private Integer x;
	private Integer y;

	public Location2D(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}

	public Location2D getNeighbourLocation(Direction2D dir)
	{
		switch (dir) 
		{
		case N:
			return new Location2D(this.x,this.y-1);
		case S:
			return new Location2D(this.x,this.y+1);
		case E:
			return new Location2D(this.x-1,this.y);
		case W:
			return new Location2D(this.x+1,this.y);
		default:
			break;
		}
		return new Location2D(this.x,this.y);
	}

	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}	
}
