class InMemoryURLRepository implements URLRepository {
    private Map<String, ShortURL> urlMap = new HashMap<>();

    @Override
    public void save(ShortURL shortURL) {
        urlMap.put(shortURL.getShortId(), shortURL);
    }

    @Override
    public ShortURL findByShortId(String shortId) {
        return urlMap.get(shortId);
    }
}