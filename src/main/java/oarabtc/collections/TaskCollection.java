package oarabtc.collections;

public class TaskCollection {

    public static void main(String[] args) {

        BearArrayListHelper.createBearList();
        BearArrayListHelper.printBearList();

        BearArrayListHelper.changeBearList();
        BearArrayListHelper.printChangedBearList();

        BearMapHelper.createBearMap();
        BearMapHelper.printBearMap();

        BearMapHelper.changeBearMap();
        BearMapHelper.printChangedBearMap();
    }
}
