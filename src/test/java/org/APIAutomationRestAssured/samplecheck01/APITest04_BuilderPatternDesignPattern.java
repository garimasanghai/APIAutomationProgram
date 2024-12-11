package org.APIAutomationRestAssured.samplecheck01;

public class APITest04_BuilderPatternDesignPattern {
    public APITest04_BuilderPatternDesignPattern step1(){
        System.out.println("Step 1");
        return this;
    }

    public APITest04_BuilderPatternDesignPattern step2(){
        System.out.println("Step 2");
        return this;
    }

    public APITest04_BuilderPatternDesignPattern step3(String param1){
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {

        APITest04_BuilderPatternDesignPattern bp = new APITest04_BuilderPatternDesignPattern();
        bp.step1().step2().step3("hello");

    }
}
