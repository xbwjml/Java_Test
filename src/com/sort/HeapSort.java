package com.sort;


public class HeapSort {
	public static void main(String[] args) {
      int[] arr = {16, 7, 3, 20, 17, 8};
      heapSort(arr);
      for (int i : arr) {
          System.out.print(i + " ");
      }
	}
	
	/**
	 * 堆排序
	 * @param arr 待排序列
	 */
	public static void heapSort(int[] arr) {
		//首先把待排序列按顺序，以层序遍历的方式放入一个完全二叉树
		
		//把上面这颗二叉树转换成一个大顶堆
		for( int i= (arr.length-1)/2 ; i>=0; i--) {
			//从最后一个非叶子结点开始调整，从下至上，从左至右。
			//最后一个非叶子结点索引为(arr.length-1)/2
			adjustHeap(arr, i, arr.length);
		}
		
		System.out.println("刚完成初始堆");
		
		//调整堆结构，交换堆顶元素与末尾元素
		for( int i= arr.length-1; i>0; i-- ) {
			//交换堆顶元素与末尾元素
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			
			//重新调整堆,末尾元素不参加新一次的调整
			adjustHeap(arr,0,i);
		}
	}
	
	/**
	 * 调整堆
	 * @param arr		待排序列
	 * @param parent	父节点
	 * @param length	待排序列长度
	 */
	public static void adjustHeap(int[] arr, int parent, int length) {
		int temp = arr[parent];//将temp作为父节点
		
		int lChild = 2*parent +1;//parent的左孩子
		
		while( lChild < length ) {//首先得判断 parent 的左孩子是否存在
			
			if( lChild+1<length && arr[lChild]<arr[lChild+1] ) {
				//若parent的右孩子存在,并且又孩子比左孩子大
				lChild += 1;
			}
			
			if( temp >=arr[lChild] ) {
				//如果parent比它的孩子都大，那么下面就不用比较了
				break;
			}
			
			//如果parent没它的孩子大，则把比parent大的孩子的值赋值给parent
			arr[parent] = arr[lChild];
			//把当前比parent大的孩子结点作为下一轮调整堆的parent,继续向下调整
			parent = lChild;
			lChild = 2*lChild + 1 ;
		}
		
		arr[parent] = temp;
	}
}