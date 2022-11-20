// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import android.view.View;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.IntentUtils;
import android.content.Context;
import com.twitter.sdk.android.core.models.User;
import android.content.Intent;
import android.content.res.Resources;
import com.twitter.sdk.android.core.models.Tweet;
import android.view.View$OnClickListener;

class ShareTweetAction implements View$OnClickListener
{
    public final Tweet tweet;
    public final TweetScribeClient tweetScribeClient;
    public final TweetUi tweetUi;
    
    public ShareTweetAction(final Tweet tweet, final TweetUi tweetUi) {
        this(tweet, tweetUi, (TweetScribeClient)new TweetScribeClientImpl(tweetUi));
    }
    
    public ShareTweetAction(final Tweet tweet, final TweetUi tweetUi, final TweetScribeClient tweetScribeClient) {
        this.tweet = tweet;
        this.tweetUi = tweetUi;
        this.tweetScribeClient = tweetScribeClient;
    }
    
    public String getShareContent(final Resources resources) {
        final int tw__share_content_format = R$string.tw__share_content_format;
        final Tweet tweet = this.tweet;
        return resources.getString(tw__share_content_format, new Object[] { tweet.user.screenName, Long.toString(tweet.id) });
    }
    
    public Intent getShareIntent(final String s, final String s2) {
        final Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", s);
        intent.putExtra("android.intent.extra.TEXT", s2);
        intent.setType("text/plain");
        return intent;
    }
    
    public String getShareSubject(final Resources resources) {
        final int tw__share_subject_format = R$string.tw__share_subject_format;
        final User user = this.tweet.user;
        return resources.getString(tw__share_subject_format, new Object[] { user.name, user.screenName });
    }
    
    public void launchShareIntent(final Intent intent, final Context context) {
        if (!IntentUtils.safeStartActivity(context, intent)) {
            Twitter.getLogger().e("TweetUi", "Activity cannot be found to handle share intent");
        }
    }
    
    public void onClick(final Context context, final Resources resources) {
        final Tweet tweet = this.tweet;
        if (tweet != null) {
            if (tweet.user != null) {
                this.scribeShareAction();
                this.launchShareIntent(Intent.createChooser(this.getShareIntent(this.getShareSubject(resources), this.getShareContent(resources)), (CharSequence)resources.getString(R$string.tw__share_tweet)), context);
            }
        }
    }
    
    public void onClick(final View view) {
        this.onClick(view.getContext(), view.getResources());
    }
    
    public void scribeShareAction() {
        this.tweetScribeClient.share(this.tweet);
    }
}
