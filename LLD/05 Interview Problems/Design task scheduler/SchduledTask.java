class ScheduledTask implements Comparable<ScheduledTask>{
    private Task task;
    private long executionTime;

    public ScheduledTask(Task task, long executionTime) {
        this.task = task;
        this.executionTime = executionTime;
    }

    public Task getTask() {
        return task;
    }

    public long getExecutionTime() {
        return executionTime;
    }

    @Override
    public int compareTo(ScheduledTask scheduledTask)
    return Long.compare(this.executionTime, o.executionTime);
}