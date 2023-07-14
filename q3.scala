import scala.io.StdIn

object q3 {
    def sum(n:Int):Int={
        if(n==0){return(0)}
        else if(n==1){return(1)}
        else{return(n+sum(n-1))}
    }

    def main(args: Array[String]): Unit= {
        printf("Enter n : ");
        val n=scala.io.StdIn.readInt();
        printf("%d",sum(n));
    }
}


