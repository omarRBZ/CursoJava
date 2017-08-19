 class matriz {
    public static void main(String[]args){

    int[][] matriz=new int [4][4];
    int numero=2;
    int numero2=1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=numero*numero2;
                numero2++;

            }


        }
        System.out.println("[ "+matriz[0][0]+"] ["+matriz[0][1]+"] ["+matriz[0][2]+"] ["+matriz[0][3]+"]");
        System.out.println("["+matriz[1][0]+"]["+matriz[1][1]+"]["+matriz[1][2]+"]["+matriz[1][3]+"]");
        System.out.println("["+matriz[2][0]+"]["+matriz[2][1]+"]["+matriz[2][2]+"]["+matriz[2][3]+"]");
        System.out.println("["+matriz[3][0]+"]["+matriz[3][1]+"]["+matriz[3][2]+"]["+matriz[3][3]+"]");


    }

}
