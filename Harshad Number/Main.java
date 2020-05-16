#include<iostream>
using namespace std;

int main()
{
  int a, b, c, x, y, temp;
 int sum = 0;
  cin>>a;
  temp = a;
  while(a>0)
  {
    int r= a%10;
    sum =sum+r;
    a = a/10;
}
  if((temp%sum)==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
} 