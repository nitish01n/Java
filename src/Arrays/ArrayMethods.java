package Arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayMethods {

    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr11 = {11,22,33,44};
        List<int[]> al1 = Arrays.asList(arr1,arr1);

        arr1[1]=23;
        al1.set(0,arr11);
        for(int a:arr1)
        {
            System.out.print(a+" ");
        }
        System.out.println();

        for(int[] a: al1)
        {
            for(int aa: a)
            {
                System.out.print(aa+" ");
            }
        }
        System.out.println();

        int[] arr2 = new int[]{1,2,3,4,5};
        int[] arr20 = {10,20,30,40,50};

        List<int[]> al2 = List.of(arr2,arr2);
        try {
            al2.set(0,arr20);
        }
        catch (UnsupportedOperationException e)
        {
            System.out.println();
            System.out.println(e.getMessage()+" "+ "Arrays.toString(e.getStackTrace())");
        }

        for(int a:arr2)
        {
            System.out.print(a+" ");
        }
        System.out.println();
        for(int[] a:al2)
        {
            for(int aa:a)
            {
                System.out.print(aa+" ");
            }
        }
    }
}
