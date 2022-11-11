// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.network;

import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URI;
import android.text.TextUtils;
import java.util.TreeMap;

public final class UrlUtils
{
    public static final String UTF8 = "UTF8";
    
    private UrlUtils() {
    }
    
    public static TreeMap<String, String> getQueryParams(final String s, final boolean b) {
        final TreeMap treeMap = new TreeMap();
        if (s == null) {
            return treeMap;
        }
        final String[] split = s.split("&");
        for (int length = split.length, i = 0; i < length; ++i) {
            final String[] split2 = split[i].split("=");
            if (split2.length == 2) {
                if (b) {
                    treeMap.put(urlDecode(split2[0]), urlDecode(split2[1]));
                }
                else {
                    treeMap.put(split2[0], split2[1]);
                }
            }
            else if (!TextUtils.isEmpty((CharSequence)split2[0])) {
                if (b) {
                    treeMap.put(urlDecode(split2[0]), "");
                }
                else {
                    treeMap.put(split2[0], "");
                }
            }
        }
        return treeMap;
    }
    
    public static TreeMap<String, String> getQueryParams(final URI uri, final boolean b) {
        return getQueryParams(uri.getRawQuery(), b);
    }
    
    public static String percentEncode(String urlEncode) {
        if (urlEncode == null) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        urlEncode = urlEncode(urlEncode);
        for (int length = urlEncode.length(), i = 0; i < length; ++i) {
            final char char1 = urlEncode.charAt(i);
            if (char1 == '*') {
                sb.append("%2A");
            }
            else if (char1 == '+') {
                sb.append("%20");
            }
            else {
                if (char1 == '%') {
                    final int n = i + 2;
                    if (n < length && urlEncode.charAt(i + 1) == '7' && urlEncode.charAt(n) == 'E') {
                        sb.append('~');
                        i = n;
                        continue;
                    }
                }
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    public static String urlDecode(String decode) {
        if (decode == null) {
            return "";
        }
        try {
            decode = URLDecoder.decode(decode, "UTF8");
            return decode;
        }
        catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
    
    public static String urlEncode(String encode) {
        if (encode == null) {
            return "";
        }
        try {
            encode = URLEncoder.encode(encode, "UTF8");
            return encode;
        }
        catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
}
