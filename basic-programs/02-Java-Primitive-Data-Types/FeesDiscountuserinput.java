import java.util.Scanner;

class FeesDiscountuserinput{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int Fees,discountpercent;
		Fees = sc.nextInt();
		discountpercent = sc.nextInt();
		double discountamount = (Fees*discountpercent)/100.0;
		double discountedfees = Fees-discountamount;
		System.out.println("The discount amount is INR "+discountamount+" and final discounted fee is INR "+discountedfees);
		}
	}