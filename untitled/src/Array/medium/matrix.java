package Array.medium;

public class matrix {


    static void printrow(int[][] matrix,int i ) {

        for ( int j= 0; j  < matrix[0].length; j++ ) {

            if(matrix[i][j]!=0) {
                matrix[i][j]=-1;
            }
        }

    }



    static void printcolumn(int[][] matrix,int j) {

        for ( int i= 0; i  < matrix.length; i++ ) {

            if(matrix[i][j]!=0) {
                matrix[i][j]=-1;
            }
        }

    }

    static void  get (int mat[][]) {


        for(int i = 0; i < mat.length; i++){

            for(int j = 0; j < mat[i].length; j++){

                if(mat[i][j] == 0){


                    printrow(mat,i);
                    printcolumn(mat,j);

                }
            }
        }


        for ( int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == -1){

                    mat[i][j]=0;
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
