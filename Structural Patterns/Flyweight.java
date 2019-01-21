import java.util.HashMap;

/*
 Flyweight object is divided into: 
    - state-dependent part      => Extrinsic         
    - state-independent part    => Intrinsic

    * Extrinsic is stored/calculated by the client
    * Intrinsic is stored/shared in the Flyweight object

    1. Flyweight objects are immutable: cannot be modified once they ahve been constructed
    2. 
*/

interface Intrinsic {
    private String data1 = "shared 1";
    private String data2 = "shared 2";
    private String data3 = "shared 3";
}

class A implements Intrinsic {

}

class B implements Intrinsic {

}

class FlyweightFactory {
    private static HashMap<String, Intrinsic> cache = new HashMap<String, Intrinsic>();

    public static Intrinsic getFlyweight(String s) {
        Intrinsic p = null;

        if(cache.containsKey(s)) {
            p = cache.get(s);
        } else {
            switch(s) {
                case "A":
                    p = new A();
                    break;
                case "B";
                    p = new B();
                    break;
            }
            cache.put(s, p);
        }
        return p;
    }
}