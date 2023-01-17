package org.example;

public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) throws NumberNegativeException {
        if(val<0){
            throw new NumberNegativeException("Number negative exception" , val);
        }
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NumberNegativeException {
        if(val<0){
            throw new NumberNegativeException("Number negative exception" , val);
        }
        this.val = val;
    }

    public void decrementer(int n) throws NumberNegativeException {
        if(val - n < 0){
            throw new NumberNegativeException("Number negative exception" , n);
        }
        this.val -= n;
    }
}
