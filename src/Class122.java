import java.util.Iterator;

public final class Class122 implements Iterable {

	LinkedEntry aLinkedEntry_1554;
	int anInt1556;
	LinkedEntry[] aLinkedEntryArray1555;

	public void method1515(LinkedEntry var1, long var2) {
		if (var1.next != null) {
			var1.unlink();
		}

		LinkedEntry var4 = aLinkedEntryArray1555[(int) (var2 & (long) (anInt1556 - 1))];
		var1.next = var4.next;
		var1.prev = var4;
		var1.next.prev = var1;
		var1.prev.next = var1;
		var1.key = var2;
	}

	public LinkedEntry method1516(long var1) {
		LinkedEntry var3 = aLinkedEntryArray1555[(int) (var1 & (long) (anInt1556 - 1))];

		for (aLinkedEntry_1554 = var3.prev; aLinkedEntry_1554 != var3; aLinkedEntry_1554 = aLinkedEntry_1554.prev) {
			if (aLinkedEntry_1554.key == var1) {
				LinkedEntry var4 = aLinkedEntry_1554;
				aLinkedEntry_1554 = aLinkedEntry_1554.prev;
				return var4;
			}
		}

		aLinkedEntry_1554 = null;
		return null;
	}

	public Iterator iterator() {
		return new Class130(this);
	}

	public Class122(int var1) {
		anInt1556 = var1;
		aLinkedEntryArray1555 = new LinkedEntry[var1];

		for (int var3 = 0; var3 < var1; var3++) {
			LinkedEntry var2 = aLinkedEntryArray1555[var3] = new LinkedEntry();
			var2.prev = var2;
			var2.next = var2;
		}

	}

	public void method1520() {
		for (int var1 = 0; var1 < anInt1556; var1++) {
			LinkedEntry var3 = aLinkedEntryArray1555[var1];

			while (true) {
				LinkedEntry var2 = var3.prev;
				if (var2 == var3) {
					break;
				}

				var2.unlink();
			}
		}

		aLinkedEntry_1554 = null;
	}

}
