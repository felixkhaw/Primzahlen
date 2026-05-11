public class Primzahlen {

    public static int[] erstelleZahlen(int x){
        int[] tmp_array = new int[1001-x];
        int tmp_index = 0;
        for(int i = x; i<= 1000; i++){
            tmp_array[tmp_index] = i;
            tmp_index++;
        }
        return tmp_array;
    }

    public static boolean testeVielfaches(int y, int z){
        if(y % z == 0){
            return true;
        } else {
            return false;
        }
    }

}