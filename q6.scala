import scala.io.StdIn

object q6 {
    def fib(x:Int):Int={
        if(x==1){return 0}
        else if(x==2){return 1}
        else{return (fib(x-1) +fib(x-2))}
    }

    def printfib(n:Int)=for(i <-1 to n){
        printf("%d, ",fib(i))
    }

    def main(args: Array[String]): Unit= {
        printf("Enter n : ");
        val n=scala.io.StdIn.readInt();
        printfib(n);
    }
}


