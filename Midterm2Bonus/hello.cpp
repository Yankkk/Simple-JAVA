//UIUC CS125 SPRING 2014 MP. File: hello.cpp, CS125 Project: Midterm2Bonus, Version: 2014-04-01T08:17:54-0500.448442000
#include <iostream>
#include <string>

using std::string;
using std::cout;
using std::endl;

int main()
{
   cout << "Hey,";
   string mesg = "this my second C++ program";
   mesg += "!";
   cout << mesg << endl;
 
  // endl stands for 'end line'

   for(int i=1; i<17; i++) {
     for(int j = 1; j<17; j++){
      cout << i*j;
      cout << "  ";
     }
     cout << endl;
   }
   return 0;
}
