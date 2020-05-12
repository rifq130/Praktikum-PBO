import java.util.*;
public class Latihan2{
	public static void linear(int n, int key, int bil[]){
		int i;
		for(i=0;i<n;i++){
			if(bil[i]==key){
				System.out.println("Data Terdapat Pada Index Ke-"+i);
					break;
			}
		}
		if(i==n){
			System.out.println("Data Tidak Ditemukan");
		}
	}
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);
		int n,key,bil[];
		System.out.print("Masukan Jumlah Data : ");
		n = input.nextInt();
		bil = new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Masukan Data Ke-"+i+" : ");
			bil[i] = input.nextInt();
		}
		System.out.print("Masukan Data Yang Dicari : ");
		key = input.nextInt();
		Latihan2.linear(n,key,bil);
	}
}