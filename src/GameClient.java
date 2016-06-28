import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.Socket;

public final class GameClient extends Applet_Sub1 {

	static final int anInt2875 = 15;
	static RenderedItemImage[] aClass109_Sub23_Sub14_Sub2Array2905;
	static IndexDescriptor_Sub1 aClass94_Sub1_2928;
	static final String aString3070 = "oldschool";
	static final int anInt3103 = 16;
	static IndexDescriptor_Sub1 aClass94_Sub1_3134;
	static int anInt3048;
	static int anInt2860 = 0;
	static int anInt2861 = 0;
	static int anInt2872 = -1172587151;
	static String aString2866;
	static int anInt2865 = 0;
	static GameClient aGameClient2857;
	static boolean aBool2863 = false;
	static Class119 aClass119_2919;
	static boolean aBool2991 = false;
	static long aLong3080;
	static boolean aBool3081;
	static int cycle = 0;
	static int anInt3065;
	static int anInt2918;
	static int anInt2920;
	static int anInt2862;
	static int anInt2868 = 0;
	static int anInt3087;
	static AsyncJob aAsyncJob_2890;
	static int anInt3130;
	static long aLong2893;
	static int anInt2896;
	static boolean aBool2935 = true;
	static boolean aBool2864 = false;
	static boolean aBool2953 = true;
	static long aLong2882 = -2561770266170829527L;
	static int anInt2949 = 357731023;
	static int anInt3021 = 1290332263;
	static int anInt3041 = -1183622521;
	static boolean aBool3061 = true;
	static int anInt2877 = 0;
	static int anInt3113 = 0;
	static int anInt2879 = 0;
	static int anInt3026 = 0;
	static int anInt2899 = 0;
	static int anInt3139 = 0;
	static int anInt2883 = 0;
	static int anInt2884 = 0;
	static int anInt2885 = 0;
	static DataBuffer aDataBuffer_2886 = new DataBuffer(new byte[5000]);
	static Class42 aClass42_2887;
	static int anInt2889;
	static int loginStage;
	static int anInt2989;
	static int anInt3023;
	static int anInt2900;
	static Npc[] sceneNpcs;
	static int numLocalNpcs;
	static int[] npcIndices;
	static PacketBuffer secureBuffer;
	static PacketBuffer loginBuffer;
	static PacketBuffer gameBuffer;
	static int messageSize;
	static int incomingMessage;
	static int anInt2910;
	static int anInt2911;
	static int anInt2912;
	static int anInt2913;
	static int anInt2916;
	static int anInt2915;
	static boolean aBool3142;
	static int anInt2917;
	static int anInt3115;
	static int anInt3127;
	static Class141[] aClass141Array2923;
	static boolean aBool2960;
	static int[][][] anIntArrayArrayArray2925;
	static int[] objIdxTypes;
	static int anInt2927;
	static int anInt3100;
	static int anInt3132;
	static int anInt3028;
	static int anInt2931;
	static int anInt3051;
	static int anInt2933;
	static int anInt2880;
	static int anInt3064;
	static int anInt2936;
	static int anInt2937;
	static int anInt2938;
	static int anInt2939;
	static int anInt2878;
	static int anInt2942;
	static int anInt2943;
	static int anInt3095;
	static boolean aBool2945;
	static int anInt2946;
	static int anInt2947;
	static int anInt2948;
	static int anInt2940;
	static int anInt2950;
	static int anInt3059;
	static int anInt2952;
	static int anInt3013;
	static boolean aBool3007;
	static int anInt2955;
	static int anInt2956;
	static int anInt2957;
	static int[] anIntArray2958;
	static int[] anIntArray2891;
	static int[] anIntArray2959;
	static int[] anIntArray2961;
	static int[] anIntArray2962;
	static int[] anIntArray2963;
	static int[] anIntArray2932;
	static String[] aStringArray2965;
	static int[][] anIntArrayArray2966;
	static int anInt2924;
	static int anInt2968;
	static int anInt2969;
	static int anInt2970;
	static int anInt2971;
	static int anInt2972;
	static int anInt2973;
	static int anInt2974;
	static int anInt2975;
	static int anInt3049;
	static int anInt2977;
	static int anInt2978;
	static int anInt2979;
	static boolean aBool3109;
	static int anInt2981;
	static int anInt2982;
	static Player[] aClass109_Sub23_Sub16_Sub2_Sub2Array2983;
	static int anInt3091;
	static int[] anIntArray3107;
	static int npcUpdatePointer;
	static int[] npcIndicesNeedingUpdating;
	static DataBuffer[] aDataBufferArray2988;
	static int myIndex;
	static int member;
	static int numNpcsPendingRemoval;
	static int[] npcsPendingRemoval;
	static int[] anIntArray2993;
	static String[] aStringArray2994;
	static boolean[] aBoolArray3008;
	static int[] anIntArray2996;
	static int anInt2867;
	static JagexLinkedList[][][] aJagexLinkedListArrayArrayArray2998;
	static JagexLinkedList aJagexLinkedList_2999;
	static JagexLinkedList aJagexLinkedList_3000;
	static JagexLinkedList aJagexLinkedList_3001;
	static int[] anIntArray3002;
	static int[] anIntArray3003;
	static int[] anIntArray3004;
	static int anInt3005;
	static boolean aBool3006;
	static int menuActionPtr;
	static int[] menuParam2;
	static int[] menuParam3;
	static int[] menuCommands;
	static int[] menuParam1;
	static String[] menuOptions;
	static String[] menuOptionTexts;
	static int anInt3060;
	static int anInt3074;
	static int anInt2859;
	static int anInt3017;
	static int anInt3018;
	static String aString3019;
	static boolean isPickingOption;
	static int anInt2881;
	static int anInt3022;
	static String currentInterfaceAction;
	static String aString2967;
	static int activeRoot;
	static JagexMap aJagexMap_3073;
	static int anInt3027;
	static int anInt3104;
	static InterfaceDef aInterfaceDef_3029;
	static int anInt3030;
	static int anInt3031;
	static int playerRights;
	static int anInt2922;
	static boolean unknown;
	static boolean enableQAInterfaceDebug;
	static boolean debugOptions;
	static InterfaceDef aInterfaceDef_3037;
	static InterfaceDef aInterfaceDef_3038;
	static InterfaceDef aInterfaceDef_3036;
	static int anInt3040;
	static int anInt3085;
	static InterfaceDef aInterfaceDef_3042;
	static boolean aBool3043;
	static int anInt2934;
	static int anInt3045;
	static boolean aBool3046;
	static int anInt3044;
	static int anInt3121;
	static boolean aBool3124;
	static int anInt3050;
	static int[] anIntArray2964;
	static int anInt3052;
	static int[] itemContainerTriggers;
	static int itemContainerTriggerptr;
	static int[] skillIncreaseTriggers;
	static int skillTriggerPtr;
	static int anInt2874;
	static int anInt2990;
	static int anInt3014;
	static int anInt2980;
	static int anInt2929;
	static int anInt3062;
	static int[] anIntArray3063;
	static String[] aStringArray2869;
	static JagexLinkedList scriptInvocationQueue;
	static JagexLinkedList aJagexLinkedList_3067;
	static JagexLinkedList aJagexLinkedList_3068;
	static JagexMap interfaceSettings;
	static int anInt2894;
	static int anInt2985;
	static boolean[] aBoolArray3072;
	static boolean[] aBoolArray2888;
	static boolean[] aBoolArray3129;
	static int[] anIntArray2876;
	static int[] anIntArray3076;
	static int[] anIntArray3077;
	static int[] anIntArray3078;
	static int anInt3079;
	static int anInt3082;
	static int anInt2995;
	static int[] anIntArray3084;
	static int anInt3039;
	static int anInt3086;
	static String aString3096;
	static long[] aLongArray2871;
	static int anInt3089;
	static int anInt2858;
	static int[] anIntArray2976;
	static int[] anIntArray3092;
	static long aLong3093;
	static String aString3090;
	static String aString2921;
	static int anInt3058;
	static int anInt3097;
	static int[] anIntArray3098;
	static int[] anIntArray3135;
	static RenderedItemImage[] aClass109_Sub23_Sub14_Sub2Array3128;
	static int mapMarkerX;
	static int mapMarkerZ;
	static int anInt2901;
	static int anInt2951;
	static int anInt3105;
	static boolean aBool2941;
	static int anInt2954;
	static int anInt3108;
	static int anInt3075;
	static int[] anIntArray3110;
	static int[] anIntArray3111;
	static int[] anIntArray3112;
	static int[] anIntArray3016;
	static Class8[] aClass8Array3114;
	static boolean aBool3083;
	static boolean[] aBoolArray3116;
	static int[] anIntArray3117;
	static int[] anIntArray3118;
	static int[] anIntArray3119;
	static int[] anIntArray3120;
	static short aShort3106;
	static short aShort3122;
	static short aShort3123;
	static short aShort3024;
	static short aShort3125;
	static short aShort3126;
	static short aShort3137;
	static short aShort3057;
	static int anInt2944;
	static int anInt3099;
	static int anInt3131;
	static int anInt3033;
	static int anInt3133;
	static int anInt2984;
	static int anInt2898;
	static Class46[] aClass46Array3136;
	static Class115 aClass115_2892;
	static int anInt3138;
	static Class41[] aClass41Array2895;
	static Class108 aClass108_3140;
	static int anInt3141;
	static int anInt3088;
	static GrandExchangeOffer[] grandExchangeOffers;

	public final void init() {
		if (method3402(-1902859617)) {
			Class107[] var1 = new Class107[]{Class107.aClass107_1488, Class107.aClass107_1496, Class107.aClass107_1483, Class107.aClass107_1493, Class107.aClass107_1497, Class107.aClass107_1491, Class107.aClass107_1484, Class107.aClass107_1494, Class107.aClass107_1486, Class107.aClass107_1492, Class107.aClass107_1487, Class107.aClass107_1489, Class107.aClass107_1490, Class107.aClass107_1485, Class107.aClass107_1495};
			Class107[] var2 = var1;

			int var3;
			String var5;
			int var6;
			int var9;
			for (var3 = 0; var3 < var2.length; var3++) {
				Class107 var4 = var2[var3];
				var5 = Loader.getParam(var4.aString1498);
				System.out.println(var4.aString1498 + "=>" + var5);
				if (var5 != null) {
					Class88[] var8;
					switch (Integer.parseInt(var4.aString1498)) {
						case 2:
							if (var5.equalsIgnoreCase(Class37.TRUE)) {
								aBool2863 = true;
							} else {
								aBool2863 = false;
							}
							continue;
						case 3:
							anInt3048 = Integer.parseInt(var5) * -675594525;
							continue;
						case 4:
							Class7_Sub1.aClass82_1705 = (Class82) CacheableEntry_Sub23_Sub7.method2390(Class70.method937(-2046433259), Integer.parseInt(var5), 2052635667);
							if (Class7_Sub1.aClass82_1705 == Class82.aClass82_979) {
								aClass119_2919 = Class119.aClass119_1544;
							} else {
								aClass119_2919 = Class119.aClass119_1546;
							}
						case 5:
						case 8:
						default:
							continue;
						case 6:
							PacketDecoder.param6 = Integer.parseInt(var5) * -557911611;
							continue;
						case 7:
							anInt2860 = Integer.parseInt(var5) * -1614837605;
							continue;
						case 9:
							anInt2861 = Integer.parseInt(var5) * -73128997;
							continue;
						case 10:
							anInt2872 = Integer.parseInt(var5) * -1172587151;
							continue;
						case 11:
							aString2866 = var5;
							continue;
						case 12:
							anInt2865 = Integer.parseInt(var5) * -1553215559;
							continue;
						case 13:
							if (var5.equalsIgnoreCase(Class37.TRUE)) {
								;
							}
							continue;
						case 14:
							Class31.aString388 = var5;
							continue;
						case 15:
							System.out.println("ke?");
							var6 = Integer.parseInt(var5);
							Class88[] var7 = new Class88[]{Class88.aClass88_1042, Class88.aClass88_1047, Class88.aClass88_1049, Class88.aClass88_1041};
							var8 = var7;
							var9 = 0;
					}

					Class88 var11;
					while (true) {
						if (var9 >= var8.length) {
							var11 = null;
							break;
						}

						Class88 var10 = var8[var9];
						if (var10.anInt1045 * 213306333 == var6) {
							var11 = var10;
							break;
						}

						++var9;
					}

					CacheableEntry_Sub23_Sub15.aClass88_2403 = var11;
				}
			}

			Class51.method742((byte) 69);
			Class10.aString130 = getCodeBase().getHost();
			String var23 = CacheableEntry_Sub23_Sub15.aClass88_2403.aString1044;
			byte var24 = 0;

			try {
				Class83.anInt986 = 1674653552;
				Class83.anInt992 = var24 * -718316497;

				try {
					Class33.aString428 = System.getProperty("os.name");
				} catch (Exception var19) {
					Class33.aString428 = "Unknown";
				}

				LinkedEntry_Sub16.aString1890 = Class33.aString428.toLowerCase();

				try {
					Class83.aString993 = System.getProperty("user.home");
					if (Class83.aString993 != null) {
						Class83.aString993 = Class83.aString993 + "/";
					}
				} catch (Exception var18) {
					;
				}

				try {
					if (LinkedEntry_Sub16.aString1890.startsWith("win")) {
						if (Class83.aString993 == null) {
							Class83.aString993 = System.getenv("USERPROFILE");
						}
					} else if (Class83.aString993 == null) {
						Class83.aString993 = System.getenv("HOME");
					}

					if (Class83.aString993 != null) {
						Class83.aString993 = Class83.aString993 + "/";
					}
				} catch (Exception var17) {
					;
				}

				if (Class83.aString993 == null) {
					Class83.aString993 = "~/";
				}

				Class57.aStringArray747 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class83.aString993, "/tmp/", ""};
				Class83.aStringArray987 = new String[]{".jagex_cache_" + Class83.anInt992 * -960009521, ".file_store_" + Class83.anInt992 * -960009521};
				var3 = 0;

				label245:
				while (var3 < 4) {
					var5 = var3 == 0 ? "" : "" + var3;
					Class91.aFile1331 = new File(Class83.aString993, "jagex_cl_oldschool_" + var23 + var5 + ".dat");
					String var38 = null;
					String var27 = null;
					boolean var28 = false;
					File var34;
					if (Class91.aFile1331.exists()) {
						try {
							Class135 var29 = new Class135(Class91.aFile1331, "rw", 10000L);

							DataBuffer var33;
							int var35;
							for (var33 = new DataBuffer((int) var29.method1642(-1895958433)); var33.pos * 1736753585 < var33.data.length; var33.pos += var35 * 1303963473) {
								var35 = var29.method1643(var33.data, var33.pos * 1736753585, var33.data.length - var33.pos * 1736753585, 1736753585);
								if (var35 == -1) {
									throw new IOException();
								}
							}

							var33.pos = 0;
							var35 = var33.readUByte();
							if (var35 < 1 || var35 > 3) {
								throw new IOException("" + var35);
							}

							int var12 = 0;
							if (var35 > 1) {
								var12 = var33.readUByte();
							}

							if (var35 <= 2) {
								var38 = var33.method1878();
								if (var12 == 1) {
									var27 = var33.method1878();
								}
							} else {
								var38 = var33.method2021();
								if (var12 == 1) {
									var27 = var33.method2021();
								}
							}

							var29.method1641(-1428572377);
						} catch (IOException var21) {
							var21.printStackTrace();
						}

						if (var38 != null) {
							var34 = new File(var38);
							if (!var34.exists()) {
								var38 = null;
							}
						}

						if (var38 != null) {
							var34 = new File(var38, "test.dat");
							if (!Canvas_Sub1.method2825(var34, true, -612436403)) {
								var38 = null;
							}
						}
					}

					if (var38 == null && var3 == 0) {
						label219:
						for (int var30 = 0; var30 < Class83.aStringArray987.length; var30++) {
							for (var9 = 0; var9 < Class57.aStringArray747.length; var9++) {
								File var36 = new File(Class57.aStringArray747[var9] + Class83.aStringArray987[var30] + File.separatorChar + "oldschool" + File.separatorChar);
								if (var36.exists() && Canvas_Sub1.method2825(new File(var36, "test.dat"), true, -1980961456)) {
									var38 = var36.toString();
									var28 = true;
									break label219;
								}
							}
						}
					}

					if (var38 == null) {
						//var38 = Class83.aString993 + File.separatorChar + "jagexcache" + var5 + File.separatorChar + "oldschool" + File.separatorChar + var23 + File.separatorChar;
						var38 = Class83.aString993 + File.separatorChar + ".Edgeville" + var5 + File.separatorChar + "oldschool" + File.separatorChar + var23 + File.separatorChar;
						var28 = true;
					}

					if (var27 != null) {
						File var32 = new File(var27);
						var34 = new File(var38);

						try {
							File[] var37 = var32.listFiles();
							File[] var39 = var37;

							for (int var13 = 0; var13 < var39.length; var13++) {
								File var14 = var39[var13];
								File var15 = new File(var34, var14.getName());
								boolean var16 = var14.renameTo(var15);
								if (!var16) {
									throw new IOException();
								}
							}
						} catch (Exception var20) {
							var20.printStackTrace();
						}

						var28 = true;
					}

					if (var28) {
						Class107.method1343(new File(var38), (File) null, -691360820);
					}

					File var25 = new File(var38);
					Class83.aFile983 = var25;
					if (!Class83.aFile983.exists()) {
						Class83.aFile983.mkdirs();
					}

					File[] var26 = Class83.aFile983.listFiles();
					if (var26 != null) {
						File[] var40 = var26;

						for (var6 = 0; var6 < var40.length; var6++) {
							File var31 = var40[var6];
							if (!Canvas_Sub1.method2825(var31, false, -1300760502)) {
								++var3;
								continue label245;
							}
						}
					}
					break;
				}

				Class51.method719(Class83.aFile983, 1218488317);
				CacheableEntry_Sub23_Sub16_Sub3.method2966((byte) 126);
				Class83.aClass139_994 = new Class139(new Class135(Class32.method465("main_file_cache.dat2", (byte) -21), "rw", 1048576000L), 5200, 0);
				Class83.aClass139_991 = new Class139(new Class135(Class32.method465("main_file_cache.idx255", (byte) -11), "rw", 1048576L), 6000, 0);
				Class58.aClass139Array757 = new Class139[Class83.anInt986 * 1014582983];

				for (var3 = 0; var3 < Class83.anInt986 * 1014582983; var3++) {
					Class58.aClass139Array757[var3] = new Class139(new Class135(Class32.method465("main_file_cache.idx" + var3, (byte) -94), "rw", 1048576L), 6000, 0);
				}
			} catch (Exception var22) {
				Class72.method964((String) null, var22, (byte) 1);
			}

			aGameClient2857 = this;
			method3400(765, 503, 86, -64415416);
		}
	}

	protected final void method3413(int var1) {
		NpcDef.anInt2239 = 1098229281 * (anInt2861 * -134799277 == 0 ? 43594 : 40000 + anInt2872 * 1425499025);
		CacheableEntry_Sub23_Sub2.anInt2106 = -417358633 * (anInt2861 * -134799277 == 0 ? 443 : anInt2872 * 1425499025 + 50000);
		Class51.anInt712 = NpcDef.anInt2239 * 471081033;
		Class85.aShortArray1010 = Class98.aShortArray1406;
		Class108.aShortArrayArray1506 = Class98.aShortArrayArray1399;
		Class59.aShortArray766 = Class98.aShortArray1398;
		MachineInfo.aShortArrayArray1879 = Class98.aShortArrayArray1401;
		if (Class73.aString878.toLowerCase().indexOf("microsoft") != -1) {
			Class65.anIntArray832[186] = 57;
			Class65.anIntArray832[187] = 27;
			Class65.anIntArray832[188] = 71;
			Class65.anIntArray832[189] = 26;
			Class65.anIntArray832[190] = 72;
			Class65.anIntArray832[191] = 73;
			Class65.anIntArray832[192] = 58;
			Class65.anIntArray832[219] = 42;
			Class65.anIntArray832[220] = 74;
			Class65.anIntArray832[221] = 43;
			Class65.anIntArray832[222] = 59;
			Class65.anIntArray832[223] = 28;
		} else {
			Class65.anIntArray832[44] = 71;
			Class65.anIntArray832[45] = 26;
			Class65.anIntArray832[46] = 72;
			Class65.anIntArray832[47] = 73;
			Class65.anIntArray832[59] = 57;
			Class65.anIntArray832[61] = 27;
			Class65.anIntArray832[91] = 42;
			Class65.anIntArray832[92] = 74;
			Class65.anIntArray832[93] = 43;
			Class65.anIntArray832[192] = 28;
			Class65.anIntArray832[222] = 58;
			Class65.anIntArray832[520] = 59;
		}

		Canvas var2 = Class60.aCanvas771;
		var2.setFocusTraversalKeysEnabled(false);
		var2.addKeyListener(Class65.aClass65_819);
		var2.addFocusListener(Class65.aClass65_819);
		Canvas var3 = Class60.aCanvas771;
		var3.addMouseListener(Class74.aClass74_901);
		var3.addMouseMotionListener(Class74.aClass74_901);
		var3.addFocusListener(Class74.aClass74_901);

		Class72_Sub1 var4;
		try {
			var4 = new Class72_Sub1();
		} catch (Throwable var12) {
			var4 = null;
		}

		Class36.aClass72_489 = var4;
		if (Class36.aClass72_489 != null) {
			Class36.aClass72_489.method953(Class60.aCanvas771, (byte) 50);
		}

		CacheableEntry_Sub23_Sub18.aClass68_2445 = new PacketEncoder(255, Class83.aClass139_994, Class83.aClass139_991, 500000);
		Class135 var6 = null;
		Class35 var7 = new Class35();

		try {
			var6 = Class21.method347("", Class7_Sub1.aClass82_1705.aString980, false, 963366455);
			byte[] var8 = new byte[(int) var6.method1642(-2036842210)];

			int var10;
			for (int var9 = 0; var9 < var8.length; var9 += var10) {
				var10 = var6.method1643(var8, var9, var8.length - var9, 1736753585);
				if (var10 == -1) {
					throw new IOException();
				}
			}

			var7 = new Class35(new DataBuffer(var8));
		} catch (Exception var13) {
			;
		}

		try {
			if (var6 != null) {
				var6.method1641(-1055567092);
			}
		} catch (Exception var11) {
			;
		}

		Class15.aClass35_195 = var7;
		PacketDecoder.aClipboard339 = getToolkit().getSystemClipboard();
		CacheableEntry_Sub23_Sub6.method2370(this, Class56.aString737, 1979268238);
		if (anInt2861 * -134799277 != 0) {
			aBool2991 = true;
		}

		int var14 = Class15.aClass35_195.anInt474 * 1158077189;
		aLong3080 = 0L;
		if (var14 >= 2) {
			aBool3081 = true;
		} else {
			aBool3081 = false;
		}

		EnumDef.method2353(-476741378);
		if (anInt2868 * -684224463 >= 25) {
			secureBuffer.writeOpcode(141);
			secureBuffer.writeByte(LinkedEntry_Sub5_Sub4.method2933(-1412378987));
			secureBuffer.writeShort(Class5.anInt98 * 2104430923);
			secureBuffer.writeShort(Class60.anInt769 * -1064642111);
		}

		aBool2849 = true;
	}

	protected final void method3415(int var1) {
		cycle += 650746889;
		method3500((byte) 98);

		while (true) {
			JagexLinkedList var2 = Class100.aJagexLinkedList_1416;
			LinkedEntry_Sub20 var3;
			synchronized (var2) {
				var3 = (LinkedEntry_Sub20) Class100.aJagexLinkedList_1414.method1399();
			}

			if (var3 == null) {
				Class36.method486((byte) 8);
				CacheableEntry_Sub23_Sub7.method2389((byte) 42);
				Class65 var29 = Class65.aClass65_819;
				int var28;
				synchronized (var29) {
					Class65.anInt831 += 365711147;
					Class65.anInt828 = Class65.anInt829 * 776092841;
					Class65.anInt827 = 0;
					if (Class65.anInt823 * -1022982525 >= 0) {
						while (Class65.anInt822 * 20527529 != Class65.anInt823 * -1022982525) {
							var28 = Class65.anIntArray824[Class65.anInt822 * 20527529];
							Class65.anInt822 = (Class65.anInt822 * 20527529 + 1 & 127) * -1409123687;
							if (var28 < 0) {
								Class65.aBoolArray820[~var28] = false;
							} else {
								if (!Class65.aBoolArray820[var28] && Class65.anInt827 * 81863853 < Class65.anIntArray826.length - 1) {
									Class65.anIntArray826[(Class65.anInt827 -= 1947214043) * 81863853 - 1] = var28;
								}

								Class65.aBoolArray820[var28] = true;
							}
						}
					} else {
						for (var28 = 0; var28 < 112; var28++) {
							Class65.aBoolArray820[var28] = false;
						}

						Class65.anInt823 = Class65.anInt822 * -604903581;
					}

					Class65.anInt829 = Class65.anInt833 * -1893425567;
				}

				Class74 var30 = Class74.aClass74_901;
				synchronized (var30) {
					Class74.anInt896 = Class74.anInt902 * 1405368281;
					Class74.anInt897 = Class74.anInt894 * 1008788163;
					Class74.anInt898 = Class74.anInt895 * 1954754289;
					Class74.anInt903 = Class74.anInt899 * -1237391709;
					Class74.anInt891 = Class74.anInt900 * -1825792431;
					Class74.anInt905 = Class74.anInt893 * 1805479901;
					Class74.aLong906 = Class74.aLong904 * -1270734219713552515L;
					Class74.anInt899 = 0;
				}

				int var31;
				if (Class36.aClass72_489 != null) {
					var31 = Class36.aClass72_489.method961((byte) 117);
					anInt3065 = var31 * 1547349623;
				}

				if (anInt2868 * -684224463 == 0) {
					CacheableEntry_Sub23_Sub17.method2796(-1825976783);
					PacketBuffer.aClass63_2432.method830((byte) -19);

					for (var31 = 0; var31 < 32; var31++) {
						aLongArray2846[var31] = 0L;
					}

					for (var31 = 0; var31 < 32; var31++) {
						aLongArray2855[var31] = 0L;
					}

					GfxDef.anInt2370 = 0;
				} else if (anInt2868 * -684224463 == 5) {
					method3508(this, -1891877099);
					CacheableEntry_Sub23_Sub17.method2796(-2090491589);
					PacketBuffer.aClass63_2432.method830((byte) -84);

					for (var31 = 0; var31 < 32; var31++) {
						aLongArray2846[var31] = 0L;
					}

					for (var31 = 0; var31 < 32; var31++) {
						aLongArray2855[var31] = 0L;
					}

					GfxDef.anInt2370 = 0;
				} else if (anInt2868 * -684224463 != 10 && anInt2868 * -684224463 != 11) {
					if (anInt2868 * -684224463 == 20) {
						method3508(this, -1296775317);
						Class40.method669((byte) -23);
					} else if (anInt2868 * -684224463 == 25) {
						Class50.method709(false, 2096072399);
						anInt2918 = 0;
						boolean var33 = true;

						for (var28 = 0; var28 < Class61.mapFileData.length; var28++) {
							if (CacheableEntry_Sub23_Sub16_Sub2.mapFileIds[var28] != -1 && Class61.mapFileData[var28] == null) {
								Class61.mapFileData[var28] = Class126_Sub1.aClass94_Sub1_1643.getFileData(CacheableEntry_Sub23_Sub16_Sub2.mapFileIds[var28], 0);
								if (Class61.mapFileData[var28] == null) {
									var33 = false;
									anInt2918 += 214469313;
								}
							}

							if (Class77.landscapeFileId[var28] != -1 && Class30.aByteArrayArray378[var28] == null) {
								Class30.aByteArrayArray378[var28] = Class126_Sub1.aClass94_Sub1_1643.method1152(Class77.landscapeFileId[var28], 0, Class30.anIntArrayArray381[var28]);
								if (Class30.aByteArrayArray378[var28] == null) {
									var33 = false;
									anInt2918 += 214469313;
								}
							}
						}

						if (!var33) {
							anInt2862 = 809934399;
						} else {
							anInt2920 = 0;
							var33 = true;

							int var5;
							int var6;
							for (var28 = 0; var28 < Class61.mapFileData.length; var28++) {
								byte[] var4 = Class30.aByteArrayArray378[var28];
								if (var4 != null) {
									var5 = (LinkedEntry_Sub9.anIntArray1766[var28] >> 8) * 64 - Class35.anInt478 * -1719983039;
									var6 = (LinkedEntry_Sub9.anIntArray1766[var28] & 255) * 64 - LinkedEntry_Sub13.anInt1825 * 803568843;
									if (aBool2960) {
										var5 = 10;
										var6 = 10;
									}

									var33 &= Class6.method152(var4, var5, var6);
								}
							}

							if (!var33) {
								anInt2862 = 1619868798;
							} else {
								if (anInt2862 * 1765953983 != 0) {
									Class53.method780(Class90.aString1082 + Class37.BR + Class37.BRACK_OPEN + 100 + "%" + Class37.BRACK_CLOSE, true, -1714673297);
								}

								CacheableEntry_Sub23_Sub7.method2389((byte) -13);
								ObjectDef.method2469(1600056708);
								CacheableEntry_Sub23_Sub7.method2389((byte) -15);
								LinkedEntry_Sub6.aClass39_1732.method501();
								CacheableEntry_Sub23_Sub7.method2389((byte) -1);
								System.gc();

								for (var28 = 0; var28 < 4; var28++) {
									aClass141Array2923[var28].method1701((byte) -49);
								}

								int var32;
								for (var28 = 0; var28 < 4; var28++) {
									for (var32 = 0; var32 < 104; var32++) {
										for (var5 = 0; var5 < 104; var5++) {
											Class32.mapSettings[var28][var32][var5] = 0;
										}
									}
								}

								CacheableEntry_Sub23_Sub7.method2389((byte) -39);
								Class123.method1528((byte) 73);
								var28 = Class61.mapFileData.length;
								Class10.method204(1119335650);
								Class50.method709(true, 2096072399);
								int var35;
								if (!aBool2960) {
									byte[] var7;
									for (var32 = 0; var32 < var28; var32++) {
										var5 = (LinkedEntry_Sub9.anIntArray1766[var32] >> 8) * 64 - Class35.anInt478 * -1719983039;
										var6 = (LinkedEntry_Sub9.anIntArray1766[var32] & 255) * 64 - LinkedEntry_Sub13.anInt1825 * 803568843;
										var7 = Class61.mapFileData[var32];
										if (var7 != null) {
											CacheableEntry_Sub23_Sub7.method2389((byte) -15);
											GfxDef.method2542(var7, var5, var6, CacheableEntry_Sub23_Sub11.anInt2336 * -305307080 - 48, Class24.anInt317 * 1126344264 - 48, aClass141Array2923, (byte) 8);
										}
									}

									for (var32 = 0; var32 < var28; var32++) {
										var5 = (LinkedEntry_Sub9.anIntArray1766[var32] >> 8) * 64 - Class35.anInt478 * -1719983039;
										var6 = (LinkedEntry_Sub9.anIntArray1766[var32] & 255) * 64 - LinkedEntry_Sub13.anInt1825 * 803568843;
										var7 = Class61.mapFileData[var32];
										if (var7 == null && Class24.anInt317 * -932948791 < 800) {
											CacheableEntry_Sub23_Sub7.method2389((byte) 66);
											Class97.method1248(var5, var6, 64, 64, 1602338140);
										}
									}

									Class50.method709(true, 2096072399);

									for (var32 = 0; var32 < var28; var32++) {
										byte[] var34 = Class30.aByteArrayArray378[var32];
										if (var34 != null) {
											var6 = (LinkedEntry_Sub9.anIntArray1766[var32] >> 8) * 64 - Class35.anInt478 * -1719983039;
											var35 = (LinkedEntry_Sub9.anIntArray1766[var32] & 255) * 64 - LinkedEntry_Sub13.anInt1825 * 803568843;
											CacheableEntry_Sub23_Sub7.method2389((byte) -62);
											LinkedEntry_Sub13.decodeObjects(var34, var6, var35, LinkedEntry_Sub6.aClass39_1732, aClass141Array2923);
										}
									}
								}

								int var8;
								int var9;
								int var10;
								if (aBool2960) {
									var32 = 0;

									label435:
									while (true) {
										int var11;
										int var12;
										int var13;
										if (var32 >= 4) {
											for (var32 = 0; var32 < 13; var32++) {
												for (var5 = 0; var5 < 13; var5++) {
													var6 = anIntArrayArrayArray2925[0][var32][var5];
													if (var6 == -1) {
														Class97.method1248(var32 * 8, var5 * 8, 8, 8, -1106805124);
													}
												}
											}

											Class50.method709(true, 2096072399);
											var32 = 0;

											while (true) {
												if (var32 >= 4) {
													break label435;
												}

												CacheableEntry_Sub23_Sub7.method2389((byte) -99);

												for (var5 = 0; var5 < 13; var5++) {
													for (var6 = 0; var6 < 13; var6++) {
														var35 = anIntArrayArrayArray2925[var32][var5][var6];
														if (var35 != -1) {
															var8 = var35 >> 24 & 3;
															var9 = var35 >> 1 & 3;
															var10 = var35 >> 14 & 1023;
															var11 = var35 >> 3 & 2047;
															var12 = var11 / 8 + (var10 / 8 << 8);

															for (var13 = 0; var13 < LinkedEntry_Sub9.anIntArray1766.length; var13++) {
																if (var12 == LinkedEntry_Sub9.anIntArray1766[var13] && Class30.aByteArrayArray378[var13] != null) {
																	CacheableEntry_Sub23_Sub6.method2376(Class30.aByteArrayArray378[var13], var32, var5 * 8, var6 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9, LinkedEntry_Sub6.aClass39_1732, aClass141Array2923, 1768800462);
																	break;
																}
															}
														}
													}
												}

												++var32;
											}
										}

										CacheableEntry_Sub23_Sub7.method2389((byte) -50);

										for (var5 = 0; var5 < 13; var5++) {
											for (var6 = 0; var6 < 13; var6++) {
												boolean var36 = false;
												var8 = anIntArrayArrayArray2925[var32][var5][var6];
												if (var8 != -1) {
													var9 = var8 >> 24 & 3;
													var10 = var8 >> 1 & 3;
													var11 = var8 >> 14 & 1023;
													var12 = var8 >> 3 & 2047;
													var13 = var12 / 8 + (var11 / 8 << 8);

													for (int var14 = 0; var14 < LinkedEntry_Sub9.anIntArray1766.length; var14++) {
														if (var13 == LinkedEntry_Sub9.anIntArray1766[var14] && Class61.mapFileData[var14] != null) {
															byte[] var15 = Class61.mapFileData[var14];
															int var16 = var5 * 8;
															int var17 = var6 * 8;
															int var18 = (var11 & 7) * 8;
															int var19 = (var12 & 7) * 8;
															Class141[] var20 = aClass141Array2923;

															int var22;
															for (int var21 = 0; var21 < 8; var21++) {
																for (var22 = 0; var22 < 8; var22++) {
																	if (var21 + var16 > 0 && var16 + var21 < 103 && var17 + var22 > 0 && var17 + var22 < 103) {
																		var20[var32].anIntArrayArray1628[var16 + var21][var17 + var22] &= -16777217;
																	}
																}
															}

															DataBuffer var38 = new DataBuffer(var15);

															for (var22 = 0; var22 < 4; var22++) {
																for (int var23 = 0; var23 < 64; var23++) {
																	for (int var24 = 0; var24 < 64; var24++) {
																		if (var22 == var9 && var23 >= var18 && var23 < 8 + var18 && var24 >= var19 && var24 < var19 + 8) {
																			Class53.method781(var38, var32, var16 + Class32.method455(var23 & 7, var24 & 7, var10, (byte) -15), var17 + Class131.method1611(var23 & 7, var24 & 7, var10, -2068595898), 0, 0, var10, -436015020);
																		} else {
																			Class53.method781(var38, 0, -1, -1, 0, 0, 0, 843850242);
																		}
																	}
																}
															}

															var36 = true;
															break;
														}
													}
												}

												if (!var36) {
													CacheableEntry_Sub23_Sub17.method2799(var32, var5 * 8, var6 * 8, 1672071013);
												}
											}
										}

										++var32;
									}
								}

								Class50.method709(true, 2096072399);
								ObjectDef.method2469(1802634026);
								CacheableEntry_Sub23_Sub7.method2389((byte) -30);
								Class18.method320(LinkedEntry_Sub6.aClass39_1732, aClass141Array2923, 2028049246);
								Class50.method709(true, 2096072399);
								var32 = Class32.anInt392 * 2066106645;
								if (var32 > CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619) {
									var32 = CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619;
								}

								if (var32 < CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619 - 1) {
									var32 = CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619 - 1;
								}

								if (aBool2864) {
									LinkedEntry_Sub6.aClass39_1732.method502(Class32.anInt392 * 2066106645);
								} else {
									LinkedEntry_Sub6.aClass39_1732.method502(0);
								}

								for (var5 = 0; var5 < 104; var5++) {
									for (var6 = 0; var6 < 104; var6++) {
										CacheableEntry_Sub23_Sub16_Sub1.method2940(var5, var6, (byte) 96);
									}
								}

								CacheableEntry_Sub23_Sub7.method2389((byte) -12);

								for (LinkedEntry_Sub6 var37 = (LinkedEntry_Sub6) aJagexLinkedList_2999.method1405(); var37 != null; var37 = (LinkedEntry_Sub6) aJagexLinkedList_2999.method1402()) {
									if (var37.anInt1728 * -786095411 == -1) {
										var37.anInt1727 = 0;
										ItemContainer.method1850(var37);
									} else {
										var37.unlink();
									}
								}

								ObjectDef.aClass128_2261.method1579();
								if (Class57.aFrame740 != null) {
									secureBuffer.writeOpcode(214);
									secureBuffer.writeInt(1057001181);
								}

								if (!aBool2960) {
									var5 = (CacheableEntry_Sub23_Sub11.anInt2336 * 1572449351 - 6) / 8;
									var6 = (CacheableEntry_Sub23_Sub11.anInt2336 * 1572449351 + 6) / 8;
									var35 = (Class24.anInt317 * -932948791 - 6) / 8;
									var8 = (Class24.anInt317 * -932948791 + 6) / 8;

									for (var9 = var5 - 1; var9 <= 1 + var6; var9++) {
										for (var10 = var35 - 1; var10 <= 1 + var8; var10++) {
											if (var9 < var5 || var9 > var6 || var10 < var35 || var10 > var8) {
												Class126_Sub1.aClass94_Sub1_1643.method1169("m" + var9 + "_" + var10, -1835396502);
												Class126_Sub1.aClass94_Sub1_1643.method1169("l" + var9 + "_" + var10, -1414748092);
											}
										}
									}
								}

								Class93.method1146(30, 2103807804);
								CacheableEntry_Sub23_Sub7.method2389((byte) 102);
								Class32.aByteArrayArrayArray407 = (byte[][][]) null;
								Class32.aByteArrayArrayArray394 = (byte[][][]) null;
								Class36.aByteArrayArrayArray485 = (byte[][][]) null;
								LinkedEntry_Sub9.aByteArrayArrayArray1762 = (byte[][][]) null;
								CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497 = (int[][][]) null;
								Class32.aByteArrayArrayArray395 = (byte[][][]) null;
								Class32.anIntArrayArray396 = (int[][]) null;
								CacheableEntry_Sub23_Sub7.anIntArray2211 = null;
								Class32.anIntArray399 = null;
								Class32.anIntArray398 = null;
								Class77.anIntArray935 = null;
								EnumDef.anIntArray2195 = null;
								secureBuffer.writeOpcode(69);
								PacketBuffer.aClass63_2432.method830((byte) -5);

								for (var5 = 0; var5 < 32; var5++) {
									aLongArray2846[var5] = 0L;
								}

								for (var5 = 0; var5 < 32; var5++) {
									aLongArray2855[var5] = 0L;
								}

								GfxDef.anInt2370 = 0;
							}
						}
					}
				} else {
					method3508(this, -1321149852);
				}

				if (anInt2868 * -684224463 == 30) {
					CacheableEntry_Sub23_Sub16_Sub7.method3297(1260040613);
				} else if (anInt2868 * -684224463 == 40 || anInt2868 * -684224463 == 45) {
					Class40.method669((byte) -72);
				}

				return;
			}

			var3.aClass94_Sub1_2074.method2142(var3.aClass68_2073, (int) var3.key, var3.aByteArray2072, false, (byte) 76);
		}
	}

	protected final void method3460(byte var1) {
		if (Class41.aClass48_588 != null) {
			Class41.aClass48_588.aBool678 = false;
		}

		Class41.aClass48_588 = null;
		if (Class98.loginConnection != null) {
			Class98.loginConnection.terminate();
			Class98.loginConnection = null;
		}

		if (Class65.aClass65_819 != null) {
			Class65 var2 = Class65.aClass65_819;
			synchronized (var2) {
				Class65.aClass65_819 = null;
			}
		}

		if (Class74.aClass74_901 != null) {
			Class74 var10 = Class74.aClass74_901;
			synchronized (var10) {
				Class74.aClass74_901 = null;
			}
		}

		Class36.aClass72_489 = null;
		if (CacheableEntry_Sub23_Sub6.aClass2_2200 != null) {
			CacheableEntry_Sub23_Sub6.aClass2_2200.method52(-99158889);
		}

		if (IndexDescriptor.aClass2_1353 != null) {
			IndexDescriptor.aClass2_1353.method52(-99158889);
		}

		Class23.method351(-302659003);
		Object var11 = Class100.anObject1411;
		synchronized (var11) {
			if (Class100.anInt1410 * 1739579873 != 0) {
				Class100.anInt1410 = 953426465;

				try {
					Class100.anObject1411.wait();
				} catch (InterruptedException var6) {
					;
				}
			}
		}

		CacheableEntry_Sub23_Sub7.method2395(-623222018);
	}

	void method3500(byte var1) {
		if (anInt2868 * -684224463 != 1000) {
			boolean var2 = Class23.method352(-1657076487);
			if (!var2) {
				method3501(601623862);
			}

		}
	}

	void method3501(int var1) {
		if (Class97.anInt1394 * -1001122769 >= 4) {
			method3430("js5crc", (byte) 2);
			anInt2868 = -371691416;
		} else {
			if (Class97.anInt1387 * 195991739 >= 4) {
				if (anInt2868 * -684224463 <= 5) {
					method3430("js5io", (byte) 2);
					anInt2868 = -371691416;
					return;
				}

				anInt3087 = -436727112;
				Class97.anInt1387 = 1887421785;
			}

			if ((anInt3087 -= 1069301281) * 469681633 + 1 <= 0) {
				try {
					if (anInt3130 * -302792499 == 0) {
						aAsyncJob_2890 = Class50.aClass73_693.submitSocketJob(Class10.aString130, Class51.anInt712 * 751829209);
						anInt3130 -= 1048433659;
					}

					if (anInt3130 * -302792499 == 1) {
						if (aAsyncJob_2890.stage == 2) {
							method3502(-1, (byte) -5);
							return;
						}

						if (aAsyncJob_2890.stage == 1) {
							anInt3130 -= 1048433659;
						}
					}

					if (anInt3130 * -302792499 == 2) {
						Class21.aConnection_269 = new Connection((Socket) aAsyncJob_2890.result, Class50.aClass73_693);
						DataBuffer var2 = new DataBuffer(5);
						var2.writeByte(15);
						var2.writeInt(86);
						Class21.aConnection_269.write(var2.data, 0, 5);
						anInt3130 -= 1048433659;
						aLong2893 = Class10.method216((short) 255) * 6543028040007707241L;
					}

					if (anInt3130 * -302792499 == 3) {
						if (anInt2868 * -684224463 > 5 && Class21.aConnection_269.available() <= 0) {
							if (Class10.method216((short) 255) - 5478959463529956825L * aLong2893 > 30000L) {
								method3502(-2, (byte) 94);
								return;
							}
						} else {
							int var4 = Class21.aConnection_269.read();
							if (var4 != 0) {
								method3502(var4, (byte) 71);
								return;
							}

							anInt3130 -= 1048433659;
						}
					}

					if (anInt3130 * -302792499 == 4) {
						LinkedEntry_Sub9.method1834(Class21.aConnection_269, anInt2868 * -684224463 > 20, 60256045);
						aAsyncJob_2890 = null;
						Class21.aConnection_269 = null;
						anInt3130 = 0;
						anInt2896 = 0;
					}
				} catch (IOException var3) {
					method3502(-3, (byte) -27);
				}

			}
		}
	}

	void method3502(int var1, byte var2) {
		aAsyncJob_2890 = null;
		Class21.aConnection_269 = null;
		anInt3130 = 0;
		if (Class51.anInt712 * 751829209 != NpcDef.anInt2239 * -1805689375) {
			Class51.anInt712 = NpcDef.anInt2239 * 471081033;
		} else {
			Class51.anInt712 = CacheableEntry_Sub23_Sub2.anInt2106 * 191036863;
		}

		anInt2896 -= 1057819419;
		if (anInt2896 * -1273386771 < 2 || var1 != 7 && var1 != 9) {
			if (anInt2896 * -1273386771 >= 2 && var1 == 6) {
				method3430("js5connect_outofdate", (byte) 2);
				anInt2868 = -371691416;
			} else if (anInt2896 * -1273386771 >= 4) {
				if (anInt2868 * -684224463 <= 5) {
					method3430("js5connect", (byte) 2);
					anInt2868 = -371691416;
				} else {
					anInt3087 = -436727112;
				}
			}
		} else if (anInt2868 * -684224463 <= 5) {
			method3430("js5connect_full", (byte) 2);
			anInt2868 = -371691416;
		} else {
			anInt3087 = -436727112;
		}

	}

	static {
		aClass42_2887 = Class42.aClass42_604;
		anInt2889 = 0;
		anInt3130 = 0;
		anInt3087 = 0;
		anInt2896 = 0;
		loginStage = 0;
		anInt2989 = 0;
		anInt3023 = 0;
		anInt2900 = 0;
		sceneNpcs = new Npc[32768];
		numLocalNpcs = 0;
		npcIndices = new int[32768];
		secureBuffer = new PacketBuffer(5000);
		loginBuffer = new PacketBuffer(5000);
		gameBuffer = new PacketBuffer(5000);
		messageSize = 0;
		incomingMessage = 0;
		anInt2910 = 0;
		anInt2911 = 0;
		anInt2912 = 0;
		anInt2913 = 0;
		anInt2916 = 0;
		anInt2915 = 0;
		aBool3142 = false;
		anInt2917 = 0;
		anInt2918 = 0;
		anInt3115 = 1619520155;
		anInt2920 = 0;
		anInt3127 = -1369685237;
		anInt2862 = 0;
		aClass141Array2923 = new Class141[4];
		aBool2960 = false;
		anIntArrayArrayArray2925 = new int[4][13][13];
		objIdxTypes = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		anInt2927 = 0;
		anInt3100 = 993942234;
		anInt3132 = 0;
		anInt3028 = -849707682;
		anInt2931 = 0;
		anInt3051 = 1630497051;
		anInt2933 = 0;
		anInt2880 = 0;
		anInt3064 = 87705858;
		anInt2936 = 0;
		anInt2937 = 1679310403;
		anInt2938 = 0;
		anInt2939 = 0;
		anInt2878 = 701003023;
		anInt2942 = 1833510911;
		anInt2943 = 930044431;
		anInt3095 = 1999767588;
		aBool2945 = false;
		anInt2946 = 0;
		anInt2947 = -1860349568;
		anInt2948 = 0;
		anInt2940 = 0;
		anInt2950 = 0;
		anInt3059 = 0;
		anInt2952 = 0;
		anInt3013 = 0;
		aBool3007 = false;
		anInt2955 = 0;
		anInt2956 = 0;
		anInt2957 = 1890038782;
		anIntArray2958 = new int[anInt2957 * 2060170727];
		anIntArray2891 = new int[anInt2957 * 2060170727];
		anIntArray2959 = new int[anInt2957 * 2060170727];
		anIntArray2961 = new int[anInt2957 * 2060170727];
		anIntArray2962 = new int[anInt2957 * 2060170727];
		anIntArray2963 = new int[anInt2957 * 2060170727];
		anIntArray2932 = new int[anInt2957 * 2060170727];
		aStringArray2965 = new String[anInt2957 * 2060170727];
		anIntArrayArray2966 = new int[104][104];
		anInt2924 = 0;
		anInt2968 = 1738216931;
		anInt2969 = 1048260499;
		anInt2970 = 0;
		anInt2971 = 0;
		anInt2972 = 0;
		anInt2973 = 0;
		anInt2974 = 0;
		anInt2975 = 0;
		anInt3049 = 0;
		anInt2977 = 0;
		anInt2978 = 0;
		anInt2979 = 0;
		aBool3109 = false;
		anInt2981 = 0;
		anInt2982 = 0;
		aClass109_Sub23_Sub16_Sub2_Sub2Array2983 = new Player[2048];
		anInt3091 = 0;
		anIntArray3107 = new int[2048];
		npcUpdatePointer = 0;
		npcIndicesNeedingUpdating = new int[2048];
		aDataBufferArray2988 = new DataBuffer[2048];
		myIndex = 435565545;
		member = 0;
		numNpcsPendingRemoval = 0;
		npcsPendingRemoval = new int[1000];
		anIntArray2993 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		aStringArray2994 = new String[8];
		aBoolArray3008 = new boolean[8];
		anIntArray2996 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		anInt2867 = 787648439;
		aJagexLinkedListArrayArrayArray2998 = new JagexLinkedList[4][104][104];
		aJagexLinkedList_2999 = new JagexLinkedList();
		aJagexLinkedList_3000 = new JagexLinkedList();
		aJagexLinkedList_3001 = new JagexLinkedList();
		anIntArray3002 = new int[25];
		anIntArray3003 = new int[25];
		anIntArray3004 = new int[25];
		anInt3005 = 0;
		aBool3006 = false;
		menuActionPtr = 0;
		menuParam2 = new int[500];
		menuParam3 = new int[500];
		menuCommands = new int[500];
		menuParam1 = new int[500];
		menuOptions = new String[500];
		menuOptionTexts = new String[500];
		anInt3060 = 276627093;
		anInt3074 = 1244965977;
		anInt2859 = 0;
		anInt3017 = 2022005938;
		anInt3018 = 0;
		aString3019 = null;
		isPickingOption = false;
		anInt2881 = 1832237769;
		anInt3022 = -2106201685;
		currentInterfaceAction = null;
		aString2967 = null;
		activeRoot = 1855539973;
		aJagexMap_3073 = new JagexMap(8);
		anInt3027 = 0;
		anInt3104 = 0;
		aInterfaceDef_3029 = null;
		anInt3030 = 0;
		anInt3031 = 0;
		playerRights = 0;
		anInt2922 = -1834997571;
		unknown = false;
		enableQAInterfaceDebug = false;
		debugOptions = false;
		aInterfaceDef_3037 = null;
		aInterfaceDef_3038 = null;
		aInterfaceDef_3036 = null;
		anInt3040 = 0;
		anInt3085 = 0;
		aInterfaceDef_3042 = null;
		aBool3043 = false;
		anInt2934 = -1418079215;
		anInt3045 = -1618015443;
		aBool3046 = false;
		anInt3044 = -70397561;
		anInt3121 = 1380790065;
		aBool3124 = false;
		anInt3050 = -718730433;
		anIntArray2964 = new int[32];
		anInt3052 = 0;
		itemContainerTriggers = new int[32];
		itemContainerTriggerptr = 0;
		skillIncreaseTriggers = new int[32];
		skillTriggerPtr = 0;
		anInt2874 = 0;
		anInt2990 = 0;
		anInt3014 = 0;
		anInt2980 = 0;
		anInt2929 = 0;
		anInt3062 = 0;
		anIntArray3063 = new int[2000];
		aStringArray2869 = new String[1000];
		anInt3065 = 0;
		scriptInvocationQueue = new JagexLinkedList();
		aJagexLinkedList_3067 = new JagexLinkedList();
		aJagexLinkedList_3068 = new JagexLinkedList();
		interfaceSettings = new JagexMap(512);
		anInt2894 = 0;
		anInt2985 = 1337494590;
		aBoolArray3072 = new boolean[100];
		aBoolArray2888 = new boolean[100];
		aBoolArray3129 = new boolean[100];
		anIntArray2876 = new int[100];
		anIntArray3076 = new int[100];
		anIntArray3077 = new int[100];
		anIntArray3078 = new int[100];
		anInt3079 = 0;
		aLong3080 = 0L;
		aBool3081 = true;
		anInt3082 = 994247345;
		anInt2995 = -1943197525;
		anIntArray3084 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		anInt3039 = 0;
		anInt3086 = 0;
		aString3096 = "";
		aLongArray2871 = new long[100];
		anInt3089 = 0;
		anInt2858 = 0;
		anIntArray2976 = new int[128];
		anIntArray3092 = new int[128];
		aLong3093 = 1468476784576452353L;
		aString3090 = null;
		aString2921 = null;
		anInt3058 = -1611844029;
		anInt3097 = 0;
		anIntArray3098 = new int[1000];
		anIntArray3135 = new int[1000];
		aClass109_Sub23_Sub14_Sub2Array3128 = new RenderedItemImage[1000];
		mapMarkerX = 0;
		mapMarkerZ = 0;
		anInt2901 = 0;
		anInt2951 = 2109930159;
		anInt3105 = 32697485;
		aBool2941 = false;
		anInt2954 = 631129145;
		anInt3108 = -1246157843;
		anInt3075 = 0;
		anIntArray3110 = new int[50];
		anIntArray3111 = new int[50];
		anIntArray3112 = new int[50];
		anIntArray3016 = new int[50];
		aClass8Array3114 = new Class8[50];
		aBool3083 = false;
		aBoolArray3116 = new boolean[5];
		anIntArray3117 = new int[5];
		anIntArray3118 = new int[5];
		anIntArray3119 = new int[5];
		anIntArray3120 = new int[5];
		aShort3106 = 256;
		aShort3122 = 205;
		aShort3123 = 256;
		aShort3024 = 320;
		aShort3125 = 1;
		aShort3126 = 32767;
		aShort3137 = 1;
		aShort3057 = 32767;
		anInt2944 = 0;
		anInt3099 = 0;
		anInt3131 = 0;
		anInt3033 = 0;
		anInt3133 = 0;
		anInt2984 = 0;
		anInt2898 = 0;
		aClass46Array3136 = new Class46[400];
		aClass115_2892 = new Class115();
		anInt3138 = 0;
		aClass41Array2895 = new Class41[400];
		aClass108_3140 = new Class108();
		anInt3141 = -327244321;
		anInt3088 = 1642680743;
		grandExchangeOffers = new GrandExchangeOffer[8];
	}

	static void method3508(Applet_Sub1 var0, int var1) {
		int var4;
		int var10;
		int var11;
		int var13;
		if (Class3.aBool69) {
			if (Class74.anInt903 * 332680755 == 1 || !Class46.aBool651 && Class74.anInt903 * 332680755 == 4) {
				var4 = 280 + Class3.anInt42 * -468945023;
				if (Class74.anInt891 * 1837550337 >= var4 && Class74.anInt891 * 1837550337 <= 14 + var4 && Class74.anInt905 * -1013575437 >= 4 && Class74.anInt905 * -1013575437 <= 18) {
					Class49.method708(0, 0, 1882649131);
				} else if (Class74.anInt891 * 1837550337 >= var4 + 15 && Class74.anInt891 * 1837550337 <= 80 + var4 && Class74.anInt905 * -1013575437 >= 4 && Class74.anInt905 * -1013575437 <= 18) {
					Class49.method708(0, 1, -1895665187);
				} else {
					var10 = 390 + Class3.anInt42 * -468945023;
					if (Class74.anInt891 * 1837550337 >= var10 && Class74.anInt891 * 1837550337 <= var10 + 14 && Class74.anInt905 * -1013575437 >= 4 && Class74.anInt905 * -1013575437 <= 18) {
						Class49.method708(1, 0, 1119413582);
					} else if (Class74.anInt891 * 1837550337 >= 15 + var10 && Class74.anInt891 * 1837550337 <= 80 + var10 && Class74.anInt905 * -1013575437 >= 4 && Class74.anInt905 * -1013575437 <= 18) {
						Class49.method708(1, 1, 543514357);
					} else {
						var13 = 500 + Class3.anInt42 * -468945023;
						if (Class74.anInt891 * 1837550337 >= var13 && Class74.anInt891 * 1837550337 <= var13 + 14 && Class74.anInt905 * -1013575437 >= 4 && Class74.anInt905 * -1013575437 <= 18) {
							Class49.method708(2, 0, -1178019331);
						} else if (Class74.anInt891 * 1837550337 >= 15 + var13 && Class74.anInt891 * 1837550337 <= var13 + 80 && Class74.anInt905 * -1013575437 >= 4 && Class74.anInt905 * -1013575437 <= 18) {
							Class49.method708(2, 1, -420624681);
						} else {
							var11 = 610 + Class3.anInt42 * -468945023;
							if (Class74.anInt891 * 1837550337 >= var11 && Class74.anInt891 * 1837550337 <= var11 + 14 && Class74.anInt905 * -1013575437 >= 4 && Class74.anInt905 * -1013575437 <= 18) {
								Class49.method708(3, 0, 1880779856);
							} else if (Class74.anInt891 * 1837550337 >= 15 + var11 && Class74.anInt891 * 1837550337 <= 80 + var11 && Class74.anInt905 * -1013575437 >= 4 && Class74.anInt905 * -1013575437 <= 18) {
								Class49.method708(3, 1, 1953864397);
							} else if (Class74.anInt891 * 1837550337 >= 708 + Class3.anInt42 * -468945023 && Class74.anInt905 * -1013575437 >= 4 && Class74.anInt891 * 1837550337 <= 708 + Class3.anInt42 * -468945023 + 50 && Class74.anInt905 * -1013575437 <= 20) {
								Class3.aBool69 = false;
								Class134.aClass109_Sub23_Sub14_Sub2_1599.method2995(Class3.anInt42 * -468945023, 0);
								Class3.aClass109_Sub23_Sub14_Sub2_45.method2995(382 + Class3.anInt42 * -468945023, 0);
								Class106.aClass109_Sub23_Sub14_Sub1_1475.method2972(382 + Class3.anInt42 * -468945023 - Class106.aClass109_Sub23_Sub14_Sub1_1475.anInt2585 / 2, 18);
							} else if (Class3.anInt70 * 624623853 != -1) {
								Class51 var17 = Class4.aClass51Array80[Class3.anInt70 * 624623853];
								Class56.method792(var17);
								Class3.aBool69 = false;
								Class134.aClass109_Sub23_Sub14_Sub2_1599.method2995(Class3.anInt42 * -468945023, 0);
								Class3.aClass109_Sub23_Sub14_Sub2_45.method2995(Class3.anInt42 * -468945023 + 382, 0);
								Class106.aClass109_Sub23_Sub14_Sub1_1475.method2972(382 + Class3.anInt42 * -468945023 - Class106.aClass109_Sub23_Sub14_Sub1_1475.anInt2585 / 2, 18);
							}
						}
					}
				}
			}

		} else {
			if ((Class74.anInt903 * 332680755 == 1 || !Class46.aBool651 && Class74.anInt903 * 332680755 == 4) && Class74.anInt891 * 1837550337 >= 765 + Class3.anInt42 * -468945023 - 50 && Class74.anInt905 * -1013575437 >= 453) {
				Class15.aClass35_195.aBool473 = !Class15.aClass35_195.aBool473;
				Class74.method1024(-1600199621);
				if (!Class15.aClass35_195.aBool473) {
					Class36.method488(Class46.aClass94_Sub1_652, "scape main", "", 255, false, (byte) 2);
				} else {
					Class100.method1259((byte) 18);
				}
			}

			if (anInt2868 * -684224463 != 5) {
				Class3.anInt53 -= 2005965371;
				if (anInt2868 * -684224463 == 10 || anInt2868 * -684224463 == 11) {
					if (anInt2865 * 1017874057 == 0) {
						if (Class74.anInt903 * 332680755 == 1 || !Class46.aBool651 && Class74.anInt903 * 332680755 == 4) {
							var4 = 5 + Class3.anInt42 * -468945023;
							short var2 = 463;
							byte var5 = 100;
							byte var3 = 35;
							if (Class74.anInt891 * 1837550337 >= var4 && Class74.anInt891 * 1837550337 <= var5 + var4 && Class74.anInt905 * -1013575437 >= var2 && Class74.anInt905 * -1013575437 <= var3 + var2) {
								if (Class61.method816((byte) -65)) {
									Class3.aBool69 = true;
								}

								return;
							}
						}

						if (Class48.aClass44_673 != null && Class61.method816((byte) 49)) {
							Class3.aBool69 = true;
						}
					}

					var4 = Class74.anInt903 * 332680755;
					var10 = Class74.anInt891 * 1837550337;
					var13 = Class74.anInt905 * -1013575437;
					if (!Class46.aBool651 && var4 == 4) {
						var4 = 1;
					}

					short var7;
					if (Class3.anInt57 * -1261736495 == 0) {
						var11 = Class3.anInt47 * 23501379 + 180 - 80;
						var7 = 291;
						if (var4 == 1 && var10 >= var11 - 75 && var10 <= 75 + var11 && var13 >= var7 - 20 && var13 <= 20 + var7) {
							Class89.method1120(ScriptInvocation.method1836("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, -982469919);
						}

						var11 = 180 + Class3.anInt47 * 23501379 + 80;
						if (var4 == 1 && var10 >= var11 - 75 && var10 <= var11 + 75 && var13 >= var7 - 20 && var13 <= 20 + var7) {
							if ((anInt2860 * -456057453 & 4) != 0) {
								if ((anInt2860 * -456057453 & 1024) != 0) {
									Class3.aString58 = Class90.aString1277;
									Class3.aString59 = Class90.aString1211;
									Class3.aString60 = Class90.aString1279;
								} else {
									Class3.aString58 = Class90.aString1143;
									Class3.aString59 = Class90.aString1227;
									Class3.aString60 = Class90.aString1273;
								}

								Class3.anInt57 = -807924943;
								Class3.anInt65 = 0;
							} else if ((anInt2860 * -456057453 & 1024) != 0) {
								Class3.aString58 = Class90.aString1274;
								Class3.aString59 = Class90.aString1275;
								Class3.aString60 = Class90.aString1194;
								Class3.anInt57 = -807924943;
								Class3.anInt65 = 0;
							} else {
								Class3.aString58 = Class90.aString1267;
								Class3.aString59 = Class90.aString1268;
								Class3.aString60 = Class90.aString1269;
								Class3.anInt57 = -1615849886;
								Class3.anInt65 = 0;
							}
						}
					} else if (Class3.anInt57 * -1261736495 != 1) {
						short var12;
						if (Class3.anInt57 * -1261736495 == 2) {
							var12 = 231;
							var11 = var12 + 30;
							if (var4 == 1 && var13 >= var11 - 15 && var13 < var11) {
								Class3.anInt65 = 0;
							}

							var11 += 15;
							if (var4 == 1 && var13 >= var11 - 15 && var13 < var11) {
								Class3.anInt65 = 510740173;
							}

							var11 += 15;
							var12 = 361;
							if (var4 == 1 && var13 >= var12 - 15 && var13 < var12) {
								CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1298, Class90.aString1195, Class90.aString1300);
								Class3.anInt57 = 255342581;
								return;
							}

							int var15 = 180 + Class3.anInt47 * 23501379 - 80;
							short var8 = 321;
							if (var4 == 1 && var10 >= var15 - 75 && var10 <= 75 + var15 && var13 >= var8 - 20 && var13 <= 20 + var8) {
								Class3.aString55 = Class3.aString55.trim();
								if (Class3.aString55.length() == 0) {
									CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1173, Class90.aString1176, Class90.aString1174);
									return;
								}

								if (Class3.password.length() == 0) {
									CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1116, Class90.aString1177, Class90.aString1178);
									return;
								}

								CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1282, Class90.aString1283, Class90.aString1284);
								Class3.aClass85_68 = Class15.aClass35_195.aLinkedHashMap475.containsKey(Integer.valueOf(CacheableEntry_Sub23_Sub19.method2828(Class3.aString55))) ? Class85.aClass85_1006 : Class85.aClass85_1009;
								Class93.method1146(20, 1966427120);
								return;
							}

							var15 = 80 + 180 + Class3.anInt47 * 23501379;
							if (var4 == 1 && var10 >= var15 - 75 && var10 <= 75 + var15 && var13 >= var8 - 20 && var13 <= 20 + var8) {
								Class3.anInt57 = 0;
								Class3.aString55 = "";
								Class3.password = "";
								Class107.anInt1499 = 0;
								Class126_Sub1.aString1646 = "";
								Class3.aBool75 = true;
							}

							while (true) {
								while (Class6.method153((byte) 0)) {
									boolean var6 = false;

									for (int var9 = 0; var9 < Class3.aString48.length(); var9++) {
										if (Class41.aChar594 == Class3.aString48.charAt(var9)) {
											var6 = true;
											break;
										}
									}

									if (Class47.anInt661 * 875997027 == 13) {
										Class3.anInt57 = 0;
										Class3.aString55 = "";
										Class3.password = "";
										Class107.anInt1499 = 0;
										Class126_Sub1.aString1646 = "";
										Class3.aBool75 = true;
									} else if (Class3.anInt65 * -763095547 == 0) {
										if (Class47.anInt661 * 875997027 == 85 && Class3.aString55.length() > 0) {
											Class3.aString55 = Class3.aString55.substring(0, Class3.aString55.length() - 1);
										}

										if (Class47.anInt661 * 875997027 == 84 || Class47.anInt661 * 875997027 == 80) {
											Class3.anInt65 = 510740173;
										}

										if (var6 && Class3.aString55.length() < 320) {
											Class3.aString55 = Class3.aString55 + Class41.aChar594;
										}
									} else if (Class3.anInt65 * -763095547 == 1) {
										if (Class47.anInt661 * 875997027 == 85 && Class3.password.length() > 0) {
											Class3.password = Class3.password.substring(0, Class3.password.length() - 1);
										}

										if (Class47.anInt661 * 875997027 == 84 || Class47.anInt661 * 875997027 == 80) {
											Class3.anInt65 = 0;
										}

										if (Class47.anInt661 * 875997027 == 84) {
											Class3.aString55 = Class3.aString55.trim();
											if (Class3.aString55.length() == 0) {
												CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1173, Class90.aString1176, Class90.aString1174);
												return;
											}

											if (Class3.password.length() == 0) {
												CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1116, Class90.aString1177, Class90.aString1178);
												return;
											}

											CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1282, Class90.aString1283, Class90.aString1284);
											Class3.aClass85_68 = Class15.aClass35_195.aLinkedHashMap475.containsKey(Integer.valueOf(CacheableEntry_Sub23_Sub19.method2828(Class3.aString55))) ? Class85.aClass85_1006 : Class85.aClass85_1009;
											Class93.method1146(20, 2118106909);
											return;
										}

										if (var6 && Class3.password.length() < 20) {
											Class3.password = Class3.password + Class41.aChar594;
										}
									}
								}

								return;
							}
						} else {
							int var14;
							boolean var16;
							if (Class3.anInt57 * -1261736495 == 4) {
								var11 = Class3.anInt47 * 23501379 + 180 - 80;
								var7 = 321;
								if (var4 == 1 && var10 >= var11 - 75 && var10 <= 75 + var11 && var13 >= var7 - 20 && var13 <= 20 + var7) {
									Class126_Sub1.aString1646.trim();
									if (Class126_Sub1.aString1646.length() != 6) {
										CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1191, Class90.aString1090, Class90.aString1237);
										return;
									}

									Class107.anInt1499 = Integer.parseInt(Class126_Sub1.aString1646) * 1721221401;
									Class126_Sub1.aString1646 = "";
									Class3.aClass85_68 = Class3.aBool75 ? Class85.aClass85_1013 : Class85.aClass85_1007;
									CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1282, Class90.aString1283, Class90.aString1284);
									Class93.method1146(20, 2027716131);
									return;
								}

								if (var4 == 1 && var10 >= Class3.anInt47 * 23501379 + 180 - 9 && var10 <= 180 + Class3.anInt47 * 23501379 + 130 && var13 >= 263 && var13 <= 296) {
									Class3.aBool75 = !Class3.aBool75;
								}

								if (var4 == 1 && var10 >= Class3.anInt47 * 23501379 + 180 - 34 && var10 <= 180 + Class3.anInt47 * 23501379 + 34 && var13 >= 351 && var13 <= 363) {
									Class89.method1120(ScriptInvocation.method1836("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false, -982469919);
								}

								var11 = Class3.anInt47 * 23501379 + 180 + 80;
								if (var4 == 1 && var10 >= var11 - 75 && var10 <= 75 + var11 && var13 >= var7 - 20 && var13 <= 20 + var7) {
									Class3.anInt57 = 0;
									Class3.aString55 = "";
									Class3.password = "";
									Class107.anInt1499 = 0;
									Class126_Sub1.aString1646 = "";
								}

								while (Class6.method153((byte) 0)) {
									var16 = false;

									for (var14 = 0; var14 < Class3.aString54.length(); var14++) {
										if (Class41.aChar594 == Class3.aString54.charAt(var14)) {
											var16 = true;
											break;
										}
									}

									if (Class47.anInt661 * 875997027 == 13) {
										Class3.anInt57 = 0;
										Class3.aString55 = "";
										Class3.password = "";
										Class107.anInt1499 = 0;
										Class126_Sub1.aString1646 = "";
									} else {
										if (Class47.anInt661 * 875997027 == 85 && Class126_Sub1.aString1646.length() > 0) {
											Class126_Sub1.aString1646 = Class126_Sub1.aString1646.substring(0, Class126_Sub1.aString1646.length() - 1);
										}

										if (Class47.anInt661 * 875997027 == 84) {
											Class126_Sub1.aString1646.trim();
											if (Class126_Sub1.aString1646.length() != 6) {
												CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1191, Class90.aString1090, Class90.aString1237);
												return;
											}

											Class107.anInt1499 = Integer.parseInt(Class126_Sub1.aString1646) * 1721221401;
											Class126_Sub1.aString1646 = "";
											Class3.aClass85_68 = Class3.aBool75 ? Class85.aClass85_1013 : Class85.aClass85_1007;
											CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1282, Class90.aString1283, Class90.aString1284);
											Class93.method1146(20, 2146011690);
											return;
										}

										if (var16 && Class126_Sub1.aString1646.length() < 6) {
											Class126_Sub1.aString1646 = Class126_Sub1.aString1646 + Class41.aChar594;
										}
									}
								}
							} else if (Class3.anInt57 * -1261736495 == 5) {
								var11 = 180 + Class3.anInt47 * 23501379 - 80;
								var7 = 321;
								if (var4 == 1 && var10 >= var11 - 75 && var10 <= var11 + 75 && var13 >= var7 - 20 && var13 <= 20 + var7) {
									Class6.method143(2115531962);
									return;
								}

								var11 = 80 + Class3.anInt47 * 23501379 + 180;
								if (var4 == 1 && var10 >= var11 - 75 && var10 <= 75 + var11 && var13 >= var7 - 20 && var13 <= var7 + 20) {
									Class3.aString58 = Class90.aString1267;
									Class3.aString59 = Class90.aString1268;
									Class3.aString60 = Class90.aString1269;
									Class3.anInt57 = -1615849886;
									Class3.anInt65 = 0;
									Class3.password = "";
								}

								while (Class6.method153((byte) 0)) {
									var16 = false;

									for (var14 = 0; var14 < Class3.aString48.length(); var14++) {
										if (Class41.aChar594 == Class3.aString48.charAt(var14)) {
											var16 = true;
											break;
										}
									}

									if (Class47.anInt661 * 875997027 == 13) {
										Class3.aString58 = Class90.aString1267;
										Class3.aString59 = Class90.aString1268;
										Class3.aString60 = Class90.aString1269;
										Class3.anInt57 = -1615849886;
										Class3.anInt65 = 0;
										Class3.password = "";
									} else {
										if (Class47.anInt661 * 875997027 == 85 && Class3.aString55.length() > 0) {
											Class3.aString55 = Class3.aString55.substring(0, Class3.aString55.length() - 1);
										}

										if (Class47.anInt661 * 875997027 == 84) {
											Class6.method143(1758781412);
											return;
										}

										if (var16 && Class3.aString55.length() < 320) {
											Class3.aString55 = Class3.aString55 + Class41.aChar594;
										}
									}
								}
							} else if (Class3.anInt57 * -1261736495 == 6) {
								while (true) {
									do {
										if (!Class6.method153((byte) 0)) {
											var12 = 321;
											if (var4 == 1 && var13 >= var12 - 20 && var13 <= 20 + var12) {
												Class3.aString58 = Class90.aString1267;
												Class3.aString59 = Class90.aString1268;
												Class3.aString60 = Class90.aString1269;
												Class3.anInt57 = -1615849886;
												Class3.anInt65 = 0;
												Class3.password = "";
											}

											return;
										}
									} while (Class47.anInt661 * 875997027 != 84 && Class47.anInt661 * 875997027 != 13);

									Class3.aString58 = Class90.aString1267;
									Class3.aString59 = Class90.aString1268;
									Class3.aString60 = Class90.aString1269;
									Class3.anInt57 = -1615849886;
									Class3.anInt65 = 0;
									Class3.password = "";
								}
							}
						}
					} else {
						while (Class6.method153((byte) 0)) {
							if (Class47.anInt661 * 875997027 == 84) {
								Class3.aString58 = Class90.aString1267;
								Class3.aString59 = Class90.aString1268;
								Class3.aString60 = Class90.aString1269;
								Class3.anInt57 = -1615849886;
								Class3.anInt65 = 0;
							} else if (Class47.anInt661 * 875997027 == 13) {
								Class3.anInt57 = 0;
							}
						}

						var11 = Class3.anInt47 * 23501379 + 180 - 80;
						var7 = 321;
						if (var4 == 1 && var10 >= var11 - 75 && var10 <= 75 + var11 && var13 >= var7 - 20 && var13 <= 20 + var7) {
							Class3.aString58 = Class90.aString1267;
							Class3.aString59 = Class90.aString1268;
							Class3.aString60 = Class90.aString1269;
							Class3.anInt57 = -1615849886;
							Class3.anInt65 = 0;
						}

						var11 = 80 + 180 + Class3.anInt47 * 23501379;
						if (var4 == 1 && var10 >= var11 - 75 && var10 <= 75 + var11 && var13 >= var7 - 20 && var13 <= var7 + 20) {
							Class3.anInt57 = 0;
						}
					}

				}
			}
		}
	}

	protected final void method3414(int var1) {
		boolean var2;
		label285:
		{
			try {
				if (Class104.anInt1454 * 216145519 == 2) {
					if (CacheableEntry_Sub23_Sub16_Sub7.aClass109_Sub17_2781 == null) {
						CacheableEntry_Sub23_Sub16_Sub7.aClass109_Sub17_2781 = LinkedEntry_Sub17.method2115(Class104.aIndexDescriptor_1457, Class104.anInt1459 * -853454469, Class104.anInt1458 * -1483716129);
						if (CacheableEntry_Sub23_Sub16_Sub7.aClass109_Sub17_2781 == null) {
							var2 = false;
							break label285;
						}
					}

					if (Class80.aClass6_956 == null) {
						Class80.aClass6_956 = new Class6(Class104.aIndexDescriptor_1452, Class104.aIndexDescriptor_1451);
					}

					if (Class104.aClass109_Sub5_Sub4_1453.method2849(CacheableEntry_Sub23_Sub16_Sub7.aClass109_Sub17_2781, Class104.aIndexDescriptor_1456, Class80.aClass6_956, 22050, 1423463568)) {
						Class104.aClass109_Sub5_Sub4_1453.method2889(-466334053);
						Class104.aClass109_Sub5_Sub4_1453.method2837(Class104.anInt1450 * 1521159847, (byte) 0);
						Class104.aClass109_Sub5_Sub4_1453.method2842(CacheableEntry_Sub23_Sub16_Sub7.aClass109_Sub17_2781, Class99.aBool1407, -621869226);
						Class104.anInt1454 = 0;
						CacheableEntry_Sub23_Sub16_Sub7.aClass109_Sub17_2781 = null;
						Class80.aClass6_956 = null;
						Class104.aIndexDescriptor_1457 = null;
						var2 = true;
						break label285;
					}
				}
			} catch (Exception var20) {
				var20.printStackTrace();
				Class104.aClass109_Sub5_Sub4_1453.method2843((byte) 65);
				Class104.anInt1454 = 0;
				CacheableEntry_Sub23_Sub16_Sub7.aClass109_Sub17_2781 = null;
				Class80.aClass6_956 = null;
				Class104.aIndexDescriptor_1457 = null;
			}

			var2 = false;
		}

		if (var2 && aBool2941 && CacheableEntry_Sub23_Sub6.aClass2_2200 != null) {
			CacheableEntry_Sub23_Sub6.aClass2_2200.method62(1403343118);
		}

		if (anInt2868 * -684224463 == 10 || anInt2868 * -684224463 == 20 || anInt2868 * -684224463 == 30) {
			if (4890424432757411589L * aLong3080 != 0L && Class10.method216((short) 255) > aLong3080 * 4890424432757411589L) {
				int var21 = LinkedEntry_Sub5_Sub4.method2933(916322624);
				aLong3080 = 0L;
				if (var21 >= 2) {
					aBool3081 = true;
				} else {
					aBool3081 = false;
				}

				EnumDef.method2353(-476741378);
				if (anInt2868 * -684224463 >= 25) {
					secureBuffer.writeOpcode(141);
					secureBuffer.writeByte(LinkedEntry_Sub5_Sub4.method2933(-523850341));
					secureBuffer.writeShort(Class5.anInt98 * 2104430923);
					secureBuffer.writeShort(Class60.anInt769 * -1064642111);
				}

				aBool2849 = true;
			} else if (aBool2853) {
				LinkedEntry_Sub9.method1833(Class60.aCanvas771, (byte) 32);
				Canvas var4 = Class60.aCanvas771;
				var4.removeMouseListener(Class74.aClass74_901);
				var4.removeMouseMotionListener(Class74.aClass74_901);
				var4.removeFocusListener(Class74.aClass74_901);
				Class74.anInt902 = 0;
				if (Class36.aClass72_489 != null) {
					Class36.aClass72_489.method954(Class60.aCanvas771, 1073201912);
				}

				aGameClient2857.method3401(1389930970);
				Class60.aCanvas771.setBackground(Color.black);
				Canvas var5 = Class60.aCanvas771;
				var5.setFocusTraversalKeysEnabled(false);
				var5.addKeyListener(Class65.aClass65_819);
				var5.addFocusListener(Class65.aClass65_819);
				Canvas var6 = Class60.aCanvas771;
				var6.addMouseListener(Class74.aClass74_901);
				var6.addMouseMotionListener(Class74.aClass74_901);
				var6.addFocusListener(Class74.aClass74_901);
				if (Class36.aClass72_489 != null) {
					Class36.aClass72_489.method953(Class60.aCanvas771, (byte) 50);
				}

				if (activeRoot * 1787246131 != -1) {
					CacheableEntry_Sub23_Sub16_Sub7.method3298(false, (byte) -99);
				}

				aBool2852 = true;
			}
		}

		Dimension var22 = method3417((byte) -15);
		if (var22.width != Class2.anInt17 * 1822130227 || var22.height != CacheableEntry_Sub23_Sub16_Sub1.anInt2503 * -733282123 || aBool2852) {
			EnumDef.method2353(-476741378);
			aLong3080 = (Class10.method216((short) 255) + 500L) * 2121214902543181261L;
			aBool2852 = false;
		}

		boolean var23 = false;
		int var24;
		if (aBool2849) {
			aBool2849 = false;
			var23 = true;

			for (var24 = 0; var24 < 100; var24++) {
				aBoolArray3072[var24] = true;
			}
		}

		if (var23) {
			Class32.method464(-1515195159);
		}

		int var7;
		if (anInt2868 * -684224463 == 0) {
			Class31.method413(Class3.anInt66 * 719550867, Class3.aString56, (Color) null, var23, (byte) 79);
		} else if (anInt2868 * -684224463 == 5) {
			PacketEncoder.method922(Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343, Class23.aClass109_Sub23_Sub14_Sub4_Sub1_309, Class44.aClass109_Sub23_Sub14_Sub4_Sub1_621, var23, (byte) -20);
		} else if (anInt2868 * -684224463 != 10 && anInt2868 * -684224463 != 11) {
			if (anInt2868 * -684224463 == 20) {
				PacketEncoder.method922(Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343, Class23.aClass109_Sub23_Sub14_Sub4_Sub1_309, Class44.aClass109_Sub23_Sub14_Sub4_Sub1_621, var23, (byte) -2);
			} else if (anInt2868 * -684224463 == 25) {
				if (anInt2862 * 1765953983 == 1) {
					if (anInt2918 * 1226769729 > anInt3115 * -1773605997) {
						anInt3115 = anInt2918 * -975398821;
					}

					var24 = (anInt3115 * 1514013366 - anInt2918 * 1208944306) / (anInt3115 * -1773605997);
					Class53.method780(Class90.aString1082 + Class37.BR + Class37.BRACK_OPEN + var24 + "%" + Class37.BRACK_CLOSE, false, -1714673297);
				} else if (anInt2862 * 1765953983 == 2) {
					if (anInt2920 * 2022338491 > anInt3127 * -980029277) {
						anInt3127 = anInt2920 * -1436238327;
					}

					var24 = 50 + (anInt3127 * -1756823594 - anInt2920 * -1962290554) / (anInt3127 * -980029277);
					Class53.method780(Class90.aString1082 + Class37.BR + Class37.BRACK_OPEN + var24 + "%" + Class37.BRACK_CLOSE, false, -1714673297);
				} else {
					Class53.method780(Class90.aString1082, false, -1714673297);
				}
			} else if (anInt2868 * -684224463 == 30) {
				if (activeRoot * 1787246131 != -1) {
					Class60.method814(activeRoot * 1787246131, -621512993);
				}

				for (var24 = 0; var24 < anInt2894 * -2099955589; var24++) {
					if (aBoolArray3072[var24]) {
						aBoolArray2888[var24] = true;
					}

					aBoolArray3129[var24] = aBoolArray3072[var24];
					aBoolArray3072[var24] = false;
				}

				anInt2985 = cycle * -90122983;
				anInt3060 = 276627093;
				anInt3074 = 1244965977;
				Class41.aInterfaceDef_596 = null;
				if (activeRoot * 1787246131 != -1) {
					anInt2894 = 0;
					Class28.method394(activeRoot * 1787246131, 0, 0, Class5.anInt98 * 2104430923, Class60.anInt769 * -1064642111, 0, 0, -1, 420878521);
				}

				CacheableEntry_Sub23_Sub14.method2711();
				int var9;
				if (!aBool3006) {
					if (anInt3060 * 1187980099 != -1) {
						var24 = anInt3060 * 1187980099;
						var7 = anInt3074 * -1807211497;
						if (menuActionPtr * 1324290403 >= 2 || anInt3018 * -1710049223 != 0 || isPickingOption) {
							String var25;
							if (anInt3018 * -1710049223 == 1 && menuActionPtr * 1324290403 < 2) {
								var25 = Class90.USE + Class90.aString1216 + aString3019 + " " + Class37.ARROW_RIGHT;
							} else if (isPickingOption && menuActionPtr * 1324290403 < 2) {
								var25 = currentInterfaceAction + Class90.aString1216 + aString2967 + " " + Class37.ARROW_RIGHT;
							} else {
								var9 = menuActionPtr * 1324290403 - 1;
								String var27;
								if (menuOptionTexts[var9].length() > 0) {
									var27 = menuOptions[var9] + Class90.aString1216 + menuOptionTexts[var9];
								} else {
									var27 = menuOptions[var9];
								}

								var25 = var27;
							}

							if (menuActionPtr * 1324290403 > 2) {
								var25 = var25 + Class22.hexColTag(16777215) + " " + '/' + " " + (menuActionPtr * 1324290403 - 2) + Class90.MORE_OPTIONS;
							}

							Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343.method3323(var25, var24 + 4, 15 + var7, 16777215, 0, cycle * 1026470457 / 1000);
						}
					}
				} else {
					var24 = LinkedEntry_Sub6.anInt1731 * 681506315;
					var7 = CacheableEntry_Sub23_Sub16_Sub7.anInt2779 * 1953108583;
					int var8 = Class3.anInt74 * 1712819025;
					int var10 = CacheableEntry_Sub23_Sub16_Sub2.anInt2568 * -2090618933;
					var9 = 6116423;
					CacheableEntry_Sub23_Sub14.method2718(var24, var7, var8, var10, var9);
					CacheableEntry_Sub23_Sub14.method2718(var24 + 1, var7 + 1, var8 - 2, 16, 0);
					CacheableEntry_Sub23_Sub14.method2720(var24 + 1, 18 + var7, var8 - 2, var10 - 19, 0);
					Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343.method3316(Class90.CHOOSE_OPTION, var24 + 3, var7 + 14, var9, -1);
					int var11 = Class74.anInt897 * -1031552075;
					int var12 = Class74.anInt898 * 1941423145;

					for (int var13 = 0; var13 < menuActionPtr * 1324290403; var13++) {
						int var14 = var7 + 31 + (menuActionPtr * 1324290403 - 1 - var13) * 15;
						int var15 = 16777215;
						if (var11 > var24 && var11 < var8 + var24 && var12 > var14 - 13 && var12 < 3 + var14) {
							var15 = 16776960;
						}

						CacheableEntry_Sub23_Sub14_Sub4_Sub1 var16 = Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343;
						String var17;
						if (menuOptionTexts[var13].length() > 0) {
							var17 = menuOptions[var13] + Class90.aString1216 + menuOptionTexts[var13];
						} else {
							var17 = menuOptions[var13];
						}

						var16.method3316(var17, 3 + var24, var14, var15, 0);
					}

					CacheableEntry_Sub23_Sub16.method2788(LinkedEntry_Sub6.anInt1731 * 681506315, CacheableEntry_Sub23_Sub16_Sub7.anInt2779 * 1953108583, Class3.anInt74 * 1712819025, CacheableEntry_Sub23_Sub16_Sub2.anInt2568 * -2090618933, (byte) 127);
				}

				if (anInt3079 * 1189118443 == 3) {
					for (var24 = 0; var24 < anInt2894 * -2099955589; var24++) {
						if (aBoolArray3129[var24]) {
							CacheableEntry_Sub23_Sub14.method2717(anIntArray2876[var24], anIntArray3076[var24], anIntArray3077[var24], anIntArray3078[var24], 16711935, 128);
						} else if (aBoolArray2888[var24]) {
							CacheableEntry_Sub23_Sub14.method2717(anIntArray2876[var24], anIntArray3076[var24], anIntArray3077[var24], anIntArray3078[var24], 16711680, 128);
						}
					}
				}

				Class44.method677(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, Player.me.anInt2521 * -1051150961, Player.me.anInt2505 * -844883935, anInt2939 * -880137347, (byte) 80);
				anInt2939 = 0;
			} else if (anInt2868 * -684224463 == 40) {
				Class53.method780(Class90.aString1089 + Class37.BR + Class90.aString1068, false, -1714673297);
			} else if (anInt2868 * -684224463 == 45) {
				Class53.method780(Class90.PLEASE_WAIT, false, -1714673297);
			}
		} else {
			PacketEncoder.method922(Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343, Class23.aClass109_Sub23_Sub14_Sub4_Sub1_309, Class44.aClass109_Sub23_Sub14_Sub4_Sub1_621, var23, (byte) 1);
		}

		Graphics var26;
		if (anInt2868 * -684224463 == 30 && anInt3079 * 1189118443 == 0 && !var23) {
			try {
				var26 = Class60.aCanvas771.getGraphics();

				for (var7 = 0; var7 < anInt2894 * -2099955589; var7++) {
					if (aBoolArray2888[var7]) {
						Class72.aClass7_871.method164(var26, anIntArray2876[var7], anIntArray3076[var7], anIntArray3077[var7], anIntArray3078[var7], (byte) 54);
						aBoolArray2888[var7] = false;
					}
				}
			} catch (Exception var19) {
				Class60.aCanvas771.repaint();
			}
		} else if (anInt2868 * -684224463 > 0) {
			try {
				var26 = Class60.aCanvas771.getGraphics();
				Class72.aClass7_871.method160(var26, 0, 0, 1475498425);

				for (var7 = 0; var7 < anInt2894 * -2099955589; var7++) {
					aBoolArray2888[var7] = false;
				}
			} catch (Exception var18) {
				Class60.aCanvas771.repaint();
			}
		}

	}

	protected final void method3481(int var1) {
	}

	static IndexDescriptor_Sub1 method3552(int var0, boolean var1, boolean var2, boolean var3, int var4) {
		PacketEncoder var5 = null;
		if (Class83.aClass139_994 != null) {
			var5 = new PacketEncoder(var0, Class83.aClass139_994, Class58.aClass139Array757[var0], 1000000);
		}

		return new IndexDescriptor_Sub1(var5, CacheableEntry_Sub23_Sub18.aClass68_2445, var0, var1, var2, var3);
	}

	public static void method3561(boolean var0, byte var1) {
		if (Class97.aConnection_1393 != null) {
			try {
				DataBuffer var2 = new DataBuffer(4);
				var2.writeByte(var0 ? 2 : 3);
				var2.writeTriByte(0);
				Class97.aConnection_1393.write(var2.data, 0, 4);
			} catch (IOException var5) {
				try {
					Class97.aConnection_1393.terminate();
				} catch (Exception var4) {
					;
				}

				Class97.anInt1387 += 629140595;
				Class97.aConnection_1393 = null;
			}

		}
	}

	public static final Class2 method3639(Class73 var0, Component var1, int var2, int var3, byte var4) {
		if (Class2.anInt34 * -46901051 == 0) {
			throw new IllegalStateException();
		} else if (var2 >= 0 && var2 < 2) {
			if (var3 < 256) {
				var3 = 256;
			}

			try {
				Class2_Sub2 var8 = new Class2_Sub2();
				var8.anIntArray21 = new int[(Class2.aBool19 ? 2 : 1) * 256];
				var8.anInt31 = var3 * -582636057;
				var8.method55(var1);
				var8.anInt25 = ((var3 & -1024) + 1024) * -1384104685;
				if (var8.anInt25 * -1450371813 > 16384) {
					var8.anInt25 = 256163840;
				}

				var8.method95(var8.anInt25 * -1450371813);
				if (Class2.anInt18 * -1683473421 > 0 && Class2.aClass15_39 == null) {
					Class2.aClass15_39 = new Class15();
					Class2.aClass15_39.aClass73_186 = var0;
					var0.submitRunnable(Class2.aClass15_39, Class2.anInt18 * -1683473421, (byte) 7);
				}

				if (Class2.aClass15_39 != null) {
					if (Class2.aClass15_39.aClass2Array187[var2] != null) {
						throw new IllegalArgumentException();
					}

					Class2.aClass15_39.aClass2Array187[var2] = var8;
				}

				return var8;
			} catch (Throwable var7) {
				try {
					Class2_Sub1 var5 = new Class2_Sub1(var0, var2);
					var5.anIntArray21 = new int[(Class2.aBool19 ? 2 : 1) * 256];
					var5.anInt31 = var3 * -582636057;
					var5.method55(var1);
					var5.anInt25 = 256163840;
					var5.method95(var5.anInt25 * -1450371813);
					if (Class2.anInt18 * -1683473421 > 0 && Class2.aClass15_39 == null) {
						Class2.aClass15_39 = new Class15();
						Class2.aClass15_39.aClass73_186 = var0;
						var0.submitRunnable(Class2.aClass15_39, Class2.anInt18 * -1683473421, (byte) 7);
					}

					if (Class2.aClass15_39 != null) {
						if (Class2.aClass15_39.aClass2Array187[var2] != null) {
							throw new IllegalArgumentException();
						}

						Class2.aClass15_39.aClass2Array187[var2] = var5;
					}

					return var5;
				} catch (Throwable var6) {
					return new Class2();
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	static final int method3775(int var0, int var1, int var2, int var3) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var4 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var4;
	}

	static final boolean method3792(int var0, byte var1) {
		if (var0 < 0) {
			return false;
		} else {
			int var2 = menuCommands[var0];
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			return var2 == 1007;
		}
	}

	static final void method3793(int var0) {
		Class35.method484(aInterfaceDef_3038, -461471582);
		Class44.anInt635 += 136802995;
		if (aBool3046 && aBool3043) {
			int var1 = Class74.anInt897 * -1031552075;
			int var2 = Class74.anInt898 * 1941423145;
			var1 -= anInt3040 * 493969285;
			var2 -= anInt3085 * -1974758323;
			if (var1 < anInt2934 * 456811279) {
				var1 = anInt2934 * 456811279;
			}

			if (aInterfaceDef_3038.anInt1954 * 2096072399 + var1 > anInt2934 * 456811279 + aInterfaceDef_3036.anInt1954 * 2096072399) {
				var1 = aInterfaceDef_3036.anInt1954 * 2096072399 + anInt2934 * 456811279 - aInterfaceDef_3038.anInt1954 * 2096072399;
			}

			if (var2 < anInt3045 * -1802796197) {
				var2 = anInt3045 * -1802796197;
			}

			if (var2 + aInterfaceDef_3038.invsize * 539675235 > anInt3045 * -1802796197 + aInterfaceDef_3036.invsize * 539675235) {
				var2 = aInterfaceDef_3036.invsize * 539675235 + anInt3045 * -1802796197 - aInterfaceDef_3038.invsize * 539675235;
			}

			int var4 = var1 - anInt3044 * -409412663;
			int var5 = var2 - anInt3121 * 568342063;
			int var3 = aInterfaceDef_3038.anInt2052 * 1658015637;
			if (Class44.anInt635 * 1969654907 > aInterfaceDef_3038.anInt2014 * 244194293 && (var4 > var3 || var4 < -var3 || var5 > var3 || var5 < -var3)) {
				aBool3124 = true;
			}

			int var7 = var1 - anInt2934 * 456811279 + aInterfaceDef_3036.anInt2070 * 706996303;
			int var8 = var2 - anInt3045 * -1802796197 + aInterfaceDef_3036.anInt2038 * -650026719;
			ScriptInvocation var6;
			if (aInterfaceDef_3038.anObjectArray2026 != null && aBool3124) {
				var6 = new ScriptInvocation();
				var6.inter = aInterfaceDef_3038;
				var6.anInt1770 = var7 * -2053567695;
				var6.anInt1776 = var8 * 1536383743;
				var6.parameters = aInterfaceDef_3038.anObjectArray2026;
				InterfaceDef.method2182(var6, -78970283);
			}

			if (Class74.anInt896 * 445478637 == 0) {
				if (aBool3124) {
					if (aInterfaceDef_3038.anObjectArray2027 != null) {
						var6 = new ScriptInvocation();
						var6.inter = aInterfaceDef_3038;
						var6.anInt1770 = var7 * -2053567695;
						var6.anInt1776 = var8 * 1536383743;
						var6.aInterfaceDef_1774 = aInterfaceDef_3042;
						var6.parameters = aInterfaceDef_3038.anObjectArray2027;
						InterfaceDef.method2182(var6, 262826454);
					}

					if (aInterfaceDef_3042 != null && CacheableEntry_Sub23_Sub16_Sub4.method3074(aInterfaceDef_3038, -1592922968) != null) {
						secureBuffer.writeOpcode(50);
						secureBuffer.writeLEShortA(aInterfaceDef_3042.anInt2057 * -181409537);
						secureBuffer.writeLEShortA(aInterfaceDef_3038.anInt2057 * -181409537);
						secureBuffer.writeShort(aInterfaceDef_3042.slot * -1395083971);
						secureBuffer.writeShort(aInterfaceDef_3038.slot * -1395083971);
						secureBuffer.writeIntv2(aInterfaceDef_3038.hash * 1582464481);
						secureBuffer.writeIntv2(aInterfaceDef_3042.hash * 1582464481);
					}
				} else if ((anInt3005 * -696348949 == 1 || method3792(menuActionPtr * 1324290403 - 1, (byte) 1)) && menuActionPtr * 1324290403 > 2) {
					CacheableEntry_Sub23_Sub16_Sub4.method3067(anInt3040 * 493969285 + anInt3044 * -409412663, anInt3121 * 568342063 + anInt3085 * -1974758323, -1717111969);
				} else if (menuActionPtr * 1324290403 > 0) {
					Class29.method395(anInt3040 * 493969285 + anInt3044 * -409412663, anInt3121 * 568342063 + anInt3085 * -1974758323, 832789918);
				}

				aInterfaceDef_3038 = null;
			}

		} else {
			if (Class44.anInt635 * 1969654907 > 1) {
				aInterfaceDef_3038 = null;
			}

		}
	}

}
