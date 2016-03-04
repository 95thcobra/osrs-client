import java.io.FileWriter;

/**
 * Created by Bart on 8/5/2015.
 */
public class ExamineDumper implements Runnable {

	public static int reqptr = 9224;
	public static int resptr;

	public static void start() {
		new Thread(new ExamineDumper()).start();
	}

	@Override
	public void run() {
		System.out.println("NICE begin");
		while (true) {
			if (resptr != reqptr) {
				onfail("Was at " + reqptr + " but had to be at " + resptr);
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			resptr = reqptr;
			for (int i = 0; i < 9; i++) {
				fake(reqptr++);
			}
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void onfail(String resp) {
		try {
			FileWriter fw = new FileWriter("objexamines_failed.txt", true);
			fw.append(String.valueOf(resptr)).append(":").append(resp).append("\n");
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void onresp(String resp) {
		try {
			FileWriter fw = new FileWriter("objexamines.txt", true);
			fw.append(String.valueOf(resptr++)).append(":").append(resp).append("\n");
			fw.flush();
			fw.close();
			System.out.println(resptr-1 + ": " + resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void fake(int id) {
		GameClient.secureBuffer.writeOpcode(213);
		GameClient.secureBuffer.writeShortLE(id);
	}

}
