// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.scheduledposts;

import java.util.LinkedHashMap;
import java.util.Iterator;
import android.os.Parcel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import com.reddit.domain.model.MediaMetaData;
import java.util.Map;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b6\u00107J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0092\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0002H\u00d6\u0001J\t\u0010 \u001a\u00020\u001fH\u00d6\u0001J\u0013\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010$\u001a\u00020\u001fH\u00d6\u0001J\u0019\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001fH\u00d6\u0001R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b-\u0010,R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\b.\u0010,R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b0\u00101R%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u00105\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u00105\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u00105\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u00105\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u00105\u001a\u0004\b\u001b\u0010\r¨\u00068" }, d2 = { "Lcom/reddit/domain/modtools/scheduledposts/UpdateScheduledPostData;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$ContentType;", "component4", "", "Lcom/reddit/domain/model/MediaMetaData;", "component5", "", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "component10", "id", "title", "body", "bodyContentType", "mediaMetaData", "isSticky", "isDistinguishedAsMod", "isOriginalContent", "isSpoiler", "isNSFW", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$ContentType;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/reddit/domain/modtools/scheduledposts/UpdateScheduledPostData;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "getBody", "Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$ContentType;", "getBodyContentType", "()Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$ContentType;", "Ljava/util/Map;", "getMediaMetaData", "()Ljava/util/Map;", "Ljava/lang/Boolean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$ContentType;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class UpdateScheduledPostData implements Parcelable
{
    public static final Parcelable$Creator<UpdateScheduledPostData> CREATOR;
    private final String body;
    private final SubredditScheduledPost.ContentType bodyContentType;
    private final String id;
    private final Boolean isDistinguishedAsMod;
    private final Boolean isNSFW;
    private final Boolean isOriginalContent;
    private final Boolean isSpoiler;
    private final Boolean isSticky;
    private final Map<String, MediaMetaData> mediaMetaData;
    private final String title;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public UpdateScheduledPostData(final String id, final String title, final String body, final SubredditScheduledPost.ContentType bodyContentType, final Map<String, MediaMetaData> mediaMetaData, final Boolean isSticky, final Boolean isDistinguishedAsMod, final Boolean isOriginalContent, final Boolean isSpoiler, final Boolean isNSFW) {
        e.f((Object)id, "id");
        this.id = id;
        this.title = title;
        this.body = body;
        this.bodyContentType = bodyContentType;
        this.mediaMetaData = mediaMetaData;
        this.isSticky = isSticky;
        this.isDistinguishedAsMod = isDistinguishedAsMod;
        this.isOriginalContent = isOriginalContent;
        this.isSpoiler = isSpoiler;
        this.isNSFW = isNSFW;
    }
    
    public UpdateScheduledPostData(final String s, String s2, String s3, SubredditScheduledPost.ContentType contentType, Map map, Boolean b, Boolean b2, Boolean b3, Boolean b4, Boolean b5, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        final Boolean b6 = null;
        if ((n & 0x2) != 0x0) {
            s2 = null;
        }
        if ((n & 0x4) != 0x0) {
            s3 = null;
        }
        if ((n & 0x8) != 0x0) {
            contentType = null;
        }
        if ((n & 0x10) != 0x0) {
            map = null;
        }
        if ((n & 0x20) != 0x0) {
            b = null;
        }
        if ((n & 0x40) != 0x0) {
            b2 = null;
        }
        if ((n & 0x80) != 0x0) {
            b3 = null;
        }
        if ((n & 0x100) != 0x0) {
            b4 = null;
        }
        if ((n & 0x200) != 0x0) {
            b5 = b6;
        }
        this(s, s2, s3, contentType, map, b, b2, b3, b4, b5);
    }
    
    public static UpdateScheduledPostData copy$default(final UpdateScheduledPostData updateScheduledPostData, String id, String title, String body, SubredditScheduledPost.ContentType bodyContentType, Map mediaMetaData, Boolean isSticky, Boolean isDistinguishedAsMod, Boolean isOriginalContent, Boolean isSpoiler, Boolean isNSFW, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            id = updateScheduledPostData.id;
        }
        if ((n & 0x2) != 0x0) {
            title = updateScheduledPostData.title;
        }
        if ((n & 0x4) != 0x0) {
            body = updateScheduledPostData.body;
        }
        if ((n & 0x8) != 0x0) {
            bodyContentType = updateScheduledPostData.bodyContentType;
        }
        if ((n & 0x10) != 0x0) {
            mediaMetaData = updateScheduledPostData.mediaMetaData;
        }
        if ((n & 0x20) != 0x0) {
            isSticky = updateScheduledPostData.isSticky;
        }
        if ((n & 0x40) != 0x0) {
            isDistinguishedAsMod = updateScheduledPostData.isDistinguishedAsMod;
        }
        if ((n & 0x80) != 0x0) {
            isOriginalContent = updateScheduledPostData.isOriginalContent;
        }
        if ((n & 0x100) != 0x0) {
            isSpoiler = updateScheduledPostData.isSpoiler;
        }
        if ((n & 0x200) != 0x0) {
            isNSFW = updateScheduledPostData.isNSFW;
        }
        return updateScheduledPostData.copy(id, title, body, bodyContentType, mediaMetaData, isSticky, isDistinguishedAsMod, isOriginalContent, isSpoiler, isNSFW);
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final Boolean component10() {
        return this.isNSFW;
    }
    
    public final String component2() {
        return this.title;
    }
    
    public final String component3() {
        return this.body;
    }
    
    public final SubredditScheduledPost.ContentType component4() {
        return this.bodyContentType;
    }
    
    public final Map<String, MediaMetaData> component5() {
        return this.mediaMetaData;
    }
    
    public final Boolean component6() {
        return this.isSticky;
    }
    
    public final Boolean component7() {
        return this.isDistinguishedAsMod;
    }
    
    public final Boolean component8() {
        return this.isOriginalContent;
    }
    
    public final Boolean component9() {
        return this.isSpoiler;
    }
    
    public final UpdateScheduledPostData copy(final String s, final String s2, final String s3, final SubredditScheduledPost.ContentType contentType, final Map<String, MediaMetaData> map, final Boolean b, final Boolean b2, final Boolean b3, final Boolean b4, final Boolean b5) {
        e.f((Object)s, "id");
        return new UpdateScheduledPostData(s, s2, s3, contentType, map, b, b2, b3, b4, b5);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateScheduledPostData)) {
            return false;
        }
        final UpdateScheduledPostData updateScheduledPostData = (UpdateScheduledPostData)o;
        return e.a((Object)this.id, (Object)updateScheduledPostData.id) && e.a((Object)this.title, (Object)updateScheduledPostData.title) && e.a((Object)this.body, (Object)updateScheduledPostData.body) && this.bodyContentType == updateScheduledPostData.bodyContentType && e.a((Object)this.mediaMetaData, (Object)updateScheduledPostData.mediaMetaData) && e.a((Object)this.isSticky, (Object)updateScheduledPostData.isSticky) && e.a((Object)this.isDistinguishedAsMod, (Object)updateScheduledPostData.isDistinguishedAsMod) && e.a((Object)this.isOriginalContent, (Object)updateScheduledPostData.isOriginalContent) && e.a((Object)this.isSpoiler, (Object)updateScheduledPostData.isSpoiler) && e.a((Object)this.isNSFW, (Object)updateScheduledPostData.isNSFW);
    }
    
    public final String getBody() {
        return this.body;
    }
    
    public final SubredditScheduledPost.ContentType getBodyContentType() {
        return this.bodyContentType;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final Map<String, MediaMetaData> getMediaMetaData() {
        return this.mediaMetaData;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String title = this.title;
        int hashCode2 = 0;
        int hashCode3;
        if (title == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = title.hashCode();
        }
        final String body = this.body;
        int hashCode4;
        if (body == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = body.hashCode();
        }
        final SubredditScheduledPost.ContentType bodyContentType = this.bodyContentType;
        int hashCode5;
        if (bodyContentType == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = bodyContentType.hashCode();
        }
        final Map<String, MediaMetaData> mediaMetaData = this.mediaMetaData;
        int hashCode6;
        if (mediaMetaData == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = mediaMetaData.hashCode();
        }
        final Boolean isSticky = this.isSticky;
        int hashCode7;
        if (isSticky == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = isSticky.hashCode();
        }
        final Boolean isDistinguishedAsMod = this.isDistinguishedAsMod;
        int hashCode8;
        if (isDistinguishedAsMod == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = isDistinguishedAsMod.hashCode();
        }
        final Boolean isOriginalContent = this.isOriginalContent;
        int hashCode9;
        if (isOriginalContent == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = isOriginalContent.hashCode();
        }
        final Boolean isSpoiler = this.isSpoiler;
        int hashCode10;
        if (isSpoiler == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = isSpoiler.hashCode();
        }
        final Boolean isNSFW = this.isNSFW;
        if (isNSFW != null) {
            hashCode2 = isNSFW.hashCode();
        }
        return ((((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode2;
    }
    
    public final Boolean isDistinguishedAsMod() {
        return this.isDistinguishedAsMod;
    }
    
    public final Boolean isNSFW() {
        return this.isNSFW;
    }
    
    public final Boolean isOriginalContent() {
        return this.isOriginalContent;
    }
    
    public final Boolean isSpoiler() {
        return this.isSpoiler;
    }
    
    public final Boolean isSticky() {
        return this.isSticky;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("UpdateScheduledPostData(id=");
        t.append(this.id);
        t.append(", title=");
        t.append(this.title);
        t.append(", body=");
        t.append(this.body);
        t.append(", bodyContentType=");
        t.append(this.bodyContentType);
        t.append(", mediaMetaData=");
        t.append(this.mediaMetaData);
        t.append(", isSticky=");
        t.append(this.isSticky);
        t.append(", isDistinguishedAsMod=");
        t.append(this.isDistinguishedAsMod);
        t.append(", isOriginalContent=");
        t.append(this.isOriginalContent);
        t.append(", isSpoiler=");
        t.append(this.isSpoiler);
        t.append(", isNSFW=");
        return android.support.v4.media.a.m(t, this.isNSFW, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        final SubredditScheduledPost.ContentType bodyContentType = this.bodyContentType;
        if (bodyContentType == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeString(bodyContentType.name());
        }
        final Map<String, MediaMetaData> mediaMetaData = this.mediaMetaData;
        if (mediaMetaData == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeInt(mediaMetaData.size());
            for (final Map.Entry<String, V> entry : mediaMetaData.entrySet()) {
                parcel.writeString((String)entry.getKey());
                parcel.writeParcelable((Parcelable)entry.getValue(), n);
            }
        }
        final Boolean isSticky = this.isSticky;
        if (isSticky == null) {
            parcel.writeInt(0);
        }
        else {
            aq2.a.w(parcel, 1, isSticky);
        }
        final Boolean isDistinguishedAsMod = this.isDistinguishedAsMod;
        if (isDistinguishedAsMod == null) {
            parcel.writeInt(0);
        }
        else {
            aq2.a.w(parcel, 1, isDistinguishedAsMod);
        }
        final Boolean isOriginalContent = this.isOriginalContent;
        if (isOriginalContent == null) {
            parcel.writeInt(0);
        }
        else {
            aq2.a.w(parcel, 1, isOriginalContent);
        }
        final Boolean isSpoiler = this.isSpoiler;
        if (isSpoiler == null) {
            parcel.writeInt(0);
        }
        else {
            aq2.a.w(parcel, 1, isSpoiler);
        }
        final Boolean isNSFW = this.isNSFW;
        if (isNSFW == null) {
            parcel.writeInt(0);
        }
        else {
            aq2.a.w(parcel, 1, isNSFW);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<UpdateScheduledPostData>
    {
        public final UpdateScheduledPostData createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            Enum<SubredditScheduledPost.ContentType> value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = SubredditScheduledPost.ContentType.valueOf(parcel.readString());
            }
            final int int1 = parcel.readInt();
            final boolean b = false;
            Map<String, MediaMetaData> map;
            if (int1 == 0) {
                map = null;
            }
            else {
                final int int2 = parcel.readInt();
                final LinkedHashMap linkedHashMap = new LinkedHashMap(int2);
                int n = 0;
                while (true) {
                    map = (Map<String, MediaMetaData>)linkedHashMap;
                    if (n == int2) {
                        break;
                    }
                    linkedHashMap.put((Object)parcel.readString(), (Object)parcel.readParcelable(UpdateScheduledPostData.class.getClassLoader()));
                    ++n;
                }
            }
            Boolean value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = (parcel.readInt() != 0);
            }
            Boolean value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = (parcel.readInt() != 0);
            }
            Boolean value4;
            if (parcel.readInt() == 0) {
                value4 = null;
            }
            else {
                value4 = (parcel.readInt() != 0);
            }
            Boolean value5;
            if (parcel.readInt() == 0) {
                value5 = null;
            }
            else {
                value5 = (parcel.readInt() != 0);
            }
            Boolean value6;
            if (parcel.readInt() == 0) {
                value6 = null;
            }
            else {
                boolean b2 = b;
                if (parcel.readInt() != 0) {
                    b2 = true;
                }
                value6 = b2;
            }
            return new UpdateScheduledPostData(string, string2, string3, (SubredditScheduledPost.ContentType)value, map, value2, value3, value4, value5, value6);
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final UpdateScheduledPostData[] newArray(final int n) {
            return new UpdateScheduledPostData[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}
