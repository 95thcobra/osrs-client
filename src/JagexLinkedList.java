public class JagexLinkedList {

	LinkedEntry aLinkedEntry_1516;
	public LinkedEntry head = new LinkedEntry();

	public void method1394() {
		while (true) {
			LinkedEntry var1 = head.prev;
			if (var1 == head) {
				aLinkedEntry_1516 = null;
				return;
			}

			var1.unlink();
		}
	}

	public void add(LinkedEntry var1) {
		if (var1.next != null) {
			var1.unlink();
		}

		var1.next = head.next;
		var1.prev = head;
		var1.next.prev = var1;
		var1.prev.next = var1;
	}

	public void method1396(LinkedEntry var1) {
		if (var1.next != null) {
			var1.unlink();
		}

		var1.next = head;
		var1.prev = head.prev;
		var1.next.prev = var1;
		var1.prev.next = var1;
	}

	public LinkedEntry method1397() {
		LinkedEntry var1 = head.next;
		if (var1 != head) {
			var1.unlink();
			return var1;
		} else {
			return null;
		}
	}

	public LinkedEntry method1399() {
		LinkedEntry var1 = head.prev;
		if (var1 == head) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	public LinkedEntry method1401() {
		LinkedEntry var1 = head.next;
		if (var1 == head) {
			aLinkedEntry_1516 = null;
			return null;
		} else {
			aLinkedEntry_1516 = var1.next;
			return var1;
		}
	}

	public LinkedEntry method1402() {
		LinkedEntry var1 = aLinkedEntry_1516;
		if (var1 == head) {
			aLinkedEntry_1516 = null;
			return null;
		} else {
			aLinkedEntry_1516 = var1.prev;
			return var1;
		}
	}

	public LinkedEntry method1403() {
		LinkedEntry var1 = aLinkedEntry_1516;
		if (var1 == head) {
			aLinkedEntry_1516 = null;
			return null;
		} else {
			aLinkedEntry_1516 = var1.next;
			return var1;
		}
	}

	public LinkedEntry method1405() {
		LinkedEntry var1 = head.prev;
		if (var1 == head) {
			aLinkedEntry_1516 = null;
			return null;
		} else {
			aLinkedEntry_1516 = var1.prev;
			return var1;
		}
	}

	public static void method1418(LinkedEntry var0, LinkedEntry var1) {
		if (var0.next != null) {
			var0.unlink();
		}

		var0.next = var1.next;
		var0.prev = var1;
		var0.next.prev = var0;
		var0.prev.next = var0;
	}

	public JagexLinkedList() {
		head.prev = head;
		head.next = head;
	}

}
