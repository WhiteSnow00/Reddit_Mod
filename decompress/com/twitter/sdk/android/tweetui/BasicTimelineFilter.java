// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.TweetEntities;
import com.twitter.sdk.android.core.models.User;
import java.util.Collections;
import java.util.ArrayList;
import com.twitter.sdk.android.core.models.UrlEntity;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.SymbolEntity;
import com.twitter.sdk.android.core.models.MentionEntity;
import com.twitter.sdk.android.core.models.HashtagEntity;
import java.util.List;
import java.net.IDN;
import okhttp3.HttpUrl;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Locale;
import java.text.BreakIterator;
import java.util.Set;

public class BasicTimelineFilter implements TimelineFilter
{
    private final Set<String> handleConstraints;
    private final Set<String> hashTagConstraints;
    private final Set<String> keywordConstraints;
    private final Set<String> urlConstraints;
    private final BreakIterator wordIterator;
    
    public BasicTimelineFilter(final FilterValues filterValues) {
        this(filterValues, Locale.getDefault());
    }
    
    public BasicTimelineFilter(final FilterValues filterValues, final Locale locale) {
        final BasicTimelineFilter.BasicTimelineFilter$IgnoreCaseComparator basicTimelineFilter$IgnoreCaseComparator = new BasicTimelineFilter.BasicTimelineFilter$IgnoreCaseComparator(locale);
        this.wordIterator = BreakIterator.getWordInstance(locale);
        (this.keywordConstraints = new TreeSet<String>((Comparator<? super String>)basicTimelineFilter$IgnoreCaseComparator)).addAll(filterValues.keywords);
        this.hashTagConstraints = new TreeSet<String>((Comparator<? super String>)basicTimelineFilter$IgnoreCaseComparator);
        final Iterator iterator = filterValues.hashtags.iterator();
        while (iterator.hasNext()) {
            this.hashTagConstraints.add(normalizeHashtag((String)iterator.next()));
        }
        this.handleConstraints = new HashSet<String>(filterValues.handles.size());
        final Iterator iterator2 = filterValues.handles.iterator();
        while (iterator2.hasNext()) {
            this.handleConstraints.add(normalizeHandle((String)iterator2.next()));
        }
        this.urlConstraints = new HashSet<String>(filterValues.urls.size());
        final Iterator iterator3 = filterValues.urls.iterator();
        while (iterator3.hasNext()) {
            this.urlConstraints.add(normalizeUrl((String)iterator3.next()));
        }
    }
    
    public static String normalizeHandle(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        final char char1 = s.charAt(0);
        if (char1 != '@') {
            final String substring = s;
            if (char1 != '\uff20') {
                return substring.toLowerCase(Locale.US);
            }
        }
        final String substring = s.substring(1, s.length());
        return substring.toLowerCase(Locale.US);
    }
    
    public static String normalizeHashtag(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        final char char1 = s.charAt(0);
        if (char1 != '#' && char1 != '\uff03') {
            final String substring = s;
            if (char1 != '$') {
                return substring;
            }
        }
        return s.substring(1, s.length());
    }
    
    public static String normalizeUrl(String lowerCase) {
        try {
            final HttpUrl parse = HttpUrl.parse(lowerCase);
            if (parse != null && parse.host() != null) {
                return parse.host().toLowerCase(Locale.US);
            }
            lowerCase = IDN.toASCII(lowerCase).toLowerCase(Locale.US);
            return lowerCase;
        }
        catch (final IllegalArgumentException ex) {
            return lowerCase;
        }
    }
    
    public boolean containsMatchingHashtag(final List<HashtagEntity> list) {
        final Iterator<HashtagEntity> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (this.hashTagConstraints.contains(iterator.next().text)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean containsMatchingMention(final List<MentionEntity> list) {
        final Iterator<MentionEntity> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (this.handleConstraints.contains(normalizeHandle(iterator.next().screenName))) {
                return true;
            }
        }
        return false;
    }
    
    public boolean containsMatchingScreenName(String normalizeHandle) {
        normalizeHandle = normalizeHandle(normalizeHandle);
        return this.handleConstraints.contains(normalizeHandle);
    }
    
    public boolean containsMatchingSymbol(final List<SymbolEntity> list) {
        final Iterator<SymbolEntity> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (this.hashTagConstraints.contains(iterator.next().text)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean containsMatchingText(final Tweet tweet) {
        this.wordIterator.setText(tweet.text);
        int first = this.wordIterator.first();
        int next;
        for (int i = this.wordIterator.next(); i != -1; i = next) {
            if (this.keywordConstraints.contains(tweet.text.substring(first, i))) {
                return true;
            }
            next = this.wordIterator.next();
            first = i;
        }
        return false;
    }
    
    public boolean containsMatchingUrl(final List<UrlEntity> list) {
        final Iterator<UrlEntity> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (this.urlConstraints.contains(normalizeUrl(iterator.next().expandedUrl))) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public List<Tweet> filter(final List<Tweet> list) {
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final Tweet tweet = list.get(i);
            if (!this.shouldFilterTweet(tweet)) {
                list2.add(tweet);
            }
        }
        return (List<Tweet>)Collections.unmodifiableList((List<?>)list2);
    }
    
    public boolean shouldFilterTweet(final Tweet tweet) {
        final User user = tweet.user;
        if (user != null && this.containsMatchingScreenName(user.screenName)) {
            return true;
        }
        final TweetEntities entities = tweet.entities;
        return (entities != null && (this.containsMatchingHashtag(entities.hashtags) || this.containsMatchingSymbol(tweet.entities.symbols) || this.containsMatchingUrl(tweet.entities.urls) || this.containsMatchingMention(tweet.entities.userMentions))) || this.containsMatchingText(tweet);
    }
    
    @Override
    public int totalFilters() {
        return this.handleConstraints.size() + (this.urlConstraints.size() + (this.hashTagConstraints.size() + this.keywordConstraints.size()));
    }
}
