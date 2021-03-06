#include <iostream>
using namespace std;
#define NIL -1
#define MAX 100

int lookup[MAX];

void _initialize(){
    for (int i = 0; i < MAX; i++){
        lookup[i] = NIL;
    };
};

int fib(int n){

    if (lookup[n] == NIL)
    {
        if(n<=1){
            lookup[n] = n;
        }else{
            lookup[n] = fib(n-1)+fib(n-2);
        }
    };
    return lookup[n];
}

int main(){
    int n = 40;
    _initialize();
    cout << "Fibanocci number is "<< fib(n); 
    return 0;

}

