public final class Class22 {

	int anInt272;
	int anInt273;
	int anInt274;
	static final int anInt275 = 68;
	int anInt276;
	int anInt277;
	int anInt278;
	int anInt279;
	int anInt280;
	int anInt281;
	int anInt282;
	int anInt283;
	int anInt284;
	int anInt285;
	int anInt286;
	static final int anInt287 = 90;
	static IndexDescriptor_Sub1 aClass94_Sub1_288;
	int anInt289;
	int anInt290;
	int anInt291;
	int anInt292;
	public static final int anInt293 = 160;
	public static final int anInt294 = 37;

	static String hexColTag(int color) {
		return "<col=" + Integer.toHexString(color) + ">";
	}

	static final void method349(int var0, short var1) {
		ScriptInvocation.method1835();

		for (LinkedEntry_Sub7 var3 = (LinkedEntry_Sub7) LinkedEntry_Sub7.aJagexLinkedList_1739.method1405(); var3 != null; var3 = (LinkedEntry_Sub7) LinkedEntry_Sub7.aJagexLinkedList_1739.method1402()) {
			if (var3.aClass109_Sub23_Sub9_1735 != null) {
				var3.method1819((byte) 48);
			}
		}

		int var5 = CacheableEntry_Sub23_Sub16_Sub3.method2967(var0, (byte) -34).anInt2215 * -1238798311;
		if (var5 != 0) {
			int var4 = Class106.varps[var0];
			if (var5 == 1) {
				if (var4 == 1) {
					CacheableEntry_Sub23_Sub14_Sub3.method3154(0.9D);
					((Class45) CacheableEntry_Sub23_Sub14_Sub3.anInterface2_2715).method682(0.9D);
				}

				if (var4 == 2) {
					CacheableEntry_Sub23_Sub14_Sub3.method3154(0.8D);
					((Class45) CacheableEntry_Sub23_Sub14_Sub3.anInterface2_2715).method682(0.8D);
				}

				if (var4 == 3) {
					CacheableEntry_Sub23_Sub14_Sub3.method3154(0.7D);
					((Class45) CacheableEntry_Sub23_Sub14_Sub3.anInterface2_2715).method682(0.7D);
				}

				if (var4 == 4) {
					CacheableEntry_Sub23_Sub14_Sub3.method3154(0.6D);
					((Class45) CacheableEntry_Sub23_Sub14_Sub3.anInterface2_2715).method682(0.6D);
				}

				Class5.method136(441681564);
			}

			if (var5 == 3) {
				short var2 = 0;
				if (var4 == 0) {
					var2 = 255;
				}

				if (var4 == 1) {
					var2 = 192;
				}

				if (var4 == 2) {
					var2 = 128;
				}

				if (var4 == 3) {
					var2 = 64;
				}

				if (var4 == 4) {
					var2 = 0;
				}

				if (GameClient.anInt2951 * -250760527 != var2) {
					if (GameClient.anInt2951 * -250760527 == 0 && GameClient.anInt3105 * -759346757 != -1) {
						Class97.method1247(Class46.aClass94_Sub1_652, GameClient.anInt3105 * -759346757, 0, var2, false, (byte) -82);
						GameClient.aBool2941 = false;
					} else if (var2 == 0) {
						Class100.method1259((byte) 9);
						GameClient.aBool2941 = false;
					} else {
						CacheableEntry_Sub23_Sub2.method2224(var2, 388098154);
					}

					GameClient.anInt2951 = var2 * 361977425;
				}
			}

			if (var5 == 4) {
				if (var4 == 0) {
					GameClient.anInt2954 = 631129145;
				}

				if (var4 == 1) {
					GameClient.anInt2954 = 646167200;
				}

				if (var4 == 2) {
					GameClient.anInt2954 = -1000877632;
				}

				if (var4 == 3) {
					GameClient.anInt2954 = 1647044832;
				}

				if (var4 == 4) {
					GameClient.anInt2954 = 0;
				}
			}

			if (var5 == 5) {
				GameClient.anInt3005 = var4 * 1673570755;
			}

			if (var5 == 6) {
				GameClient.anInt3027 = var4 * -1515195159;
			}

			if (var5 == 9) {
				GameClient.anInt3104 = var4 * -1488140935;
			}

			if (var5 == 10) {
				if (var4 == 0) {
					GameClient.anInt3108 = -1246157843;
				}

				if (var4 == 1) {
					GameClient.anInt3108 = -1449257184;
				}

				if (var4 == 2) {
					GameClient.anInt3108 = -966171456;
				}

				if (var4 == 3) {
					GameClient.anInt3108 = -483085728;
				}

				if (var4 == 4) {
					GameClient.anInt3108 = 0;
				}
			}

			if (var5 == 17) {
				GameClient.anInt2922 = (var4 & 65535) * 1834997571;
			}

			if (var5 == 18) {
				Class42[] var6 = new Class42[]{Class42.aClass42_604, Class42.aClass42_599, Class42.aClass42_600};
				GameClient.aClass42_2887 = (Class42) CacheableEntry_Sub23_Sub7.method2390(var6, var4, 1733546317);
				if (GameClient.aClass42_2887 == null) {
					GameClient.aClass42_2887 = Class42.aClass42_604;
				}
			}

			if (var5 == 19) {
				if (var4 == -1) {
					GameClient.anInt2867 = 787648439;
				} else {
					GameClient.anInt2867 = (var4 & 2047) * -787648439;
				}
			}

		}
	}

}
