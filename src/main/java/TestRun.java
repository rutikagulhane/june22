import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestRun {
    public static void main(String[] args) {


//        List<User> user=new ArrayList<>();
//        user.add(new User("rutika","gulhane",1));
//        user.add(new User("Arjun","gulhane",2));
//        user.add(new User("Vaibhav","Dave",3));
        //System.out.println(user);
        UserDatabase userDatabase=new UserDatabase();
        userDatabase.addUSer(new User("rutika","gulhane",1));
        userDatabase.addUSer(new User("Arjun","gulhane",2));
        userDatabase.addUSer(new User("Vaibhav","gulhane",3));
        userDatabase.addUSer(new User("Vaibhav","gulhane",3));

        System.out.println(userDatabase.getUser(2));
        userDatabase.printDatabse();
        Set<String> stringSet=new TreeSet<>();
        stringSet.add("Akash");
        stringSet.add("Rutika");
        stringSet.add("Kiran");
        System.out.println(stringSet);

    }
}

class UserDatabase{
   // private List<User> userdatabse=new LinkedList<>();
    Comparator<User> userComparator=(a,b)->a.getId()-b.getId();
    private Set<User> userdatabse=new TreeSet<>();

    public boolean addUSer(User user)
    {
        return userdatabse.add(user);
    }


    public User getUser(int id)
    {

        for(User temp:userdatabse)
        {
            if(temp.getId()==id)
            {
                return temp;
            }
        }
        return null;
    }
    public void printDatabse()
    {
        System.out.println(userdatabse);
    }
}