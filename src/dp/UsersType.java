/*
 User Type enum
 */
package dp;

/**
 *
 * @author hishamls
 */
public enum UsersType {
    ADMIN(1, "admin"), TEACHER(2, "teacher"), STUDENT(3, "student");
    
    private int ID;
    private String Type;

    private UsersType(int ID, String Type) {
        this.ID = ID;
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
}
