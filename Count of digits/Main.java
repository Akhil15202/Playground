#include<iostream>
int main()
{
  int a, count =0;
  std::cin>>a;
  
  do
  {
    a=a/10;
    count++;
}
  while(a!=0);
  std::cout<<count;
} 