package com.crio.shorturl;

import java.util.HashMap;
import java.util.Map;

public class XUrlImpl implements XUrl {

  private Map<String, String> longToShortUrlMap;
  private Map<String, String> shortToLongUrlMap;
  private Map<String, Integer> longUrlHitCountMap;

  public XUrlImpl() {
    longToShortUrlMap = new HashMap<>();
    shortToLongUrlMap = new HashMap<>();
    longUrlHitCountMap = new HashMap<>();
  }

  @Override
  public String registerNewUrl(String longUrl) {
    if (longToShortUrlMap.containsKey(longUrl)) {
      return longToShortUrlMap.get(longUrl);
    }
    String shortUrl = generateShortUrl();
    longToShortUrlMap.put(longUrl, shortUrl);
    shortToLongUrlMap.put(shortUrl, longUrl);
    longUrlHitCountMap.put(longUrl, 0);
    return shortUrl;
  }

  @Override
  public String registerNewUrl(String longUrl, String shortUrl) {
    if (shortToLongUrlMap.containsKey(shortUrl)) {
      return null;
    }
    longToShortUrlMap.put(longUrl, shortUrl);
    shortToLongUrlMap.put(shortUrl, longUrl);
    longUrlHitCountMap.put(longUrl, 0);
    return shortUrl;
  }

  @Override
  public String getUrl(String shortUrl) {
    if (shortToLongUrlMap.containsKey(shortUrl)) {
      String longUrl = shortToLongUrlMap.get(shortUrl);
      longUrlHitCountMap.put(longUrl, longUrlHitCountMap.get(longUrl) + 1);
      return longUrl;
    }
    return null;
  }

  @Override
  public Integer getHitCount(String longUrl) {
    if (longUrlHitCountMap.containsKey(longUrl)) {
      return longUrlHitCountMap.get(longUrl);
    }
    return 0;
  }

  @Override
  public String delete(String longUrl) {
    if (longToShortUrlMap.containsKey(longUrl)) {
      String shortUrl = longToShortUrlMap.get(longUrl);
      longToShortUrlMap.remove(longUrl);
      shortToLongUrlMap.remove(shortUrl);
      longUrlHitCountMap.remove(longUrl);
      return shortUrl;
    }
    return null;
  }

  private String generateShortUrl() {
    String shortUrl = "";
    String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    int length = allowedChars.length();
    while (shortUrl.length() < 9) {
      int index = (int) (Math.random() * length);
      shortUrl += allowedChars.charAt(index);
    }
    return "http://short.url/" + shortUrl;
  }

}