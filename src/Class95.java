public class Class95 {

	public static final int anInt1370 = 15;
	public static final int anInt1371 = 4;
	static final int anInt1372 = 8;
	public static final int anInt1373 = 14;
	public static final int anInt1374 = 7;

	Class95() throws Throwable {
		throw new Error();
	}

	static final void method1223(String var0, int var1) {
		if (var0 != null) {
			String var2 = Class38.method497(var0, GameClient.aClass119_2919, -1668818814);
			if (var2 != null) {
				for (int var5 = 0; var5 < GameClient.anInt2984 * 389772333; var5++) {
					Class46 var3 = GameClient.aClass46Array3136[var5];
					String var4 = var3.aString658;
					String var6 = Class38.method497(var4, GameClient.aClass119_2919, -1997515050);
					boolean var7;
					if (var0 != null && var4 != null) {
						if (!var0.startsWith("#") && !var4.startsWith("#")) {
							var7 = var2.equals(var6);
						} else {
							var7 = var0.equals(var4);
						}
					} else {
						var7 = false;
					}

					if (var7) {
						GameClient.anInt2984 -= 681507749;

						for (int var8 = var5; var8 < GameClient.anInt2984 * 389772333; var8++) {
							GameClient.aClass46Array3136[var8] = GameClient.aClass46Array3136[1 + var8];
						}

						GameClient.anInt2990 = GameClient.anInt3050 * 1609802529;
						GameClient.secureBuffer.writeOpcode(157);
						GameClient.secureBuffer.writeByte(Class56.calcStringBytes(var0));
						GameClient.secureBuffer.writeStr(var0);
						break;
					}
				}

			}
		}
	}

}
