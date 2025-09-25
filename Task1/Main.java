public class Main {
    public static void main(String[] args) {
        Team bb = new Team("Banana Boys");
        Team gg = new Team("Glamrock Girls");
        Team dd = new Team("Devilish Droids");
        Team rr = new Team("Rad Racoons");
        Team ll = new Team("Lustful Ladies");
        Team hh = new Team("Hardhat Henry's");

        bb.setRank(1);
        gg.setRank(2);
        dd.setRank(3);
        rr.setRank(4);
        ll.setRank(5);
        hh.setRank(6);

        bb.addPlayer("Jonas");
        bb.addPlayer("Carlos");

        gg.addPlayer("Josephine");
        gg.addPlayer("Luna");

        dd.addPlayer("T-1337");
        dd.addPlayer("NS-420");

        rr.addPlayer("Ronni");
        rr.addPlayer("Chonker");

        ll.addPlayer("Stephanie");
        ll.addPlayer("Jessica");

        hh.addPlayer("Henry");
        hh.addPlayer("Henry");


        bb.toString();
        gg.toString();
        dd.toString();
        rr.toString();
        ll.toString();
        hh.toString();
    }
}