#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a, b, c,d;
  float x,n, e, z, y, p, q;
  cin>>a>>b>>c>>d;
  x = a/6;
  y = d/6;
  z = d%6;
  n = z/10;
  e = y+n;
  p = c/e;
  q = b/x;
  cout<<x;
  cout<<"\n"<<e;
  cout<<fixed<<setprecision(1)<<"\n"<<p;
  cout<<"\n"<<q;
  (p>q)?cout<<"\nEligible to Win":cout<<"\nNot Eligible to Win";
}