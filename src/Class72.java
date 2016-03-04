import java.awt.*;
import java.io.DataInputStream;
import java.net.URL;

public abstract class Class72 {

	static int anInt870;
	public static Class7 aClass7_871;
	static final int anInt872 = 52;
	static final int anInt873 = 2160;
	static DataBuffer aDataBuffer_874;
	public static final int anInt875 = 165;
	public static final String aString876 = "rw";
	static final int anInt877 = 64;

	public abstract void method953(Component var1, byte var2);

	public abstract void method954(Component var1, int var2);

	public static int method955(CharSequence var0, int var1, byte var2) {
		return Npc.method3394(var0, var1, true, (byte) 1);
	}

	public abstract int method961(byte var1);

	static void method963(Class51[] var0, int var1, int var2, int[] var3, int[] var4, int var5) {
		if (var1 < var2) {
			int var11 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var1 + var2) / 2;
			Class51 var9 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var9;

			while (var11 < var6) {
				boolean var10 = true;

				int var8;
				int var12;
				int var13;
				do {
					--var6;

					for (var8 = 0; var8 < 4; var8++) {
						if (var3[var8] == 2) {
							var12 = var0[var6].anInt709 * -373679473;
							var13 = var9.anInt709 * -373679473;
						} else if (var3[var8] == 1) {
							var12 = var0[var6].anInt701 * 1599434219;
							var13 = var9.anInt701 * 1599434219;
							if (var12 == -1 && var4[var8] == 1) {
								var12 = 2001;
							}

							if (var13 == -1 && var4[var8] == 1) {
								var13 = 2001;
							}
						} else if (var3[var8] == 3) {
							var12 = var0[var6].method715((byte) 16) ? 1 : 0;
							var13 = var9.method715((byte) 16) ? 1 : 0;
						} else {
							var12 = var0[var6].anInt703 * 1685233739;
							var13 = var9.anInt703 * 1685233739;
						}

						if (var12 != var13) {
							if ((var4[var8] != 1 || var12 <= var13) && (var4[var8] != 0 || var12 >= var13)) {
								var10 = false;
							}
							break;
						}

						if (var8 == 3) {
							var10 = false;
						}
					}
				} while (var10);

				var10 = true;

				do {
					++var11;

					for (var8 = 0; var8 < 4; var8++) {
						if (var3[var8] == 2) {
							var12 = var0[var11].anInt709 * -373679473;
							var13 = var9.anInt709 * -373679473;
						} else if (var3[var8] == 1) {
							var12 = var0[var11].anInt701 * 1599434219;
							var13 = var9.anInt701 * 1599434219;
							if (var12 == -1 && var4[var8] == 1) {
								var12 = 2001;
							}

							if (var13 == -1 && var4[var8] == 1) {
								var13 = 2001;
							}
						} else if (var3[var8] == 3) {
							var12 = var0[var11].method715((byte) 16) ? 1 : 0;
							var13 = var9.method715((byte) 16) ? 1 : 0;
						} else {
							var12 = var0[var11].anInt703 * 1685233739;
							var13 = var9.anInt703 * 1685233739;
						}

						if (var12 != var13) {
							if ((var4[var8] != 1 || var12 >= var13) && (var4[var8] != 0 || var12 <= var13)) {
								var10 = false;
							}
							break;
						}

						if (var8 == 3) {
							var10 = false;
						}
					}
				} while (var10);

				if (var11 < var6) {
					Class51 var14 = var0[var11];
					var0[var11] = var0[var6];
					var0[var6] = var14;
				}
			}

			method963(var0, var1, var6, var3, var4, -1772996848);
			method963(var0, var6 + 1, var2, var3, var4, 56772071);
		}

	}

	public static void method964(String var0, Throwable var1, byte var2) {
		var1.printStackTrace();;
		try {
			String var3 = "";
			if (var1 != null) {
				var3 = Class88.method1096(var1, -386359746);
			}

			if (var0 != null) {
				if (var1 != null) {
					var3 = var3 + " | ";
				}

				var3 = var3 + var0;
			}

			System.out.println("Error: " + var3);
			var3 = var3.replace(':', '.');
			var3 = var3.replace('@', '_');
			var3 = var3.replace('&', '_');
			var3 = var3.replace('#', '_');
			if (RuntimeException_Sub1.anApplet2785 == null) {
				return;
			}

			URL var4 = new URL(RuntimeException_Sub1.anApplet2785.getCodeBase(), "clienterror.ws?c=" + Npc.anInt2812 * -80589821 + "&u=" + RuntimeException_Sub1.aString2784 + "&v1=" + Class73.aString878 + "&v2=" + Class73.aString879 + "&e=" + var3);
			DataInputStream var5 = new DataInputStream(var4.openStream());
			var5.read();
			var5.close();
		} catch (Exception var6) {
			;
		}

	}

}
