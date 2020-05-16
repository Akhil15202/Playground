#include<iostream>
using namespace std;
int main()
{
  int a, b, c, d, e, f, g, h, i, x, y, z;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  x = (a - (a*b) /100)+c;
  y = (d - (d*e) /100)+f;
  z = (g - (g*h) /100)+i;
  cout<<"In Flipkart Rs."<<x;
  cout<<"\nIn Snapdeal Rs."<<y;
  cout<<"\nIn Amazon Rs."<<z;
  
  if(x<=y&&x<z)
    cout<<"\nHe will prefer Flipkart";
  else if(y<x&&y<z)
    cout<<"\nHe will prefer Snapdeal";
  else
    cout<<"\nHe will prefer Amazon";
  
}