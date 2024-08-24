public class Main {
    public static void main(String[] args) {
        // Get the Scheduler instance
        Scheduler scheduler = SchedulerFactory.createScheduler();

        // Create some tasks
        Task task1 = new PrintTask("Task 1 executed");
        Task task2 = new PrintTask("Task 2 executed");
        Task task3 = new PrintTask("Task 3 executed");

        // Schedule tasks
        scheduler.scheduleTask(task1, 3000); // Executes after 3 seconds
        scheduler.scheduleTask(task2, 5000); // Executes after 5 seconds
        scheduler.scheduleTask(task3, 7000); // Executes after 7 seconds

        // Main thread sleeps to allow scheduled tasks to run
        try {
            Thread.sleep(10000); // Sleep for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
