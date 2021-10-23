//Creating a dynamic array accepting input from user
#include <stdio.h>
#include <stdlib.h>
int main()
{
    int i,j,m,n;
    int *arr;
    printf("Enter the array size");
    scanf("%d", &n);
    arr=(int*)malloc(n*sizeof(int));
    for(i=1;i<=n;i++)
    {
        printf("Enter the Element %d", i);
        scanf("%d", &arr[i]);
    }
    for(j=1;j<=n;j++){
        printf("%d\t", arr[j]);   
    }
}
