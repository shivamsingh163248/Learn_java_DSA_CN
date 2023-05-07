
public class swep_alternete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr = {23,4,65,5,7};
// 
int[]shiv = new int[arr.length];

for (int i = 0,j= 1; i < arr.length && j < shiv.length; i+=2,j+=2) {
    shiv[j] = arr[i];
}

//for (int i = 0; i < shiv.length; i++) {
//	System.out.print(shiv[i]+" ");
//}
//System.out.println();



for (int i = 1,j=0; i < arr.length && j<arr.length; i+=2,j+=2) {
    shiv[j] = arr[i];
}
//
//for (int i = 0; i < shiv.length; i++) {
//	System.out.print(shiv[i]+" ");
//}
//
//System.out.println();

arr = shiv;

for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
}


System.out.println();


for (int i = 0; i < shiv.length; i++) {
	System.out.print(shiv[i]+" ");
}


	}

}
