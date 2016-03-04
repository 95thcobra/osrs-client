import java.util.Iterator;

public class Class113 implements Iterator {

	LinkedEntry aLinkedEntry_1523 = null;
	Class120 aClass120_1521;
	LinkedEntry aLinkedEntry_1522;

	Class113(Class120 var1) {
		aClass120_1521 = var1;
		aLinkedEntry_1522 = aClass120_1521.aLinkedEntry_1551.prev;
		aLinkedEntry_1523 = null;
	}

	public Object next() {
		LinkedEntry var1 = aLinkedEntry_1522;
		if (var1 == aClass120_1521.aLinkedEntry_1551) {
			var1 = null;
			aLinkedEntry_1522 = null;
		} else {
			aLinkedEntry_1522 = var1.prev;
		}

		aLinkedEntry_1523 = var1;
		return var1;
	}

	public boolean hasNext() {
		return aLinkedEntry_1522 != aClass120_1521.aLinkedEntry_1551;
	}

	public void remove() {
		if (aLinkedEntry_1523 == null) {
			throw new IllegalStateException();
		} else {
			aLinkedEntry_1523.unlink();
			aLinkedEntry_1523 = null;
		}
	}

}
