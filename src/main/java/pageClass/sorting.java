package pageClass;

public class sorting {
  static String array[]={"going","i","now","home"};

  public static void main(String args[]){
      for(int i=0;i<array.length;i++){
          for(int j=i+1;j< array.length;j++){
              if(array[i].compareTo(array[j])>0){
                  String temp=array[i];
                  array[i]=array[j];
                  array[j]=temp;
              }
          }System.out.println(array[i]);

      }
  }

        }

