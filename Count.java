class Count{

    static int staticCount;
    int instanceCount;

    static int staticCounter;
    static int nonStaticCounter;

    static {
        staticCounter++;
        System.out.println("Static counter: " + staticCounter);
    }

    {
        nonStaticCounter++;
        System.out.println("Non static block counter: " + nonStaticCounter);
    }

    public static void staticIncr(){
        staticCount++;
        System.out.println("Static" + staticCount);
    }
    public static void staticDecr(){
        staticCount--;
        System.out.println("Static" + staticCount);
    }

    public void instanceIncr(){
        instanceCount++;
        System.out.println("Instance" + instanceCount);
    }
    public void instanceDecr(){
        instanceCount--;
        System.out.println("Instance" + instanceCount);
    }

}