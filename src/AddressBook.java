import java.util.ArrayList;
public class AddressBook {

    //Create
    BuddyInfo info1 = new BuddyInfo("Jennie","12 Blueberry Ave","3439652019" );
    BuddyInfo info2 = new BuddyInfo("Aubrey","45 Blane Dr","5359652045");
    BuddyInfo info3 = new BuddyInfo("Naomi","76 Knox-dale","2829652088");
    BuddyInfo info4 = new BuddyInfo("Mark","45 Flag street","2889653067");
    BuddyInfo info5 = new BuddyInfo("Chris","56 Waterfall Ave", "6139654356");

    //Put into an array
    private ArrayList<BuddyInfo> info = new ArrayList<BuddyInfo>();
    private void addBuddy(BuddyInfo newInfo){
        info.add(newInfo);
    }
    //Remove from array
    private void removeBuddy(BuddyInfo data){
        for (BuddyInfo buddy:info){
            if (buddy.equals(data)){
                info.remove(data);
            }

        }

    }

    public static void main(String[] args) {
        BuddyInfo newInfo = new BuddyInfo("Ese", "35 Bland street", "5856790930" );
        AddressBook address = new AddressBook();
        address.addBuddy(newInfo);
        address.removeBuddy(newInfo);
    }
}