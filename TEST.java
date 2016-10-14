package HOCJAVA;

import java.util.Random;

public class TEST {
static DATA datachung;
	/**
	 * @param args
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 datachung = new DATA();
		Thread th1 = new Thread(new Runnable() {

			public void run() {

				for (int i = 1; i < 100; i++) {

					try {
						int a = new Random().nextInt(100);
						datachung.setA(a);
						System.out.println("" + datachung.getA());
						Thread.sleep(90);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		});

		Thread th2 = new Thread(new Runnable() {
			public void run() {

				for (int i = 1; i < 100; i++) {

					try {
						int b = new Random().nextInt(100);
						datachung.setB(b);
						System.out.println("" + datachung.getB());
						Thread.sleep(90);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
th1.start();
th2.start();
	}

}
