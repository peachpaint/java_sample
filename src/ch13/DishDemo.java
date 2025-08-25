package ch13;

public class DishDemo {

	public static void main(String[] args) {
		Dish dish = new Dish();
		new Thread(new Cook(dish)).start();
		new Thread(new Cus)
	}

}

class Dish {
	private boolean empty = true;

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
}

class Cook implements Runnable {
	private final Dish dish;

	public Cook(Dish dish) {
		this.dish = dish;
	}

	private void cook(int i) throws InterruptedException {
		synchronized (dish) {
			while (!dish.isEmpty()) {
				dish.wait();
			}
			dish.setEmpty(false);
			System.out.println(i + "번째 음식이 준비되었습니다");
			dish.notify();
		}
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				cokk(i);
				threa
			}catch{
				
			}
		}
		
	}
}
