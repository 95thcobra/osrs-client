import java.awt.*;
import java.awt.event.ActionEvent;

public class Class15 implements Runnable {

	Class73 aClass73_186;
	static RenderedItemImage aClass109_Sub23_Sub14_Sub2_189;
	public static final int anInt190 = 83;
	protected static Image anImage191;
	public static final int anInt192 = 4;
	public static final int anInt194 = 130;
	static Class35 aClass35_195;
	volatile Class2[] aClass2Array187 = new Class2[2];
	volatile boolean aBool188 = false;
	volatile boolean aBool193 = false;

	public void run() {
		aBool193 = true;

		try {
			try {
				while (!aBool188) {
					Class2 var2;
					for (int var1 = 0; var1 < 2; var1++) {
						var2 = aClass2Array187[var1];
						if (var2 != null) {
							var2.method49(134121842);
						}
					}

					Class24.method357(10L);
					Class73 var9 = aClass73_186;
					var2 = null;
					if (var9.anEventQueue885 != null) {
						for (int var3 = 0; var3 < 50 && var9.anEventQueue885.peekEvent() != null; var3++) {
							Class24.method357(1L);
						}

						if (var2 != null) {
							var9.anEventQueue885.postEvent(new ActionEvent(var2, 1001, "dummy"));
						}
					}
				}
			} catch (Exception var7) {
				Class72.method964((String) null, var7, (byte) 1);
				aBool193 = false;
				return;
			}

			aBool193 = false;
		} finally {
			aBool193 = false;
		}
	}

	public static CacheableEntry_Sub23_Sub2 method270(int var0, int var1) {
		CacheableEntry_Sub23_Sub2 var2 = (CacheableEntry_Sub23_Sub2) CacheableEntry_Sub23_Sub2.aClass128_2097.get((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = CacheableEntry_Sub23_Sub2.aIndexDescriptor_2108.getFileData(3, var0);
			var2 = new CacheableEntry_Sub23_Sub2();
			if (var3 != null) {
				var2.method2223(new DataBuffer(var3), -2137109875);
			}

			CacheableEntry_Sub23_Sub2.aClass128_2097.put(var2, (long) var0);
			return var2;
		}
	}

}
