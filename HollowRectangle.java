public class HollowRectangle{
    public static void main(String[] args) {
        int totRows = 4;
        int totCols = 4;

        // outer loop
        for(int i=1; i<=totRows; i++){

            // inner loop
            for(int j=1; j<=totCols; j++){

                // cell - (i, j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){

                    // boundery cell
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }
}