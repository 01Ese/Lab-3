import java.util.ArrayList;
public class AddressBook {

    private ArrayList<BuddyInfo> buddiesInfo = new ArrayList<>();

    //Put into an array
    private void addBuddy(BuddyInfo newInfo){
        if (newInfo != null) {
            buddiesInfo.add(newInfo);
        }
    }

    //Remove from array
    private void removeBuddy(BuddyInfo data){
        for (BuddyInfo buddy:buddiesInfo){
            if (buddy.equals(data)){
                buddiesInfo.remove(data);
            }
        }
    }
    
    //Main method
    public static void main(String[] args) {
        BuddyInfo newInfo = new BuddyInfo("Ese", "35 Bland street", "5856790930" );
        AddressBook address = new AddressBook();
        address.addBuddy(newInfo);
        BuddyInfo newInfo2 = new BuddyInfo("Audrey", "35 Bland street", "5856790930" );
        address.addBuddy(newInfo2);

    }
}
