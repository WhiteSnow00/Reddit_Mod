// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.Map;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\f\u0012\b\b\u0003\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003J\t\u0010$\u001a\u00020\fH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u000fH\u00c6\u0003Js\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u000fH\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006-" }, d2 = { "Lcom/reddit/domain/model/UserComment;", "", "id", "", "linkKindWithId", "linkTitle", "bodyHtml", "body", "mediaMetadata", "", "Lcom/reddit/domain/model/MediaMetaData;", "createdUtc", "", "subredditNamePrefixed", "score", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;JLjava/lang/String;I)V", "getBody", "()Ljava/lang/String;", "getBodyHtml", "getCreatedUtc", "()J", "getId", "getLinkKindWithId", "getLinkTitle", "getMediaMetadata", "()Ljava/util/Map;", "getScore", "()I", "getSubredditNamePrefixed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class UserComment
{
    private final String body;
    private final String bodyHtml;
    private final long createdUtc;
    private final String id;
    private final String linkKindWithId;
    private final String linkTitle;
    private final Map<String, MediaMetaData> mediaMetadata;
    private final int score;
    private final String subredditNamePrefixed;
    
    public UserComment() {
        this(null, null, null, null, null, null, 0L, null, 0, 511, null);
    }
    
    public UserComment(final String id, @n(name = "link_id") final String linkKindWithId, @n(name = "link_title") final String linkTitle, @n(name = "body_html") final String bodyHtml, final String body, @n(name = "media_metadata") final Map<String, MediaMetaData> mediaMetadata, @n(name = "created_utc") final long createdUtc, @n(name = "subreddit_name_prefixed") final String subredditNamePrefixed, final int score) {
        a.t(id, "id", linkKindWithId, "linkKindWithId", bodyHtml, "bodyHtml", body, "body", subredditNamePrefixed, "subredditNamePrefixed");
        this.id = id;
        this.linkKindWithId = linkKindWithId;
        this.linkTitle = linkTitle;
        this.bodyHtml = bodyHtml;
        this.body = body;
        this.mediaMetadata = mediaMetadata;
        this.createdUtc = createdUtc;
        this.subredditNamePrefixed = subredditNamePrefixed;
        this.score = score;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.linkKindWithId;
    }
    
    public final String component3() {
        return this.linkTitle;
    }
    
    public final String component4() {
        return this.bodyHtml;
    }
    
    public final String component5() {
        return this.body;
    }
    
    public final Map<String, MediaMetaData> component6() {
        return this.mediaMetadata;
    }
    
    public final long component7() {
        return this.createdUtc;
    }
    
    public final String component8() {
        return this.subredditNamePrefixed;
    }
    
    public final int component9() {
        return this.score;
    }
    
    public final UserComment copy(final String s, @n(name = "link_id") final String s2, @n(name = "link_title") final String s3, @n(name = "body_html") final String s4, final String s5, @n(name = "media_metadata") final Map<String, MediaMetaData> map, @n(name = "created_utc") final long n, @n(name = "subreddit_name_prefixed") final String s6, final int n2) {
        f.f((Object)s, "id");
        f.f((Object)s2, "linkKindWithId");
        f.f((Object)s4, "bodyHtml");
        f.f((Object)s5, "body");
        f.f((Object)s6, "subredditNamePrefixed");
        return new UserComment(s, s2, s3, s4, s5, map, n, s6, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserComment)) {
            return false;
        }
        final UserComment userComment = (UserComment)o;
        return f.a((Object)this.id, (Object)userComment.id) && f.a((Object)this.linkKindWithId, (Object)userComment.linkKindWithId) && f.a((Object)this.linkTitle, (Object)userComment.linkTitle) && f.a((Object)this.bodyHtml, (Object)userComment.bodyHtml) && f.a((Object)this.body, (Object)userComment.body) && f.a((Object)this.mediaMetadata, (Object)userComment.mediaMetadata) && this.createdUtc == userComment.createdUtc && f.a((Object)this.subredditNamePrefixed, (Object)userComment.subredditNamePrefixed) && this.score == userComment.score;
    }
    
    public final String getBody() {
        return this.body;
    }
    
    public final String getBodyHtml() {
        return this.bodyHtml;
    }
    
    public final long getCreatedUtc() {
        return this.createdUtc;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getLinkKindWithId() {
        return this.linkKindWithId;
    }
    
    public final String getLinkTitle() {
        return this.linkTitle;
    }
    
    public final Map<String, MediaMetaData> getMediaMetadata() {
        return this.mediaMetadata;
    }
    
    public final int getScore() {
        return this.score;
    }
    
    public final String getSubredditNamePrefixed() {
        return this.subredditNamePrefixed;
    }
    
    @Override
    public int hashCode() {
        final int f = ag0.a.f(this.linkKindWithId, this.id.hashCode() * 31, 31);
        final String linkTitle = this.linkTitle;
        final int n = 0;
        int hashCode;
        if (linkTitle == null) {
            hashCode = 0;
        }
        else {
            hashCode = linkTitle.hashCode();
        }
        final int f2 = ag0.a.f(this.body, ag0.a.f(this.bodyHtml, (f + hashCode) * 31, 31), 31);
        final Map<String, MediaMetaData> mediaMetadata = this.mediaMetadata;
        int hashCode2;
        if (mediaMetadata == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = mediaMetadata.hashCode();
        }
        return Integer.hashCode(this.score) + ag0.a.f(this.subredditNamePrefixed, b.c(this.createdUtc, (f2 + hashCode2) * 31, 31), 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("UserComment(id=");
        k.append(this.id);
        k.append(", linkKindWithId=");
        k.append(this.linkKindWithId);
        k.append(", linkTitle=");
        k.append(this.linkTitle);
        k.append(", bodyHtml=");
        k.append(this.bodyHtml);
        k.append(", body=");
        k.append(this.body);
        k.append(", mediaMetadata=");
        k.append(this.mediaMetadata);
        k.append(", createdUtc=");
        k.append(this.createdUtc);
        k.append(", subredditNamePrefixed=");
        k.append(this.subredditNamePrefixed);
        k.append(", score=");
        return d.k(k, this.score, ')');
    }
}
