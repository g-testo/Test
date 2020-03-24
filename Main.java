class Main{
    public static void main(String[] args) {
        Count count1 = new Count();
        Count count2 = new Count();

        count1.instanceIncr();
        count1.instanceIncr();
        count1.instanceIncr();
        count2.instanceIncr();
        count2.instanceIncr();
        count2.instanceIncr();

        // Count.staticIncr();

        count1.staticIncr();
        count1.staticIncr();
        count1.staticIncr();
        count2.staticIncr();
        count2.staticIncr();
        count2.staticIncr();


        Count count3 = new Count();
        Count count4 = new Count();

    }

}