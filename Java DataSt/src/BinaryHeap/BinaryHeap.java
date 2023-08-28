package BinaryHeap;

public class BinaryHeap {
    int arr[];
    int sizeofTree;

    public BinaryHeap(int size){
        arr = new int[size+1];
        this.sizeofTree = 0;
        System.out.println("Binary heap has been created");
    }

    public boolean isEmpty(){
        if(sizeofTree ==0) return true;
        return false;
    }
    public Integer Peek(){
        if(isEmpty()) return null;
        return arr[1];
    }
    public int sizeofBH(){
        return sizeofTree;
    }

    public void levelorder(){
        for(int i=1;i<=sizeofTree ;i++){
            System.out.println(arr[i]+" ");
        }
    }

    //Heapify for Insert
    public void heapifyBottomToTop(int index,String heapType){
        int parent  = index/2;
        if(index <= 1){
            return;
        }
        if(heapType == "Min"){
            if(arr[index] < arr[parent]){
                int tmp = arr[index];
                arr[index] =arr[parent];
                arr[parent] =  tmp;
            }
        } else if (heapType == "Max") {
            if(arr[index] > arr[parent]){
                int tmp = arr[index];
                arr[index] =arr[parent];
                arr[parent] =  tmp;
            }
        }
        heapifyBottomToTop(parent,heapType);
    }

    public void insert(int value,String typeHeap){
        arr[sizeofTree+1] = value;
        sizeofTree++;
        heapifyBottomToTop(sizeofTree,typeHeap);
        System.out.println("Inserted "+value+" successfully in heap");
    }

    public void heapifyTopTOBottom(int index,String heapType){
        int left = index*2;
        int right = index*2 +1;
        int swapchild;
        if(sizeofTree<left){
            return;
        }
        if(heapType == "Max"){
            if(sizeofTree == left){
                if(arr[index] < arr[left]){
                    int tmp =arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            }else{
                if(arr[left]>arr[right]){swapchild = left;}
                else{swapchild = right;}
                if(arr[index] < arr[swapchild]){
                    int tmp = arr[index];
                    arr[index] = arr[swapchild];
                    arr[swapchild] = tmp;
                }
            }
        }else if(heapType == "Min"){
            if(sizeofTree == left){
                if(arr[index] > arr[left]){
                    int tmp =arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            }else{
                if(arr[left] < arr[right]){swapchild = left;}
                else{swapchild = right;}
                if(arr[index] > arr[swapchild]){
                    int tmp = arr[index];
                    arr[index] = arr[swapchild];
                    arr[swapchild] = tmp;
                }
            }
        }
    }

    public int extractHeapofBH(String heapTYpe){
        System.out.println("Extracting");
        if(isEmpty()){
            return -1;
        }else {
            int extractedValue = arr[1];
            arr[1] = arr[sizeofTree];
            sizeofTree--;
            heapifyTopTOBottom(1,heapTYpe);
            return extractedValue;
        }
    }

}


