class Main{
    
    public static void main(String args[]){
        URLRepository repo =  new InMemoryURLRepository();
        URLShortnerService service =  new URLShortnerService(repo);
        String orignalURL = "www.codebix.in";
        String shortURL = service.getshortURL(orignalURL);
    }
}