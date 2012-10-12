package gridAndPathFinder;

public enum Direction2D {
	N, E, W, S, U;

	static public Direction2D opposedDir(Direction2D dir) {
		switch (dir) 
		{
		case N: return S;
		case S: return N;
		case E:	return W;
		case W:	return E;
		default:
			break;
		}
		return dir;
	}
};
