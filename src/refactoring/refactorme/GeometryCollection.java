package refactoring.refactorme;

import java.util.ArrayList;
import java.util.List;

public class GeometryCollection<T extends Geometry> {
	private final List<T> container;

	public GeometryCollection() {
		container = new ArrayList<>();
	}

	public void add(T geometry) {
		container.add(geometry);
	}

	public void remove(T geometry) {
		container.remove(geometry);
	}

	public boolean contains(T geometry) {
		return container.contains(geometry);
	}

	public T getById(final int id) throws InvalidAccessException {
		for (T geometry : container) {
			if (geometry.getId() == id) {
				return geometry;
			}
		}
		throw new InvalidAccessException("No such element.");
	}
}