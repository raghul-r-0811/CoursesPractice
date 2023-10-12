#include<stdio.h>
#include<stdlib.h>


typedef struct Complex
{
    int real;
    int img;
}Complex;

Complex createComplexNumber(int realPart, int imgPart)
{
    struct Complex i;
    i.real = realPart;
    i.img = imgPart;
    return i;
}

typedef struct LLnode{
    Complex comp;
    struct LLnode *next;
}LLnode;

void printLL(LLnode *head){
     LLnode *temp = head;
    while(temp != NULL){
       printf("%d  + %di \n",temp->comp.real,temp->comp.img);
        temp = temp->next;
    }                     
}
int findLLSize(LLnode *head){
    LLnode *temp = head;
    int i=0;
    while(temp!=NULL){
        temp = temp->next;
        i++;
    }
    return i;
}

LLnode *createLinkedList(int real,int img){
    Complex icomp = createComplexNumber(real,img);
     LLnode *head = (LLnode*)malloc(sizeof(LLnode));
     head->comp = icomp;
     head->next = NULL;
     return head;
}

void  *addLinkedListNode(LLnode **head,int real,int img,int location){
    Complex icomp = createComplexNumber(real,img);
    LLnode *mynode = (LLnode*)malloc(sizeof(LLnode));
    mynode->next = NULL;
    mynode->comp = icomp;
    int totalNodes = findLLSize(*head);
    printf("before adding the total  nodes is %d\n",totalNodes);
    //to add node in the begining of the linked list
    if(location == 0){
        mynode->next = *head;
        *head = mynode;
    }
     else if(location >= totalNodes+1 ){
        LLnode *current = (LLnode*)malloc(sizeof(LLnode));
        current = *head;
        while(current->next !=NULL ){
            current = current->next;
        }
        current->next= mynode;
    }
    else{
        LLnode *current = (LLnode*)malloc(sizeof(LLnode));
        current = *head;
        for(int i=0;i<location-1;i++){
            current = current->next;
        }
        LLnode *temp = (LLnode*)malloc(sizeof(LLnode));
        mynode->next = current->next;
        current->next = mynode;

    }
    
}

int main(){
    LLnode *myLinkedList = createLinkedList(5,7);
    //LLnode *secLinkedList = createLinkedList(6,8);
    
    addLinkedListNode(&myLinkedList,7,9,0);
    addLinkedListNode(&myLinkedList,71,2,0);
    addLinkedListNode(&myLinkedList,80,-6,0);
    addLinkedListNode(&myLinkedList,35,7,8);
    addLinkedListNode(&myLinkedList,40,4,3);
    printLL(myLinkedList);   

    printf("size of the ll is %d\n",findLLSize(myLinkedList));
    // printf("size of myLinedList is %lu\n",sizeof(myLinkedList));
    // int num = 5;
    // printf("size of mynum is %lu\n",sizeof(num));
}

