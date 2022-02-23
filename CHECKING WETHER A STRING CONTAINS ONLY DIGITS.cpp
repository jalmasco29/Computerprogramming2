#include<iostream>
#include<cstring>
using namespace std;
main()
{
	int count=0,in;
	string str;
	cout<<"Enter your String:";
	getline(cin,str);
	int len=0;
	for(in=0;str[in]!='\0';in++)
	{
		len++;
	}
	for(in=0;in<len;in++)
	{
		if(str[in]>='0'&&str[in] <='9')
		{
			count++;
		}
	}
	if(count==len)
	   cout<<"String contains only digits.";
	else
	cout<<"String does not contain only digits.";
}
