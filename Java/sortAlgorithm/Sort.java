package sortAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:�����㷨��Ϊ�ڲ������㷨���ɷ�Ϊ���¼��ࣺ
 * 	1����������ֱ�Ӳ������򡢶��ֲ�������ϣ������
 * 	2��ѡ�����򣺼�ѡ�����򡢶�����
 *  3����������ð�����򡢿�������
 *  4���鲢���򣺶�·�鲢����·�鲢
 *  5����������
 * @author vechace
 * date:2018/3/5
 *
 */
public class Sort {

	public static void main(String[] args) {
		
		int[] a ={48,11,54,46,98,78,22,31,0,1};
		System.out.println("����ǰ��" + Arrays.toString(a));
		
		//������
		//insertSort(a);
		//binaryInsertSort(a);
		//shellSort(a);
		//selectSort(a);
		//heapSort(a);
		//bubbleSort(a);
		//quickSort(a);
		//mergeSort(a, 0, a.length-1);
		radixSort(a);
		
		System.out.println("�����" + Arrays.toString(a));


	}
	
	/**************************************
	 * ��������ֱ�Ӳ������򡢶��ֲ�������ϣ������  *
	 **************************************/
	
	/**
	 * ֱ�Ӳ�������ƽ��ʱ�临�Ӷ�Ϊ O(n^2),�ȶ�
	 * �����������ļ���̬������ʱ�临�Ӷ���O(n)
	 * ��������̬����ʱ�临�Ӷ���O(n^2)
	 * @param a
	 */
	public  static void  insertSort(int[] a){
		
		//System.out.println("ֱ�Ӳ�������");
		
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
	 * ���ֲ�������ƽ��ʱ�临�Ӷ�Ϊ O(n^2), �ȶ�
	 * ��������O(n),������O(n^2/2)
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
	 * ϣ������ƽ��ʱ�临�Ӷ�ΪO(n*logn),���ȶ�
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
	 * ѡ������ֱ��ѡ�����򡢶�����    *
	 ***************************/
	
	/**
	 * ��ѡ������ƽ��ʱ�临�Ӷ�ΪO(n^2)�����ȶ�
	 * @param a
	 */
	public static void selectSort(int[] a){
		
		for(int i = 0;i < a.length;i++){
			int min = a[i];
			int n = i;//��С������
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
	 * ������ƽ��ʱ�临�Ӷ�Ϊ O(n*logn),���ȶ�
	 * @param a
	 */
	public static void heapSort(int[] a){
		int arrayLength = a.length;
		//ѭ��������
		for(int i = 0;i <arrayLength-1;i++){
			buildMaxHeap(a,arrayLength-1-i);
			//�����Ѷ������һ��Ԫ��
			swap(a,0,arrayLength-1-i);
		}
	}
	
	//�����󶥶�
	private static void buildMaxHeap(int[] data,int lastIndex){
		//�����һ���ڵ�ĸ��ڵ㿪ʼ
		for(int i = (lastIndex-1)/2;i>=0;i--){
			//���������жϵĽ��
			int k=i;
			//�����ǰk�ڵ���ӽڵ����
			while(k*2+1<lastIndex){
				 //k�ڵ�����ӽڵ������
				int biggerIndex = 2*k+1;
				//���biggerIndexС��lastIndex����biggerIndex+1�����k�ڵ�����ӽڵ����
				if(biggerIndex <lastIndex){
					//�����ӽڵ��ֵ�ϴ�
					if(data[biggerIndex]<data[biggerIndex+1]){
						biggerIndex++;
					}
				}
				//���k�ڵ��ֵС����ϴ���ӽڵ��
				if(data[k]<data[biggerIndex]){
					swap(data,k,biggerIndex);
					//��biggerIndex����k����ʼwhileѭ������һ��ѭ�������±�֤k�ڵ��ֵ�����������ӽڵ��ֵ
					k = biggerIndex;
				}
				else break;
			}
		}
	}
	
	//����
	private static void swap(int[] data,int i,int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	/*************************
	 * ��������ð�����򡢿�������   *
	 *************************/
	
	/**
	 * ð������ƽ��ʱ�临�Ӷ�Ϊ��O(n^2),�ȶ�
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
	 * ��������ƽ��ʱ�临�Ӷ�Ϊ O(n*logn),���ȶ�
	 * @param a
	 */
	public static void quickSort(int[] a){
		
		if(a.length>0){
			qSort(a,0,a.length-1);
		}
	}
	//һ�˿���
	private static void qSort(int[] a, int low, int high) {
		int pivotloc;
		if(low<high){//�ݹ��˳�����������������޷��˳����¶�ջ����쳣
			pivotloc = partition(a,low,high);
			qSort(a,0,pivotloc-1);
			qSort(a,pivotloc+1,high);
		}
	}
	//����
	private static int partition(int[] a, int low, int high) {
		int temp = a[low];
		while(low<high){
			//high�����ҵ���tempС����ʱ��ͣ
			while(low<high && a[high]>=temp){
				high--;
			}
			
			a[low] = a[high];
			//low�����ҵ���temp�����ʱ��ͣ
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
	 * �鲢����ƽ��ʱ�临�Ӷ�Ϊ��O(n*logn),�ȶ����ٶȽ����ڿ���
	 * @param a
	 * @param left
	 * @param right
	 */
	public static void mergeSort(int[] a,int left,int right){
		if(left<right){
			int middle = (left+right)/2;
			//����ߵݹ�
			mergeSort(a,left,middle);
			//���ұߵݹ�
			mergeSort(a,middle+1,right);
			//�ϲ�
			merge(a,left,middle,right);
		}
	}
	//�鲢
	private static void merge(int[] a, int left, int middle, int right) {
		
		int[] tempArray = new int[a.length];
		int mid = middle+1;//�ұߵ���ʼλ��
		int temp = left;
		int third = left;
		while(left<=middle && mid<=right){
			//������������ѡȡ��С���������м�����
			if(a[left]<=a[mid]){
				tempArray[third++] = a[left++];
			}else {
				tempArray[third++] = a[mid++];
			}
		}
		//��ʣ��Ĳ��ַ����м�����
		while(left<=middle){
			tempArray[third++] = a[left++];
			
		}
		while(mid<=right){
			tempArray[third++] = a[mid++];
		
		}
		//���м����鸴�ƻ�ԭ����
		while(temp <= right){
			a[temp] = tempArray[temp++];
		}
	}
	
	
	/**
	 * ��������ƽ��ʱ�临�Ӷ�Ϊ��O(d(n+r)),dΪλ����rΪ���������ȶ��������㷨
	 * @param array
	 */
	public static void radixSort(int[] array) {
		
		//�ҵ��������ȷ��Ҫ������
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if(max<array[i]){
				max = array[i];
			}
		}
		//�ж�λ��
		int times = 0;
		while(max>0){
			max = max/10;
			times++;
		}
		
		//����ʮ������
		List<ArrayList> queue = new ArrayList<ArrayList>();
		for (int i = 0; i < 10; i++) {
			ArrayList queue1 = new ArrayList();
			queue.add(queue1);
		}
		        
		//����times�η�����ռ�
		for (int i = 0; i < times; i++) {
			//����
			for (int j = 0; j < array.length; j++) {
				int x = array[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10, i);
				ArrayList queue2 = queue.get(x);
				queue2.add(array[j]);
				queue.set(x,queue2);
			}
			
			//�ռ�
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
