#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

struct Stack{
    int top;
    unsigned  size;
    int* arr;
};

struct Stack *createStack(unsigned size ){
    struct Stack *stack = (struct Stack*)malloc(sizeof(struct Stack));
    stack->size = size;
    stack->top = -1;
    stack->arr = (int*)malloc(stack->size * sizeof(int));
    return stack;
}

int isFull(struct Stack *stack){
    return stack->top == stack->size-1;
}

int isEmpty(struct Stack *stack){
    return stack->top == -1;
}

void push(struct Stack *stack,int item){
    if(isFull(stack)){
        return;
    }
    stack->arr[++stack->top] = item;
}
int pop(struct Stack *stack){
    if(isEmpty(stack)){
        return -1;
    }
    return stack->arr[stack->top--];
}
int peek(struct Stack *stack){
    if(isEmpty(stack)){
        return -1;
    }
    return stack->arr[stack->top];
}



int main(){
    struct Stack *myStack = createStack(10);

    push(myStack,10);
    push(myStack,20);
    push(myStack,30);



}
