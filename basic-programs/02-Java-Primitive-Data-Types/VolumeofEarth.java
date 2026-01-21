class VolumeofEarth{
	public static void main(String args[]){
		int radius = 6378;
		double radiustomiles =6378*0.62;
		double volume = (4.0/3)*Math.PI*Math.pow(radius,3);
		double volumeinmiles = (4.0/3)*Math.PI*Math.pow(radiustomiles,3);
		System.out.println("The volume of earth in cubic kilometers is "+volumeinmiles+" and cubic miles is "+volumeinmiles);
		}
	}
	