package homework0330;
import java.util.Scanner;

public class ordercoffee {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		//String order;
		int price=0, sum=0;
		String[] orderlist = new String[5];
		System.out.println("������ �帱���? ");
		for (int i =0;i<5;i++) {
			orderlist[i] = scanner.next();
		}
		//orderlist[0]="�Ƹ޸�ī��";
		//orderlist[1]="�Ƹ޸�ī��";
		//orderlist[2]="īǪġ��";
		//orderlist[3]="����������";
		//orderlist[4]="ī���";

		System.out.println("<��꼭>");
		System.out.println("ǰ��          �ܰ�     ����    �ݾ�");
		for(int i=0;i<5;i++)
		{
			switch (orderlist[i]) 
			{
			case "����������":
				price = 2000;
				break;
			case "īǪġ��":
			case "ī���":
				price = 3500;
				break;
			case "�Ƹ޸�ī��":
				price = 2500;
				break;
			}
			sum += price;
			System.out.println(orderlist[i]+" "+price+" "+1+" "+sum);
		}
 	   	scanner.close();
	}	
}


//coffee = scanner.next();
//cnt = scanner.nextInt();

/*
for(int i = 0; i < 5; i++)
{
	int price, sum, num;
	order = scanner.next();
	switch (order) 
	{
	case "����������":
		price = 2000;
		break;
	case "īǪġ��":
	case "ī���":
		price = 3500;
		break;
	case "�Ƹ޸�ī��":
		price = 2500;
		break;
	}
	sum += price;
	num++;
	System.out.println(sum+num);
	        	
}

//System.out.println(order+price);
*/
/*
switch (coffee) { 
case "����������": 
    amt = 2000; 
    break; 
case "�Ƹ޸�ī��": 
    amt = 2500; 
    break; 
case "īǪġ��": 
    amt = 3000; 
    break; 
case "ī���": 
    amt = 3500; 
    break; 
} 
System.out.println(amt*cnt+"�� �Դϴ�");
*/

/*
System.out.println(order+price+cnt+price*cnt);
	order = scanner.next();
	cnt = scanner.nextInt();
	while (total>5) {
		switch (order) { 
		case "����������": 
			price = 2000; 
			break; 
		case "�Ƹ޸�ī��": 
			price = 2500; 
			break; 
		case "īǪġ��": 
			price = 3000; 
			break; 
		case "ī���": 
			price = 3500; 
			break; 
		}
		total += cnt;
		System.out.println(order+price+cnt+price*cnt);
	}
	*/