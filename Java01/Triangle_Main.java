package Java01;
import java.util.Scanner;

public class Triangle_Main {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		Triangle t = new Triangle();
		Triangle ty = new Triangle();
		int i=0;
		
		if(i == 0){
			System.out.println("Digite o valor do X: ");
			t.a = x.nextDouble();
			t.b = x.nextDouble();
			t.c = x.nextDouble();
			i++;
		if(i == 1){
			System.out.println("Digite o valor do Y: ");
			ty.a = x.nextDouble();
			ty.b = x.nextDouble();
			ty.c = x.nextDouble();
			}
		}
		double areaX = t.area();
		double areaY = ty.area();
		
		System.out.printf("Triangle X: %.4f%n",areaX);
		System.out.printf("Triangle Y: %.4f%n",areaY);
		
	}

}
