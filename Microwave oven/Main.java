#include<iostream>
#include<iomanip>

using namespace std;
int main()
{
  int a;
  float x;
  cin>>a>>x;
  if(a==1)
    cout<<fixed<<setprecision(2)<<x;
  else if(a==2)
    cout<<fixed<<setprecision(2)<<(x/2)+x;
  else if(a==3)
    cout<<fixed<<setprecision(2)<<x*2;
  else
    cout<<"Number of items is more";
  
}