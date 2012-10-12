package gridAndPathFinder;

import java.util.ArrayList;

/**
 * @author sye
 *
 * @param <T>
 */
public class Grid<T> {
	private ArrayList<T> m_list = null;
	private Integer m_columnCount = null;
	private Integer m_rowCount = null;

	/**
	 * @param p_columnCount
	 * @param p_rowCount
	 * @param p_default
	 */
	public Grid(Integer p_columnCount, Integer p_rowCount, T p_default) {
		super();
		this.m_list = new ArrayList<T>();
		this.m_columnCount = p_columnCount;
		this.m_rowCount = p_rowCount;

		for (int i = 0; i < p_columnCount*p_rowCount; i++) {
			m_list.add(p_default);
		}
	}	

	public Boolean contain(Integer x, Integer y)
	{
		return x<m_columnCount && x >= 0 && y<m_rowCount && y >=0;
	}
	
	public Boolean contain(Location2D loc)
	{
		return this.contain(loc.getX(), loc.getY());
	}

	public T get(Integer x, Integer y) 
	{
		return contain(x, y) ? m_list.get(x*m_rowCount+y) : null ;
	}
	
	/**
	 * @param loc
	 * @return
	 */
	public T get(Location2D loc) 
	{
		return get(loc.getX(), loc.getY()) ;
	}

	public void set(Location2D loc, T value)
	{
		this.set(loc.getX(), loc.getY(), value);
	}
	
	public void set(Integer x, Integer y, T value)
	{
		if(contain(x, y))
			m_list.set(x*m_rowCount+y, value);
		else
			System.out.println("set impossible : depassement de la grille");
	}

	public int getM_columnCount() {
		return m_columnCount;
	}
	public int getM_rowCount() {
		return m_rowCount;
	}

	public void affiche()
	{
		for (int i = 0; i < m_rowCount ; i++) {
			for (int j = 0; j < m_columnCount; j++) {
				System.out.print("["/*+"("+j+","+i+") : "*/+this.get(j,i)+"]");
			}
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return "Grid [m_list=" + m_list + ", m_columnCount="
		+ m_columnCount + ", m_rowCount=" + m_rowCount + "]";
	}


}
