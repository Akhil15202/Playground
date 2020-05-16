 #include <bits/stdc++.h> 
using namespace std; 
void printCollatz(int n) 
{ 
  int count =0;
   while (n != 1) 
    { 
        cout << n << "\n";
        if (n & 1) 
            n = 3*n + 1;
        else
            n = n/2;
     count++;
    } 
  cout << n; 
  cout<<"\n"<<count;
} 
int main() 
{ 
  int a;
  cin>>a;
    printCollatz(a); 
    return 0; 
} 