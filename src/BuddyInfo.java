public class BuddyInfo {
    private String name;
    private String address;
    private String p_number;

    public BuddyInfo(String name, String address, String p_number) {
        this.name = name;
        this.address = address;
        this.p_number = p_number;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getP_number() {
        return p_number;
    }

    public static void main(String[] args) {
        BuddyInfo info = new BuddyInfo("Jennie","","0");
        System.out.println("Hello " + info.getName());

    }
}
