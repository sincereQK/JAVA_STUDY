
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

class ColorTV extends TV {
	private int resolution;
	ColorTV(int size, int resolution) {
		super(size);
		this.resolution = resolution;
	}
	
	public void printProperty() {
		System.out.print(getSize()+"��ġ "+resolution+"�÷�");
	}
}

class IPTV extends ColorTV {
	String IP;
	IPTV(String IP, int size, int resolution) {
		super(size, resolution);
		this.IP = IP;
	}
	
	public void printProperty() {
		System.out.print("���� IPTV�� "+IP+" �ּ��� ");
		super.printProperty();
	}
	
}
