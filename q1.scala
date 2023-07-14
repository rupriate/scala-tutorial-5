import scala.io.StdIn

object q1 {
  def primeCheck(x:Int,n:Int=2):Boolean={
    if(x==1)return false
    if(x==2)return true
    if(x<0)return false
    if(x%n==0)return false
    if(n*n>x)return true
    return(primeCheck(x,n+1));
  }

  def isPrime(x:Int)=if(primeCheck(x)){printf("Number is prime\n")}else{printf("Number is not prime\n")}



  def main(args: Array[String]): Unit= {
    printf("Enter n : ");
    val n=scala.io.StdIn.readInt();
    isPrime(n);

  }
}
