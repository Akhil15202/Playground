#include<iostream>
using namespace std;
int main()
{
  int age, a,b, c;
  float time, x;
  x =13.30;
  cin>>age>>time;
  if(age<13&&time==x)
    cout<<"$2.00";
  else if(age<13&&time!=x)
    cout<<"$4.00";
  else if(age>13&&time==x)
    cout<<"$5.00";
  else
    cout<<"$8.00";
    
    
}