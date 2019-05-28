import java.io.*;
public class Prime
{
public static void main(String s[])
{
int flag=0,i,j;
for(i=20;i<=100;i++)
{
for(j=2;j<i;j++)
{
if(i%j==0)
{
  flag=1;
  break;
}
else
{
flag=0;
}
}
if(flag==0){
System.out.println(i);
}
}
}
}
