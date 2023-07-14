import scala.io.StdIn

object q5 {
    def even(x:Int):Boolean={
        if(x==0){return true}
        else if(x==1){return false}
        else{return (even(x-2))}
    }

    def addEven(n:Int):Int={
        if(n==0){return 0}
        else if(n==1){return 0}
        else if(even(n)){return (addEven(n-2)+n)}
        else{return addEven(n-1)}
    }

    def main(args: Array[String]): Unit= {
        printf("Enter n : ");
        val n=scala.io.StdIn.readInt();
        printf("%d",addEven(n));
    }
}


