public class InitializationData {

    public Information validSize() {
        Information information = new Information();

        int a = information.getAlias().size();
        int b = information.getEmailList().size();
        int c = information.getUserKey().size();


        if ((a == b) && (b == c)) {
            return information;
        } else {
            System.out.println("Size is not equal");
            return null;
        }
    }
}
