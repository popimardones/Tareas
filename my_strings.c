#include <stdio.h>
#include <stdlib.h>
#include "my_strings.h"
//Paula Mardones 19.741.361
int strcmpic(char *str1, char *str2);

int main(void) {

   char* str1 = "hola";

   char* str2 = (char*) malloc( 20 * sizeof(char));

   printf("Escribe hola:");

   scanf("%s", str2);

  if (strcmpic(str1, str2) != 0) {
    printf("no escribiste hola :(, con diferencia de %i!\n",strcmpic(str1,str2));
  }
  else{
    printf("escribiste hola! con diferencia de %i!\n",strcmpic(str1,str2));
  }
}
