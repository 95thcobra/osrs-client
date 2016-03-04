import java.awt.*;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Class73 implements Runnable {

	Interface1 anInterface1_880;
	static final int anInt882 = 2;
	static CacheableEntry_Sub23_Sub14_Sub1 aClass109_Sub23_Sub14_Sub1_886;
	static final int anInt887 = 3;
	static final int anInt889 = 1;
	public static final int anInt890 = 185;
	AsyncJob aAsyncJob_881 = null;
	AsyncJob aAsyncJob_888 = null;
	boolean aBool884 = false;
	public static String aString878;
	static String aString879;
	public EventQueue anEventQueue885;
	Thread aThread883;

	static final void method966(int var0, int var1, int var2, boolean var3, int var4) {
		if (ItemContainer.method1840(var0)) {
			Class66.method894(InterfaceDef.aInterfaceDefArrayArray1975[var0], -1, var1, var2, var3, -711223216);
		}
	}

	public final void run() {
		while (true) {
			AsyncJob var2;
			synchronized (this) {
				while (true) {
					if (aBool884) {
						return;
					}

					if (aAsyncJob_881 != null) {
						var2 = aAsyncJob_881;
						aAsyncJob_881 = aAsyncJob_881.aAsyncJob_1039;
						if (aAsyncJob_881 == null) {
							aAsyncJob_888 = null;
						}
						break;
					}

					try {
						wait();
					} catch (InterruptedException var7) {
						;
					}
				}
			}

			try {
				int var1 = var2.type * 65210863;
				if (var1 == 1) {
					var2.result = new Socket(Loader.IP, Loader.PORT);
				} else if (var1 == 2) {
					Thread var3 = new Thread((Runnable) var2.objectparam);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var2.intparam);
					var2.result = var3;
				} else if (var1 == 4) {
					var2.result = new DataInputStream(((URL) var2.objectparam).openStream());
				} else if (var1 == 3) {
					String var9 = (var2.intparam >> 24 & 255) + "." + (var2.intparam >> 16 & 255) + "." + (var2.intparam >> 8 & 255) + "." + (var2.intparam & 255);
					var2.result = InetAddress.getByName(var9).getHostName();
				}

				var2.stage = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var6) {
				var2.stage = 2;
			}
		}
	}

	final AsyncJob submitJob(int var1, int var2, Object var4) {
		AsyncJob var6 = new AsyncJob();
		var6.type = var1 * 88818959;
		var6.intparam = var2;
		var6.objectparam = var4;
		synchronized (this) {
			if (aAsyncJob_888 != null) {
				aAsyncJob_888.aAsyncJob_1039 = var6;
				aAsyncJob_888 = var6;
			} else {
				aAsyncJob_888 = aAsyncJob_881 = var6;
			}

			notify();
			return var6;
		}
	}

	public final AsyncJob submitSocketJob(String host, int port) {
		return submitJob(1, port, host);
	}

	public final AsyncJob submitRunnable(Runnable var1, int var2, byte var3) {
		return submitJob(2, var2, var1);
	}

	public final AsyncJob method970(int var1, int var2) {
		return submitJob(3, var1, (Object) null);
	}

	public final AsyncJob method971(URL var1, byte var2) {
		return submitJob(4, 0, var1);
	}

	public final Interface1 method972(int var1) {
		return anInterface1_880;
	}

	Class73() {
		aString878 = "Unknown";
		aString879 = "1.1";

		try {
			aString878 = System.getProperty("java.vendor");
			aString879 = System.getProperty("java.version");
		} catch (Exception var3) {
			;
		}

		try {
			anEventQueue885 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var2) {
			;
		}

		aBool884 = false;
		aThread883 = new Thread(this);
		aThread883.setPriority(10);
		aThread883.setDaemon(true);
		aThread883.start();
	}

	final void method976(byte var1) {
		synchronized (this) {
			aBool884 = true;
			notifyAll();
		}

		try {
			aThread883.join();
		} catch (InterruptedException var4) {
			;
		}

	}

}
