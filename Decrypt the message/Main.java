#include<iostream>
using namespace std;
int main()
{
  int a, b,c;
  int sum=0, i;
  cin>>a>>b;
  c =a+b;
  for(int i=1;i<c;i++)
  {
    if(c%i==0)
    sum =sum+i;  
  }
  if((a==b)||(sum==c)) 
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  
  } 