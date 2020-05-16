#include <iostream>
int main() 
{
 int k, a, b;
 std::cin>>a>>b;
 for(k = a;k <= b; k++)
 {
  int i=1,sum=0;
     while(i < k)
     {  
      if(k % i == 0)
      {
          sum = sum + i;
      }
       i++;
     }         
    if(sum == k)
    {
      std::cout<<i<<" ";
    } 
 }  
 return 0;
}
