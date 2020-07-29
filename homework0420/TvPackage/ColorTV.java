package TvPackage;

class ColorTV extends TV {
	private int resolution;
	ColorTV(int size, int resolution) {
		super(size);
		this.resolution = resolution;
	}
	
	public void printProperty() {
		System.out.print(getSize()+"ÀÎÄ¡ "+resolution+"ÄÃ·¯");
	}
}
