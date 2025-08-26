import java.util.ArrayList;

public class practise {
    public static int minElementsToRemove(ArrayList<Integer> arr) {
        int count = 0;
        for(int i=0; i<arr.size(); i++){
            int n = 0;
            int value = -1;
            while(true){
                    if(value==-1 && arr.get(i)!=-1) value=arr.get(i);
                int idx = arr.indexOf(value);
                if(idx!=-1){
                    arr.set(idx, -1);
                }else{
                    value = -1;
                    break;
                }
                if(n>0 && idx!=-1) count++;
                n+=1;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(1);
        al.add(2);

        System.out.println(minElementsToRemove(al));
    }
}
