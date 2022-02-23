#include<iostream>
#include<string.h>
using namespace std;

int main(){
	char first[50], second[50];
	int length1, length2, found=0, not_found=0;
	cout<<"Enter first string: ";
	gets(first);
	cout<<"Enter second string: ";
	gets(second);
	length1=strlen(first);
	length2=strlen(second);
	if(length1==length2){
		for(int i=0; i<length1; i++){
			found=0;
			for(int j=0; j<length1; j++){
				if(first[i]==second[j]){
					found=1;
					break;
				}
			}
			if(found==0){
				not_found=1;
				break;
			}
		}
		if(not_found==1)
		   cout<<"\nEntered string are not anagram ";
		else
		   cout<<"\nEntered string are anagram ";
	}
	return 0;
}
