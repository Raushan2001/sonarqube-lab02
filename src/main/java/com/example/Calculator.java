package main.java.com.example;

public class Calculator {

    // Code Smell: Long method + high complexity
    publicintcalculate(inta, intb,Stringop){
        if(op.equals("add")){
            return a+b;
        }elseif(op.equals("add-again")){
            return a+b;//DUPLICATION
        }elseif(op.equals("sub")){
            return a-b;
        }elseif(op.equals("sub-again")){
            return a-b;//DUPLICATION
        }elseif(op.equals("mul")){
            return a*b;
        }elseif(op.equals("div")){
            if(b==0){
                return 0;
            }else{
                return a/b;
            }
        }elseif(op.equals("mod")){
            return a%b;
        }elseif(op.equals("pow")){
            int result=1;
            for(inti=0; i<b; i++){
                result=result*a;
            }
            return result;
        }else{
            return 0;
        }
    }


    // Code Duplication (students must remove)
    public int addNumbers(int x, int y) {
        return x + y;
    }

    public int sumValues(int a, int b) {
        return a + b;
    }

    // INTENTIONAL DUPLICATION
    public int addAgain(int a, int b) {
        return a + b;
    }
}
