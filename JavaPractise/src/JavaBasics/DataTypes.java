package JavaBasics;

public class DataTypes {
	public static void main(String[] args) {
		
		String x[][]=new String[2][2];
		x[0][0]="Hi";
		x[0][1]="HEllo";
		x[1][0]="How ";
		x[1][1]="r you";
						
		System.out.println(x[1].length);
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.println(x[i][j]);
			}
		}
	}

}
