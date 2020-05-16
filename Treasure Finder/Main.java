#include<iostream>
using namespace std;
int main()
{
  int a, b, c, x, y, z;
  cin>>a>>b>>c;
  
   if(a>b&&a<c)
   {
   cout<<"The treasure is in box which has number "<<a;
 //  cout<<"The code to open the box is "<<b;
   }
  else if(a>c&&a<b)
  {
   cout<<"The treasure is in box which has number "<<a;
 //  cout<<"\nThe code to open the box is "<<c;
  }
  else if(b>a&&b<c)
  {
   cout<<"The treasure is in box which has number "<<b;
 //  cout<<"\nThe code to open the box is "<<a;
  }
  else if(b>c&&b<a)
  {
   cout<<"The treasure is in box which has number "<<b;
 //  cout<<"\nThe code to open the box is "<<c;
  }
  else if(c>a&&c<b) 
  {
   cout<<"The treasure is in box which has number "<<c;
//   cout<<"\nThe code to open the box is "<<a;
  }  
  else
  {
   cout<<"The treasure is in box which has number "<<c;
  // cout<<"\nThe code to open the box is "<<c/c;
  } 
   if((a<b&&a<c)&&((b%a==0) &&(c%a==0))) 
   cout<<"\nThe code to open the box is "<<a;
   else if((b<a&&b<c)&&((a%b==0)&&(c%b==0)))
     cout<<"\nThe code to open box the is "<<b;
  else if((c<a&&c<b) &&((a%c==0)&&(b%c==0)))
    cout<<"\nThe code to open the box is "<<c;
  else
    cout<<"\nThe code to open the box is 1";
  
   
}