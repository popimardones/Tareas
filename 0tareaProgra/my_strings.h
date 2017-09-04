#include <stdio.h>
#include <stdlib.h>
//Paula Mardones 19.741.361
int strcmpic(char *str1, char *str2){
  int result;
  int resta_entre_c1_y_c2;
    do{
      for(int i=0;i<=19;i++){
          if(str2[i] >= 65 && str2[i] <= 90)
          {
            str2[i]=str2[i]+32;
          }
      }

      while(*str1 != '\0' && *str1 == *str2){
        ++str1;
        ++str2;
      }
      if(*str1 == *str2){
        result = 0;
        return result;
      }
      else{
        resta_entre_c1_y_c2 = *str1 - *str2;
        result = resta_entre_c1_y_c2;
        return result;
      }

    }while(*str1 != '\0' && *str2 != '\0');
  }
