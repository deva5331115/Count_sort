import java.util.Arrays;
import java.util.Scanner;

public class CountSort
        {
                public static void CountSort(int array[],int size)
                {
                        int count_arr[]=new int[10];
                        Arrays.fill(count_arr,0);
                        for(int i=0;i<size;i++)
                        {
                                count_arr[array[i]]++;
                        }
                        for(int i=0;i<10;i++)
                        {

                                for(int j=0;j<count_arr[i];j++)
                                {
                                        System.out.print(i+" ");
                                }
                        }
                }
                public static void main(String[] args) {
                        Scanner scanner=new Scanner(System.in);
                        int size=scanner.nextInt();
                        int array[]=new int[size];
                        for(int i=0;i<size;i++)
                        {
                                array[i]=scanner.nextInt();
                        }

                        CountSort(array,size);
                }

        }
