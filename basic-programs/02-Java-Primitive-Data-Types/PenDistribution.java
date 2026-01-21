class PenDistribution{
	public static void main(String args[]){
		int pen = 14;
		int student=3;
		double remainingpen = pen%student;
		double distributedpen = pen/student;
		System.out.println("The Pen Per Student is "+distributedpen+" and the remaining pen not distributed is "+remainingpen);
		}
	}