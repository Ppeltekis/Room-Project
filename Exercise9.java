import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] rents=new int[][] { {0,400,450,510}, {1,500,560,630}, {2,625,676,740}, {3,1000,1250,1600} };
        System.out.print("The price list is: ");
        System.out.println("");  
        for (int floor=0; floor<rents.length; floor++) {
            for(int bedrooms=0; bedrooms<4; bedrooms++) {    
                System.out.print("\t"+rents[floor][bedrooms]);
            }
            System.out.println("");  
        }
        System.out.print("Give number of floor: ");
        int floor_num=input.nextInt();
        System.out.print("Give number of bedrooms: ");
        int bedrooms_num=input.nextInt();
        input.close();
        if (floor_num==rents[0][0]) {
            if (bedrooms_num==0) {
                System.out.println("The rent you have to pay is: "+rents[0][1]);
            }
            if (bedrooms_num==1) {
                System.out.println("The rent you have to pay is: "+rents[0][2]);
            }
            if (bedrooms_num==2) {
                System.out.println("The rent you have to pay is: "+rents[0][3]);
            }
        }
        if (floor_num==rents[1][0]) {
            if (bedrooms_num==0) {
                System.out.println("The rent you have to pay is: "+rents[1][1]);
            }
            if (bedrooms_num==1) {
                System.out.println("The rent you have to pay is: "+rents[1][2]);
            }
            if (bedrooms_num==2) {
                System.out.println("The rent you have to pay is: "+rents[1][3]);
            }
        }
        if (floor_num==rents[2][0]) {
            if (bedrooms_num==0) {
                System.out.println("The rent you have to pay is: "+rents[2][1]);
            }
            if (bedrooms_num==1) {
                System.out.println("The rent you have to pay is: "+rents[2][2]);
            }
            if (bedrooms_num==2) {
                System.out.println("The rent you have to pay is: "+rents[2][3]);
            }
        }
        if (floor_num==rents[3][0]) {
            if (bedrooms_num==0) {
                System.out.println("The rent you have to pay is: "+rents[3][1]);
            }
            if (bedrooms_num==1) {
                System.out.println("The rent you have to pay is: "+rents[3][2]);
            }
            if (bedrooms_num==2) {
                System.out.println("The rent you have to pay is: "+rents[3][3]);
            }
        }
    }
}