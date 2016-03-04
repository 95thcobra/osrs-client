public final class Npc extends CacheableEntry_Sub23_Sub16_Sub2 {

	static int anInt2812;
	NpcDef definition;

	public static int method3394(CharSequence var0, int var1, boolean var2, byte var3) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var5 = false;
			boolean var10 = false;
			int var8 = 0;
			int var7 = var0.length();

			for (int var6 = 0; var6 < var7; var6++) {
				char var4 = var0.charAt(var6);
				if (var6 == 0) {
					if (var4 == 45) {
						var5 = true;
						continue;
					}

					if (var4 == 43 && var2) {
						continue;
					}
				}

				int var11;
				if (var4 >= 48 && var4 <= 57) {
					var11 = var4 - 48;
				} else if (var4 >= 65 && var4 <= 90) {
					var11 = var4 - 55;
				} else {
					if (var4 < 97 || var4 > 122) {
						throw new NumberFormatException();
					}

					var11 = var4 - 87;
				}

				if (var11 >= var1) {
					throw new NumberFormatException();
				}

				if (var5) {
					var11 = -var11;
				}

				int var9 = var11 + var1 * var8;
				if (var8 != var9 / var1) {
					throw new NumberFormatException();
				}

				var8 = var9;
				var10 = true;
			}

			if (!var10) {
				throw new NumberFormatException();
			} else {
				return var8;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	protected final CacheableEntry_Sub23_Sub16_Sub5 method2791(int var1) {
		if (definition == null) {
			return null;
		} else {
			AnimationSequence var3 = anInt2536 * 1287875615 != -1 && anInt2517 * -82959261 == 0 ? CacheableEntry_Sub23_Sub11.getAnimation(anInt2536 * 1287875615) : null;
			AnimationSequence var4 = anInt2556 * -1834510973 == -1 || anInt2556 * -1834510973 == anInt2509 * -71832567 && var3 != null ? null : CacheableEntry_Sub23_Sub11.getAnimation(anInt2556 * -1834510973);
			CacheableEntry_Sub23_Sub16_Sub5 var2 = definition.method2404(var3, anInt2537 * -1478048169, var4, anInt2534 * 1209298591, 1251284797);
			if (var2 == null) {
				return null;
			} else {
				var2.method3082();
				anInt2554 = var2.anInt2410 * -1471884917;
				if (anInt2541 * -1444330405 != -1 && anInt2542 * -2034852903 != -1) {
					CacheableEntry_Sub23_Sub16_Sub5 var5 = Class42.getGfxDef(anInt2541 * -1444330405).method2522(anInt2542 * -2034852903, 1519008298);
					if (var5 != null) {
						var5.method3100(0, -(anInt2545 * -678743773), 0);
						CacheableEntry_Sub23_Sub16_Sub5[] var6 = new CacheableEntry_Sub23_Sub16_Sub5[]{var2, var5};
						var2 = new CacheableEntry_Sub23_Sub16_Sub5(var6, 2);
					}
				}

				if (definition.anInt2222 * 951781961 == 1) {
					var2.aBool2648 = true;
				}

				return var2;
			}
		}
	}

	final boolean method2945(int var1) {
		return definition != null;
	}

	static final void method3395(int var0) {
		int var1 = CacheableEntry_Sub23_Sub16_Sub7.anInt2774 * 1636505728 + 64;
		int var3 = Class31.anInt386 * 1395542912 + 64;
		int var4 = NpcDef.method2423(var1, var3, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236) - Class85.anInt1004 * -984470877;
		if (NpcDef.anInt2245 * -1967123133 < var1) {
			NpcDef.anInt2245 += (Class72.anInt870 * 1505832971 + (var1 - NpcDef.anInt2245 * -1967123133) * Class3.anInt67 * 1935430399 / 1000) * 1074536299;
			if (NpcDef.anInt2245 * -1967123133 > var1) {
				NpcDef.anInt2245 = var1 * 1074536299;
			}
		}

		if (NpcDef.anInt2245 * -1967123133 > var1) {
			NpcDef.anInt2245 -= (Class3.anInt67 * 1935430399 * (NpcDef.anInt2245 * -1967123133 - var1) / 1000 + Class72.anInt870 * 1505832971) * 1074536299;
			if (NpcDef.anInt2245 * -1967123133 < var1) {
				NpcDef.anInt2245 = var1 * 1074536299;
			}
		}

		if (Class74.anInt907 * 113597655 < var4) {
			Class74.anInt907 += (Class72.anInt870 * 1505832971 + Class3.anInt67 * 1935430399 * (var4 - Class74.anInt907 * 113597655) / 1000) * 653219559;
			if (Class74.anInt907 * 113597655 > var4) {
				Class74.anInt907 = var4 * 653219559;
			}
		}

		if (Class74.anInt907 * 113597655 > var4) {
			Class74.anInt907 -= ((Class74.anInt907 * 113597655 - var4) * Class3.anInt67 * 1935430399 / 1000 + Class72.anInt870 * 1505832971) * 653219559;
			if (Class74.anInt907 * 113597655 < var4) {
				Class74.anInt907 = var4 * 653219559;
			}
		}

		if (CacheableEntry_Sub23_Sub1.anInt2093 * 681386919 < var3) {
			CacheableEntry_Sub23_Sub1.anInt2093 += (Class72.anInt870 * 1505832971 + Class3.anInt67 * 1935430399 * (var3 - CacheableEntry_Sub23_Sub1.anInt2093 * 681386919) / 1000) * -1774627817;
			if (CacheableEntry_Sub23_Sub1.anInt2093 * 681386919 > var3) {
				CacheableEntry_Sub23_Sub1.anInt2093 = var3 * -1774627817;
			}
		}

		if (CacheableEntry_Sub23_Sub1.anInt2093 * 681386919 > var3) {
			CacheableEntry_Sub23_Sub1.anInt2093 -= (Class72.anInt870 * 1505832971 + (CacheableEntry_Sub23_Sub1.anInt2093 * 681386919 - var3) * Class3.anInt67 * 1935430399 / 1000) * -1774627817;
			if (CacheableEntry_Sub23_Sub1.anInt2093 * 681386919 < var3) {
				CacheableEntry_Sub23_Sub1.anInt2093 = var3 * -1774627817;
			}
		}

		var1 = 64 + Class32.anInt410 * 704623744;
		var3 = CacheableEntry_Sub23_Sub10.anInt2321 * -1750243200 + 64;
		var4 = NpcDef.method2423(var1, var3, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236) - CacheableEntry_Sub23_Sub16_Sub2.anInt2550 * 276298013;
		int var8 = var1 - NpcDef.anInt2245 * -1967123133;
		int var6 = var4 - Class74.anInt907 * 113597655;
		int var9 = var3 - CacheableEntry_Sub23_Sub1.anInt2093 * 681386919;
		int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
		int var5 = (int) (Math.atan2((double) var6, (double) var10) * 325.949D) & 2047;
		int var7 = (int) (Math.atan2((double) var8, (double) var9) * -325.949D) & 2047;
		if (var5 < 128) {
			var5 = 128;
		}

		if (var5 > 383) {
			var5 = 383;
		}

		if (IndexDescriptor.anInt1366 * -1557542191 < var5) {
			IndexDescriptor.anInt1366 += (Player.anInt2827 * 449006875 + Class63.anInt803 * -817214085 * (var5 - IndexDescriptor.anInt1366 * -1557542191) / 1000) * 34393649;
			if (IndexDescriptor.anInt1366 * -1557542191 > var5) {
				IndexDescriptor.anInt1366 = var5 * 34393649;
			}
		}

		if (IndexDescriptor.anInt1366 * -1557542191 > var5) {
			IndexDescriptor.anInt1366 -= (Player.anInt2827 * 449006875 + (IndexDescriptor.anInt1366 * -1557542191 - var5) * Class63.anInt803 * -817214085 / 1000) * 34393649;
			if (IndexDescriptor.anInt1366 * -1557542191 < var5) {
				IndexDescriptor.anInt1366 = var5 * 34393649;
			}
		}

		int var2 = var7 - Class19.anInt231 * 167182419;
		if (var2 > 1024) {
			var2 -= 2048;
		}

		if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			Class19.anInt231 += (Class63.anInt803 * -817214085 * var2 / 1000 + Player.anInt2827 * 449006875) * -112245797;
			Class19.anInt231 = (Class19.anInt231 * 167182419 & 2047) * -112245797;
		}

		if (var2 < 0) {
			Class19.anInt231 -= (Class63.anInt803 * -817214085 * -var2 / 1000 + Player.anInt2827 * 449006875) * -112245797;
			Class19.anInt231 = (Class19.anInt231 * 167182419 & 2047) * -112245797;
		}

		int var11 = var7 - Class19.anInt231 * 167182419;
		if (var11 > 1024) {
			var11 -= 2048;
		}

		if (var11 < -1024) {
			var11 += 2048;
		}

		if (var11 < 0 && var2 > 0 || var11 > 0 && var2 < 0) {
			Class19.anInt231 = var7 * -112245797;
		}

	}

}
