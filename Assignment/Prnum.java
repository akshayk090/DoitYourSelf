import java.util.*;
class Prnum{
public static void pnum(int i){

if(i<11){
System.out.println(i);	
//num=num+i;
i++;
pnum(i);
}
}
public static void main(String args[])
{
	pnum(1);}
}