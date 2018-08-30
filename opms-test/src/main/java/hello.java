class hello extends Thread {
	private String name;

	public hello(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "运行     " + i);
		}
	}

	public static void main(String[] args) {
		hello h1 = new hello("A");
		hello h2 = new hello("B");
		h1.run();
		h2.run();
	}

}