package TvPackage;

class TV {
	private int size;
	
	public TV(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
	
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
