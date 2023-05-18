
public class check_squAre {
    public static Pair< String, int[] > sqrMat(int [][]mat, int n, int m) {
        // Write your code here.
        // first fnd the lenght of lenght
   
        // creating the new array with the size of the zer0
        int k  = 0 ;
  if (n == m) {
             k = n ;
        }

     int r = 0 ; 
        int[]arr = new int[n] ;
        if (n != m) {
               return new Pair<>("NO", arr);
        }else{
            for (int i = 0; i < n; i++) {
                for (int j = i; j < i+1; j++) {
                    arr[r] = mat[i][j];
                    r++;
                }

            }
        }





    return new Pair<>("YES", arr);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
