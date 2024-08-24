class URLShortenerService{
    private URLRepository urlRepository;
    private IDGenerator iDGenerator;

    pubic URLShortnerService(URLRepository urlRepository){
        this.urlRepository = urlRepository;
        this.iDGenerator = IDGenerator.getInstance();
    }

    public String shortenURL(String orignalURL){
       String shortID = iDGenerator.genrateID();
       ShortURL shortURL = new ShortURL(shortID, orignalURL);
       urlRepository.save(shortURL);
       return shortID;
    }

    public String getOrignalURL(String shortId){
        ShortURL shortURL = urlRepository.findByShortID(shortId);
        return shortURL;
    }

}