import java.util.ArrayList;
import java.util.Iterator;

public class arrayClass {

    public void GetNames(int a){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=1; i<5; i++){
            arrayList.add(i*9);
        }
        Iterator<Integer> it = arrayList.iterator();
            int sum = 0;
            while (it.hasNext())
            {
                int num = it.next();
                if (num > 10) {
                    sum += num;
                }
            }
            System.out.println(sum);
        arrayList.forEach(System.out::println);
    }



    public static void main(String[] args){
        System.out.println();
        System.out.println();
        ArrayList<Integer> listOne = new ArrayList<>();
        for(int a=1; a<=5; a++){
            listOne.add(a*9);
        }

        listOne.forEach(System.out::println);
    }
}
