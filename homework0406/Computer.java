
public class Computer {
	//field
	public String company = "Hp";
	public int power;
	public int cpuT;
	
	//method
	//public void power6hours1(int power) {
	//	this.power = power;
	//	System.out.println("6시간 동안"+power*6+"의 전력을 소비함");
	//}
	public String power6hours() {
		return "6시간동안 "+(this.power*6)+"w의 전력을 소비함";
	}
	//public void com_shutdown(int cpuT) {
	//	this.cpuT = cpuT;
	//	if (cpuT < 100) {
	//		System.out.println("컴퓨터가 꺼지기 까지"+(100-cpuT)+"도 남았습니다.");
	//	}
	//	else {
	//		System.out.println("컴퓨터가 꺼집니다.");
	//	}
	//}
	public String comshutdown() {
		return "컴퓨터가 꺼지기 까지 "+(100-this.cpuT)+"도 남았습니다.";
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
		System.out.println("computer1의 제조회사 : "+computer1.company);
		System.out.println("computer1의 전력소비량 : "+computer1.power+"w");
		System.out.println("computer1의 cpu의 현재 온도 : "+computer1.cpuT+"℃");
		System.out.println(computer1.power6hours());
		System.out.println(computer1.comshutdown());
		
		Computer computer2 = new Computer("LG",65,58);
		System.out.println("computer2의 제조회사 : "+computer2.company);
		System.out.println("computer2의 전력소비량 : "+computer2.power+"w");
		System.out.println("computer2의 cpu의 현재 온도 : "+computer2.cpuT+"℃");
		System.out.println(computer2.power6hours());
		System.out.println(computer2.comshutdown());
	}
}