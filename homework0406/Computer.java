
public class Computer {
	//field
	public String company = "Hp";
	public int power;
	public int cpuT;
	
	//method
	//public void power6hours1(int power) {
	//	this.power = power;
	//	System.out.println("6�ð� ����"+power*6+"�� ������ �Һ���");
	//}
	public String power6hours() {
		return "6�ð����� "+(this.power*6)+"w�� ������ �Һ���";
	}
	//public void com_shutdown(int cpuT) {
	//	this.cpuT = cpuT;
	//	if (cpuT < 100) {
	//		System.out.println("��ǻ�Ͱ� ������ ����"+(100-cpuT)+"�� ���ҽ��ϴ�.");
	//	}
	//	else {
	//		System.out.println("��ǻ�Ͱ� �����ϴ�.");
	//	}
	//}
	public String comshutdown() {
		return "��ǻ�Ͱ� ������ ���� "+(100-this.cpuT)+"�� ���ҽ��ϴ�.";
	}
	
	//constructor
	Computer() {	
	}
	
	public Computer(int power, int cpuT) {
		this.power = power;
		this.cpuT = cpuT;
	}
	
	public Computer(String company, int power, int cpuT) {
		this.company = company;
		this.power = power;
		this.cpuT = cpuT;	
	}
	//main
	public static void main(String[] args) {
		Computer computer1 = new Computer(85,99);
		System.out.println("computer1�� ����ȸ�� : "+computer1.company);
		System.out.println("computer1�� ���¼Һ� : "+computer1.power+"w");
		System.out.println("computer1�� cpu�� ���� �µ� : "+computer1.cpuT+"��");
		System.out.println(computer1.power6hours());
		System.out.println(computer1.comshutdown());
		
		Computer computer2 = new Computer("LG",65,58);
		System.out.println("computer2�� ����ȸ�� : "+computer2.company);
		System.out.println("computer2�� ���¼Һ� : "+computer2.power+"w");
		System.out.println("computer2�� cpu�� ���� �µ� : "+computer2.cpuT+"��");
		System.out.println(computer2.power6hours());
		System.out.println(computer2.comshutdown());
	}
}