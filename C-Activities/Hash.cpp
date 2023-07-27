#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>

#define SIZE 20

struct Item
{
    int data,key;
};

struct Item *hasharray[SIZE];
struct Item *d_item;
struct Item *item;

int hashCode(int key){
    return key % SIZE;
}

struct Item *search(int key){
    int hashvalue = hashCode(key);
    while(hasharray[hashvalue] != NULL){
        if(hasharray[hashvalue]->key == key)
            return hasharray[hashvalue];
            ++hashvalue;
            hashvalue %= SIZE;
    }
    return NULL;
}

void insert(int key,int data){
    struct Item *item = (struct Item*)malloc(sizeof(struct Item));
    item->data = data;
    item->key    = key;
    int hashvalue = hashCode(key);
    while(hasharray[hashvalue] != NULL && hasharray[hashvalue]->key != -1){
        ++hashvalue;
        hashvalue  %= SIZE;        
    }
    hasharray[hashvalue] = item;
}


struct Item *deletehash(struct Item* item){
     int key = item->key; 
    int hashvalue = hashCode(key); 
    while(hasharray[hashvalue] != NULL){
         if(hasharray[hashvalue]->key == key){
             struct Item* temp = hasharray[hashvalue];
            hasharray[hashvalue] = d_item; 
            return temp;
            }
        ++hashvalue; 
        hashvalue %= SIZE;
    }
    return NULL;
}

int main(){
    d_item = (struct Item*)malloc(sizeof(struct Item));
    d_item->data = -1;
    d_item->key = -1;
    insert(1,20);
    insert(2,70);
    insert(42,80);
    insert(4,25);
    insert(12,44);
    insert(14,32);
    insert(17,11);
    insert(13,78);
    insert(37,97);
    item = search(37);
    if(item != NULL){
        printf("element found: %d\n",item->data);
    }else{
        printf("element not found\n");
    }
    delete(item);
    item = search(37);
    if(item != NULL){
        printf("element found: %d\n",item->data);
    }else{
        printf("element not found\n");
    }
   
}