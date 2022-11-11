// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import com.reddit.domain.awards.model.Award;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0003\u0012\b\b\u0003\u0010-\u001a\u00020\u0002\u0012\b\b\u0003\u0010.\u001a\u00020\u0002\u0012\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00101\u001a\u00020\u0002\u0012\b\b\u0003\u00102\u001a\u00020\u0002\u0012\b\b\u0002\u00103\u001a\u00020\u0002\u0012\b\b\u0003\u00104\u001a\u00020\n\u0012\b\b\u0002\u00105\u001a\u00020\n\u0012\b\b\u0003\u00106\u001a\u00020\u0002\u0012\b\b\u0003\u00107\u001a\u00020\u000e\u0012\n\b\u0003\u00108\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u00109\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010<\u001a\u00020\u0002\u0012\b\b\u0003\u0010=\u001a\u00020\u000e\u0012\b\b\u0003\u0010>\u001a\u00020\u0002\u0012\b\b\u0003\u0010?\u001a\u00020\u0002\u0012\b\b\u0003\u0010@\u001a\u00020\u0002\u0012\b\b\u0002\u0010A\u001a\u00020\u0002\u0012\b\b\u0003\u0010B\u001a\u00020\u0002\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0003\u0010D\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010F\u001a\u0004\u0018\u00010\"\u0012\n\b\u0003\u0010G\u001a\u0004\u0018\u00010\"\u0012\n\b\u0003\u0010H\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010I\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010J\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010K\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010M\u001a\u00020\"\u0012\b\b\u0003\u0010N\u001a\u00020\"¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\t\u0010\f\u001a\u00020\nH\u00c6\u0003J\t\u0010\r\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010#\u001a\u0004\u0018\u00010\"H\u00c6\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\"H\u00c6\u0003¢\u0006\u0004\b%\u0010$J\u000b\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010+\u001a\u00020\"H\u00c6\u0003J\t\u0010,\u001a\u00020\"H\u00c6\u0003J\u008a\u0003\u0010O\u001a\u00020\u00002\b\b\u0003\u0010-\u001a\u00020\u00022\b\b\u0003\u0010.\u001a\u00020\u00022\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00101\u001a\u00020\u00022\b\b\u0003\u00102\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u00022\b\b\u0003\u00104\u001a\u00020\n2\b\b\u0002\u00105\u001a\u00020\n2\b\b\u0003\u00106\u001a\u00020\u00022\b\b\u0003\u00107\u001a\u00020\u000e2\n\b\u0003\u00108\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u00109\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010<\u001a\u00020\u00022\b\b\u0003\u0010=\u001a\u00020\u000e2\b\b\u0003\u0010>\u001a\u00020\u00022\b\b\u0003\u0010?\u001a\u00020\u00022\b\b\u0003\u0010@\u001a\u00020\u00022\b\b\u0002\u0010A\u001a\u00020\u00022\b\b\u0003\u0010B\u001a\u00020\u00022\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u001d2\n\b\u0003\u0010D\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010F\u001a\u0004\u0018\u00010\"2\n\b\u0003\u0010G\u001a\u0004\u0018\u00010\"2\n\b\u0003\u0010H\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010I\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010J\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010K\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010M\u001a\u00020\"2\b\b\u0003\u0010N\u001a\u00020\"H\u00c6\u0001¢\u0006\u0004\bO\u0010PJ\t\u0010Q\u001a\u00020\u0002H\u00d6\u0001J\t\u0010R\u001a\u00020\nH\u00d6\u0001J\u0013\u0010U\u001a\u00020\"2\b\u0010T\u001a\u0004\u0018\u00010SH\u00d6\u0003J\t\u0010V\u001a\u00020\nH\u00d6\u0001J\u0019\u0010[\u001a\u00020Z2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\nH\u00d6\u0001R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\\\u001a\u0004\b_\u0010^R\u0019\u0010/\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\\\u001a\u0004\b`\u0010^R\u0019\u00100\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\\\u001a\u0004\ba\u0010^R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\\\u001a\u0004\bb\u0010^R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\\\u001a\u0004\bc\u0010^R\u0017\u00103\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\\\u001a\u0004\bd\u0010^R\u0017\u00104\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u0010e\u001a\u0004\bf\u0010gR\u0017\u00105\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u0010e\u001a\u0004\bh\u0010gR\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\\\u001a\u0004\bi\u0010^R\u0017\u00107\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b7\u0010j\u001a\u0004\bk\u0010lR\u0019\u00108\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\\\u001a\u0004\bm\u0010^R\u001f\u00109\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b9\u0010n\u001a\u0004\bo\u0010pR\u0019\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010\\\u001a\u0004\bq\u0010^R\u0019\u0010;\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\\\u001a\u0004\br\u0010^R\u0017\u0010<\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010\\\u001a\u0004\bs\u0010^R\u0017\u0010=\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010j\u001a\u0004\bt\u0010lR\u0017\u0010>\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\\\u001a\u0004\bu\u0010^R\u0017\u0010?\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010\\\u001a\u0004\bv\u0010^R\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010\\\u001a\u0004\bw\u0010^R\u0017\u0010A\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\\\u001a\u0004\bx\u0010^R\u0017\u0010B\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010\\\u001a\u0004\by\u0010^R\u0019\u0010C\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bC\u0010z\u001a\u0004\b{\u0010|R\u0019\u0010D\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bD\u0010}\u001a\u0004\b~\u0010\u007fR\u001a\u0010E\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bE\u0010\\\u001a\u0005\b\u0080\u0001\u0010^R\u001b\u0010F\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\u000e\n\u0005\bF\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010$R\u001a\u0010G\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\r\n\u0005\bG\u0010\u0081\u0001\u001a\u0004\bG\u0010$R\u001a\u0010H\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bH\u0010\\\u001a\u0005\b\u0083\u0001\u0010^R\u001a\u0010I\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bI\u0010\\\u001a\u0005\b\u0084\u0001\u0010^R\u001a\u0010J\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bJ\u0010\\\u001a\u0005\b\u0085\u0001\u0010^R\u001a\u0010K\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bK\u0010\\\u001a\u0005\b\u0086\u0001\u0010^R\u001a\u0010L\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bL\u0010\\\u001a\u0005\b\u0087\u0001\u0010^R\u001a\u0010M\u001a\u00020\"8\u0006¢\u0006\u000f\n\u0005\bM\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010N\u001a\u00020\"8\u0006¢\u0006\u000f\n\u0005\bN\u0010\u0088\u0001\u001a\u0006\b\u008b\u0001\u0010\u008a\u0001¨\u0006\u008e\u0001" }, d2 = { "Lcom/reddit/domain/model/LiveComment;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "component9", "component10", "", "component11", "component12", "", "Lcom/reddit/domain/model/FlairRichTextItem;", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "Lcom/reddit/domain/model/RichTextResponse;", "component23", "Lcom/reddit/domain/awards/model/Award;", "component24", "component25", "", "component26", "()Ljava/lang/Boolean;", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "id", "kindWithId", "parentKindWithId", "parentId", "body", "bodyHtml", "context", "totalCommentCount", "score", "fullDate", "authorId", "authorFlairText", "authorFlairRichText", "flairCssClass", "flairPosition", "author", "createdUtc", "authorKindWithId", "subredditKindWithId", "linkKindWithId", "subreddit", "subredditNamePrefixed", "rtjson", "associatedAward", "distinguished", "collapsed", "isCollapsedBecauseOfCrowdControl", "collapsedReasonCode", "unrepliableReason", "commentType", "authorSnoovatarImg", "authorIconImg", "authorIsDefaultIcon", "authorIsNsfwIcon", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/RichTextResponse;Lcom/reddit/domain/awards/model/Award;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/reddit/domain/model/LiveComment;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getKindWithId", "getParentKindWithId", "getParentId", "getBody", "getBodyHtml", "getContext", "I", "getTotalCommentCount", "()I", "getScore", "getFullDate", "J", "getAuthorId", "()J", "getAuthorFlairText", "Ljava/util/List;", "getAuthorFlairRichText", "()Ljava/util/List;", "getFlairCssClass", "getFlairPosition", "getAuthor", "getCreatedUtc", "getAuthorKindWithId", "getSubredditKindWithId", "getLinkKindWithId", "getSubreddit", "getSubredditNamePrefixed", "Lcom/reddit/domain/model/RichTextResponse;", "getRtjson", "()Lcom/reddit/domain/model/RichTextResponse;", "Lcom/reddit/domain/awards/model/Award;", "getAssociatedAward", "()Lcom/reddit/domain/awards/model/Award;", "getDistinguished", "Ljava/lang/Boolean;", "getCollapsed", "getCollapsedReasonCode", "getUnrepliableReason", "getCommentType", "getAuthorSnoovatarImg", "getAuthorIconImg", "Z", "getAuthorIsDefaultIcon", "()Z", "getAuthorIsNsfwIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/RichTextResponse;Lcom/reddit/domain/awards/model/Award;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class LiveComment implements Parcelable
{
    public static final Parcelable$Creator<LiveComment> CREATOR;
    private final Award associatedAward;
    private final String author;
    private final List<FlairRichTextItem> authorFlairRichText;
    private final String authorFlairText;
    private final String authorIconImg;
    private final long authorId;
    private final boolean authorIsDefaultIcon;
    private final boolean authorIsNsfwIcon;
    private final String authorKindWithId;
    private final String authorSnoovatarImg;
    private final String body;
    private final String bodyHtml;
    private final Boolean collapsed;
    private final String collapsedReasonCode;
    private final String commentType;
    private final String context;
    private final long createdUtc;
    private final String distinguished;
    private final String flairCssClass;
    private final String flairPosition;
    private final String fullDate;
    private final String id;
    private final Boolean isCollapsedBecauseOfCrowdControl;
    private final String kindWithId;
    private final String linkKindWithId;
    private final String parentId;
    private final String parentKindWithId;
    private final RichTextResponse rtjson;
    private final int score;
    private final String subreddit;
    private final String subredditKindWithId;
    private final String subredditNamePrefixed;
    private final int totalCommentCount;
    private final String unrepliableReason;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public LiveComment() {
        this(null, null, null, null, null, null, null, 0, 0, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, -1, 3, null);
    }
    
    public LiveComment(@n(name = "_id36") final String id, @n(name = "name") final String kindWithId, @n(name = "parent_id") final String parentKindWithId, @n(name = "parent_id36") final String parentId, final String body, @n(name = "body_html") final String bodyHtml, final String context, @n(name = "total_comment_count") final int totalCommentCount, final int score, @n(name = "full_date") final String fullDate, @n(name = "author_id") final long authorId, @n(name = "author_flair_text") final String authorFlairText, @n(name = "author_flair_richtext") final List<FlairRichTextItem> authorFlairRichText, @n(name = "flair_css_class") final String flairCssClass, @n(name = "flair_position") final String flairPosition, final String author, @n(name = "created_utc") final long createdUtc, @n(name = "author_fullname") final String authorKindWithId, @n(name = "subreddit_id") final String subredditKindWithId, @n(name = "link_id") final String linkKindWithId, final String subreddit, @n(name = "subreddit_name_prefixed") final String subredditNamePrefixed, final RichTextResponse rtjson, @n(name = "associated_award") final Award associatedAward, final String distinguished, @n(name = "collapsed") final Boolean collapsed, @n(name = "collapsed_because_crowd_control") final Boolean isCollapsedBecauseOfCrowdControl, @n(name = "collapsed_reason_code") final String collapsedReasonCode, @n(name = "unrepliable_reason") final String unrepliableReason, @n(name = "comment_type") final String commentType, @n(name = "author_snoovatar_img") final String authorSnoovatarImg, @n(name = "author_icon_img") final String authorIconImg, @n(name = "author_is_default_icon") final boolean authorIsDefaultIcon, @n(name = "author_is_nsfw_icon") final boolean authorIsNsfwIcon) {
        f.f((Object)id, "id");
        f.f((Object)kindWithId, "kindWithId");
        f.f((Object)body, "body");
        f.f((Object)bodyHtml, "bodyHtml");
        f.f((Object)context, "context");
        f.f((Object)fullDate, "fullDate");
        f.f((Object)author, "author");
        f.f((Object)authorKindWithId, "authorKindWithId");
        f.f((Object)subredditKindWithId, "subredditKindWithId");
        f.f((Object)linkKindWithId, "linkKindWithId");
        f.f((Object)subreddit, "subreddit");
        f.f((Object)subredditNamePrefixed, "subredditNamePrefixed");
        this.id = id;
        this.kindWithId = kindWithId;
        this.parentKindWithId = parentKindWithId;
        this.parentId = parentId;
        this.body = body;
        this.bodyHtml = bodyHtml;
        this.context = context;
        this.totalCommentCount = totalCommentCount;
        this.score = score;
        this.fullDate = fullDate;
        this.authorId = authorId;
        this.authorFlairText = authorFlairText;
        this.authorFlairRichText = authorFlairRichText;
        this.flairCssClass = flairCssClass;
        this.flairPosition = flairPosition;
        this.author = author;
        this.createdUtc = createdUtc;
        this.authorKindWithId = authorKindWithId;
        this.subredditKindWithId = subredditKindWithId;
        this.linkKindWithId = linkKindWithId;
        this.subreddit = subreddit;
        this.subredditNamePrefixed = subredditNamePrefixed;
        this.rtjson = rtjson;
        this.associatedAward = associatedAward;
        this.distinguished = distinguished;
        this.collapsed = collapsed;
        this.isCollapsedBecauseOfCrowdControl = isCollapsedBecauseOfCrowdControl;
        this.collapsedReasonCode = collapsedReasonCode;
        this.unrepliableReason = unrepliableReason;
        this.commentType = commentType;
        this.authorSnoovatarImg = authorSnoovatarImg;
        this.authorIconImg = authorIconImg;
        this.authorIsDefaultIcon = authorIsDefaultIcon;
        this.authorIsNsfwIcon = authorIsNsfwIcon;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component10() {
        return this.fullDate;
    }
    
    public final long component11() {
        return this.authorId;
    }
    
    public final String component12() {
        return this.authorFlairText;
    }
    
    public final List<FlairRichTextItem> component13() {
        return this.authorFlairRichText;
    }
    
    public final String component14() {
        return this.flairCssClass;
    }
    
    public final String component15() {
        return this.flairPosition;
    }
    
    public final String component16() {
        return this.author;
    }
    
    public final long component17() {
        return this.createdUtc;
    }
    
    public final String component18() {
        return this.authorKindWithId;
    }
    
    public final String component19() {
        return this.subredditKindWithId;
    }
    
    public final String component2() {
        return this.kindWithId;
    }
    
    public final String component20() {
        return this.linkKindWithId;
    }
    
    public final String component21() {
        return this.subreddit;
    }
    
    public final String component22() {
        return this.subredditNamePrefixed;
    }
    
    public final RichTextResponse component23() {
        return this.rtjson;
    }
    
    public final Award component24() {
        return this.associatedAward;
    }
    
    public final String component25() {
        return this.distinguished;
    }
    
    public final Boolean component26() {
        return this.collapsed;
    }
    
    public final Boolean component27() {
        return this.isCollapsedBecauseOfCrowdControl;
    }
    
    public final String component28() {
        return this.collapsedReasonCode;
    }
    
    public final String component29() {
        return this.unrepliableReason;
    }
    
    public final String component3() {
        return this.parentKindWithId;
    }
    
    public final String component30() {
        return this.commentType;
    }
    
    public final String component31() {
        return this.authorSnoovatarImg;
    }
    
    public final String component32() {
        return this.authorIconImg;
    }
    
    public final boolean component33() {
        return this.authorIsDefaultIcon;
    }
    
    public final boolean component34() {
        return this.authorIsNsfwIcon;
    }
    
    public final String component4() {
        return this.parentId;
    }
    
    public final String component5() {
        return this.body;
    }
    
    public final String component6() {
        return this.bodyHtml;
    }
    
    public final String component7() {
        return this.context;
    }
    
    public final int component8() {
        return this.totalCommentCount;
    }
    
    public final int component9() {
        return this.score;
    }
    
    public final LiveComment copy(@n(name = "_id36") final String s, @n(name = "name") final String s2, @n(name = "parent_id") final String s3, @n(name = "parent_id36") final String s4, final String s5, @n(name = "body_html") final String s6, final String s7, @n(name = "total_comment_count") final int n, final int n2, @n(name = "full_date") final String s8, @n(name = "author_id") final long n3, @n(name = "author_flair_text") final String s9, @n(name = "author_flair_richtext") final List<FlairRichTextItem> list, @n(name = "flair_css_class") final String s10, @n(name = "flair_position") final String s11, final String s12, @n(name = "created_utc") final long n4, @n(name = "author_fullname") final String s13, @n(name = "subreddit_id") final String s14, @n(name = "link_id") final String s15, final String s16, @n(name = "subreddit_name_prefixed") final String s17, final RichTextResponse richTextResponse, @n(name = "associated_award") final Award award, final String s18, @n(name = "collapsed") final Boolean b, @n(name = "collapsed_because_crowd_control") final Boolean b2, @n(name = "collapsed_reason_code") final String s19, @n(name = "unrepliable_reason") final String s20, @n(name = "comment_type") final String s21, @n(name = "author_snoovatar_img") final String s22, @n(name = "author_icon_img") final String s23, @n(name = "author_is_default_icon") final boolean b3, @n(name = "author_is_nsfw_icon") final boolean b4) {
        f.f((Object)s, "id");
        f.f((Object)s2, "kindWithId");
        f.f((Object)s5, "body");
        f.f((Object)s6, "bodyHtml");
        f.f((Object)s7, "context");
        f.f((Object)s8, "fullDate");
        f.f((Object)s12, "author");
        f.f((Object)s13, "authorKindWithId");
        f.f((Object)s14, "subredditKindWithId");
        f.f((Object)s15, "linkKindWithId");
        f.f((Object)s16, "subreddit");
        f.f((Object)s17, "subredditNamePrefixed");
        return new LiveComment(s, s2, s3, s4, s5, s6, s7, n, n2, s8, n3, s9, list, s10, s11, s12, n4, s13, s14, s15, s16, s17, richTextResponse, award, s18, b, b2, s19, s20, s21, s22, s23, b3, b4);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LiveComment)) {
            return false;
        }
        final LiveComment liveComment = (LiveComment)o;
        return f.a((Object)this.id, (Object)liveComment.id) && f.a((Object)this.kindWithId, (Object)liveComment.kindWithId) && f.a((Object)this.parentKindWithId, (Object)liveComment.parentKindWithId) && f.a((Object)this.parentId, (Object)liveComment.parentId) && f.a((Object)this.body, (Object)liveComment.body) && f.a((Object)this.bodyHtml, (Object)liveComment.bodyHtml) && f.a((Object)this.context, (Object)liveComment.context) && this.totalCommentCount == liveComment.totalCommentCount && this.score == liveComment.score && f.a((Object)this.fullDate, (Object)liveComment.fullDate) && this.authorId == liveComment.authorId && f.a((Object)this.authorFlairText, (Object)liveComment.authorFlairText) && f.a((Object)this.authorFlairRichText, (Object)liveComment.authorFlairRichText) && f.a((Object)this.flairCssClass, (Object)liveComment.flairCssClass) && f.a((Object)this.flairPosition, (Object)liveComment.flairPosition) && f.a((Object)this.author, (Object)liveComment.author) && this.createdUtc == liveComment.createdUtc && f.a((Object)this.authorKindWithId, (Object)liveComment.authorKindWithId) && f.a((Object)this.subredditKindWithId, (Object)liveComment.subredditKindWithId) && f.a((Object)this.linkKindWithId, (Object)liveComment.linkKindWithId) && f.a((Object)this.subreddit, (Object)liveComment.subreddit) && f.a((Object)this.subredditNamePrefixed, (Object)liveComment.subredditNamePrefixed) && f.a((Object)this.rtjson, (Object)liveComment.rtjson) && f.a((Object)this.associatedAward, (Object)liveComment.associatedAward) && f.a((Object)this.distinguished, (Object)liveComment.distinguished) && f.a((Object)this.collapsed, (Object)liveComment.collapsed) && f.a((Object)this.isCollapsedBecauseOfCrowdControl, (Object)liveComment.isCollapsedBecauseOfCrowdControl) && f.a((Object)this.collapsedReasonCode, (Object)liveComment.collapsedReasonCode) && f.a((Object)this.unrepliableReason, (Object)liveComment.unrepliableReason) && f.a((Object)this.commentType, (Object)liveComment.commentType) && f.a((Object)this.authorSnoovatarImg, (Object)liveComment.authorSnoovatarImg) && f.a((Object)this.authorIconImg, (Object)liveComment.authorIconImg) && this.authorIsDefaultIcon == liveComment.authorIsDefaultIcon && this.authorIsNsfwIcon == liveComment.authorIsNsfwIcon;
    }
    
    public final Award getAssociatedAward() {
        return this.associatedAward;
    }
    
    public final String getAuthor() {
        return this.author;
    }
    
    public final List<FlairRichTextItem> getAuthorFlairRichText() {
        return this.authorFlairRichText;
    }
    
    public final String getAuthorFlairText() {
        return this.authorFlairText;
    }
    
    public final String getAuthorIconImg() {
        return this.authorIconImg;
    }
    
    public final long getAuthorId() {
        return this.authorId;
    }
    
    public final boolean getAuthorIsDefaultIcon() {
        return this.authorIsDefaultIcon;
    }
    
    public final boolean getAuthorIsNsfwIcon() {
        return this.authorIsNsfwIcon;
    }
    
    public final String getAuthorKindWithId() {
        return this.authorKindWithId;
    }
    
    public final String getAuthorSnoovatarImg() {
        return this.authorSnoovatarImg;
    }
    
    public final String getBody() {
        return this.body;
    }
    
    public final String getBodyHtml() {
        return this.bodyHtml;
    }
    
    public final Boolean getCollapsed() {
        return this.collapsed;
    }
    
    public final String getCollapsedReasonCode() {
        return this.collapsedReasonCode;
    }
    
    public final String getCommentType() {
        return this.commentType;
    }
    
    public final String getContext() {
        return this.context;
    }
    
    public final long getCreatedUtc() {
        return this.createdUtc;
    }
    
    public final String getDistinguished() {
        return this.distinguished;
    }
    
    public final String getFlairCssClass() {
        return this.flairCssClass;
    }
    
    public final String getFlairPosition() {
        return this.flairPosition;
    }
    
    public final String getFullDate() {
        return this.fullDate;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getKindWithId() {
        return this.kindWithId;
    }
    
    public final String getLinkKindWithId() {
        return this.linkKindWithId;
    }
    
    public final String getParentId() {
        return this.parentId;
    }
    
    public final String getParentKindWithId() {
        return this.parentKindWithId;
    }
    
    public final RichTextResponse getRtjson() {
        return this.rtjson;
    }
    
    public final int getScore() {
        return this.score;
    }
    
    public final String getSubreddit() {
        return this.subreddit;
    }
    
    public final String getSubredditKindWithId() {
        return this.subredditKindWithId;
    }
    
    public final String getSubredditNamePrefixed() {
        return this.subredditNamePrefixed;
    }
    
    public final int getTotalCommentCount() {
        return this.totalCommentCount;
    }
    
    public final String getUnrepliableReason() {
        return this.unrepliableReason;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.kindWithId, this.id.hashCode() * 31, 31);
        final String parentKindWithId = this.parentKindWithId;
        int hashCode = 0;
        int hashCode2;
        if (parentKindWithId == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = parentKindWithId.hashCode();
        }
        final String parentId = this.parentId;
        int hashCode3;
        if (parentId == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = parentId.hashCode();
        }
        final int c = b.c(this.authorId, a.f(this.fullDate, s0.e(this.score, s0.e(this.totalCommentCount, a.f(this.context, a.f(this.bodyHtml, a.f(this.body, ((f + hashCode2) * 31 + hashCode3) * 31, 31), 31), 31), 31), 31), 31), 31);
        final String authorFlairText = this.authorFlairText;
        int hashCode4;
        if (authorFlairText == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = authorFlairText.hashCode();
        }
        final List<FlairRichTextItem> authorFlairRichText = this.authorFlairRichText;
        int hashCode5;
        if (authorFlairRichText == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = authorFlairRichText.hashCode();
        }
        final String flairCssClass = this.flairCssClass;
        int hashCode6;
        if (flairCssClass == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = flairCssClass.hashCode();
        }
        final String flairPosition = this.flairPosition;
        int hashCode7;
        if (flairPosition == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = flairPosition.hashCode();
        }
        final int f2 = a.f(this.subredditNamePrefixed, a.f(this.subreddit, a.f(this.linkKindWithId, a.f(this.subredditKindWithId, a.f(this.authorKindWithId, b.c(this.createdUtc, a.f(this.author, ((((c + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31, 31), 31), 31), 31), 31), 31), 31);
        final RichTextResponse rtjson = this.rtjson;
        int hashCode8;
        if (rtjson == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = rtjson.hashCode();
        }
        final Award associatedAward = this.associatedAward;
        int hashCode9;
        if (associatedAward == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = associatedAward.hashCode();
        }
        final String distinguished = this.distinguished;
        int hashCode10;
        if (distinguished == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = distinguished.hashCode();
        }
        final Boolean collapsed = this.collapsed;
        int hashCode11;
        if (collapsed == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = collapsed.hashCode();
        }
        final Boolean isCollapsedBecauseOfCrowdControl = this.isCollapsedBecauseOfCrowdControl;
        int hashCode12;
        if (isCollapsedBecauseOfCrowdControl == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = isCollapsedBecauseOfCrowdControl.hashCode();
        }
        final String collapsedReasonCode = this.collapsedReasonCode;
        int hashCode13;
        if (collapsedReasonCode == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = collapsedReasonCode.hashCode();
        }
        final String unrepliableReason = this.unrepliableReason;
        int hashCode14;
        if (unrepliableReason == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = unrepliableReason.hashCode();
        }
        final String commentType = this.commentType;
        int hashCode15;
        if (commentType == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = commentType.hashCode();
        }
        final String authorSnoovatarImg = this.authorSnoovatarImg;
        int hashCode16;
        if (authorSnoovatarImg == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = authorSnoovatarImg.hashCode();
        }
        final String authorIconImg = this.authorIconImg;
        if (authorIconImg != null) {
            hashCode = authorIconImg.hashCode();
        }
        final int authorIsDefaultIcon = this.authorIsDefaultIcon ? 1 : 0;
        int n = 1;
        int n2 = authorIsDefaultIcon;
        if (authorIsDefaultIcon != 0) {
            n2 = 1;
        }
        final int authorIsNsfwIcon = this.authorIsNsfwIcon ? 1 : 0;
        if (authorIsNsfwIcon == 0) {
            n = authorIsNsfwIcon;
        }
        return (((((((((((f2 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode) * 31 + n2) * 31 + n;
    }
    
    public final Boolean isCollapsedBecauseOfCrowdControl() {
        return this.isCollapsedBecauseOfCrowdControl;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("LiveComment(id=");
        k.append(this.id);
        k.append(", kindWithId=");
        k.append(this.kindWithId);
        k.append(", parentKindWithId=");
        k.append(this.parentKindWithId);
        k.append(", parentId=");
        k.append(this.parentId);
        k.append(", body=");
        k.append(this.body);
        k.append(", bodyHtml=");
        k.append(this.bodyHtml);
        k.append(", context=");
        k.append(this.context);
        k.append(", totalCommentCount=");
        k.append(this.totalCommentCount);
        k.append(", score=");
        k.append(this.score);
        k.append(", fullDate=");
        k.append(this.fullDate);
        k.append(", authorId=");
        k.append(this.authorId);
        k.append(", authorFlairText=");
        k.append(this.authorFlairText);
        k.append(", authorFlairRichText=");
        k.append(this.authorFlairRichText);
        k.append(", flairCssClass=");
        k.append(this.flairCssClass);
        k.append(", flairPosition=");
        k.append(this.flairPosition);
        k.append(", author=");
        k.append(this.author);
        k.append(", createdUtc=");
        k.append(this.createdUtc);
        k.append(", authorKindWithId=");
        k.append(this.authorKindWithId);
        k.append(", subredditKindWithId=");
        k.append(this.subredditKindWithId);
        k.append(", linkKindWithId=");
        k.append(this.linkKindWithId);
        k.append(", subreddit=");
        k.append(this.subreddit);
        k.append(", subredditNamePrefixed=");
        k.append(this.subredditNamePrefixed);
        k.append(", rtjson=");
        k.append(this.rtjson);
        k.append(", associatedAward=");
        k.append(this.associatedAward);
        k.append(", distinguished=");
        k.append(this.distinguished);
        k.append(", collapsed=");
        k.append(this.collapsed);
        k.append(", isCollapsedBecauseOfCrowdControl=");
        k.append(this.isCollapsedBecauseOfCrowdControl);
        k.append(", collapsedReasonCode=");
        k.append(this.collapsedReasonCode);
        k.append(", unrepliableReason=");
        k.append(this.unrepliableReason);
        k.append(", commentType=");
        k.append(this.commentType);
        k.append(", authorSnoovatarImg=");
        k.append(this.authorSnoovatarImg);
        k.append(", authorIconImg=");
        k.append(this.authorIconImg);
        k.append(", authorIsDefaultIcon=");
        k.append(this.authorIsDefaultIcon);
        k.append(", authorIsNsfwIcon=");
        return s0.o(k, this.authorIsNsfwIcon, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.kindWithId);
        parcel.writeString(this.parentKindWithId);
        parcel.writeString(this.parentId);
        parcel.writeString(this.body);
        parcel.writeString(this.bodyHtml);
        parcel.writeString(this.context);
        parcel.writeInt(this.totalCommentCount);
        parcel.writeInt(this.score);
        parcel.writeString(this.fullDate);
        parcel.writeLong(this.authorId);
        parcel.writeString(this.authorFlairText);
        final List<FlairRichTextItem> authorFlairRichText = this.authorFlairRichText;
        if (authorFlairRichText == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator o = b.o(parcel, 1, (List)authorFlairRichText);
            while (o.hasNext()) {
                ((FlairRichTextItem)o.next()).writeToParcel(parcel, n);
            }
        }
        parcel.writeString(this.flairCssClass);
        parcel.writeString(this.flairPosition);
        parcel.writeString(this.author);
        parcel.writeLong(this.createdUtc);
        parcel.writeString(this.authorKindWithId);
        parcel.writeString(this.subredditKindWithId);
        parcel.writeString(this.linkKindWithId);
        parcel.writeString(this.subreddit);
        parcel.writeString(this.subredditNamePrefixed);
        final RichTextResponse rtjson = this.rtjson;
        if (rtjson == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            rtjson.writeToParcel(parcel, n);
        }
        parcel.writeParcelable((Parcelable)this.associatedAward, n);
        parcel.writeString(this.distinguished);
        final Boolean collapsed = this.collapsed;
        if (collapsed == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, collapsed);
        }
        final Boolean isCollapsedBecauseOfCrowdControl = this.isCollapsedBecauseOfCrowdControl;
        if (isCollapsedBecauseOfCrowdControl == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, isCollapsedBecauseOfCrowdControl);
        }
        parcel.writeString(this.collapsedReasonCode);
        parcel.writeString(this.unrepliableReason);
        parcel.writeString(this.commentType);
        parcel.writeString(this.authorSnoovatarImg);
        parcel.writeString(this.authorIconImg);
        parcel.writeInt((int)(this.authorIsDefaultIcon ? 1 : 0));
        parcel.writeInt((int)(this.authorIsNsfwIcon ? 1 : 0));
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<LiveComment>
    {
        public final LiveComment createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            final String string5 = parcel.readString();
            final String string6 = parcel.readString();
            final String string7 = parcel.readString();
            final int int1 = parcel.readInt();
            final int int2 = parcel.readInt();
            final String string8 = parcel.readString();
            final long long1 = parcel.readLong();
            final String string9 = parcel.readString();
            ArrayList list;
            if (parcel.readInt() == 0) {
                list = null;
            }
            else {
                final int int3 = parcel.readInt();
                list = new ArrayList(int3);
                for (int i = 0; i != int3; i = a.c((Parcelable$Creator)FlairRichTextItem.CREATOR, parcel, list, i, 1)) {}
            }
            final String string10 = parcel.readString();
            final String string11 = parcel.readString();
            final String string12 = parcel.readString();
            final long long2 = parcel.readLong();
            final String string13 = parcel.readString();
            final String string14 = parcel.readString();
            final String string15 = parcel.readString();
            final String string16 = parcel.readString();
            final String string17 = parcel.readString();
            Object fromParcel;
            if (parcel.readInt() == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = RichTextResponse.CREATOR.createFromParcel(parcel);
            }
            final RichTextResponse richTextResponse = (RichTextResponse)fromParcel;
            final Award award = (Award)parcel.readParcelable(LiveComment.class.getClassLoader());
            final String string18 = parcel.readString();
            Boolean value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = (parcel.readInt() != 0);
            }
            Boolean value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = (parcel.readInt() != 0);
            }
            return new LiveComment(string, string2, string3, string4, string5, string6, string7, int1, int2, string8, long1, string9, list, string10, string11, string12, long2, string13, string14, string15, string16, string17, richTextResponse, award, string18, value, value2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }
        
        public final LiveComment[] newArray(final int n) {
            return new LiveComment[n];
        }
    }
}
