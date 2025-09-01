package HeapsPractice;

class MinHeap{
    private int[] arr;
    private int size;
    MinHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
//    Add Function
    public void add(int num){
        arr[size++] = num;
        upheapify(size-1);
    }
    public void upheapify(int child){
        if(child==0) return;
        int parent =(child-1)/2;
        if(arr[child] < arr[parent]){
            swap(child,parent);
            upheapify(parent);
        }
    }
    public void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int peek() throws Exception{
        if(size == 0) {
            throw new Exception("heap is empty!");
        }
        return arr[0];
    }

//    Remove Function
    public int remove() throws Exception{
        if(size == 0) throw new Exception("Heap is Empty");
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void downHeapify(int idx){
        if(idx>=size) return;

        int leftchild = 2*idx-1 , rightchild = 2*idx+1;
        int minIdx = idx;

        if(leftchild<size && arr[leftchild] < arr[minIdx]) minIdx = leftchild;

        if(rightchild<size && arr[rightchild]<arr[minIdx]) minIdx = rightchild;

        if(idx == minIdx) return;
        swap(idx,minIdx);
        downHeapify(minIdx);
    }
    public int getSize(){
        return size;
    }
}
public class MinHeapImplementationArray {
    public static void main(String[] args) throws Exception{
        MinHeap pq = new MinHeap(10);
        pq.add(10);
        pq.add(1);
        pq.add(6);
        pq.remove();

    }
}
