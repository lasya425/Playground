#include <stdio.h>

int main() 
{
    int i = 65;
    int k = 120;
    printf("%d %d\n", i, k);
  {
    i =  k;
  }
    k = i-55;
    printf("%d %d", i, k);
    return 0;
}
