package sortAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:以下算法均为内部排序算法，可分为以下几类：
 * 	1、插入排序：直接插入排序、二分插入排序、希尔排序
 * 	2、选择排序：简单选择排序、堆排序
 *  3、交换排序：冒泡排序、快速排序
 *  4、归并排序：二路归并、多路归并
 *  5、基数排序
 * @author vechace
 * date:2018/3/5
 *
 */
public class Sort {

	public static void main(String[] args) {
		
		int[] a ={48,11,54,46,98,78,22,31,0,1};
		System.out.println("排序前：" + Arrays.toString(a));
		
		//测试用
		//insertSort(a);
		//binaryInsertSort(a);
		//shellSort(a);
		//selectSort(a);
		//heapSort(a);
		//bubbleSort(a);
		//quickSort(a);
		//mergeSort(a, 0, a.length-1);
		radixSort(a);
		
		System.out.println("排序后：" + Arrays.toString(a));


	}
	
	/**************************************
	 * 插入排序：直接插入排序、二分插入排序、希尔排序  *
	 **************************************/
	
	/**
	 * 直接插入排序：平均时间复杂度为 O(n^2),稳定
	 * 最好情况：若文件初态是正序，时间复杂度是O(n)
	 * 最坏情况：初态反序，时间复杂度是O(n^2)
	 * @param a
	 */
	public  static void  insertSort(int[] a){
		
		//System.out.println("直接插入排序");
		
		for(int i = 0;i<a.length;i++){
			
			int temp = a[i];
			int j;
			for(j = i-1;j>=0;j--){
				if(a[j]>temp){
					a[j+1] = a[j];
				}else break;
			}
			a[j+1] = temp;
		}
	}
	
	/**
	 * 二分插入排序：平均时间复杂度为 O(n^2), 稳定
	 * 最好情况：O(n),最坏情况：O(n^2/2)
	 * @param a
	 */
	public static void binaryInsertSort(int[] a){
		
		for(int i = 1;i<a.length;i++){
			int temp = a[i];
			int left = 0, right = i-1, mid = 0;
			while(left <= right){
				mid = (left + right)/2;
				if(temp < a[mid]){
						right = mid-1;
				}
				else {
					left = mid +1;
				}
			}
			
			for(int j = i-1;j >= left;j--){
				a[j+1] = a[j];
			}
			if(left !=i){
				a[left] = temp;
			}
			
		}
	}
	
	/**
	 * 希尔排序：平均时间复杂度为O(n*logn),不稳定
	 * 
	 * @param a
	 */
	public static void shellSort(int[] a){
		int d = a.length;
		while(true){
			d = d/2;
			for(int x = 0;x <d;x++){
				for(int i = x+d;i<a.length;i = i+d){
					int temp = a[i];
					int j;
					for( j = i-d;j>=0&&a[j]>temp;j=j-d){
						a[j+d] = a[j];
					}
					a[j+d] = temp;
				}
			}
			if(d==1) break;
		}
	}
	
	/***************************
	 * 选择排序：直接选择排序、堆排序    *
	 ***************************/
	
	/**
	 * 简单选择排序：平均时间复杂度为O(n^2)，不稳定
	 * @param a
	 */
	public static void selectSort(int[] a){
		
		for(int i = 0;i < a.length;i++){
			int min = a[i];
			int n = i;//最小数索引
			for(int j = i+1;j<a.length;j++){
				if(a[j]<min){
					min = a[j];
					n = j;
				}
			}
			a[n] = a[i];
			a[i] = min;
		}
	}
	
	/**
	 * 堆排序：平均时间复杂度为 O(n*logn),不稳定
	 * @param a
	 */
	public static void heapSort(int[] a){
		int arrayLength = a.length;
		//循环建立堆
		for(int i = 0;i <arrayLength-1;i++){
			buildMaxHeap(a,arrayLength-1-i);
			//交换堆顶和最后一个元素
			swap(a,0,arrayLength-1-i);
		}
	}
	
	//建立大顶堆
	private static void buildMaxHeap(int[] data,int lastIndex){
		//从最后一个节点的父节点开始
		for(int i = (lastIndex-1)/2;i>=0;i--){
			//保存正在判断的结点
			int k=i;
			//如果当前k节点的子节点存在
			while(k*2+1<lastIndex){
				 //k节点的左子节点的索引
				int biggerIndex = 2*k+1;
				//如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
				if(biggerIndex <lastIndex){
					//若右子节点的值较大
					if(data[biggerIndex]<data[biggerIndex+1]){
						biggerIndex++;
					}
				}
				//如果k节点的值小于其较大的子节点的
				if(data[k]<data[biggerIndex]){
					swap(data,k,biggerIndex);
					//将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值
					k = biggerIndex;
				}
				else break;
			}
		}
	}
	
	//交换
	private static void swap(int[] data,int i,int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	/*************************
	 * 交换排序：冒泡排序、快速排序   *
	 *************************/
	
	/**
	 * 冒泡排序：平均时间复杂度为：O(n^2),稳定
	 * @param a
	 */
	public static void bubbleSort(int[] a){
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * 快速排序：平均时间复杂度为 O(n*logn),不稳定
	 * @param a
	 */
	public static void quickSort(int[] a){
		
		if(a.length>0){
			qSort(a,0,a.length-1);
		}
	}
	//一趟快排
	private static void qSort(int[] a, int low, int high) {
		int pivotloc;
		if(low<high){//递归退出条件，如果不加则无法退出导致堆栈溢出异常
			pivotloc = partition(a,low,high);
			qSort(a,0,pivotloc-1);
			qSort(a,pivotloc+1,high);
		}
	}
	//划分
	private static int partition(int[] a, int low, int high) {
		int temp = a[low];
		while(low<high){
			//high左移找到比temp小的数时暂停
			while(low<high && a[high]>=temp){
				high--;
			}
			
			a[low] = a[high];
			//low右移找到比temp大的数时暂停
			while(low<high && a[low]<=temp){
				low++;
			}
			a[high] = a[low];
		}
		a[low] = temp;
		return low;
	}
	
	/***********************************************/
	/**
	 * 归并排序：平均时间复杂度为：O(n*logn),稳定，速度仅次于快排
	 * @param a
	 * @param left
	 * @param right
	 */
	public static void mergeSort(int[] a,int left,int right){
		if(left<right){
			int middle = (left+right)/2;
			//对左边递归
			mergeSort(a,left,middle);
			//对右边递归
			mergeSort(a,middle+1,right);
			//合并
			merge(a,left,middle,right);
		}
	}
	//归并
	private static void merge(int[] a, int left, int middle, int right) {
		
		int[] tempArray = new int[a.length];
		int mid = middle+1;//右边的起始位置
		int temp = left;
		int third = left;
		while(left<=middle && mid<=right){
			//从两个数组中选取较小的数放入中间数组
			if(a[left]<=a[mid]){
				tempArray[third++] = a[left++];
			}else {
				tempArray[third++] = a[mid++];
			}
		}
		//将剩余的部分放入中间数组
		while(left<=middle){
			tempArray[third++] = a[left++];
			
		}
		while(mid<=right){
			tempArray[third++] = a[mid++];
		
		}
		//将中间数组复制回原数组
		while(temp <= right){
			a[temp] = tempArray[temp++];
		}
	}
	
	
	/**
	 * 基数排序：平均时间复杂度为：O(d(n+r)),d为位数，r为基数，最稳定的排序算法
	 * @param array
	 */
	public static void radixSort(int[] array) {
		
		//找到最大数，确定要排序几趟
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if(max<array[i]){
				max = array[i];
			}
		}
		//判断位数
		int times = 0;
		while(max>0){
			max = max/10;
			times++;
		}
		
		//建立十个队列
		List<ArrayList> queue = new ArrayList<ArrayList>();
		for (int i = 0; i < 10; i++) {
			ArrayList queue1 = new ArrayList();
			queue.add(queue1);
		}
		        
		//进行times次分配和收集
		for (int i = 0; i < times; i++) {
			//分配
			for (int j = 0; j < array.length; j++) {
				int x = array[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10, i);
				ArrayList queue2 = queue.get(x);
				queue2.add(array[j]);
				queue.set(x,queue2);
			}
			
			//收集
			int count = 0;
			for (int j = 0; j < 10; j++) {
				while(queue.get(j).size()>0){
					ArrayList<Integer> queue3 = queue.get(j);
					array[count] = queue3.get(0);
					queue3.remove(0);
					count++;
				}
			}
		}
	}
	
	public static void test(){
		int j = 1 ;
		for(int i = 0;j+i !=10;j++,i++) System.out.println("j is " +j);
	}

}
