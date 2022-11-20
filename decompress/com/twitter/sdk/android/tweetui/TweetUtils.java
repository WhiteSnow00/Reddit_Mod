// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.TweetEntities;
import java.util.List;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.Logger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.models.User;
import android.text.TextUtils;
import android.net.Uri;
import java.util.Locale;
import com.twitter.sdk.android.core.models.Tweet;

public final class TweetUtils
{
    private static final String HASHTAG_URL = "https://twitter.com/hashtag/%s?ref_src=twsrc%%5Etwitterkit";
    public static final String LOAD_TWEET_DEBUG = "loadTweet failure for Tweet Id %d.";
    private static final String PROFILE_URL = "https://twitter.com/%s?ref_src=twsrc%%5Etwitterkit";
    private static final String SYMBOL_URL = "https://twitter.com/search?q=%%24%s&ref_src=twsrc%%5Etwitterkit";
    private static final String TWEET_URL = "https://twitter.com/%s/status/%d?ref_src=twsrc%%5Etwitterkit";
    private static final String TWITTER_KIT_REF = "ref_src=twsrc%%5Etwitterkit";
    private static final String TWITTER_URL = "https://twitter.com/";
    private static final String UNKNOWN_SCREEN_NAME = "twitter_unknown";
    
    private TweetUtils() {
    }
    
    public static Tweet getDisplayTweet(final Tweet tweet) {
        if (tweet != null) {
            final Tweet retweetedStatus = tweet.retweetedStatus;
            if (retweetedStatus != null) {
                return retweetedStatus;
            }
        }
        return tweet;
    }
    
    public static String getHashtagPermalink(final String s) {
        return String.format(Locale.US, "https://twitter.com/hashtag/%s?ref_src=twsrc%%5Etwitterkit", s);
    }
    
    public static Uri getPermalink(String s, final long n) {
        if (n <= 0L) {
            return null;
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            s = String.format(Locale.US, "https://twitter.com/%s/status/%d?ref_src=twsrc%%5Etwitterkit", "twitter_unknown", n);
        }
        else {
            s = String.format(Locale.US, "https://twitter.com/%s/status/%d?ref_src=twsrc%%5Etwitterkit", s, n);
        }
        return Uri.parse(s);
    }
    
    public static String getProfilePermalink(String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            s = String.format(Locale.US, "https://twitter.com/%s?ref_src=twsrc%%5Etwitterkit", "twitter_unknown");
        }
        else {
            s = String.format(Locale.US, "https://twitter.com/%s?ref_src=twsrc%%5Etwitterkit", s);
        }
        return s;
    }
    
    public static String getSymbolPermalink(final String s) {
        return String.format(Locale.US, "https://twitter.com/search?q=%%24%s&ref_src=twsrc%%5Etwitterkit", s);
    }
    
    public static boolean isTweetResolvable(final Tweet tweet) {
        if (tweet != null && tweet.id > 0L) {
            final User user = tweet.user;
            if (user != null && !TextUtils.isEmpty((CharSequence)user.screenName)) {
                return true;
            }
        }
        return false;
    }
    
    public static void loadTweet(final long n, final Callback<Tweet> callback) {
        TweetUi.getInstance().getTweetRepository().loadTweet(n, (Callback<Tweet>)new LoggingCallback<Tweet>(callback, Twitter.getLogger(), callback) {
            public final Callback val$cb;
            
            public void success(final Result<Tweet> result) {
                final Callback val$cb = this.val$cb;
                if (val$cb != null) {
                    val$cb.success(result);
                }
            }
        });
    }
    
    public static void loadTweets(final List<Long> list, final Callback<List<Tweet>> callback) {
        TweetUi.getInstance().getTweetRepository().loadTweets(list, (Callback<List<Tweet>>)new LoggingCallback<List<Tweet>>(callback, Twitter.getLogger(), callback) {
            public final Callback val$cb;
            
            public void success(final Result<List<Tweet>> result) {
                final Callback val$cb = this.val$cb;
                if (val$cb != null) {
                    val$cb.success(result);
                }
            }
        });
    }
    
    public static boolean showQuoteTweet(final Tweet tweet) {
        if (tweet.quotedStatus != null && tweet.card == null) {
            final TweetEntities entities = tweet.entities;
            if (entities != null) {
                final List media = entities.media;
                if (media != null && !media.isEmpty()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
