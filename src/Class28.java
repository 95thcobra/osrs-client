import java.math.BigInteger;

public class Class28 {

	static final int anInt349 = 6;
	static final int anInt350 = 1000;
	static final int anInt351 = 7;
	static final String aString352 = "passwordchoice.ws";
	static final int anInt353 = 4;
	public static final int anInt354 = 56;
	static final String aString356 = "m=accountappeal/login.ws";
	static final int anInt357 = 8192;
	static BigInteger aBigInteger348 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
	static BigInteger aBigInteger355 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

	Class28() throws Throwable {
		throw new Error();
	}

	static final void method392(InterfaceDef[] var0, int var1, int var2) {
		for (int var3 = 0; var3 < var0.length; var3++) {
			InterfaceDef var5 = var0[var3];
			if (var5 != null && var5.anInt1958 * -1588791493 == var1 && (!var5.cs2Inter || !Connection.method1061(var5, (byte) -82))) {
				if (var5.contenttype * -1878336627 == 0) {
					if (!var5.cs2Inter && Connection.method1061(var5, (byte) -42) && Class6.aInterfaceDef_103 != var5) {
						continue;
					}

					method392(var0, var5.hash * 1582464481, 1023306095);
					if (var5.aInterfaceDefArray2061 != null) {
						method392(var5.aInterfaceDefArray2061, var5.hash * 1582464481, 1023306095);
					}

					LinkedEntry_Sub13 var7 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.get((long) (var5.hash * 1582464481));
					if (var7 != null) {
						Class60.method814(var7.anInt1819 * -1385416029, -658083655);
					}
				}

				if (var5.contenttype * -1878336627 == 6) {
					int var4;
					if (var5.anInt1959 * -335970573 != -1 || var5.anInt1985 * 658207607 != -1) {
						boolean var8 = Class46.method695(var5, -691822510);
						if (var8) {
							var4 = var5.anInt1985 * 658207607;
						} else {
							var4 = var5.anInt1959 * -335970573;
						}

						if (var4 != -1) {
							AnimationSequence var6 = CacheableEntry_Sub23_Sub11.getAnimation(var4);

							for (var5.anInt2010 += GameClient.anInt2939 * 1796937341; var5.anInt2010 * -1587119871 > var6.anIntArray2183[var5.anInt2059 * 920672345]; Class35.method484(var5, -198125500)) {
								var5.anInt2010 -= var6.anIntArray2183[var5.anInt2059 * 920672345] * -624261375;
								var5.anInt2059 -= 2090242071;
								if (var5.anInt2059 * 920672345 >= var6.anIntArray2169.length) {
									var5.anInt2059 -= var6.anInt2182 * 1936839615;
									if (var5.anInt2059 * 920672345 < 0 || var5.anInt2059 * 920672345 >= var6.anIntArray2169.length) {
										var5.anInt2059 = 0;
									}
								}
							}
						}
					}

					if (var5.anInt1993 * -1575574419 != 0 && !var5.cs2Inter) {
						int var9 = var5.anInt1993 * -1575574419 >> 16;
						var4 = var5.anInt1993 * -1575574419 << 16 >> 16;
						var9 *= GameClient.anInt2939 * -880137347;
						var4 *= GameClient.anInt2939 * -880137347;
						var5.anInt1988 = (var5.anInt1988 * -1788131197 + var9 & 2047) * 193807915;
						var5.anInt1989 = (var5.anInt1989 * 1096480275 + var4 & 2047) * 1932084251;
						Class35.method484(var5, -13439484);
					}
				}
			}
		}

	}

	static final int method393(int var0, int var1, int var2, int var3, int var4) {
		int var5 = 65536 - CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720[var2 * 1024 / var3] >> 1;
		return ((65536 - var5) * var0 >> 16) + (var5 * var1 >> 16);
	}

	static final void method394(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (ItemContainer.method1840(var0)) {
			Class38.aInterfaceDefArray503 = null;
			Class106.method1340(InterfaceDef.aInterfaceDefArrayArray1975[var0], -1, var1, var2, var3, var4, var5, var6, var7, 1834742585);
			if (Class38.aInterfaceDefArray503 != null) {
				Class106.method1340(Class38.aInterfaceDefArray503, -1412584499, var1, var2, var3, var4, LinkedEntry_Sub6.anInt1726 * -2044555587, Class23.anInt313 * -636770955, var7, 2053106011);
				Class38.aInterfaceDefArray503 = null;
			}

		} else {
			if (var7 != -1) {
				GameClient.aBoolArray3072[var7] = true;
			} else {
				for (int var9 = 0; var9 < 100; var9++) {
					GameClient.aBoolArray3072[var9] = true;
				}
			}

		}
	}

}
