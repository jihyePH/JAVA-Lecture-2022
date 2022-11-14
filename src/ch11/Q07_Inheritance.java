package ch11;

public class Q07_Inheritance {

	public static void main(String[] args) {
		ColorTV myTv = new ColorTV(32, 1024);
		myTv.printProperty();
	}

}

class TV{
	protected int size;
	
	TV(int size){
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
}

class ColorTV extends TV{
	private int resolution;
	public ColorTV(int size, int resolution) {
	super(size);
	this.resolution = resolution;
		
	}
	protected void printProperty() {
		System.out.println(size+ "인치 " + resolution + " color");
	}
}

class IPTV extends ColorTV{
	private String addr;
	public IPTV(String addr,int size, int resolution) {
		super(size, resolution);
		this.addr = addr;
	}
	protected void printProperty() {
		System.out.print("나의 IPTV는"+ addr + " 주소의 ");
		super.printProperty();
	}
}