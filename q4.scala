import scala.io.StdIn

object q4 {
    def even(x:Int):Boolean={
        if(x==0){return true}
        else if(x==1){return false}
        else{return (even(x-2))}
    }


    def main(args: Array[String]): Unit= {
        printf("Enter n : ");
        val n=scala.io.StdIn.readInt();
        if(even(n))printf("Number is Even!");
    }
}


