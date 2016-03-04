import java.util.Iterator;

public class Class120 implements Iterable {

	LinkedEntry aLinkedEntry_1551 = new LinkedEntry();

	public void method1495(LinkedEntry var1) {
		if (var1.next != null) {
			var1.unlink();
		}

		var1.next = aLinkedEntry_1551.next;
		var1.prev = aLinkedEntry_1551;
		var1.next.prev = var1;
		var1.prev.next = var1;
	}

	public Iterator iterator() {
		return new Class113(this);
	}

	public LinkedEntry method1498() {
		return method1501((LinkedEntry) null);
	}

	public Class120() {
		aLinkedEntry_1551.prev = aLinkedEntry_1551;
		aLinkedEntry_1551.next = aLinkedEntry_1551;
	}

	LinkedEntry method1501(LinkedEntry var1) {
		LinkedEntry var2;
		if (var1 == null) {
			var2 = aLinkedEntry_1551.prev;
		} else {
			var2 = var1;
		}

		return var2 == aLinkedEntry_1551 ? null : var2;
	}

}
