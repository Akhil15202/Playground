#include<iostream>
using namespace std;
int main()
{
  int a, b, c, d, x, y, z;
  cin>>a>>b>>c>>d;
  x = b+d;
  y = a+c;
  
  if((x/100)==1)
  {
    y = y+1;
    x = x%100;
  }
  cout<<y<<"\n";
  cout<<x;
} 
    
  