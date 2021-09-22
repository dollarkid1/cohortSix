package LibraryManagementSystem.users;

public abstract class User {
   private String name;
   private int id;
   private boolean isVerified;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean Verify(String name, int id){
        if (name == getName() && id == id){
          return   isVerified = true;
        }
        return isVerified = false;
    }
}
