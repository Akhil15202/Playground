#include<iostream>
using namespace std;
int main()
{
  int n, i;
  cin>>n;
  int a[n];
  for( i=0;i<n;i++) 
  {
    cin>>a[i];
  }
  for(i=0;i<n;++i)
  {
    if(a[0] <a[i])
      a[0]=a[i];
  }
  cout<<a[0];
      
    
  
}