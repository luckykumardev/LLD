class ShortURL{
    private String shortId;
    private String originalURL;

    public ShortURL(String shortId, String originalURL) {
        this.shortId = shortId;
        this.originalURL = originalURL;
    }

    public String getShortId() {
        return shortId;
    }

    public String getOriginalURL() {
        return originalURL;
    }

}