import scala.io.StdIn

object q2 {
    def primeCheck(x:Int,n:Int=2):Boolean={
        if(x==1)return false
        if(x==2)return true
        if(x<0)return false
        if(x%n==0)return false
        if(n*n>x)return true
        return(primeCheck(x,n+1));
  }

    def primeSeq(n: Int): Unit = {
        if (n > 2) {
            primeSeq(n - 1)
            if (primeCheck(n))
            printf("%d, ",n)
        }else if (n == 2) {
            printf("2, ")
        }
    }



    def main(args: Array[String]): Unit= {
        printf("Enter n : ");
        val n=scala.io.StdIn.readInt();
        primeSeq(n);

  }
}
