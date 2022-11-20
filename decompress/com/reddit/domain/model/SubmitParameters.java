// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import com.squareup.moshi.n;
import androidx.annotation.Keep;
import kotlin.Metadata;
import com.squareup.moshi.o;
import com.reddit.domain.model.postsubmit.PostSubmitGeneralMetaData;
import android.os.Parcelable;

@o(generateAdapter = false)
@Metadata(d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001aR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0014\u0010\b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015\u0082\u0001\u0005\"#$%&¨\u0006'" }, d2 = { "Lcom/reddit/domain/model/SubmitParameters;", "Landroid/os/Parcelable;", "Lcom/reddit/domain/model/postsubmit/PostSubmitGeneralMetaData;", "type", "", "postType", "Lcom/reddit/domain/model/PostType;", "subreddit", "title", "content", "flairText", "flairId", "discussionType", "Lcom/reddit/domain/model/DiscussionType;", "isNsfw", "", "isSpoiler", "postSetId", "linkId", "(Ljava/lang/String;Lcom/reddit/domain/model/PostType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/DiscussionType;ZZLjava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDiscussionType", "()Lcom/reddit/domain/model/DiscussionType;", "getFlairId", "getFlairText", "()Z", "getLinkId", "getPostSetId", "getPostType", "()Lcom/reddit/domain/model/PostType;", "getSubreddit", "getTitle", "getType", "Lcom/reddit/domain/model/SubmitGeneralParameters;", "Lcom/reddit/domain/model/SubmitLinkParameters;", "Lcom/reddit/domain/model/SubmitPollParameters;", "Lcom/reddit/domain/model/SubmitPostSetParameters;", "Lcom/reddit/domain/model/SubmitPredictionsParameters;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
@Keep
public abstract class SubmitParameters implements Parcelable, PostSubmitGeneralMetaData
{
    private final String content;
    private final DiscussionType discussionType;
    private final String flairId;
    private final String flairText;
    private final boolean isNsfw;
    private final boolean isSpoiler;
    private final String linkId;
    private final String postSetId;
    private final PostType postType;
    private final String subreddit;
    private final String title;
    private final String type;
    
    private SubmitParameters(@n(name = "_type") final String type, final PostType postType, final String subreddit, final String title, final String content, final String flairText, final String flairId, final DiscussionType discussionType, final boolean isNsfw, final boolean isSpoiler, final String postSetId, final String linkId) {
        this.type = type;
        this.postType = postType;
        this.subreddit = subreddit;
        this.title = title;
        this.content = content;
        this.flairText = flairText;
        this.flairId = flairId;
        this.discussionType = discussionType;
        this.isNsfw = isNsfw;
        this.isSpoiler = isSpoiler;
        this.postSetId = postSetId;
        this.linkId = linkId;
    }
    
    public SubmitParameters(final String s, final PostType postType, final String s2, final String s3, final String s4, String s5, String s6, DiscussionType discussionType, boolean b, boolean b2, String s7, String s8, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x20) != 0x0) {
            s5 = null;
        }
        if ((n & 0x40) != 0x0) {
            s6 = null;
        }
        if ((n & 0x80) != 0x0) {
            discussionType = null;
        }
        if ((n & 0x100) != 0x0) {
            b = false;
        }
        if ((n & 0x200) != 0x0) {
            b2 = false;
        }
        if ((n & 0x400) != 0x0) {
            s7 = null;
        }
        if ((n & 0x800) != 0x0) {
            s8 = null;
        }
        this(s, postType, s2, s3, s4, s5, s6, discussionType, b, b2, s7, s8, null);
    }
    
    public SubmitParameters(final String s, final PostType postType, final String s2, final String s3, final String s4, final String s5, final String s6, final DiscussionType discussionType, final boolean b, final boolean b2, final String s7, final String s8, final DefaultConstructorMarker defaultConstructorMarker) {
        this(s, postType, s2, s3, s4, s5, s6, discussionType, b, b2, s7, s8);
    }
    
    public String getContent() {
        return this.content;
    }
    
    public DiscussionType getDiscussionType() {
        return this.discussionType;
    }
    
    public String getFlairId() {
        return this.flairId;
    }
    
    public String getFlairText() {
        return this.flairText;
    }
    
    public String getLinkId() {
        return this.linkId;
    }
    
    public String getPostSetId() {
        return this.postSetId;
    }
    
    public PostType getPostType() {
        return this.postType;
    }
    
    public String getSubreddit() {
        return this.subreddit;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getType() {
        return this.type;
    }
    
    public boolean isNsfw() {
        return this.isNsfw;
    }
    
    public boolean isSpoiler() {
        return this.isSpoiler;
    }
}
