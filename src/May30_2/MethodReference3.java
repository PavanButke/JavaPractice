package May30_2;

import java.util.function.Bifunction;
class Arithmetic{
public static int add(int a, int b){
return a+b;
}
}
public class MethodReference3{
public static void main(Strting[] args){
BiFunction <integer,integer>adder=Arthmetic::add;
int result = adder.apply(10,20);
system.oout.println(result);
}
}
