package refactoring.refactorme;

import java.util.ArrayList;
import java.util.List;

public class GeometryCollection<T extends Geometry> {
	private final List<T> container;

	public GeometryCollection() {
		container = new ArrayList<>();
	}
/**
 * adds a geometry to the list
 * @param geometry
 */
	public void add(T geometry) {
		container.add(geometry);
	}

/**
 * removes a geometry from the list
 * @param geometry
 */
	public void remove(T geometry) {
		container.remove(geometry);
	}

/**
 * checks if a geometry is in the list
 * @param geometry
 * @return
 */
	public boolean contains(T geometry) {
		return container.contains(geometry);
	}

/**
 * returns a geometry based on its ID
 * @param id
 * @return
 * @throws InvalidAccessException
 */
	public T getById(final int id) throws InvalidAccessException {
		for (T geometry : container) {
			if (geometry.getId() == id) {
				return geometry;
			}
		}
		throw new InvalidAccessException("No such element.");
	}
}