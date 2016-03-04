import java.util.Iterator;

public class Class130 implements Iterator {

	LinkedEntry aLinkedEntry_1581;
	int anInt1583;
	LinkedEntry aLinkedEntry_1582 = null;
	Class122 aClass122_1584;

	void method1592() {
		aLinkedEntry_1581 = aClass122_1584.aLinkedEntryArray1555[0].prev;
		anInt1583 = 1;
		aLinkedEntry_1582 = null;
	}

	public boolean hasNext() {
		if (aLinkedEntry_1581 == aClass122_1584.aLinkedEntryArray1555[anInt1583 - 1]) {
			while (anInt1583 < aClass122_1584.anInt1556) {
				if (aClass122_1584.aLinkedEntryArray1555[anInt1583++].prev != aClass122_1584.aLinkedEntryArray1555[anInt1583 - 1]) {
					aLinkedEntry_1581 = aClass122_1584.aLinkedEntryArray1555[anInt1583 - 1].prev;
					return true;
				}

				aLinkedEntry_1581 = aClass122_1584.aLinkedEntryArray1555[anInt1583 - 1];
			}

			return false;
		} else {
			return true;
		}
	}

	public Object next() {
		LinkedEntry var1;
		if (aLinkedEntry_1581 != aClass122_1584.aLinkedEntryArray1555[anInt1583 - 1]) {
			var1 = aLinkedEntry_1581;
			aLinkedEntry_1581 = var1.prev;
			aLinkedEntry_1582 = var1;
			return var1;
		} else {
			do {
				if (anInt1583 >= aClass122_1584.anInt1556) {
					return null;
				}

				var1 = aClass122_1584.aLinkedEntryArray1555[anInt1583++].prev;
			} while (var1 == aClass122_1584.aLinkedEntryArray1555[anInt1583 - 1]);

			aLinkedEntry_1581 = var1.prev;
			aLinkedEntry_1582 = var1;
			return var1;
		}
	}

	public void remove() {
		if (aLinkedEntry_1582 == null) {
			throw new IllegalStateException();
		} else {
			aLinkedEntry_1582.unlink();
			aLinkedEntry_1582 = null;
		}
	}

	Class130(Class122 var1) {
		aClass122_1584 = var1;
		method1592();
	}

}
