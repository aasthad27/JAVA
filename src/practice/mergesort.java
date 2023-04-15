package practice;
import java.util.*;
import java.util.Scanner;

public class mergesort {
	public static void merge(int arr[],int mid,int l ,int h)
	{
		int sizeone=mid-l+1;
		int sizetwo=h-mid;
		int arr1[]=new int[sizeone];
		int arr2[]=new int[sizetwo];
		for(int i=0;i<sizeone;i++)
		{
			arr1[i]=arr[l+i];
		}
		for(int i=0;i<sizetwo;i++)
		{
			arr2[i]=arr[mid+i+1];
		}
		int leftarray=0;
		int rightarray=0;
		int mergearray=l;
		while(leftarray<sizeone && rightarray<sizetwo)
		{
			if(arr1[leftarray]<=arr2[rightarray])
			{
				arr[mergearray]=arr1[leftarray];
				leftarray++;
				mergearray++;
			}
			else
			{
				arr[mergearray]=arr2[rightarray];
				rightarray++;
				mergearray++;
			}
		}
		while(leftarray<sizeone)
		{
			arr[mergearray]=arr1[leftarray];
			leftarray++;
			mergearray++;
		}
		while(rightarray<sizetwo)
		{
			arr[mergearray]=arr2[rightarray];
			rightarray++;
			mergearray++;
		}
		
	}
	
	public static void ms(int arr[],int l,int h)
	{
		if(l<h)
		{
			int mid=(l+h)/2;
			ms(arr,l,mid);
			ms(arr,mid+1,h);
			merge(arr,mid,l,h);
		}
	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		ms(arr,0,n-1);
		print(arr);
	}
}
