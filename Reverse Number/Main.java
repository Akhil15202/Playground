#include <iostream>
int main() 
{
	int a,n ;
  std::cin>>a;
  while(a>0)
  {
    n = a%10;
    a = a/10;   
  std::cout<<n;
  } 
  return 0;
}