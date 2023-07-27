#include <stdio.h>
#include <stdlib.h>

struct Queue{
    int front,rear,size;
    int *arr;
    unsigned capacity;
};

struct Queue *createQueue(unsigned capacity){
    struct Queue *queue = (struct Queue*)malloc(sizeof(struct Queue));
    queue->capacity= capacity;
    queue->front=queue->size=0;
    queue->rear= capacity-1;
    queue->arr = (int*)malloc(sizeof(int) * queue->capacity);
    return queue;
}

int isfull(struct Queue* queue){
    return (queue->size == queue->capacity);
}



void enQueue(struct Queue *queue,int item){
    if(isfull(queue)){
        return;
    }
    queue->rear = (queue->rear+1)%queue->capacity;
    queue->arr[queue->rear] = item;
    queue->size = queue->size+1;
    printf("%d enqueued tp queue\n",item);
}

int isEmpty(struct Queue* queue){
    return (queue->size == 0);
}

int dequeue(struct Queue *queue){
    if(isEmpty){
        return -1;
    }
    int item = queue->arr[queue->front];
    queue->front = (queue->front+1) % queue->capacity; 
    --queue->size;
    return item;

}
int main(){

    struct Queue *myqueue = createQueue(5);

    enQueue(myqueue,10);
    enQueue(myqueue,20);
    enQueue(myqueue,30);

    dequeue(myqueue);



}