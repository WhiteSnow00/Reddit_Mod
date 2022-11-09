// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import androidx.viewpager.widget.c;
import android.os.Parcel;
import androidx.appcompat.widget.s0;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import androidx.annotation.Keep;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 v2\u00020\u0001:\u0001vB\u0091\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010.\u001a\u00020\u0004\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00101\u001a\u00020\u0010\u0012\b\u00102\u001a\u0004\u0018\u00010\u0012\u0012\b\u00103\u001a\u0004\u0018\u00010\u0010\u0012\b\u00104\u001a\u0004\u0018\u00010\u0010\u0012\b\u00105\u001a\u0004\u0018\u00010\u0010\u0012\b\u00106\u001a\u0004\u0018\u00010\u0004\u0012\b\u00107\u001a\u0004\u0018\u00010\u0002\u0012\b\u00108\u001a\u0004\u0018\u00010\u0004\u0012\b\u00109\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010=\u001a\u0004\u0018\u00010 \u0012\u0006\u0010>\u001a\u00020\u0012\u0012\u0006\u0010?\u001a\u00020\u0012\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010A\u001a\u00020\u0012¢\u0006\u0004\bt\u0010uJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0010H\u00c6\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003¢\u0006\u0004\b\u001a\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010 H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0012H\u00c6\u0003J\t\u0010#\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010%\u001a\u00020\u0012H\u00c6\u0003J\u00ce\u0002\u0010B\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010.\u001a\u00020\u00042\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00101\u001a\u00020\u00102\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010=\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010>\u001a\u00020\u00122\b\b\u0002\u0010?\u001a\u00020\u00122\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010A\u001a\u00020\u0012H\u00c6\u0001¢\u0006\u0004\bB\u0010CJ\t\u0010D\u001a\u00020\u0004H\u00d6\u0001J\t\u0010E\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010H\u001a\u00020\u00122\b\u0010G\u001a\u0004\u0018\u00010FH\u00d6\u0003J\t\u0010I\u001a\u00020\u0010H\u00d6\u0001J\u0019\u0010N\u001a\u00020M2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010(\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010R\u001a\u0004\bU\u0010TR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010R\u001a\u0004\bV\u0010TR\u0019\u0010*\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010R\u001a\u0004\bW\u0010TR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010R\u001a\u0004\bX\u0010TR\u0019\u0010,\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010R\u001a\u0004\bY\u0010TR\u0019\u0010-\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010R\u001a\u0004\bZ\u0010TR\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010R\u001a\u0004\b[\u0010TR\u0019\u0010/\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010R\u001a\u0004\b\\\u0010TR\u0019\u00100\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010]\u001a\u0004\b^\u0010\u000fR\u0017\u00101\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b1\u0010_\u001a\u0004\b`\u0010aR\u0019\u00102\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b2\u0010b\u001a\u0004\b2\u0010\u0014R\u0019\u00103\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b3\u0010c\u001a\u0004\bd\u0010\u0016R\u0019\u00104\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b4\u0010c\u001a\u0004\be\u0010\u0016R\u0019\u00105\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b5\u0010c\u001a\u0004\bf\u0010\u0016R\u0019\u00106\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u0010R\u001a\u0004\bg\u0010TR\u0019\u00107\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010]\u001a\u0004\bh\u0010\u000fR\u0019\u00108\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b8\u0010R\u001a\u0004\bi\u0010TR\u0019\u00109\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b9\u0010c\u001a\u0004\bj\u0010\u0016R\u0019\u0010:\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b:\u0010c\u001a\u0004\bk\u0010\u0016R\u0019\u0010;\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u0010R\u001a\u0004\bl\u0010TR\u0019\u0010<\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b<\u0010R\u001a\u0004\bm\u0010TR\u0019\u0010=\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b=\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010>\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b>\u0010q\u001a\u0004\b>\u0010rR\u0017\u0010?\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b?\u0010q\u001a\u0004\b?\u0010rR\u0019\u0010@\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b@\u0010R\u001a\u0004\bs\u0010TR\u0017\u0010A\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bA\u0010q\u001a\u0004\bA\u0010r¨\u0006w" }, d2 = { "Lcom/reddit/domain/model/VideoUpload;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Ljava/lang/Long;", "", "component12", "", "component13", "()Ljava/lang/Boolean;", "component14", "()Ljava/lang/Integer;", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "Lcom/reddit/domain/model/DiscussionType;", "component24", "component25", "component26", "component27", "component28", "id", "requestId", "filePath", "title", "bodyText", "subreddit", "uploadUrl", "posterUrl", "thumbnail", "videoKey", "timestamp", "status", "isGif", "attempts", "originalDuration", "duration", "source", "uploadDuration", "uploadError", "videoWidth", "videoHeight", "flairText", "flairId", "discussionType", "isNsfw", "isSpoiler", "parentPostId", "isReactAllowed", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/DiscussionType;ZZLjava/lang/String;Z)Lcom/reddit/domain/model/VideoUpload;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "J", "getId", "()J", "Ljava/lang/String;", "getRequestId", "()Ljava/lang/String;", "getFilePath", "getTitle", "getBodyText", "getSubreddit", "getUploadUrl", "getPosterUrl", "getThumbnail", "getVideoKey", "Ljava/lang/Long;", "getTimestamp", "I", "getStatus", "()I", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getAttempts", "getOriginalDuration", "getDuration", "getSource", "getUploadDuration", "getUploadError", "getVideoWidth", "getVideoHeight", "getFlairText", "getFlairId", "Lcom/reddit/domain/model/DiscussionType;", "getDiscussionType", "()Lcom/reddit/domain/model/DiscussionType;", "Z", "()Z", "getParentPostId", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/DiscussionType;ZZLjava/lang/String;Z)V", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 })
@Keep
public final class VideoUpload implements Parcelable
{
    public static final Parcelable$Creator<VideoUpload> CREATOR;
    public static final Companion Companion;
    public static final long NO_ID = 0L;
    public static final int VIDEO_UPLOAD_NOT_STARTED = 0;
    private final Integer attempts;
    private final String bodyText;
    private final DiscussionType discussionType;
    private final Integer duration;
    private final String filePath;
    private final String flairId;
    private final String flairText;
    private final long id;
    private final Boolean isGif;
    private final boolean isNsfw;
    private final boolean isReactAllowed;
    private final boolean isSpoiler;
    private final Integer originalDuration;
    private final String parentPostId;
    private final String posterUrl;
    private final String requestId;
    private final String source;
    private final int status;
    private final String subreddit;
    private final String thumbnail;
    private final Long timestamp;
    private final String title;
    private final Long uploadDuration;
    private final String uploadError;
    private final String uploadUrl;
    private final Integer videoHeight;
    private final String videoKey;
    private final Integer videoWidth;
    
    static {
        Companion = new Companion(null);
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public VideoUpload(final long id, final String requestId, final String filePath, final String title, final String bodyText, final String subreddit, final String uploadUrl, final String posterUrl, final String thumbnail, final String videoKey, final Long timestamp, final int status, final Boolean isGif, final Integer attempts, final Integer originalDuration, final Integer duration, final String source, final Long uploadDuration, final String uploadError, final Integer videoWidth, final Integer videoHeight, final String flairText, final String flairId, final DiscussionType discussionType, final boolean isNsfw, final boolean isSpoiler, final String parentPostId, final boolean isReactAllowed) {
        a.s(requestId, "requestId", title, "title", subreddit, "subreddit", thumbnail, "thumbnail");
        this.id = id;
        this.requestId = requestId;
        this.filePath = filePath;
        this.title = title;
        this.bodyText = bodyText;
        this.subreddit = subreddit;
        this.uploadUrl = uploadUrl;
        this.posterUrl = posterUrl;
        this.thumbnail = thumbnail;
        this.videoKey = videoKey;
        this.timestamp = timestamp;
        this.status = status;
        this.isGif = isGif;
        this.attempts = attempts;
        this.originalDuration = originalDuration;
        this.duration = duration;
        this.source = source;
        this.uploadDuration = uploadDuration;
        this.uploadError = uploadError;
        this.videoWidth = videoWidth;
        this.videoHeight = videoHeight;
        this.flairText = flairText;
        this.flairId = flairId;
        this.discussionType = discussionType;
        this.isNsfw = isNsfw;
        this.isSpoiler = isSpoiler;
        this.parentPostId = parentPostId;
        this.isReactAllowed = isReactAllowed;
    }
    
    public final long component1() {
        return this.id;
    }
    
    public final String component10() {
        return this.videoKey;
    }
    
    public final Long component11() {
        return this.timestamp;
    }
    
    public final int component12() {
        return this.status;
    }
    
    public final Boolean component13() {
        return this.isGif;
    }
    
    public final Integer component14() {
        return this.attempts;
    }
    
    public final Integer component15() {
        return this.originalDuration;
    }
    
    public final Integer component16() {
        return this.duration;
    }
    
    public final String component17() {
        return this.source;
    }
    
    public final Long component18() {
        return this.uploadDuration;
    }
    
    public final String component19() {
        return this.uploadError;
    }
    
    public final String component2() {
        return this.requestId;
    }
    
    public final Integer component20() {
        return this.videoWidth;
    }
    
    public final Integer component21() {
        return this.videoHeight;
    }
    
    public final String component22() {
        return this.flairText;
    }
    
    public final String component23() {
        return this.flairId;
    }
    
    public final DiscussionType component24() {
        return this.discussionType;
    }
    
    public final boolean component25() {
        return this.isNsfw;
    }
    
    public final boolean component26() {
        return this.isSpoiler;
    }
    
    public final String component27() {
        return this.parentPostId;
    }
    
    public final boolean component28() {
        return this.isReactAllowed;
    }
    
    public final String component3() {
        return this.filePath;
    }
    
    public final String component4() {
        return this.title;
    }
    
    public final String component5() {
        return this.bodyText;
    }
    
    public final String component6() {
        return this.subreddit;
    }
    
    public final String component7() {
        return this.uploadUrl;
    }
    
    public final String component8() {
        return this.posterUrl;
    }
    
    public final String component9() {
        return this.thumbnail;
    }
    
    public final VideoUpload copy(final long n, final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8, final String s9, final Long n2, final int n3, final Boolean b, final Integer n4, final Integer n5, final Integer n6, final String s10, final Long n7, final String s11, final Integer n8, final Integer n9, final String s12, final String s13, final DiscussionType discussionType, final boolean b2, final boolean b3, final String s14, final boolean b4) {
        f.f((Object)s, "requestId");
        f.f((Object)s3, "title");
        f.f((Object)s5, "subreddit");
        f.f((Object)s8, "thumbnail");
        return new VideoUpload(n, s, s2, s3, s4, s5, s6, s7, s8, s9, n2, n3, b, n4, n5, n6, s10, n7, s11, n8, n9, s12, s13, discussionType, b2, b3, s14, b4);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoUpload)) {
            return false;
        }
        final VideoUpload videoUpload = (VideoUpload)o;
        return this.id == videoUpload.id && f.a((Object)this.requestId, (Object)videoUpload.requestId) && f.a((Object)this.filePath, (Object)videoUpload.filePath) && f.a((Object)this.title, (Object)videoUpload.title) && f.a((Object)this.bodyText, (Object)videoUpload.bodyText) && f.a((Object)this.subreddit, (Object)videoUpload.subreddit) && f.a((Object)this.uploadUrl, (Object)videoUpload.uploadUrl) && f.a((Object)this.posterUrl, (Object)videoUpload.posterUrl) && f.a((Object)this.thumbnail, (Object)videoUpload.thumbnail) && f.a((Object)this.videoKey, (Object)videoUpload.videoKey) && f.a((Object)this.timestamp, (Object)videoUpload.timestamp) && this.status == videoUpload.status && f.a((Object)this.isGif, (Object)videoUpload.isGif) && f.a((Object)this.attempts, (Object)videoUpload.attempts) && f.a((Object)this.originalDuration, (Object)videoUpload.originalDuration) && f.a((Object)this.duration, (Object)videoUpload.duration) && f.a((Object)this.source, (Object)videoUpload.source) && f.a((Object)this.uploadDuration, (Object)videoUpload.uploadDuration) && f.a((Object)this.uploadError, (Object)videoUpload.uploadError) && f.a((Object)this.videoWidth, (Object)videoUpload.videoWidth) && f.a((Object)this.videoHeight, (Object)videoUpload.videoHeight) && f.a((Object)this.flairText, (Object)videoUpload.flairText) && f.a((Object)this.flairId, (Object)videoUpload.flairId) && this.discussionType == videoUpload.discussionType && this.isNsfw == videoUpload.isNsfw && this.isSpoiler == videoUpload.isSpoiler && f.a((Object)this.parentPostId, (Object)videoUpload.parentPostId) && this.isReactAllowed == videoUpload.isReactAllowed;
    }
    
    public final Integer getAttempts() {
        return this.attempts;
    }
    
    public final String getBodyText() {
        return this.bodyText;
    }
    
    public final DiscussionType getDiscussionType() {
        return this.discussionType;
    }
    
    public final Integer getDuration() {
        return this.duration;
    }
    
    public final String getFilePath() {
        return this.filePath;
    }
    
    public final String getFlairId() {
        return this.flairId;
    }
    
    public final String getFlairText() {
        return this.flairText;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final Integer getOriginalDuration() {
        return this.originalDuration;
    }
    
    public final String getParentPostId() {
        return this.parentPostId;
    }
    
    public final String getPosterUrl() {
        return this.posterUrl;
    }
    
    public final String getRequestId() {
        return this.requestId;
    }
    
    public final String getSource() {
        return this.source;
    }
    
    public final int getStatus() {
        return this.status;
    }
    
    public final String getSubreddit() {
        return this.subreddit;
    }
    
    public final String getThumbnail() {
        return this.thumbnail;
    }
    
    public final Long getTimestamp() {
        return this.timestamp;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public final Long getUploadDuration() {
        return this.uploadDuration;
    }
    
    public final String getUploadError() {
        return this.uploadError;
    }
    
    public final String getUploadUrl() {
        return this.uploadUrl;
    }
    
    public final Integer getVideoHeight() {
        return this.videoHeight;
    }
    
    public final String getVideoKey() {
        return this.videoKey;
    }
    
    public final Integer getVideoWidth() {
        return this.videoWidth;
    }
    
    @Override
    public int hashCode() {
        final int f = ag0.a.f(this.requestId, Long.hashCode(this.id) * 31, 31);
        final String filePath = this.filePath;
        int hashCode = 0;
        int hashCode2;
        if (filePath == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = filePath.hashCode();
        }
        final int f2 = ag0.a.f(this.title, (f + hashCode2) * 31, 31);
        final String bodyText = this.bodyText;
        int hashCode3;
        if (bodyText == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = bodyText.hashCode();
        }
        final int f3 = ag0.a.f(this.subreddit, (f2 + hashCode3) * 31, 31);
        final String uploadUrl = this.uploadUrl;
        int hashCode4;
        if (uploadUrl == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = uploadUrl.hashCode();
        }
        final String posterUrl = this.posterUrl;
        int hashCode5;
        if (posterUrl == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = posterUrl.hashCode();
        }
        final int f4 = ag0.a.f(this.thumbnail, ((f3 + hashCode4) * 31 + hashCode5) * 31, 31);
        final String videoKey = this.videoKey;
        int hashCode6;
        if (videoKey == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = videoKey.hashCode();
        }
        final Long timestamp = this.timestamp;
        int hashCode7;
        if (timestamp == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = timestamp.hashCode();
        }
        final int e = s0.e(this.status, ((f4 + hashCode6) * 31 + hashCode7) * 31, 31);
        final Boolean isGif = this.isGif;
        int hashCode8;
        if (isGif == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = isGif.hashCode();
        }
        final Integer attempts = this.attempts;
        int hashCode9;
        if (attempts == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = attempts.hashCode();
        }
        final Integer originalDuration = this.originalDuration;
        int hashCode10;
        if (originalDuration == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = originalDuration.hashCode();
        }
        final Integer duration = this.duration;
        int hashCode11;
        if (duration == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = duration.hashCode();
        }
        final String source = this.source;
        int hashCode12;
        if (source == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = source.hashCode();
        }
        final Long uploadDuration = this.uploadDuration;
        int hashCode13;
        if (uploadDuration == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = uploadDuration.hashCode();
        }
        final String uploadError = this.uploadError;
        int hashCode14;
        if (uploadError == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = uploadError.hashCode();
        }
        final Integer videoWidth = this.videoWidth;
        int hashCode15;
        if (videoWidth == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = videoWidth.hashCode();
        }
        final Integer videoHeight = this.videoHeight;
        int hashCode16;
        if (videoHeight == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = videoHeight.hashCode();
        }
        final String flairText = this.flairText;
        int hashCode17;
        if (flairText == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = flairText.hashCode();
        }
        final String flairId = this.flairId;
        int hashCode18;
        if (flairId == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = flairId.hashCode();
        }
        final DiscussionType discussionType = this.discussionType;
        int hashCode19;
        if (discussionType == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = discussionType.hashCode();
        }
        final int isNsfw = this.isNsfw ? 1 : 0;
        int n = 1;
        int n2 = isNsfw;
        if (isNsfw != 0) {
            n2 = 1;
        }
        int isSpoiler;
        if ((isSpoiler = (this.isSpoiler ? 1 : 0)) != 0) {
            isSpoiler = 1;
        }
        final String parentPostId = this.parentPostId;
        if (parentPostId != null) {
            hashCode = parentPostId.hashCode();
        }
        final int isReactAllowed = this.isReactAllowed ? 1 : 0;
        if (isReactAllowed == 0) {
            n = isReactAllowed;
        }
        return (((((((((((((((e + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode19) * 31 + n2) * 31 + isSpoiler) * 31 + hashCode) * 31 + n;
    }
    
    public final Boolean isGif() {
        return this.isGif;
    }
    
    public final boolean isNsfw() {
        return this.isNsfw;
    }
    
    public final boolean isReactAllowed() {
        return this.isReactAllowed;
    }
    
    public final boolean isSpoiler() {
        return this.isSpoiler;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("VideoUpload(id=");
        k.append(this.id);
        k.append(", requestId=");
        k.append(this.requestId);
        k.append(", filePath=");
        k.append(this.filePath);
        k.append(", title=");
        k.append(this.title);
        k.append(", bodyText=");
        k.append(this.bodyText);
        k.append(", subreddit=");
        k.append(this.subreddit);
        k.append(", uploadUrl=");
        k.append(this.uploadUrl);
        k.append(", posterUrl=");
        k.append(this.posterUrl);
        k.append(", thumbnail=");
        k.append(this.thumbnail);
        k.append(", videoKey=");
        k.append(this.videoKey);
        k.append(", timestamp=");
        k.append(this.timestamp);
        k.append(", status=");
        k.append(this.status);
        k.append(", isGif=");
        k.append(this.isGif);
        k.append(", attempts=");
        k.append(this.attempts);
        k.append(", originalDuration=");
        k.append(this.originalDuration);
        k.append(", duration=");
        k.append(this.duration);
        k.append(", source=");
        k.append(this.source);
        k.append(", uploadDuration=");
        k.append(this.uploadDuration);
        k.append(", uploadError=");
        k.append(this.uploadError);
        k.append(", videoWidth=");
        k.append(this.videoWidth);
        k.append(", videoHeight=");
        k.append(this.videoHeight);
        k.append(", flairText=");
        k.append(this.flairText);
        k.append(", flairId=");
        k.append(this.flairId);
        k.append(", discussionType=");
        k.append(this.discussionType);
        k.append(", isNsfw=");
        k.append(this.isNsfw);
        k.append(", isSpoiler=");
        k.append(this.isSpoiler);
        k.append(", parentPostId=");
        k.append(this.parentPostId);
        k.append(", isReactAllowed=");
        return s0.o(k, this.isReactAllowed, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeLong(this.id);
        parcel.writeString(this.requestId);
        parcel.writeString(this.filePath);
        parcel.writeString(this.title);
        parcel.writeString(this.bodyText);
        parcel.writeString(this.subreddit);
        parcel.writeString(this.uploadUrl);
        parcel.writeString(this.posterUrl);
        parcel.writeString(this.thumbnail);
        parcel.writeString(this.videoKey);
        final Long timestamp = this.timestamp;
        if (timestamp == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, timestamp);
        }
        parcel.writeInt(this.status);
        final Boolean isGif = this.isGif;
        if (isGif == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.w(parcel, 1, isGif);
        }
        final Integer attempts = this.attempts;
        if (attempts == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, attempts);
        }
        final Integer originalDuration = this.originalDuration;
        if (originalDuration == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, originalDuration);
        }
        final Integer duration = this.duration;
        if (duration == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, duration);
        }
        parcel.writeString(this.source);
        final Long uploadDuration = this.uploadDuration;
        if (uploadDuration == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, uploadDuration);
        }
        parcel.writeString(this.uploadError);
        final Integer videoWidth = this.videoWidth;
        if (videoWidth == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, videoWidth);
        }
        final Integer videoHeight = this.videoHeight;
        if (videoHeight == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, videoHeight);
        }
        parcel.writeString(this.flairText);
        parcel.writeString(this.flairId);
        final DiscussionType discussionType = this.discussionType;
        if (discussionType == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeString(discussionType.name());
        }
        parcel.writeInt((int)(this.isNsfw ? 1 : 0));
        parcel.writeInt((int)(this.isSpoiler ? 1 : 0));
        parcel.writeString(this.parentPostId);
        parcel.writeInt((int)(this.isReactAllowed ? 1 : 0));
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/VideoUpload$Companion;", "", "()V", "NO_ID", "", "VIDEO_UPLOAD_NOT_STARTED", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<VideoUpload>
    {
        public final VideoUpload createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final long long1 = parcel.readLong();
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            final String string5 = parcel.readString();
            final String string6 = parcel.readString();
            final String string7 = parcel.readString();
            final String string8 = parcel.readString();
            final String string9 = parcel.readString();
            final int int1 = parcel.readInt();
            DiscussionType value = null;
            Long value2;
            if (int1 == 0) {
                value2 = null;
            }
            else {
                value2 = parcel.readLong();
            }
            final int int2 = parcel.readInt();
            Boolean value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = (parcel.readInt() != 0);
            }
            Integer value4;
            if (parcel.readInt() == 0) {
                value4 = null;
            }
            else {
                value4 = parcel.readInt();
            }
            Integer value5;
            if (parcel.readInt() == 0) {
                value5 = null;
            }
            else {
                value5 = parcel.readInt();
            }
            Integer value6;
            if (parcel.readInt() == 0) {
                value6 = null;
            }
            else {
                value6 = parcel.readInt();
            }
            final String string10 = parcel.readString();
            Long value7;
            if (parcel.readInt() == 0) {
                value7 = null;
            }
            else {
                value7 = parcel.readLong();
            }
            final String string11 = parcel.readString();
            Integer value8;
            if (parcel.readInt() == 0) {
                value8 = null;
            }
            else {
                value8 = parcel.readInt();
            }
            Integer value9;
            if (parcel.readInt() == 0) {
                value9 = null;
            }
            else {
                value9 = parcel.readInt();
            }
            final String string12 = parcel.readString();
            final String string13 = parcel.readString();
            if (parcel.readInt() != 0) {
                value = DiscussionType.valueOf(parcel.readString());
            }
            return new VideoUpload(long1, string, string2, string3, string4, string5, string6, string7, string8, string9, value2, int2, value3, value4, value5, value6, string10, value7, string11, value8, value9, string12, string13, value, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }
        
        public final VideoUpload[] newArray(final int n) {
            return new VideoUpload[n];
        }
    }
}
