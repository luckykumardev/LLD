class PrintTask implements Task{
    
    private String message;
    
    public PrintTask(String message){
      this.message = message;
    }

    @Override
    public void execute(){
        System.out.println(message);
    }
    

}