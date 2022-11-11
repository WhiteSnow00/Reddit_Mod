// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import android.os.Parcel;
import androidx.appcompat.widget.s0;
import ah2.f;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.vote.VoteDirection;
import com.reddit.domain.model.Link;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u0000 e2\u00020\u0001:\u0001eB\u00ad\u0001\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0006\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010 \u001a\u00020\n\u0012\b\u0010!\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\b\b\u0001\u0010$\u001a\u00020\u0010\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\b\b\u0001\u0010&\u001a\u00020\u0002\u0012\b\b\u0001\u0010'\u001a\u00020\u0006\u0012\b\b\u0001\u0010(\u001a\u00020\b\u0012\b\b\u0001\u0010)\u001a\u00020\u0002\u0012\b\b\u0001\u0010*\u001a\u00020\u0017\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\bc\u0010dJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0010H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0017H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J¹\u0001\u0010,\u001a\u00020\u00002\b\b\u0003\u0010\u001b\u001a\u00020\u00022\b\b\u0003\u0010\u001c\u001a\u00020\u00022\b\b\u0003\u0010\u001d\u001a\u00020\u00022\b\b\u0003\u0010\u001e\u001a\u00020\u00062\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010 \u001a\u00020\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0003\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0003\u0010&\u001a\u00020\u00022\b\b\u0003\u0010'\u001a\u00020\u00062\b\b\u0003\u0010(\u001a\u00020\b2\b\b\u0003\u0010)\u001a\u00020\u00022\b\b\u0003\u0010*\u001a\u00020\u00172\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u0019H\u00c6\u0001J\t\u0010-\u001a\u00020\bH\u00d6\u0001J\t\u0010.\u001a\u00020\u0002H\u00d6\u0001J\u0013\u00101\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010/H\u00d6\u0003J\t\u00102\u001a\u00020\u0002H\u00d6\u0001J\u0019\u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0002H\u00d6\u0001R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u00108\u001a\u0004\b;\u0010:R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u00108\u001a\u0004\b<\u0010:R\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010=\u001a\u0004\b\u001e\u0010>R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010 \u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010B\u001a\u0004\bC\u0010DR\u0019\u0010!\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b!\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u00108\u001a\u0004\bH\u0010:R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\bI\u0010:R\u0017\u0010$\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b$\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u00108\u001a\u0004\bM\u0010:R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u00108\u001a\u0004\bN\u0010:R\u0017\u0010'\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010=\u001a\u0004\bO\u0010>R\u0017\u0010(\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010?\u001a\u0004\bP\u0010AR\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u00108\u001a\u0004\bQ\u0010:R\u0017\u0010*\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b*\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010+\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b+\u0010U\u001a\u0004\bV\u0010WR\u0011\u0010X\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bX\u0010>R\u0011\u0010Y\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bY\u0010>R\u0011\u0010Z\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bZ\u0010>R\u0011\u0010\\\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b[\u0010AR\u0011\u0010^\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b]\u0010AR\u0011\u0010`\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b_\u0010AR\u0014\u0010b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010A¨\u0006f" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamVideoData;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "", "component5", "Lcom/reddit/domain/model/Link;", "component6", "Lcom/reddit/domain/model/streaming/Stream;", "component7", "component8", "component9", "Lcom/reddit/domain/model/vote/VoteDirection;", "component10", "component11", "component12", "component13", "component14", "component15", "", "component16", "Lcom/reddit/domain/model/streaming/Meter;", "component17", "uniqueWatchers", "continuousWatchers", "totalContinuousWatchers", "isFirstBroadcast", "endedReason", "post", "stream", "upvotes", "downvotes", "voteDirection", "rank", "totalStreams", "chatDisabled", "shareLink", "estimatedRemainingTimeSeconds", "broadcastTimeSeconds", "meter", "copy", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "I", "getUniqueWatchers", "()I", "getContinuousWatchers", "getTotalContinuousWatchers", "Z", "()Z", "Ljava/lang/String;", "getEndedReason", "()Ljava/lang/String;", "Lcom/reddit/domain/model/Link;", "getPost", "()Lcom/reddit/domain/model/Link;", "Lcom/reddit/domain/model/streaming/Stream;", "getStream", "()Lcom/reddit/domain/model/streaming/Stream;", "getUpvotes", "getDownvotes", "Lcom/reddit/domain/model/vote/VoteDirection;", "getVoteDirection", "()Lcom/reddit/domain/model/vote/VoteDirection;", "getRank", "getTotalStreams", "getChatDisabled", "getShareLink", "getEstimatedRemainingTimeSeconds", "F", "getBroadcastTimeSeconds", "()F", "Lcom/reddit/domain/model/streaming/Meter;", "getMeter", "()Lcom/reddit/domain/model/streaming/Meter;", "isVod", "isAdminEnded", "isBumper", "getStreamId", "streamId", "getUpvoteCount", "upvoteCount", "getDownvoteCount", "downvoteCount", "getStreamIdOrPostId", "streamIdOrPostId", "<init>", "(IIIZLjava/lang/String;Lcom/reddit/domain/model/Link;Lcom/reddit/domain/model/streaming/Stream;IILcom/reddit/domain/model/vote/VoteDirection;IIZLjava/lang/String;IFLcom/reddit/domain/model/streaming/Meter;)V", "Companion", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class StreamVideoData implements Parcelable
{
    public static final Parcelable$Creator<StreamVideoData> CREATOR;
    public static final Companion Companion;
    private static final String STREAM_ENDED_ADMIN = "MOD";
    private final float broadcastTimeSeconds;
    private final boolean chatDisabled;
    private final int continuousWatchers;
    private final int downvotes;
    private final String endedReason;
    private final int estimatedRemainingTimeSeconds;
    private final boolean isFirstBroadcast;
    private final Meter meter;
    private final Link post;
    private final int rank;
    private final String shareLink;
    private final Stream stream;
    private final int totalContinuousWatchers;
    private final int totalStreams;
    private final int uniqueWatchers;
    private final int upvotes;
    private final VoteDirection voteDirection;
    
    static {
        Companion = new Companion(null);
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public StreamVideoData(@n(name = "unique_watchers") final int uniqueWatchers, @n(name = "continuous_watchers") final int continuousWatchers, @n(name = "total_continuous_watchers") final int totalContinuousWatchers, @n(name = "is_first_broadcast") final boolean isFirstBroadcast, @n(name = "ended_reason") final String endedReason, final Link post, final Stream stream, final int upvotes, final int downvotes, @n(name = "vote_direction") final VoteDirection voteDirection, final int rank, @n(name = "total_streams") final int totalStreams, @n(name = "chat_disabled") final boolean chatDisabled, @n(name = "share_link") final String shareLink, @n(name = "estimated_remaining_time") final int estimatedRemainingTimeSeconds, @n(name = "broadcast_time") final float broadcastTimeSeconds, @n(name = "meter") final Meter meter) {
        f.f((Object)post, "post");
        f.f((Object)voteDirection, "voteDirection");
        f.f((Object)shareLink, "shareLink");
        this.uniqueWatchers = uniqueWatchers;
        this.continuousWatchers = continuousWatchers;
        this.totalContinuousWatchers = totalContinuousWatchers;
        this.isFirstBroadcast = isFirstBroadcast;
        this.endedReason = endedReason;
        this.post = post;
        this.stream = stream;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
        this.voteDirection = voteDirection;
        this.rank = rank;
        this.totalStreams = totalStreams;
        this.chatDisabled = chatDisabled;
        this.shareLink = shareLink;
        this.estimatedRemainingTimeSeconds = estimatedRemainingTimeSeconds;
        this.broadcastTimeSeconds = broadcastTimeSeconds;
        this.meter = meter;
    }
    
    private final String getStreamIdOrPostId() {
        final Stream stream = this.stream;
        String s;
        if (stream == null || (s = stream.getStreamId()) == null) {
            s = this.post.getId();
        }
        return s;
    }
    
    public final int component1() {
        return this.uniqueWatchers;
    }
    
    public final VoteDirection component10() {
        return this.voteDirection;
    }
    
    public final int component11() {
        return this.rank;
    }
    
    public final int component12() {
        return this.totalStreams;
    }
    
    public final boolean component13() {
        return this.chatDisabled;
    }
    
    public final String component14() {
        return this.shareLink;
    }
    
    public final int component15() {
        return this.estimatedRemainingTimeSeconds;
    }
    
    public final float component16() {
        return this.broadcastTimeSeconds;
    }
    
    public final Meter component17() {
        return this.meter;
    }
    
    public final int component2() {
        return this.continuousWatchers;
    }
    
    public final int component3() {
        return this.totalContinuousWatchers;
    }
    
    public final boolean component4() {
        return this.isFirstBroadcast;
    }
    
    public final String component5() {
        return this.endedReason;
    }
    
    public final Link component6() {
        return this.post;
    }
    
    public final Stream component7() {
        return this.stream;
    }
    
    public final int component8() {
        return this.upvotes;
    }
    
    public final int component9() {
        return this.downvotes;
    }
    
    public final StreamVideoData copy(@n(name = "unique_watchers") final int n, @n(name = "continuous_watchers") final int n2, @n(name = "total_continuous_watchers") final int n3, @n(name = "is_first_broadcast") final boolean b, @n(name = "ended_reason") final String s, final Link link, final Stream stream, final int n4, final int n5, @n(name = "vote_direction") final VoteDirection voteDirection, final int n6, @n(name = "total_streams") final int n7, @n(name = "chat_disabled") final boolean b2, @n(name = "share_link") final String s2, @n(name = "estimated_remaining_time") final int n8, @n(name = "broadcast_time") final float n9, @n(name = "meter") final Meter meter) {
        f.f((Object)link, "post");
        f.f((Object)voteDirection, "voteDirection");
        f.f((Object)s2, "shareLink");
        return new StreamVideoData(n, n2, n3, b, s, link, stream, n4, n5, voteDirection, n6, n7, b2, s2, n8, n9, meter);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamVideoData)) {
            return false;
        }
        final StreamVideoData streamVideoData = (StreamVideoData)o;
        return this.uniqueWatchers == streamVideoData.uniqueWatchers && this.continuousWatchers == streamVideoData.continuousWatchers && this.totalContinuousWatchers == streamVideoData.totalContinuousWatchers && this.isFirstBroadcast == streamVideoData.isFirstBroadcast && f.a((Object)this.endedReason, (Object)streamVideoData.endedReason) && f.a((Object)this.post, (Object)streamVideoData.post) && f.a((Object)this.stream, (Object)streamVideoData.stream) && this.upvotes == streamVideoData.upvotes && this.downvotes == streamVideoData.downvotes && this.voteDirection == streamVideoData.voteDirection && this.rank == streamVideoData.rank && this.totalStreams == streamVideoData.totalStreams && this.chatDisabled == streamVideoData.chatDisabled && f.a((Object)this.shareLink, (Object)streamVideoData.shareLink) && this.estimatedRemainingTimeSeconds == streamVideoData.estimatedRemainingTimeSeconds && f.a((Object)this.broadcastTimeSeconds, (Object)streamVideoData.broadcastTimeSeconds) && f.a((Object)this.meter, (Object)streamVideoData.meter);
    }
    
    public final float getBroadcastTimeSeconds() {
        return this.broadcastTimeSeconds;
    }
    
    public final boolean getChatDisabled() {
        return this.chatDisabled;
    }
    
    public final int getContinuousWatchers() {
        return this.continuousWatchers;
    }
    
    public final String getDownvoteCount() {
        return String.valueOf(this.downvotes);
    }
    
    public final int getDownvotes() {
        return this.downvotes;
    }
    
    public final String getEndedReason() {
        return this.endedReason;
    }
    
    public final int getEstimatedRemainingTimeSeconds() {
        return this.estimatedRemainingTimeSeconds;
    }
    
    public final Meter getMeter() {
        return this.meter;
    }
    
    public final Link getPost() {
        return this.post;
    }
    
    public final int getRank() {
        return this.rank;
    }
    
    public final String getShareLink() {
        return this.shareLink;
    }
    
    public final Stream getStream() {
        return this.stream;
    }
    
    public final String getStreamId() {
        String s;
        if (this.isBumper()) {
            final StringBuilder k = a.k("t3_");
            k.append(this.getStreamIdOrPostId());
            s = k.toString();
        }
        else {
            s = this.getStreamIdOrPostId();
        }
        return s;
    }
    
    public final int getTotalContinuousWatchers() {
        return this.totalContinuousWatchers;
    }
    
    public final int getTotalStreams() {
        return this.totalStreams;
    }
    
    public final int getUniqueWatchers() {
        return this.uniqueWatchers;
    }
    
    public final String getUpvoteCount() {
        return String.valueOf(this.upvotes);
    }
    
    public final int getUpvotes() {
        return this.upvotes;
    }
    
    public final VoteDirection getVoteDirection() {
        return this.voteDirection;
    }
    
    @Override
    public int hashCode() {
        final int e = s0.e(this.totalContinuousWatchers, s0.e(this.continuousWatchers, Integer.hashCode(this.uniqueWatchers) * 31, 31), 31);
        final int isFirstBroadcast = this.isFirstBroadcast ? 1 : 0;
        final int n = 1;
        int n2 = isFirstBroadcast;
        if (isFirstBroadcast != 0) {
            n2 = 1;
        }
        final String endedReason = this.endedReason;
        final int n3 = 0;
        int hashCode;
        if (endedReason == null) {
            hashCode = 0;
        }
        else {
            hashCode = endedReason.hashCode();
        }
        final int hashCode2 = this.post.hashCode();
        final Stream stream = this.stream;
        int hashCode3;
        if (stream == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = stream.hashCode();
        }
        final int e2 = s0.e(this.totalStreams, s0.e(this.rank, (this.voteDirection.hashCode() + s0.e(this.downvotes, s0.e(this.upvotes, ((hashCode2 + ((e + n2) * 31 + hashCode) * 31) * 31 + hashCode3) * 31, 31), 31)) * 31, 31), 31);
        int chatDisabled = this.chatDisabled ? 1 : 0;
        if (chatDisabled != 0) {
            chatDisabled = n;
        }
        final int a = a.a(this.broadcastTimeSeconds, s0.e(this.estimatedRemainingTimeSeconds, ag0.a.f(this.shareLink, (e2 + chatDisabled) * 31, 31), 31), 31);
        final Meter meter = this.meter;
        int hashCode4;
        if (meter == null) {
            hashCode4 = n3;
        }
        else {
            hashCode4 = meter.hashCode();
        }
        return a + hashCode4;
    }
    
    public final boolean isAdminEnded() {
        final Stream stream = this.stream;
        String streamEndedBy;
        if (stream != null) {
            streamEndedBy = stream.getStreamEndedBy();
        }
        else {
            streamEndedBy = null;
        }
        return f.a((Object)streamEndedBy, (Object)"MOD") || this.endedReason != null;
    }
    
    public final boolean isBumper() {
        return this.stream == null;
    }
    
    public final boolean isFirstBroadcast() {
        return this.isFirstBroadcast;
    }
    
    public final boolean isVod() {
        final Stream stream = this.stream;
        final boolean b = false;
        boolean booleanValue = false;
        Label_0030: {
            if (stream != null) {
                final Boolean videoOnDemand = stream.isVideoOnDemand();
                if (videoOnDemand != null) {
                    booleanValue = videoOnDemand;
                    break Label_0030;
                }
            }
            booleanValue = false;
        }
        boolean b2 = b;
        if (booleanValue) {
            final Stream stream2 = this.stream;
            String state;
            if (stream2 != null) {
                state = stream2.getState();
            }
            else {
                state = null;
            }
            b2 = b;
            if (f.a((Object)state, (Object)"ENDED")) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("StreamVideoData(uniqueWatchers=");
        k.append(this.uniqueWatchers);
        k.append(", continuousWatchers=");
        k.append(this.continuousWatchers);
        k.append(", totalContinuousWatchers=");
        k.append(this.totalContinuousWatchers);
        k.append(", isFirstBroadcast=");
        k.append(this.isFirstBroadcast);
        k.append(", endedReason=");
        k.append(this.endedReason);
        k.append(", post=");
        k.append(this.post);
        k.append(", stream=");
        k.append(this.stream);
        k.append(", upvotes=");
        k.append(this.upvotes);
        k.append(", downvotes=");
        k.append(this.downvotes);
        k.append(", voteDirection=");
        k.append(this.voteDirection);
        k.append(", rank=");
        k.append(this.rank);
        k.append(", totalStreams=");
        k.append(this.totalStreams);
        k.append(", chatDisabled=");
        k.append(this.chatDisabled);
        k.append(", shareLink=");
        k.append(this.shareLink);
        k.append(", estimatedRemainingTimeSeconds=");
        k.append(this.estimatedRemainingTimeSeconds);
        k.append(", broadcastTimeSeconds=");
        k.append(this.broadcastTimeSeconds);
        k.append(", meter=");
        k.append(this.meter);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeInt(this.uniqueWatchers);
        parcel.writeInt(this.continuousWatchers);
        parcel.writeInt(this.totalContinuousWatchers);
        parcel.writeInt((int)(this.isFirstBroadcast ? 1 : 0));
        parcel.writeString(this.endedReason);
        parcel.writeParcelable((Parcelable)this.post, n);
        final Stream stream = this.stream;
        if (stream == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            stream.writeToParcel(parcel, n);
        }
        parcel.writeInt(this.upvotes);
        parcel.writeInt(this.downvotes);
        parcel.writeString(this.voteDirection.name());
        parcel.writeInt(this.rank);
        parcel.writeInt(this.totalStreams);
        parcel.writeInt((int)(this.chatDisabled ? 1 : 0));
        parcel.writeString(this.shareLink);
        parcel.writeInt(this.estimatedRemainingTimeSeconds);
        parcel.writeFloat(this.broadcastTimeSeconds);
        final Meter meter = this.meter;
        if (meter == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            meter.writeToParcel(parcel, n);
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamVideoData$Companion;", "", "()V", "STREAM_ENDED_ADMIN", "", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<StreamVideoData>
    {
        public final StreamVideoData createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final int int1 = parcel.readInt();
            final int int2 = parcel.readInt();
            final int int3 = parcel.readInt();
            final boolean b = parcel.readInt() != 0;
            final String string = parcel.readString();
            final Link link = (Link)parcel.readParcelable(StreamVideoData.class.getClassLoader());
            final int int4 = parcel.readInt();
            final Meter meter = null;
            Object fromParcel;
            if (int4 == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = Stream.CREATOR.createFromParcel(parcel);
            }
            final Stream stream = (Stream)fromParcel;
            final int int5 = parcel.readInt();
            final int int6 = parcel.readInt();
            final VoteDirection value = VoteDirection.valueOf(parcel.readString());
            final int int7 = parcel.readInt();
            final int int8 = parcel.readInt();
            final boolean b2 = parcel.readInt() != 0;
            final String string2 = parcel.readString();
            final int int9 = parcel.readInt();
            final float float1 = parcel.readFloat();
            Object fromParcel2;
            if (parcel.readInt() == 0) {
                fromParcel2 = meter;
            }
            else {
                fromParcel2 = Meter.CREATOR.createFromParcel(parcel);
            }
            return new StreamVideoData(int1, int2, int3, b, string, link, stream, int5, int6, value, int7, int8, b2, string2, int9, float1, (Meter)fromParcel2);
        }
        
        public final StreamVideoData[] newArray(final int n) {
            return new StreamVideoData[n];
        }
    }
}
