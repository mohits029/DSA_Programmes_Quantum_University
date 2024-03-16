import java.util.ArrayList;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums[] = {2,5,4,6,8,1,2,5,4};
        ArrayList<Integer> list= new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            boolean flag= true;
            for(int j=0; j<list.size(); j++){
                if(list.get(j)== nums[i]){
                    flag= false;
                }
            }
            if(flag){
                list.add(nums[i]);
            }
        }

        System.out.println(list);

    }
}
