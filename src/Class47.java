import java.util.HashMap;

public class Class47 {

	static final int anInt660 = 11;
	public static int anInt661;
	static RenderedItemImage[] aClass109_Sub23_Sub14_Sub2Array662;
	static final int anInt663 = 25;
	public static final int anInt664 = 3;
	static int anInt665;
	static final int anInt666 = 200000;
	public static final int anInt667 = 1;

	Class47() throws Throwable {
		throw new Error();
	}

	static {
		new HashMap();
	}

	static final int method700(int var0, int var1, byte var2) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = var1 * (var0 & 127) / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	static CacheableEntry_Sub23_Sub15 method701(int var0, byte var1) {
		CacheableEntry_Sub23_Sub15 var2 = (CacheableEntry_Sub23_Sub15) AnimationSequence.aClass128_2168.get((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			var2 = Class10.method215(AnimationSequence.aIndexDescriptor_2165, AnimationSequence.aIndexDescriptor_2166, var0, false, 843654049);
			if (var2 != null) {
				AnimationSequence.aClass128_2168.put(var2, (long) var0);
			}

			return var2;
		}
	}

}
