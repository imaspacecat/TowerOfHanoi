class Towers {
    private int towerHeight;
    private int[][] towers;
    public Towers(int towerHeight){
        this.towerHeight = towerHeight;
        towers = new int[3][towerHeight];

        fillTowers();
    }

    private void fillTowers(){
        int count = towerHeight;
        for(int i = 0; i < towers[0].length; i++){
            towers[0][i] = count;
            count--;
        }

        for(int i = 0; i < towers[1].length; i++){
            towers[1][i] = 0;
            towers[2][i] = 0;
        }
    }

    void printTowers(){
        for(int x = 0; x < towers.length; x++){
            for(int y = 0; y < towers[1].length; y++){
                System.out.println(towers[x][y]);
            }
            System.out.println();
        }
    }

    void solve(){
        findSmallest(1);
//        if(towers[0].length % 2 == 0){
//
//            if(towers[0][findSmallest(0)] < towers[1][findSmallest(0)] || towers[1][0] == 0){
//                towers[0][findSmallest(0)] = towers[1][2];
//                towers[0][2] = 0;
//            } else{
//                towers[1][2] = towers[0][2];
//                towers[1][2] = 0;
//            }
//
//            towers[0][2] = towers[2][2];
//            towers[0][2] = 0;
//
//
//
//        }
    }

    private int findSmallest(int towerNum){
        int smallest = towers[towerNum][0];
        int smallestIndex = 0;
        //find smallest non zero value in tower
        for(int i = 0; i < towers[towerNum].length; i++ ){
            if(towers[towerNum][i] < smallest){
                smallest = towers[towerNum][i];
                smallestIndex = i;
            }
        }
        System.out.println("smallest is: " + smallest);
        System.out.println("smallest index is: " + smallestIndex);
        return smallestIndex;
    }


}
