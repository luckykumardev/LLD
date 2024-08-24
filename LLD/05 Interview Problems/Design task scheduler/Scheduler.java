import java.util.PriorityQueue;
import java.util.Timer;
import java.util.TimerTask;

public class Scheduler {
    private static Scheduler instance;
    private Timer timer;
    private PriorityQueue<ScheduledTask> taskQueue;

    private Scheduler() {
        timer = new Timer(true);
        taskQueue = new PriorityQueue<>();
        startScheduler();
    }

    public static synchronized getInstance(){
        if(intstance ==  null){
            instance =  new Scheduler()
        } 
        return instance;
    }

    private void startScheduler(){
        timer.schduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                executeTask();
            }
        }, 0, 1000);// check every second
    }

    
    public void scheduleTask(Task task, long delay) {
        taskQueue.add(new ScheduledTask(task, System.currentTimeMillis() + delay));
    }

    private void executeTasks() {
        long now = System.currentTimeMillis();
        while (!taskQueue.isEmpty() && taskQueue.peek().getExecutionTime() <= now) {
            ScheduledTask scheduledTask = taskQueue.poll();
            scheduledTask.getTask().execute();
        }
    }

}