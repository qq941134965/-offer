public class Solution {
    public boolean Find(int target, int [][] array) {
          int rows = array.length;
          int columns = array[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(array[i][j] == target) return true;
                else if(array[i][j] > target){
                    break;
                }
            }
        }
        return false;
    }
}
