#include<iostream>
using namespace std;
int power(int x, int y, int z) {  
   int i,power=1;
   if(y == 0)
      return 1;
   for(i=1;i<=y;i++)
      power=power*x;
  return power;
 /* if(power>=z)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor!  you need more bacteria.";
*/
}

int main() { 
   int x , y, z, p;
  cin>>x>>y>>z;
  p =power(x, y, z);
  if(p>=z)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
   
} 