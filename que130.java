import java.util.ArrayList;
public class que130 {
    public static void main(String[] args) {
        int arr1[]= {1,4,6};
        int arr2[]= {1,4,8,10};

        ArrayList<Integer> union_list= new ArrayList<>();
        ArrayList<Integer> intersection_list= new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
            union_list.add(arr1[i]);
            
        }

        for(int i=0; i< arr2.length; i++){
            boolean flag= true;
            for (int e : union_list){
                if(e== arr2[i]){
                    flag= false;
                    break;
                }
            }
            if(flag){
                union_list.add(arr2[i]);
            }
        }


        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]== arr2[j]){
                    intersection_list.add(arr2[j]);
                }
            }
        }

        for(int i : union_list){
            System.out.print(i+" ");
        }

        System.out.println();
        for(int i : intersection_list){
            System.out.print(i+" ");
        }

    }
}
