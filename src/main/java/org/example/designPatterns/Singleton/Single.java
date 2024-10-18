package org.example.designPatterns.Singleton;

public final class Single {
    private static volatile Single single;
    private Integer value;
    private Single(Integer x){
        System.out.println("Hey We create a Single Object");
        this.value=x;
        System.out.println("The Value is: "+ value);

    }

    public static Single getInstance(Integer x){
        Single instance = single;
        if(instance != null){
            return instance;
        }
        synchronized (Single.class){
            if(single==null){
                single=new Single(x);
            }
            return single;
        }

    }

}
/**
 * final class can not be extended in java
 *
 *
 * only static variables can be used in static method
 *
 *
 * when we use volatile keyword in java, it means that the value of the variable
 * can be changed by multiple threads but if value of any volatile
 * variable is changed in one thread it would reflect in other threads too. [THREAD SAFE]
 *
 * Synchronized keyword is used to make sure that only one thread can access the method at a time.
 * It maintains thread safe and also Mutual Exclusion which means that only one thread can access the method at a time.
 *
 * volatile keyword is used to make sure that the value of the variable can be changed by multiple threads
 * and it should never be cached.
 *
 *
 * 3 WAYS of Breaking SingleTon Design Pattern :
 * Reflection API
 * Deserialization
 * Copy Object [watch code with durgesh for more details]
 */