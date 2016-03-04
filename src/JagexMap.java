public final class JagexMap {

	int anInt1564 = 0;
	int granularity;
	LinkedEntry[] bucket;
	LinkedEntry aLinkedEntry_1562;
	LinkedEntry aLinkedEntry_1560;

	public void put(LinkedEntry entry, long key) {
		if (entry.next != null) {
			entry.unlink();
		}

		LinkedEntry newEntry = bucket[(int) (key & (long) (granularity - 1))];
		entry.next = newEntry.next;
		entry.prev = newEntry;
		entry.next.prev = entry;
		entry.prev.next = entry;
		entry.key = key;
	}

	public JagexMap(int var1) {
		granularity = var1;
		bucket = new LinkedEntry[var1];

		for (int var2 = 0; var2 < var1; var2++) {
			LinkedEntry var3 = bucket[var2] = new LinkedEntry();
			var3.prev = var3;
			var3.next = var3;
		}
	}

	public LinkedEntry method1537() {
		anInt1564 = 0;
		return method1543();
	}

	public LinkedEntry method1543() {
		LinkedEntry var1;
		if (anInt1564 > 0 && aLinkedEntry_1562 != bucket[anInt1564 - 1]) {
			var1 = aLinkedEntry_1562;
			aLinkedEntry_1562 = var1.prev;
			return var1;
		} else {
			do {
				if (anInt1564 >= granularity) {
					return null;
				}

				var1 = bucket[anInt1564++].prev;
			} while (var1 == bucket[anInt1564 - 1]);

			aLinkedEntry_1562 = var1.prev;
			return var1;
		}
	}

	public LinkedEntry get(long var1) {
		LinkedEntry var3 = bucket[(int) (var1 & (long) (granularity - 1))];

		for (aLinkedEntry_1560 = var3.prev; aLinkedEntry_1560 != var3; aLinkedEntry_1560 = aLinkedEntry_1560.prev) {
			if (aLinkedEntry_1560.key == var1) {
				LinkedEntry var4 = aLinkedEntry_1560;
				aLinkedEntry_1560 = aLinkedEntry_1560.prev;
				return var4;
			}
		}

		aLinkedEntry_1560 = null;
		return null;
	}

	void method1546() {
		for (int var1 = 0; var1 < granularity; var1++) {
			LinkedEntry var2 = bucket[var1];

			while (true) {
				LinkedEntry var3 = var2.prev;
				if (var3 == var2) {
					break;
				}

				var3.unlink();
			}
		}

		aLinkedEntry_1560 = null;
		aLinkedEntry_1562 = null;
	}

}
