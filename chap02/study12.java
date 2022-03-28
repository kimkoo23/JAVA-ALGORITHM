package chap02;

class study12 {
    public static void main(String[] args){
        int[][] x = new int[2][4];

        x[0][1]= 37;
        x[0][3]= 54;
        x[1][2] = 65;

        for(int i = 0; i<2; i++)
            for(int k = 0; k<4; k++ )
                System.out.println("x[" + i+"]["+ k +"] = "+ x[i][k]);
    }    
}
