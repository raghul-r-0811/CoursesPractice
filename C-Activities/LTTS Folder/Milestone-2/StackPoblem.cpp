#include <stdio.h>
#include <stdlib.h>

struct Complex
{
    int real;
    int img;
};

struct Complex createComplexNumber(int realPart, int imgPart)
{
    struct Complex i;
    i.real = realPart;
    i.img = imgPart;
    return i;
}

struct Stack
{
    int top;
    unsigned size;
    struct Complex *complexArr;
};

struct Stack *createComplexStack(unsigned size)
{
    struct Stack *compStack = (struct Stack *)malloc(sizeof(struct Stack));
    compStack->size = size;
    compStack->top = -1;
    compStack->complexArr = (struct Complex*)malloc(size * sizeof(struct Complex));
    return compStack;
}

int isFull(struct Stack *stack)
{
    return stack->top == (stack->size) - 1;
}

int isEmpty(struct Stack *stack)
{
    return stack->top == -1;
}

void push(struct Stack *stack, int real, int img)
{
    struct Complex i = createComplexNumber(real, img);
    if (isFull(stack))
    {
        printf("stack is full \n");
        return;
    }
    stack->complexArr[++stack->top] = i;
}

struct Complex pop(struct Stack *stack){
    if (!isEmpty(stack)){
        struct Complex num = stack->complexArr[stack->top--];
        return num;
    }else{
        printf("stack is empty nothing is here in the stack to pop \n");
        struct Complex nullComplex;
        return nullComplex;
    }
}

int main()
{
    struct Stack *mystack = createComplexStack(5);

    push(mystack, 2, 1);
    push(mystack, 23, 1);
    push(mystack, 9, 11);
    push(mystack,45,6);
    push(mystack,8,9);
    struct Complex myPop = pop(mystack);
    printf("the poped complex number is %d + %di\n",myPop.real,myPop.img);

   
}