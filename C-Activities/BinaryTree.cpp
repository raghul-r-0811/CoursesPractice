#include <stdio.h>
#include <stdlib.h>

struct node{
    int value;
    struct node *left;
    struct node *right;
};

struct node *createBiTree(int value){
    struct node *root = (struct node*)malloc(sizeof(struct node));
    root->value=value;
    root->left = NULL;
    root->right = NULL;
    return root;
}

void inorder(struct node *root){
    if(root != NULL){
    inorder(root->left);
    printf("%d \n", root->value);
    inorder(root->right);
    }
}

struct node *insertNode(struct node *root,int value){
    
        if(root == NULL){
          return  createBiTree(value);
        }
        if(root->value > value){
           root->left=  insertNode(root->left,value);
        }else if(root->value < value){
           root->right= insertNode(root->right,value);
        }
          return root;
        }
    


int main(){
    struct node *mytree = NULL;
    mytree = insertNode(mytree,50);
    insertNode(mytree,30) ;
    insertNode(mytree,20) ;
    insertNode(mytree,40) ;
    insertNode(mytree,70) ;
    insertNode(mytree,60) ;
    insertNode(mytree,80) ;
    inorder(mytree);


}