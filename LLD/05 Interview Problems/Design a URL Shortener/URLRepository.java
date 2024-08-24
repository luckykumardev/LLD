interface URLRepository {
    void save(ShortURL shortURL);
    ShortURL findByShortId(String shortId);
}