package Esercizio1;
//Scrivere un programma che individui il valore massimo e minimo all’interno di un array.

public class Numerazione {
private int arr[];
	
	public Numerazione() {
		
		arr=new int[7];
		}
public void verificaNumeri() {
	arr[0]=14;
	arr[1]=65;
	arr[2]=6;
	arr[3]=45;
	arr[4]=4;
	arr[5]=23;
	arr[6]=14;
	
	int min =arr[0];
	int max =arr[0];
	for(int x=1;x<arr.length;++x) {
		if(arr[x]<min) {
			min=arr[x];
			
		}
		else if (max<arr[x]) {
			max=arr[x];
		}
	}
	System.out.println("Il valore minimo dell'array è: "+min);
	System.out.println("Il valore massimo dell'array è: "+max);
	
	
}

}
