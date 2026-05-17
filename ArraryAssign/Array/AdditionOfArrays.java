package Array;

import java.util.Arrays;

public class AdditionOfArrays {
	public static void main(String[] args) {
		
				int[] arr = {2,3,10};
				int[] arr1 = {2,4,5};
				int sum=0,sum1=0;
			   int[] arr3 = new int[3];
			   for(int k=0;k<=arr.length-1;k++)
			   {
				  int ele = arr[k];
				  sum1= sum1 +ele;
			   }
			  System.out.println(sum1);
				
			   for(int i=0;i<arr.length;i++)
				{
				int ele1=arr[i];
				//System.out.println(ele1);
				for(int j=i;j==i;j++)
				 {
					int ele2=arr1[j];
					//System.out.println(ele2);
					 sum=ele1+ele2;
					arr3[i]=sum;
					
				}
				
				}
			
			System.out.println(Arrays.toString(arr3));
			   
			  // arr3[arr3.length-1]=sum;
				//System.out.println(Arrays.toString(arr3));
			}

		}



