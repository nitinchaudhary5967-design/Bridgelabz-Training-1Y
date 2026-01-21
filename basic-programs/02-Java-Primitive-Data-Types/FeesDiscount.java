class FeesDiscount{
	public static void main(String args[]){
		int Fees = 125000;
		int discountpercent = 10;
		double discountamount = Fees/discountpercent;
		double discountedfees = Fees-discountamount;
		System.out.println("The discount amount is INR "+discountamount+" and final discounted fee is INR "+discountedfees);
		}
	}