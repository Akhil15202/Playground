
#include <iostream>
using namespace std;

int main() 
{
int a ,b,c,d,m,n, x, y, z;
cin>>a>>b>>c>>d;
m =(a*2);
n =(a*1);
x=(a*(b-1));
y=(a*(b-2));
if(c>=n&&c<=m)
cout<<"It is a mango tree";
else if(c>=y&&c<=x) 
cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
    return 0;
}






/*#include<iostream>
using namespace std;
int main()
{
  int a, b, c, x, d;
  cin>>a>>b>>c;
  d =a+b;
  if(a==b) 
    cout<<"It is a mango tree" ;
  else
    cout<<"It is not a mango tree";
   // cout<<"It is not a mango tree";
}
*/