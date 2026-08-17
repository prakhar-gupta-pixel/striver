package Array.medium;

public class matrixbettetr {


    static void get (int mat[][]) {

        int []  row  = new int [mat.length];
        int []  col = new int [mat[0].length];



        for ( int i = 0; i < mat.length; i++){
            for ( int j = 0; j < mat[i].length; j++){


                if ( mat[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }


        for  ( int i = 0; i < mat.length; i++){
            for  ( int j = 0; j < mat[i].length; j++){


                if(  row [i]==1 || col[j]==1 ){
                    mat[i][j] = 0;
                }
            }
        }




    }


    static void main() {


        int [][] matrix  ={
                {1,2,0,4},
                {5,0,7,8},
                {6,4,2,3}};


        get(matrix);



        for ( int i = 0; i < matrix.length; i++ ) {

            for ( int j = 0; j < matrix[i].length; j++ ) {
                System.out.print(matrix[i][j] + " ");


            }

            System.out.println("");
        }
    }
}
