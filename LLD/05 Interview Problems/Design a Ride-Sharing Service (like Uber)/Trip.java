public class Trip {
    private Ride ride;
    private String status;

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        // Status update logic
    }
}