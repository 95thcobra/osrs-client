public class LinkedEntry {

	public long key;
	public LinkedEntry prev;
	LinkedEntry next;

	public void unlink() {
		if (next != null) {
			next.prev = prev;
			prev.next = next;
			prev = null;
			next = null;
		}
	}

	public boolean hasNext() {
		return next != null;
	}

}
