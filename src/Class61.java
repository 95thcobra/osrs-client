import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.Hashtable;

public class Class61 {

	protected static Font aFont779;
	static File aFile780;
	static final int anInt782 = 4;
	static final int anInt783 = 83;
	static byte[][] mapFileData;
	static boolean aBool785 = false;
	static Hashtable aHashtable781 = new Hashtable(16);

	Class61() throws Throwable {
		throw new Error();
	}

	static boolean method816(byte var0) {
		try {
			if (Class48.aClass44_673 == null) {
				Class48.aClass44_673 = new Class44(Class50.aClass73_693, new URL(Class31.aString388));
			} else {
				byte[] var1 = Class48.aClass44_673.method675((byte) 37);
				if (var1 != null) {
					DataBuffer var2 = new DataBuffer(var1);
					Class51.anInt711 = var2.readUShort() * 1895949711;
					Class4.aClass51Array80 = new Class51[Class51.anInt711 * 1121294703];

					for (int var3 = 0; var3 < Class51.anInt711 * 1121294703; var3++) {
						Class51 var4 = Class4.aClass51Array80[var3] = new Class51();
						var4.anInt703 = var2.readUShort() * -469751453;
						var4.anInt704 = var2.readInt() * 1718530509;
						var4.aString699 = var2.readString();
						var4.aString707 = var2.readString();
						var4.anInt710 = var2.readUByte() * 1614881501;
						var4.anInt701 = var2.readShort() * -2010623293;
						var4.anInt709 = var3 * -1258830737;
					}

					Class72.method963(Class4.aClass51Array80, 0, Class4.aClass51Array80.length - 1, Class51.anIntArray702, Class51.anIntArray705, 2046332763);
					Class48.aClass44_673 = null;
					return true;
				}
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			Class48.aClass44_673 = null;
		}

		return false;
	}

	static final void method819(int var0, int var1) {
		short var2 = 256;
		Class3.anInt51 += var0 * 481926528;
		int var7;
		if (Class3.anInt51 * 348057075 > Class66.anIntArray840.length) {
			Class3.anInt51 -= Class66.anIntArray840.length * -1472629957;
			var7 = (int) (Math.random() * 12.0D);
			ScriptInvocation.method1837(ItemDef.aClass109_Sub23_Sub14_Sub1Array2140[var7]);
		}

		var7 = 0;
		int var8 = var0 * 128;
		int var9 = (var2 - var0) * 128;

		int var3;
		int var10;
		for (var3 = 0; var3 < var9; var3++) {
			var10 = Class30.anIntArray382[var7 + var8] - Class66.anIntArray840[var7 + Class3.anInt51 * 348057075 & Class66.anIntArray840.length - 1] * var0 / 6;
			if (var10 < 0) {
				var10 = 0;
			}

			Class30.anIntArray382[var7++] = var10;
		}

		int var4;
		int var6;
		for (var3 = var2 - var0; var3 < var2; var3++) {
			var10 = var3 * 128;

			for (var6 = 0; var6 < 128; var6++) {
				var4 = (int) (Math.random() * 100.0D);
				if (var4 < 50 && var6 > 10 && var6 < 118) {
					Class30.anIntArray382[var6 + var10] = 255;
				} else {
					Class30.anIntArray382[var6 + var10] = 0;
				}
			}
		}

		if (Class3.anInt49 * 948700643 > 0) {
			Class3.anInt49 -= var0 * 961388332;
		}

		if (Class3.anInt50 * -476800185 > 0) {
			Class3.anInt50 -= var0 * -1058375204;
		}

		if (Class3.anInt49 * 948700643 == 0 && Class3.anInt50 * -476800185 == 0) {
			var3 = (int) (Math.random() * (double) (2000 / var0));
			if (var3 == 0) {
				Class3.anInt49 = 1302277120;
			}

			if (var3 == 1) {
				Class3.anInt50 = -361112576;
			}
		}

		for (var3 = 0; var3 < var2 - var0; var3++) {
			Class3.anIntArray61[var3] = Class3.anIntArray61[var0 + var3];
		}

		for (var3 = var2 - var0; var3 < var2; var3++) {
			Class3.anIntArray61[var3] = (int) (Math.sin((double) (Class3.anInt46 * -133635249) / 14.0D) * 16.0D + Math.sin((double) (Class3.anInt46 * -133635249) / 15.0D) * 14.0D + Math.sin((double) (Class3.anInt46 * -133635249) / 16.0D) * 12.0D);
			Class3.anInt46 += 1705399215;
		}

		Class3.anInt52 += var0 * -903418597;
		var3 = ((GameClient.cycle * 1026470457 & 1) + var0) / 2;
		if (var3 > 0) {
			for (var10 = 0; var10 < Class3.anInt52 * -1921483924; var10++) {
				var6 = (int) (Math.random() * 124.0D) + 2;
				var4 = (int) (Math.random() * 128.0D) + 128;
				Class30.anIntArray382[var6 + (var4 << 7)] = 192;
			}

			Class3.anInt52 = 0;

			int var5;
			for (var10 = 0; var10 < var2; var10++) {
				var6 = 0;
				var4 = var10 * 128;

				for (var5 = -var3; var5 < 128; var5++) {
					if (var3 + var5 < 128) {
						var6 += Class30.anIntArray382[var3 + var4 + var5];
					}

					if (var5 - (1 + var3) >= 0) {
						var6 -= Class30.anIntArray382[var4 + var5 - (1 + var3)];
					}

					if (var5 >= 0) {
						CacheableEntry_Sub23_Sub16_Sub4.anIntArray2617[var5 + var4] = var6 / (var3 * 2 + 1);
					}
				}
			}

			for (var10 = 0; var10 < 128; var10++) {
				var6 = 0;

				for (var4 = -var3; var4 < var2; var4++) {
					var5 = var4 * 128;
					if (var4 + var3 < var2) {
						var6 += CacheableEntry_Sub23_Sub16_Sub4.anIntArray2617[var3 * 128 + var5 + var10];
					}

					if (var4 - (1 + var3) >= 0) {
						var6 -= CacheableEntry_Sub23_Sub16_Sub4.anIntArray2617[var10 + var5 - (1 + var3) * 128];
					}

					if (var4 >= 0) {
						Class30.anIntArray382[var5 + var10] = var6 / (var3 * 2 + 1);
					}
				}
			}
		}

	}

}
