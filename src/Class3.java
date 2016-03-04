public class Class3 {

	static CacheableEntry_Sub23_Sub14_Sub1 aClass109_Sub23_Sub14_Sub1_41;
	static CacheableEntry_Sub23_Sub14_Sub1 aClass109_Sub23_Sub14_Sub1_43;
	static CacheableEntry_Sub23_Sub14_Sub1 aClass109_Sub23_Sub14_Sub1_44;
	static RenderedItemImage aClass109_Sub23_Sub14_Sub2_45;
	static boolean aBool63;
	static CacheableEntry_Sub23_Sub14_Sub1[] aClass109_Sub23_Sub14_Sub1Array64;
	static int anInt67;
	public static final int anInt71 = 99;
	public static final int anInt72 = 98;
	static RenderedItemImage aClass109_Sub23_Sub14_Sub2_73;
	static int anInt74;
	static int anInt42 = 0;
	static int anInt47;
	static int[] anIntArray61;
	static int anInt49;
	static int anInt50;
	static int anInt51;
	static int anInt52;
	static int anInt53;
	static int anInt46;
	static int anInt66;
	static String aString56;
	static int anInt57;
	static String aString58;
	static String aString59;
	static String aString60;
	static String aString55;
	static String password;
	static Class85 aClass85_68;
	static boolean aBool75;
	static int anInt65;
	static String aString48;
	static String aString54;
	static boolean aBool69;
	static int anInt70;

	static {
		anInt47 = anInt42 * -2012744469 - 1809848210;
		anIntArray61 = new int[256];
		anInt49 = 0;
		anInt50 = 0;
		anInt51 = 0;
		anInt52 = 0;
		anInt53 = 0;
		anInt46 = 0;
		anInt66 = -956072434;
		aString56 = "";
		anInt57 = 0;
		aString58 = "";
		aString59 = "";
		aString60 = "";
		aString55 = "";
		password = "";
		aClass85_68 = Class85.aClass85_1009;
		aBool75 = true;
		anInt65 = 0;
		aString48 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ";
		aString54 = "1234567890";
		aBool69 = false;
		anInt70 = -806313189;
	}

	public static int method114(byte[] var0, int var1, int var2, int var3) {
		int var4 = -1;

		for (int var5 = var1; var5 < var2; var5++) {
			var4 = var4 >>> 8 ^ DataBuffer.anIntArray1833[(var4 ^ var0[var5]) & 255];
		}

		var4 = ~var4;
		return var4;
	}

	Class3() throws Throwable {
		throw new Error();
	}

	static CacheableEntry_Sub23_Sub12 method129(int var0, int var1, int var2) {
		Class30 var3 = (Class30) PacketDecoder.aMap335.get(var0);
		return var3.method398(var1, (byte) 1);
	}

	static void decodeNpcSync(boolean largeScene) {
		GameClient.numNpcsPendingRemoval = 0;
		GameClient.npcUpdatePointer = 0;

		GameClient.gameBuffer.startBitMode();

		int numLocalNpcs = GameClient.gameBuffer.readbits(8);
		System.out.println("Num local: " + numLocalNpcs);
		if (numLocalNpcs < GameClient.numLocalNpcs * 1974577941) {
			for (int i = numLocalNpcs; i < GameClient.numLocalNpcs * 1974577941; i++) {
				GameClient.npcsPendingRemoval[(GameClient.numNpcsPendingRemoval += 880507307) * -807159549 - 1] = GameClient.npcIndices[i];
			}
		}

		if (numLocalNpcs > GameClient.numLocalNpcs * 1974577941) {
			throw new RuntimeException("local npcs more than num local stored");
		} else {
			GameClient.numLocalNpcs = 0;

			int var6;
			int var7;
			int var8;
			int var9;
			for (int i = 0; i < numLocalNpcs; i++) {
				int npcIndex = GameClient.npcIndices[i];
				Npc npc = GameClient.sceneNpcs[npcIndex];
				int needsUpdating = GameClient.gameBuffer.readbits(1);
				System.out.println("Needs updating: " + needsUpdating);
				if (needsUpdating == 0) {
					GameClient.npcIndices[(GameClient.numLocalNpcs += 1449151549) * 1974577941 - 1] = npcIndex;
					npc.lastSync = GameClient.cycle * 489897939;
				} else {
					int moveType = GameClient.gameBuffer.readbits(2);

					if (moveType == 0) { // No movement but just update
						GameClient.npcIndices[(GameClient.numLocalNpcs += 1449151549) * 1974577941 - 1] = npcIndex;
						npc.lastSync = GameClient.cycle * 489897939;
						GameClient.npcIndicesNeedingUpdating[(GameClient.npcUpdatePointer -= 302765877) * -435618589 - 1] = npcIndex;
					} else if (moveType == 1) { // Walk step
						GameClient.npcIndices[(GameClient.numLocalNpcs += 1449151549) * 1974577941 - 1] = npcIndex;
						npc.lastSync = GameClient.cycle * 489897939;
						int walkStep = GameClient.gameBuffer.readbits(3);
						npc.moveInDirection(walkStep, false);

						int needsUpdate = GameClient.gameBuffer.readbits(1);
						if (needsUpdate == 1) {
							GameClient.npcIndicesNeedingUpdating[(GameClient.npcUpdatePointer -= 302765877) * -435618589 - 1] = npcIndex;
						}
					} else if (moveType == 2) { // Run step
						GameClient.npcIndices[(GameClient.numLocalNpcs += 1449151549) * 1974577941 - 1] = npcIndex;
						npc.lastSync = GameClient.cycle * 489897939;
						int walkStep = GameClient.gameBuffer.readbits(3);
						npc.moveInDirection(walkStep, true);
						int runStep = GameClient.gameBuffer.readbits(3);
						npc.moveInDirection(runStep, true);

						int needsUpdate = GameClient.gameBuffer.readbits(1);
						if (needsUpdate == 1) {
							GameClient.npcIndicesNeedingUpdating[(GameClient.npcUpdatePointer -= 302765877) * -435618589 - 1] = npcIndex;
						}
					} else if (moveType == 3) { // Remove
						GameClient.npcsPendingRemoval[(GameClient.numNpcsPendingRemoval += 880507307) * -807159549 - 1] = npcIndex;
					}
				}
			}

			while (GameClient.gameBuffer.bitsReadable(GameClient.messageSize * 1964753529) >= 27) {
				int index = GameClient.gameBuffer.readbits(15);
				System.out.println("add at index " + index);
				if (index == 32767) { //-1
					break;
				}

				boolean isNew = false;
				if (GameClient.sceneNpcs[index] == null) {
					GameClient.sceneNpcs[index] = new Npc();
					isNew = true;
				}

				Npc npc = GameClient.sceneNpcs[index];
				GameClient.npcIndices[(GameClient.numLocalNpcs += 1449151549) * 1974577941 - 1] = index;
				npc.lastSync = GameClient.cycle * 489897939;

				int direction = GameClient.anIntArray2996[GameClient.gameBuffer.readbits(3)];
				if (isNew) {
					npc.spawnDirection = (npc.direction = direction * 1352080005) * -601642305;
				}

				int needsUpdate = GameClient.gameBuffer.readbits(1);
				if (needsUpdate == 1) {
					GameClient.npcIndicesNeedingUpdating[(GameClient.npcUpdatePointer -= 302765877) * -435618589 - 1] = index;
				}

				npc.definition = Class50.getNpcDef(GameClient.gameBuffer.readbits(14));

				int resetQueue = GameClient.gameBuffer.readbits(1);
				if (largeScene) {
					var9 = GameClient.gameBuffer.readbits(8);
					if (var9 > 127) {
						var9 -= 256;
					}
				} else {
					var9 = GameClient.gameBuffer.readbits(5);
					if (var9 > 15) {
						var9 -= 32;
					}
				}

				if (largeScene) {
					var8 = GameClient.gameBuffer.readbits(8);
					if (var8 > 127) {
						var8 -= 256;
					}
				} else {
					var8 = GameClient.gameBuffer.readbits(5);
					if (var8 > 15) {
						var8 -= 32;
					}
				}

				System.out.println("Dx dy " + var9 + ", " + var8);

				npc.anInt2508 = npc.definition.anInt2222 * 809092725;
				npc.anInt2557 = npc.definition.anInt2223 * 1645833911;
				if (npc.anInt2557 * -1936020065 == 0) {
					npc.direction = 0;
				}

				npc.anInt2524 = npc.definition.anInt2256 * 684239299;
				npc.anInt2520 = npc.definition.anInt2229 * -1118326747;
				npc.anInt2514 = npc.definition.anInt2230 * -1218429867;
				npc.anInt2564 = npc.definition.anInt2231 * 1135653891;
				npc.anInt2509 = npc.definition.anInt2225 * -1691334965;
				npc.anInt2510 = npc.definition.anInt2233 * -1528158803;
				npc.anInt2551 = npc.definition.anInt2238 * 431532407;
				npc.method2942(Player.me.stepQueueX[0] + var9, var8 + Player.me.stepQueueY[0], resetQueue == 1, (byte) 14);
			}

			GameClient.gameBuffer.endBitMode();

			for (int i = 0; i < GameClient.npcUpdatePointer * -435618589; i++) {
				int idx = GameClient.npcIndicesNeedingUpdating[i];
				Npc npc = GameClient.sceneNpcs[idx];
				System.out.println("Apparently we want to update " + idx);
				int syncVal = GameClient.gameBuffer.readUByte();

				if ((syncVal & 1) != 0) {
					var6 = GameClient.gameBuffer.readUByteN();
					var7 = GameClient.gameBuffer.readUByteN();
					npc.addHit(var6, var7, GameClient.cycle * 1026470457);
					npc.anInt2527 = GameClient.cycle * 1810132455 - 2012164012;
					npc.anInt2528 = GameClient.gameBuffer.readUShortA() * -1158152579;
					npc.anInt2529 = GameClient.gameBuffer.readULEShort() * 1033095941;
				}

				if ((syncVal & 32) != 0) {
					npc.definition = Class50.getNpcDef(GameClient.gameBuffer.readUShort());
					npc.anInt2508 = npc.definition.anInt2222 * 809092725;
					npc.anInt2557 = npc.definition.anInt2223 * 1645833911;
					npc.anInt2524 = npc.definition.anInt2256 * 684239299;
					npc.anInt2520 = npc.definition.anInt2229 * -1118326747;
					npc.anInt2514 = npc.definition.anInt2230 * -1218429867;
					npc.anInt2564 = npc.definition.anInt2231 * 1135653891;
					npc.anInt2509 = npc.definition.anInt2225 * -1691334965;
					npc.anInt2510 = npc.definition.anInt2233 * -1528158803;
					npc.anInt2551 = npc.definition.anInt2238 * 431532407;
				}

				if ((syncVal & 2) != 0) {
					var6 = GameClient.gameBuffer.readUByteS();
					var7 = GameClient.gameBuffer.readUByteN();
					npc.addHit(var6, var7, GameClient.cycle * 1026470457);
					npc.anInt2527 = GameClient.cycle * 1810132455 - 2012164012;
					npc.anInt2528 = GameClient.gameBuffer.readULEShort() * -1158152579;
					npc.anInt2529 = GameClient.gameBuffer.readULEShort() * 1033095941;
				}

				if ((syncVal & 8) != 0) {
					npc.anInt2531 = GameClient.gameBuffer.readUShort() * 72414077;
					npc.anInt2532 = GameClient.gameBuffer.readUShortLEA() * 246722269;
				}

				if ((syncVal & 0x10) != 0) {
					var6 = GameClient.gameBuffer.readUShort();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = GameClient.gameBuffer.readUByteN();
					if (npc.anInt2536 * 1287875615 == var6 && var6 != -1) {
						var9 = CacheableEntry_Sub23_Sub11.getAnimation(var6).anInt2170 * -991178587;
						if (var9 == 1) {
							npc.anInt2537 = 0;
							npc.anInt2538 = 0;
							npc.anInt2517 = var7 * -88244917;
							npc.anInt2515 = 0;
						}

						if (var9 == 2) {
							npc.anInt2515 = 0;
						}
					} else if (var6 == -1 || npc.anInt2536 * 1287875615 == -1 || CacheableEntry_Sub23_Sub11.getAnimation(var6).anInt2176 * -251389863 >= CacheableEntry_Sub23_Sub11.getAnimation(npc.anInt2536 * 1287875615).anInt2176 * -251389863) {
						npc.anInt2536 = var6 * 1940983775;
						npc.anInt2537 = 0;
						npc.anInt2538 = 0;
						npc.anInt2517 = var7 * -88244917;
						npc.anInt2515 = 0;
						npc.anInt2563 = npc.anInt2558 * 1030099461;
					}
				}

				if ((syncVal & 0x40) != 0) { //gfx
					npc.anInt2541 = GameClient.gameBuffer.readULEShort() * 1325550547;
					var6 = GameClient.gameBuffer.readInt();
					npc.anInt2545 = (var6 >> 16) * 1119651467;
					npc.anInt2544 = (GameClient.cycle * 1026470457 + (var6 & 65535)) * 433468627;
					npc.anInt2542 = 0;
					npc.anInt2543 = 0;
					if (npc.anInt2544 * -1244118181 > GameClient.cycle * 1026470457) {
						npc.anInt2542 = 708692887;
					}

					if (npc.anInt2541 * -1444330405 == 65535) {
						npc.anInt2541 = -1325550547;
					}
				}

				if ((syncVal & 4) != 0) { // face entity
					npc.facedEntity = GameClient.gameBuffer.readUShort() * 357265433;
					if (npc.facedEntity * 1253370921 == 65535) {
						npc.facedEntity = -357265433;
					}
				}

				if ((syncVal & 128) != 0) { // shout
					npc.aString2523 = GameClient.gameBuffer.readString();
					npc.anInt2511 = -91011604;
				}
			}

			for (int i = 0; i < GameClient.numNpcsPendingRemoval * -807159549; i++) {
				int idx = GameClient.npcsPendingRemoval[i];
				if (GameClient.sceneNpcs[idx].lastSync * 354830915 != GameClient.cycle * 1026470457) {
					GameClient.sceneNpcs[idx].definition = null;
					GameClient.sceneNpcs[idx] = null;
				}
			}

			if (GameClient.gameBuffer.pos * 1736753585 != GameClient.messageSize * 1964753529) {
				throw new RuntimeException("Buffer pos was " + GameClient.gameBuffer.pos * 1736753585 + Class37.COMMA + GameClient.messageSize * 1964753529);
			} else {
				for (numLocalNpcs = 0; numLocalNpcs < GameClient.numLocalNpcs * 1974577941; numLocalNpcs++) {
					if (GameClient.sceneNpcs[GameClient.npcIndices[numLocalNpcs]] == null) {
						throw new RuntimeException(numLocalNpcs + Class37.COMMA + GameClient.numLocalNpcs * 1974577941);
					}
				}

			}
		}
	}

}
