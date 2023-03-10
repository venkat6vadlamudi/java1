package threads;

import java.util.Random;

public class Producer extends Thread {
	Stock supply;

	public Producer(Stock shareProd) {
		supply=shareProd;
	}

	public void run() {
			try{
			while(true){
					synchronized (supply) {
						// 11 = 		1   + 10
						supply.quantity=supply.quantity+20;
						System.out.println("Notify Consumers NEW STOCK ARRIVAL: Total stocks :"+supply.quantity);
						supply.notify(); // notify the consumers for new stock arrival
						supply.wait();// wait until the product runs out of stock and consumer notifies
					}
				}
				
			}catch(Exception e){
				
			}
		
	}

	
}
