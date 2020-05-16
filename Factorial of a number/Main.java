#include<iostream>
int main()
{
  int a;
  int sum = 1;
  std::cin>>a;
  for(int i=1;i<=a;i++)  
  {
    sum =sum*i;
  } 
    std::cout<<sum;  
}