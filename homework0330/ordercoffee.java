package homework0330;
import java.util.Scanner;

public class ordercoffee {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		//String order;
		int price=0, sum=0;
		String[] orderlist = new String[5];
		System.out.println("무엇을 드릴까요? ");
		for (int i =0;i<5;i++) {
			orderlist[i] = scanner.next();
		}
		//orderlist[0]="아메리카노";
		//orderlist[1]="아메리카노";
		//orderlist[2]="카푸치노";
		//orderlist[3]="에스프레소";
		//orderlist[4]="카페라떼";

		System.out.println("<계산서>");
		System.out.println("품명          단가     수량    금액");
		for(int i=0;i<5;i++)
		{
			switch (orderlist[i]) 
			{
			case "에스프레소":
				price = 2000;
				break;
			case "카푸치노":
			case "카페라떼":
				price = 3500;
				break;
			case "아메리카노":
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
	case "에스프레소":
		price = 2000;
		break;
	case "카푸치노":
	case "카페라떼":
		price = 3500;
		break;
	case "아메리카노":
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
case "에스프레소": 
    amt = 2000; 
    break; 
case "아메리카노": 
    amt = 2500; 
    break; 
case "카푸치노": 
    amt = 3000; 
    break; 
case "카페라떼": 
    amt = 3500; 
    break; 
} 
System.out.println(amt*cnt+"원 입니다");
*/

/*
System.out.println(order+price+cnt+price*cnt);
	order = scanner.next();
	cnt = scanner.nextInt();
	while (total>5) {
		switch (order) { 
		case "에스프레소": 
			price = 2000; 
			break; 
		case "아메리카노": 
			price = 2500; 
			break; 
		case "카푸치노": 
			price = 3000; 
			break; 
		case "카페라떼": 
			price = 3500; 
			break; 
		}
		total += cnt;
		System.out.println(order+price+cnt+price*cnt);
	}
	*/