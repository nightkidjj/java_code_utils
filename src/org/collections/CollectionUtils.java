package org.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionUtils {
	public static <T> ArrayList<T> newArrayList() {
		return new ArrayList<T> ();
	}
	
	public static <T> T[] toArray(Collection<T> coll) {
		if (coll == null) {
			return null;
		}
		@SuppressWarnings("unchecked")
		T[] result = (T[]) coll.toArray();
		return result;
	}
}
