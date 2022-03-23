public class FindMin {
    public static void main(String[] args) {
        int[] arr = {15,30,5,6,8,9,10,15};
        int index = minVelue(arr);
        System.out.println("Số bé nhất trong mảng là: " + arr[index]);
    }

    public static int minVelue(int[] Array){
        int index = 0;
        for (int i =1; i<Array.length; i++){
            if (Array[i]<Array[index]){
                index = i;
            }
        }
        return index;
    }
}
