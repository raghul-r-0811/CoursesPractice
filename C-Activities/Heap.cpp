#include <stdio.h>
#include <stdlib.h>

int c;
int heapsize;
void max_heapify(int a[],int i){
    int l,r,largest,temp;
    l = 2*i;
    r = 2*i+1;
    if(l<= heapsize && a[l] > a[i] ){
        largest = l;
    }else{
        largest = i;
    }
    if(r <=heapsize && a[r]>a[largest]){
        largest =r;
    }
    if(largest != i){
        temp = a[largest];
        a[largest] = a[i];
        a[i] = temp;
        max_heapify(a,largest);
    }
}

void build_max_hrap(int a[]){
    int i;
    for(i =c/2;i>=1;i--){
        max_heapify(a,i);
    }
}
 
 int maximum(int a[]){
    return a[1];
 }

 int extract_max(int a[]){
    int max,temp;
    max =a[1];
    temp =a[1];
    a[1] = a[heapsize];
    a[heapsize] = temp;
    heapsize--;
    max_heapify(a,1);
    return max;
 }

int main(){
    int i,val,num;
    int a[11]={0,4,1,3,2,16,9,10,14,8,7};
    heapsize =10;
    c=10;
    build_max_hrap(a);
    for( i=1;i<=heapsize;i++){
        printf("\n %d",a[i]);
    }
    val=maximum(a);
    printf("\n\n maximum value = %d",val);
    printf("\n display element of max heap priority queue : ");
    for(i =1;i<=c;i++){
        printf("%d ",a[i]);
        }
        val = extract_max(a);
        printf(" \n extract maximum valur = %d",val);
        int val2 = extract_max(a);
        return 1;
    }














