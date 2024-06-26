package collections;

import java.lang.constant.Constable;

interface Liquid {
    public default String taste(){

        return null;
    }
}

class Juice implements Liquid{
    public String taste(){
        return "sweet";
    }
}
class Glass<T extends Liquid>{
    private T Liquid;
    public String getLiquid;

    Constable taste(){
        return Liquid.taste();
    }
}
