// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import java.util.List;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterAuthException;
import android.text.TextUtils;
import ku2.d;
import com.twitter.sdk.android.core.Logger;
import com.twitter.sdk.android.core.Twitter;
import ku2.w;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.models.Tweet;
import android.os.Handler;
import j0.g;

class TweetRepository
{
    private static final int DEFAULT_CACHE_SIZE = 20;
    public final g<Long, FormattedTweetText> formatCache;
    private final Handler mainHandler;
    public final g<Long, Tweet> tweetCache;
    private final TwitterCore twitterCore;
    private final SessionManager<TwitterSession> userSessionManagers;
    
    public TweetRepository(final Handler handler, final SessionManager<TwitterSession> sessionManager) {
        this(handler, sessionManager, TwitterCore.getInstance());
    }
    
    public TweetRepository(final Handler mainHandler, final SessionManager<TwitterSession> userSessionManagers, final TwitterCore twitterCore) {
        this.twitterCore = twitterCore;
        this.mainHandler = mainHandler;
        this.userSessionManagers = userSessionManagers;
        this.tweetCache = (g<Long, Tweet>)new g(20);
        this.formatCache = (g<Long, FormattedTweetText>)new g(20);
    }
    
    public static TwitterCore access$000(final TweetRepository tweetRepository) {
        return tweetRepository.twitterCore;
    }
    
    private void deliverTweet(final Tweet tweet, final Callback<Tweet> callback) {
        if (callback == null) {
            return;
        }
        this.mainHandler.post((Runnable)new Runnable(this, callback, tweet) {
            public final TweetRepository this$0;
            public final Callback val$cb;
            public final Tweet val$tweet;
            
            @Override
            public void run() {
                this.val$cb.success(new Result((Object)this.val$tweet, (w)null));
            }
        });
    }
    
    public void favorite(final long n, final Callback<Tweet> callback) {
        this.getUserSession((Callback<TwitterSession>)new LoggingCallback<TwitterSession>(this, callback, Twitter.getLogger(), n, callback) {
            public final TweetRepository this$0;
            public final Callback val$cb;
            public final long val$tweetId;
            
            public void success(final Result<TwitterSession> result) {
                TweetRepository.access$000(this.this$0).getApiClient((TwitterSession)result.data).getFavoriteService().create(Long.valueOf(this.val$tweetId), Boolean.FALSE).H((d)this.val$cb);
            }
        });
    }
    
    public FormattedTweetText formatTweetText(final Tweet tweet) {
        if (tweet == null) {
            return null;
        }
        final FormattedTweetText formattedTweetText = (FormattedTweetText)this.formatCache.get((Object)tweet.id);
        if (formattedTweetText != null) {
            return formattedTweetText;
        }
        final FormattedTweetText formatTweetText = TweetTextUtils.formatTweetText(tweet);
        if (formatTweetText != null && !TextUtils.isEmpty((CharSequence)formatTweetText.text)) {
            this.formatCache.put((Object)tweet.id, (Object)formatTweetText);
        }
        return formatTweetText;
    }
    
    public void getUserSession(final Callback<TwitterSession> callback) {
        final TwitterSession twitterSession = (TwitterSession)this.userSessionManagers.getActiveSession();
        if (twitterSession == null) {
            callback.failure(new TwitterAuthException("User authorization required"));
        }
        else {
            callback.success((com.twitter.sdk.android.core.Result<TwitterSession>)new Result((Object)twitterSession, (w)null));
        }
    }
    
    public void loadTweet(final long n, final Callback<Tweet> callback) {
        final Tweet tweet = (Tweet)this.tweetCache.get((Object)n);
        if (tweet != null) {
            this.deliverTweet(tweet, callback);
            return;
        }
        this.twitterCore.getApiClient().getStatusesService().show(Long.valueOf(n), (Boolean)null, (Boolean)null, (Boolean)null).H((d)new TweetRepository.TweetRepository$SingleTweetCallback(this, (Callback)callback));
    }
    
    public void loadTweets(final List<Long> list, final Callback<List<Tweet>> callback) {
        this.twitterCore.getApiClient().getStatusesService().lookup(TextUtils.join((CharSequence)",", (Iterable)list), (Boolean)null, (Boolean)null, (Boolean)null).H((d)new TweetRepository.TweetRepository$MultiTweetsCallback(this, (List)list, (Callback)callback));
    }
    
    public void retweet(final long n, final Callback<Tweet> callback) {
        this.getUserSession((Callback<TwitterSession>)new LoggingCallback<TwitterSession>(this, callback, Twitter.getLogger(), n, callback) {
            public final TweetRepository this$0;
            public final Callback val$cb;
            public final long val$tweetId;
            
            public void success(final Result<TwitterSession> result) {
                TweetRepository.access$000(this.this$0).getApiClient((TwitterSession)result.data).getStatusesService().retweet(Long.valueOf(this.val$tweetId), Boolean.FALSE).H((d)this.val$cb);
            }
        });
    }
    
    public void unfavorite(final long n, final Callback<Tweet> callback) {
        this.getUserSession((Callback<TwitterSession>)new LoggingCallback<TwitterSession>(this, callback, Twitter.getLogger(), n, callback) {
            public final TweetRepository this$0;
            public final Callback val$cb;
            public final long val$tweetId;
            
            public void success(final Result<TwitterSession> result) {
                TweetRepository.access$000(this.this$0).getApiClient((TwitterSession)result.data).getFavoriteService().destroy(Long.valueOf(this.val$tweetId), Boolean.FALSE).H((d)this.val$cb);
            }
        });
    }
    
    public void unretweet(final long n, final Callback<Tweet> callback) {
        this.getUserSession((Callback<TwitterSession>)new LoggingCallback<TwitterSession>(this, callback, Twitter.getLogger(), n, callback) {
            public final TweetRepository this$0;
            public final Callback val$cb;
            public final long val$tweetId;
            
            public void success(final Result<TwitterSession> result) {
                TweetRepository.access$000(this.this$0).getApiClient((TwitterSession)result.data).getStatusesService().unretweet(Long.valueOf(this.val$tweetId), Boolean.FALSE).H((d)this.val$cb);
            }
        });
    }
    
    public void updateCache(final Tweet tweet) {
        this.tweetCache.put((Object)tweet.id, (Object)tweet);
    }
}
