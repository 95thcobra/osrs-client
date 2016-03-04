import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	protected static final int anInt2845 = 32;
	static long aLong2850 = 0L;
	static int anInt2838 = 0;
	static Applet_Sub1 anApplet_Sub1_2839 = null;
	public static volatile boolean aBool2849 = true;
	protected static volatile boolean aBool2853 = false;
	static volatile long aLong2854 = 0L;
	static volatile boolean aBool2844 = true;
	static boolean aBool2840 = false;
	static int anInt2842 = 1978281588;
	static int anInt2843 = -1620253313;
	protected static int anInt2837 = 0;
	protected static long[] aLongArray2846 = new long[32];
	protected static long[] aLongArray2855 = new long[32];
	protected static int anInt2848 = 0;
	protected static int anInt2847 = 0;
	static int anInt2851 = 1382875548;
	protected static boolean aBool2852 = false;
	boolean aBool2841 = false;

	public void stop() {
		if (anApplet_Sub1_2839 == this && !aBool2840) {
			aLong2850 = (Class10.method216((short) 255) + 4000L) * -5512656636336229229L;
		}
	}

	protected final void method3400(int var1, int var2, int var3, int var4) {
		try {
			if (anApplet_Sub1_2839 != null) {
				anInt2838 += 2104252121;
				if (anInt2838 * 895535465 >= 3) {
					method3430("alreadyloaded", (byte) 2);
					return;
				}

				getAppletContext().showDocument(getDocumentBase(), "_self");
				return;
			}

			anApplet_Sub1_2839 = this;
			Class5.anInt98 = var1 * -373100445;
			Class60.anInt769 = var2 * 1724921409;
			Npc.anInt2812 = var3 * 251641515;
			RuntimeException_Sub1.anApplet2785 = this;
			if (Class50.aClass73_693 == null) {
				Class50.aClass73_693 = new Class73();
			}

			Class50.aClass73_693.submitRunnable(this, 1, (byte) 7);
		} catch (Exception var6) {
			Class72.method964((String) null, var6, (byte) 1);
			method3430("crash", (byte) 2);
		}

	}

	protected final synchronized void method3401(int var1) {
		Container var2 = method3457(-2116677155);
		if (Class60.aCanvas771 != null) {
			Class60.aCanvas771.removeFocusListener(this);
			var2.remove(Class60.aCanvas771);
		}

		Class5.anInt98 = Math.max(var2.getWidth(), Class30.anInt377 * -1833536733) * -373100445;
		Class60.anInt769 = Math.max(var2.getHeight(), IsaacCipher.anInt795 * 1147884439) * 1724921409;
		Insets var3;
		if (Class57.aFrame740 != null) {
			var3 = Class57.aFrame740.getInsets();
			Class5.anInt98 -= (var3.left + var3.right) * -373100445;
			Class60.anInt769 -= (var3.bottom + var3.top) * 1724921409;
		}

		Class60.aCanvas771 = new Canvas_Sub1(this);
		var2.add(Class60.aCanvas771);
		Class60.aCanvas771.setSize(Class5.anInt98 * 2104430923, Class60.anInt769 * -1064642111);
		Class60.aCanvas771.setVisible(true);
		if (var2 != Class57.aFrame740) {
			Class60.aCanvas771.setLocation(anInt2848 * -467838879, anInt2847 * -1456024027);
		} else {
			var3 = Class57.aFrame740.getInsets();
			Class60.aCanvas771.setLocation(var3.left + anInt2848 * -467838879, var3.top + anInt2847 * -1456024027);
		}

		Class60.aCanvas771.addFocusListener(this);
		Class60.aCanvas771.requestFocus();
		aBool2849 = true;
		Class7 var4 = CacheableEntry_Sub23_Sub17.method2800(Class5.anInt98 * 2104430923, Class60.anInt769 * -1064642111, Class60.aCanvas771, (byte) -102);
		if (Class72.aClass7_871 != null) {
			Class72.aClass7_871.method160(var4.anImage111.getGraphics(), 0, 0, 1787095282);
		}

		Class72.aClass7_871 = var4;
		aBool2853 = false;
		aLong2854 = Class10.method216((short) 255) * 5321331560927141895L;
	}

	protected final boolean method3402(int var1) {
		String var2 = getDocumentBase().getHost().toLowerCase();
		if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
			if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
				if (!var2.equals("mechscape.com") && !var2.endsWith(".mechscape.com")) {
					if (var2.endsWith("127.0.0.1")) {
						return true;
					} else {
						while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= 48 && var2.charAt(var2.length() - 1) <= 57) {
							var2 = var2.substring(0, var2.length() - 1);
						}

						if (var2.endsWith("192.168.1.")) {
							return true;
						} else {
							return true;
						}
					}
				} else {
					return true;
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	public void destroy() {
		if (anApplet_Sub1_2839 == this && !aBool2840) {
			aLong2850 = Class10.method216((short) 255) * -5512656636336229229L;
			Class24.method357(5000L);
			method3466((byte) 127);
		}
	}

	static final void method3405(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Class39 var7, Class141 var8, byte var9) {
		ObjectDef var10 = Class56.getObjectDef(var4);
		int var12;
		int var15;
		if (var5 != 1 && var5 != 3) {
			var12 = var10.anInt2277 * 1832905927;
			var15 = var10.anInt2274 * 1221908201;
		} else {
			var12 = var10.anInt2274 * 1221908201;
			var15 = var10.anInt2277 * 1832905927;
		}

		int var13;
		int var14;
		if (var2 + var12 <= 104) {
			var14 = var2 + (var12 >> 1);
			var13 = (1 + var12 >> 1) + var2;
		} else {
			var14 = var2;
			var13 = var2 + 1;
		}

		int var20;
		int var22;
		if (var15 + var3 <= 104) {
			var22 = var3 + (var15 >> 1);
			var20 = (1 + var15 >> 1) + var3;
		} else {
			var22 = var3;
			var20 = 1 + var3;
		}

		int[][] var21 = Class32.mapSquareHeights[var1];
		int var16 = var21[var14][var20] + var21[var14][var22] + var21[var13][var22] + var21[var13][var20] >> 2;
		int var23 = (var12 << 6) + (var2 << 7);
		int var24 = (var3 << 7) + (var15 << 6);
		int var18 = 1073741824 + var2 + (var3 << 7) + (var4 << 14);
		if (var10.anInt2292 * -1087968583 == 0) {
			var18 += -2147483648;
		}

		int var19 = var6 + (var5 << 6);
		if (var10.anInt2298 * 1493581111 == 1) {
			var19 += 256;
		}

		Object var11;
		if (var6 == 22) {
			if (var10.anInt2281 * 181561261 == -1 && var10.anIntArray2299 == null) {
				var11 = var10.method2446(22, var5, var21, var23, var16, var24, (short) 6910);
			} else {
				var11 = new CacheableEntry_Sub23_Sub16_Sub7(var4, 22, var5, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
			}

			var7.method523(var0, var2, var3, var16, (CacheableEntry_Sub23_Sub16) var11, var18, var19);
			if (var10.anInt2275 * 445231797 == 1) {
				var8.method1699(var2, var3, 1076733774);
			}

		} else if (var6 != 10 && var6 != 11) {
			if (var6 >= 12) {
				if (var10.anInt2281 * 181561261 == -1 && var10.anIntArray2299 == null) {
					var11 = var10.method2446(var6, var5, var21, var23, var16, var24, (short) -1181);
				} else {
					var11 = new CacheableEntry_Sub23_Sub16_Sub7(var4, var6, var5, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
				}

				var7.method597(var0, var2, var3, var16, 1, 1, (CacheableEntry_Sub23_Sub16) var11, 0, var18, var19);
				if (var10.anInt2275 * 445231797 != 0) {
					var8.method1694(var2, var3, var12, var15, var10.aBool2276, -1045762884);
				}

			} else if (var6 == 0) {
				if (var10.anInt2281 * 181561261 == -1 && var10.anIntArray2299 == null) {
					var11 = var10.method2446(0, var5, var21, var23, var16, var24, (short) 19826);
				} else {
					var11 = new CacheableEntry_Sub23_Sub16_Sub7(var4, 0, var5, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
				}

				var7.method509(var0, var2, var3, var16, (CacheableEntry_Sub23_Sub16) var11, (CacheableEntry_Sub23_Sub16) null, Class32.anIntArray401[var5], 0, var18, var19);
				if (var10.anInt2275 * 445231797 != 0) {
					var8.method1696(var2, var3, var6, var5, var10.aBool2276, 442674068);
				}

			} else if (var6 == 1) {
				if (var10.anInt2281 * 181561261 == -1 && var10.anIntArray2299 == null) {
					var11 = var10.method2446(1, var5, var21, var23, var16, var24, (short) 2963);
				} else {
					var11 = new CacheableEntry_Sub23_Sub16_Sub7(var4, 1, var5, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
				}

				var7.method509(var0, var2, var3, var16, (CacheableEntry_Sub23_Sub16) var11, (CacheableEntry_Sub23_Sub16) null, Class32.anIntArray409[var5], 0, var18, var19);
				if (var10.anInt2275 * 445231797 != 0) {
					var8.method1696(var2, var3, var6, var5, var10.aBool2276, -721332835);
				}

			} else {
				Object var17;
				int var28;
				if (var6 == 2) {
					var28 = var5 + 1 & 3;
					Object var29;
					if (var10.anInt2281 * 181561261 == -1 && var10.anIntArray2299 == null) {
						var29 = var10.method2446(2, var5 + 4, var21, var23, var16, var24, (short) -5776);
						var17 = var10.method2446(2, var28, var21, var23, var16, var24, (short) 8776);
					} else {
						var29 = new CacheableEntry_Sub23_Sub16_Sub7(var4, 2, var5 + 4, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
						var17 = new CacheableEntry_Sub23_Sub16_Sub7(var4, 2, var28, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
					}

					var7.method509(var0, var2, var3, var16, (CacheableEntry_Sub23_Sub16) var29, (CacheableEntry_Sub23_Sub16) var17, Class32.anIntArray401[var5], Class32.anIntArray401[var28], var18, var19);
					if (var10.anInt2275 * 445231797 != 0) {
						var8.method1696(var2, var3, var6, var5, var10.aBool2276, 142482972);
					}

				} else if (var6 == 3) {
					if (var10.anInt2281 * 181561261 == -1 && var10.anIntArray2299 == null) {
						var11 = var10.method2446(3, var5, var21, var23, var16, var24, (short) -12275);
					} else {
						var11 = new CacheableEntry_Sub23_Sub16_Sub7(var4, 3, var5, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
					}

					var7.method509(var0, var2, var3, var16, (CacheableEntry_Sub23_Sub16) var11, (CacheableEntry_Sub23_Sub16) null, Class32.anIntArray409[var5], 0, var18, var19);
					if (var10.anInt2275 * 445231797 != 0) {
						var8.method1696(var2, var3, var6, var5, var10.aBool2276, -26471592);
					}

				} else if (var6 == 9) {
					if (var10.anInt2281 * 181561261 == -1 && var10.anIntArray2299 == null) {
						var11 = var10.method2446(var6, var5, var21, var23, var16, var24, (short) 13893);
					} else {
						var11 = new CacheableEntry_Sub23_Sub16_Sub7(var4, var6, var5, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
					}

					var7.method597(var0, var2, var3, var16, 1, 1, (CacheableEntry_Sub23_Sub16) var11, 0, var18, var19);
					if (var10.anInt2275 * 445231797 != 0) {
						var8.method1694(var2, var3, var12, var15, var10.aBool2276, 1696531031);
					}

				} else if (var6 == 4) {
					if (var10.anInt2281 * 181561261 == -1 && var10.anIntArray2299 == null) {
						var11 = var10.method2446(4, var5, var21, var23, var16, var24, (short) -15732);
					} else {
						var11 = new CacheableEntry_Sub23_Sub16_Sub7(var4, 4, var5, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
					}

					var7.method510(var0, var2, var3, var16, (CacheableEntry_Sub23_Sub16) var11, (CacheableEntry_Sub23_Sub16) null, Class32.anIntArray401[var5], 0, 0, 0, var18, var19);
				} else {
					int var26;
					if (var6 == 5) {
						var28 = 16;
						var26 = var7.method646(var0, var2, var3);
						if (var26 != 0) {
							var28 = Class56.getObjectDef(var26 >> 14 & 32767).anInt2291 * 1661784949;
						}

						if (var10.anInt2281 * 181561261 == -1 && var10.anIntArray2299 == null) {
							var17 = var10.method2446(4, var5, var21, var23, var16, var24, (short) -5116);
						} else {
							var17 = new CacheableEntry_Sub23_Sub16_Sub7(var4, 4, var5, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
						}

						var7.method510(var0, var2, var3, var16, (CacheableEntry_Sub23_Sub16) var17, (CacheableEntry_Sub23_Sub16) null, Class32.anIntArray401[var5], 0, Class32.anIntArray393[var5] * var28, var28 * Class32.anIntArray404[var5], var18, var19);
					} else if (var6 == 6) {
						var28 = 8;
						var26 = var7.method646(var0, var2, var3);
						if (var26 != 0) {
							var28 = Class56.getObjectDef(var26 >> 14 & 32767).anInt2291 * 1661784949 / 2;
						}

						if (var10.anInt2281 * 181561261 == -1 && var10.anIntArray2299 == null) {
							var17 = var10.method2446(4, 4 + var5, var21, var23, var16, var24, (short) 3406);
						} else {
							var17 = new CacheableEntry_Sub23_Sub16_Sub7(var4, 4, var5 + 4, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
						}

						var7.method510(var0, var2, var3, var16, (CacheableEntry_Sub23_Sub16) var17, (CacheableEntry_Sub23_Sub16) null, 256, var5, Class32.anIntArray405[var5] * var28, var28 * Class32.anIntArray406[var5], var18, var19);
					} else if (var6 == 7) {
						var26 = var5 + 2 & 3;
						if (var10.anInt2281 * 181561261 == -1 && var10.anIntArray2299 == null) {
							var11 = var10.method2446(4, var26 + 4, var21, var23, var16, var24, (short) 6788);
						} else {
							var11 = new CacheableEntry_Sub23_Sub16_Sub7(var4, 4, 4 + var26, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
						}

						var7.method510(var0, var2, var3, var16, (CacheableEntry_Sub23_Sub16) var11, (CacheableEntry_Sub23_Sub16) null, 256, var26, 0, 0, var18, var19);
					} else if (var6 == 8) {
						var28 = 8;
						var26 = var7.method646(var0, var2, var3);
						if (var26 != 0) {
							var28 = Class56.getObjectDef(var26 >> 14 & 32767).anInt2291 * 1661784949 / 2;
						}

						int var25 = var5 + 2 & 3;
						Object var27;
						if (var10.anInt2281 * 181561261 == -1 && var10.anIntArray2299 == null) {
							var17 = var10.method2446(4, 4 + var5, var21, var23, var16, var24, (short) -29795);
							var27 = var10.method2446(4, var25 + 4, var21, var23, var16, var24, (short) -5221);
						} else {
							var17 = new CacheableEntry_Sub23_Sub16_Sub7(var4, 4, 4 + var5, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
							var27 = new CacheableEntry_Sub23_Sub16_Sub7(var4, 4, 4 + var25, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
						}

						var7.method510(var0, var2, var3, var16, (CacheableEntry_Sub23_Sub16) var17, (CacheableEntry_Sub23_Sub16) var27, 256, var5, Class32.anIntArray405[var5] * var28, Class32.anIntArray406[var5] * var28, var18, var19);
					}
				}
			}
		} else {
			if (var10.anInt2281 * 181561261 == -1 && var10.anIntArray2299 == null) {
				var11 = var10.method2446(10, var5, var21, var23, var16, var24, (short) 7238);
			} else {
				var11 = new CacheableEntry_Sub23_Sub16_Sub7(var4, 10, var5, var1, var2, var3, var10.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
			}

			if (var11 != null) {
				var7.method597(var0, var2, var3, var16, var12, var15, (CacheableEntry_Sub23_Sub16) var11, var6 == 11 ? 256 : 0, var18, var19);
			}

			if (var10.anInt2275 * 445231797 != 0) {
				var8.method1694(var2, var3, var12, var15, var10.aBool2276, 1036617698);
			}

		}
	}

	public final void focusGained(FocusEvent var1) {
		aBool2844 = true;
		aBool2849 = true;
	}

	public final void update(Graphics var1) {
		paint(var1);
	}

	void method3410(byte var1) {
		long var2 = Class10.method216((short) 255);
		long var4 = aLongArray2855[Class67.anInt843 * -620653523];
		aLongArray2855[Class67.anInt843 * -620653523] = var2;
		Class67.anInt843 = (1 + Class67.anInt843 * -620653523 & 31) * 498981797;
		if (var4 != 0L && var2 > var4) {
			;
		}

		synchronized (this) {
			NpcDef.aBool2258 = aBool2844;
		}

		method3415(567329469);
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public abstract void init();

	protected abstract void method3413(int var1);

	public void start() {
		if (anApplet_Sub1_2839 == this && !aBool2840) {
			aLong2850 = 0L;
		}
	}

	protected abstract void method3414(int var1);

	protected abstract void method3415(int var1);

	public final synchronized void paint(Graphics var1) {
		if (anApplet_Sub1_2839 == this && !aBool2840) {
			aBool2849 = true;
			if (Class73.aString879 != null && Class73.aString879.startsWith("1.5") && Class10.method216((short) 255) - aLong2854 * -967029815931679305L > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= Class5.anInt98 * 2104430923 && var2.height >= Class60.anInt769 * -1064642111) {
					aBool2853 = true;
				}
			}

		}
	}

	protected Dimension method3417(byte var1) {
		Container var2 = method3457(-1305470698);
		int var3 = Math.max(var2.getWidth(), Class30.anInt377 * -1833536733);
		int var5 = Math.max(var2.getHeight(), IsaacCipher.anInt795 * 1147884439);
		if (Class57.aFrame740 != null) {
			Insets var4 = Class57.aFrame740.getInsets();
			var3 -= var4.left + var4.right;
			var5 -= var4.bottom + var4.top;
		}

		return new Dimension(var3, var5);
	}

	protected void method3430(String var1, byte var2) {
		if (aBool2841) {
			if (var2 == 2) {
				;
			}
		} else {
			aBool2841 = true;
			System.out.println("error_game_" + var1);

			try {
				getAppletContext().showDocument(new URL(getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var4) {
				;
			}

		}
	}

	public final void focusLost(FocusEvent var1) {
		aBool2844 = false;
	}

	void method3446(int var1) {
		Container var2 = method3457(-1080578414);
		long var3 = Class10.method216((short) 255);
		long var5 = aLongArray2846[Class57.anInt752 * -1610009163];
		aLongArray2846[Class57.anInt752 * -1610009163] = var3;
		Class57.anInt752 = (Class57.anInt752 * -1610009163 + 1 & 31) * -969158499;
		if (var5 != 0L && var3 > var5) {
			int var7 = (int) (var3 - var5);
			anInt2837 = ((var7 >> 1) + 32000) / var7 * 1479677551;
		}

		if ((anInt2851 += 320593331) * 70392187 - 1 > 50) {
			anInt2851 += 1150202634;
			aBool2849 = true;
			Class60.aCanvas771.setSize(Class5.anInt98 * 2104430923, Class60.anInt769 * -1064642111);
			Class60.aCanvas771.setVisible(true);
			if (Class57.aFrame740 == var2) {
				Insets var8 = Class57.aFrame740.getInsets();
				Class60.aCanvas771.setLocation(var8.left + anInt2848 * -467838879, var8.top + anInt2847 * -1456024027);
			} else {
				Class60.aCanvas771.setLocation(anInt2848 * -467838879, anInt2847 * -1456024027);
			}
		}

		method3414(-1691096862);
	}

	protected Container method3457(int var1) {
		return (Container) (Class57.aFrame740 != null ? Class57.aFrame740 : this);
	}

	protected abstract void method3460(byte var1);

	final synchronized void method3466(byte var1) {
		if (!aBool2840) {
			aBool2840 = true;

			try {
				Class60.aCanvas771.removeFocusListener(this);
			} catch (Exception var6) {
				;
			}

			try {
				method3460((byte) 33);
			} catch (Exception var5) {
				;
			}

			if (Class57.aFrame740 != null) {
				if (var1 <= 25) {
					return;
				}

				try {
					System.exit(0);
				} catch (Throwable var4) {
					;
				}
			}

			if (Class50.aClass73_693 != null) {
				try {
					Class50.aClass73_693.method976((byte) -128);
				} catch (Exception var3) {
					;
				}
			}

			method3481(337623929);
		}
	}

	public final void windowOpened(WindowEvent var1) {
	}

	protected abstract void method3481(int var1);

	public void run() {
		try {
			if (Class73.aString878 != null) {
				String var1 = Class73.aString878.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = Class73.aString879;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						method3430("wrongjava", (byte) 2);
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length(); var3++) {
							char var4 = var2.charAt(var3);
							boolean var5 = var4 >= 48 && var4 <= 57;
							if (!var5) {
								break;
							}
						}

						String var14 = var2.substring(6, var3);
						boolean var13 = Class19.method343(var14, 10, true, 1059519443);
						if (var13) {
							int var6 = Npc.method3394(var14, 10, true, (byte) 1);
							if (var6 < 10) {
								method3430("wrongjava", (byte) 2);
								return;
							}
						}
					}

					anInt2843 = 488668027;
				}
			}

			setFocusCycleRoot(true);
			method3401(1389930970);
			method3413(-1529490077);

			Object var9;
			try {
				var9 = new Class63_Sub2();
			} catch (Throwable var7) {
				var9 = new Class63_Sub1();
			}

			PacketBuffer.aClass63_2432 = (Class63) var9;

			label86:
			while (true) {
				Class73 var11;
				Canvas var12;
				do {
					if (2396915621362567579L * aLong2850 != 0L && Class10.method216((short) 255) >= 2396915621362567579L * aLong2850) {
						break label86;
					}

					GfxDef.anInt2370 = PacketBuffer.aClass63_2432.method831(anInt2842 * -1388536439, anInt2843 * -797648257, 808582486) * -1613232891;

					for (int var10 = 0; var10 < GfxDef.anInt2370 * -164298803; var10++) {
						method3410((byte) 26);
					}

					method3446(1912231287);
					var11 = Class50.aClass73_693;
					var12 = Class60.aCanvas771;
				} while (var11.anEventQueue885 == null);

				for (int var15 = 0; var15 < 50 && var11.anEventQueue885.peekEvent() != null; var15++) {
					Class24.method357(1L);
				}

				if (var12 != null) {
					var11.anEventQueue885.postEvent(new ActionEvent(var12, 1001, "dummy"));
				}
			}
		} catch (Exception var8) {
			Class72.method964((String) null, var8, (byte) 1);
			method3430("crash", (byte) 2);
		}

		method3466((byte) 51);
	}

	public final void windowIconified(WindowEvent var1) {
	}

}
