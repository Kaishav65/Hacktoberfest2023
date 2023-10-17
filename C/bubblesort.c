//Bubble sort
#include<stdio.h>
#define size 5

void main()
{
  int a[]={1,6,3,0,2};
  for(int i=0;i<size;i++)
{
  for(int j=0;j<size-i-1;j++)
{
  if(a[j]<a[j+1])
{
  int temp = a[j];
  a[j] = a[j+1];
  a[j+1] = temp;
}
printf("Sorted array: ");
for(int i=0;i<size;i++)
{
printf("%d",a[i]);
}
