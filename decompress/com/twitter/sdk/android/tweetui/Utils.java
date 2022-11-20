// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import com.twitter.sdk.android.core.models.Tweet;
import java.util.List;

final class Utils
{
    private Utils() {
    }
    
    public static CharSequence charSeqOrDefault(CharSequence charSequence, final CharSequence charSequence2) {
        if (charSequence == null) {
            charSequence = charSequence2;
        }
        return charSequence;
    }
    
    public static CharSequence charSeqOrEmpty(final CharSequence charSequence) {
        return charSeqOrDefault(charSequence, "");
    }
    
    public static Long numberOrDefault(final String s, final long n) {
        try {
            return Long.parseLong(s);
        }
        catch (final NumberFormatException ex) {
            return n;
        }
    }
    
    public static List<Tweet> orderTweets(final List<Long> list, final List<Tweet> list2) {
        final HashMap hashMap = new HashMap();
        final ArrayList list3 = new ArrayList();
        for (final Tweet tweet : list2) {
            hashMap.put(tweet.id, tweet);
        }
        for (final Long n : list) {
            if (hashMap.containsKey(n)) {
                list3.add(hashMap.get(n));
            }
        }
        return list3;
    }
    
    public static String stringOrDefault(String s, final String s2) {
        if (s == null) {
            s = s2;
        }
        return s;
    }
    
    public static String stringOrEmpty(final String s) {
        return stringOrDefault(s, "");
    }
}
