public class GrandExchangeOffer {

	byte state;
	public int anInt1587;
	public int anInt1586;
	public int anInt1589;
	public int anInt1590;
	public int anInt1591;

	public GrandExchangeOffer(DataBuffer data, boolean var2) {
		state = data.readByte();
		anInt1587 = data.readUShort() * -19469067;
		anInt1586 = data.readInt() * -578803967;
		anInt1589 = data.readInt() * -1248938609;
		anInt1590 = data.readInt() * -377919849;
		anInt1591 = data.readInt() * 432259385;
		if (var2) {
			method1621(CacheableEntry_Sub23_Sub16_Sub1.method2935(data, -1659910775), (short) -129);
		}
	}

	public int method1614() {
		return state & 7;
	}

	public int method1615() {
		return (state & 8) == 8 ? 1 : 0;
	}

	void method1616(int var1) {
		state &= -8;
		state = (byte) (state | var1 & 7);
	}

	public GrandExchangeOffer() {
	}

	void method1621(Integer var1, short var2) {
	}

	void method1629(int var1, int var2) {
		state &= -9;
		if (var1 == 1) {
			state = (byte) (state | 8);
		}
	}

}
