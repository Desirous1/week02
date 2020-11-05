public class Tombokgyak {

    public static void main(String[] args) {

        int[][] arrayInArray = {{1,2,3},{2,3,4},{1,2,3,4,5}};
//int[][] arrayInArray2 = new int[3][4]; //{{0,0,0,0},{0,0,0,0},{0,0,0,0}}
        for(int i=0;i<arrayInArray.length;i++){
            for(int j=0;j<arrayInArray[i].length;j++){
                System.out.print(arrayInArray[i][j]);
            }
            System.out.println();
        }


        for (int[] arr : arrayInArray) {
            for (int num : arr) {
                System.out.print(num);
            }
            System.out.println();
        }




    }

}
