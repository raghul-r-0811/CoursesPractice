#include<stdio.h>
#include<stdlib.h>

struct LLnode{
    int value;
    LLnode *next;
};

 void printLinkedList(struct LLnode *head){
    struct LLnode *temp = head;
    while(temp != NULL){
        printf("%d \n",temp->value);
        temp = temp->next;
    }

}

void findMiddle(LLnode *head){
    // 1 2 3 4 5
    LLnode *fast = head;
    LLnode *slow = head;
    if(head!= NULL){
        while(fast != NULL && fast->next != NULL){
            fast = fast->next->next;
            slow = slow->next;
        }
        printf("Middle elemet is %d \n", slow->value);
    }
}

int main(){
    
    struct LLnode* head = NULL;
    struct LLnode* second = NULL;
    struct LLnode* third = NULL;

    head = (struct LLnode*)malloc(sizeof(struct LLnode));
    second = (struct LLnode*)malloc(sizeof(struct LLnode));
    third = (struct LLnode*)malloc(sizeof(struct LLnode));

     head->value =10;
    second->value = 20;
    third->value = 30;

    head->next= second;
    second->next = third;

    printLinkedList(head);
    findMiddle(head);

    





}