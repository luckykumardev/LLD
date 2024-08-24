public abstract class User {
    protected String id;
    protected String name;
    protected Location location;
    
    public abstract void updateLocation(String newLocation);
}