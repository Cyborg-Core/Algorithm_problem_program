package BasicAlgorithm.DataStructuresAlgorithm;

public class MaxHeap {

    // 创建最大堆
    public static int[] buildMaxHeap(int[] arr)
    {
        //从最后一个根开始向前
        for(int i = arr.length/2-1;i>=0;i--)
        {
            adjustDownToTop(arr,i,arr.length);
        }
        return arr;
    }
    public static void adjustDownToTop(int[] arr,int k,int length) {
            int tmp = arr[k];
            //初始值为k的左节点 比较完之后讲i更新为新节点的左节点 左节点在这里判断为空
            for (int i = 2*k+1;i<length;i = 2*i+1)
            {
                if(i+1 <length && arr[i]<arr[i+1]) //取反就是最小堆
                {
                    i++; //切换为右子树
                }
                if(arr[i] <=tmp) //取反就是最小堆
                {
                    break;
                }else {
                    arr[k] = arr[i];//父节点等于子节点
                    k = i;
                }
            }
            arr[k] = tmp;
    }
    public static void main(String[] args)
    {
        int[] heap = new int[]{5,8,9,6,3,7,4,1};
        heap = buildMaxHeap(heap);
        for(int i = heap.length-1;i>0;i--)
        {
            int tmp = heap[0];
            heap[0]=heap[i];
            heap[i]=tmp;
            adjustDownToTop(heap,0,i);
        }
        for (int i:heap
             ) {
            System.out.println(i);
        }


    }
}
