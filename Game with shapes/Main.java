#include<iostream>
#include<iomanip>
#define pi 3.14
using namespace std;
int main()
{
  int r, x;
  float area, areas;
  cin>>r>>x;
  area = 2*r;
  if(area==x)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
  return 0;

}