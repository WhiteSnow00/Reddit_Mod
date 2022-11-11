// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import ag0.a;
import ah2.f;
import ak0.m;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b/\u00100J\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003J?\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011H\u00d6\u0001R\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R \u0010&\u001a\u00020\u00118\u0016X\u0096D¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\"\u0010,\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b,\u0010\u001d\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u001f¨\u00061" }, d2 = { "Lcom/reddit/domain/model/ChatPostSystemMessage;", "Lcom/reddit/domain/model/IComment;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "Lcom/reddit/domain/model/RichTextResponse;", "component5", "id", "kindWithId", "bodyHtml", "subredditKindWithId", "rtjson", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getKindWithId", "getBodyHtml", "getSubredditKindWithId", "Lcom/reddit/domain/model/RichTextResponse;", "getRtjson", "()Lcom/reddit/domain/model/RichTextResponse;", "depth", "I", "getDepth", "()I", "getDepth$annotations", "()V", "parentKindWithId", "getParentKindWithId", "getParentKindWithId$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/RichTextResponse;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class ChatPostSystemMessage extends IComment
{
    public static final Parcelable$Creator<ChatPostSystemMessage> CREATOR;
    private final String bodyHtml;
    private final int depth;
    private final String id;
    private final String kindWithId;
    private final String parentKindWithId;
    private final RichTextResponse rtjson;
    private final String subredditKindWithId;
    
    static {
        CREATOR = (Parcelable$Creator)new ChatPostSystemMessage$Creator();
    }
    
    public ChatPostSystemMessage() {
        this(null, null, null, null, null, 31, null);
    }
    
    public ChatPostSystemMessage(final String id, @n(name = "name") final String kindWithId, @n(name = "body_html") final String bodyHtml, @n(name = "subreddit_id") final String subredditKindWithId, final RichTextResponse rtjson) {
        m.y(id, "id", kindWithId, "kindWithId", subredditKindWithId, "subredditKindWithId");
        super(null);
        this.id = id;
        this.kindWithId = kindWithId;
        this.bodyHtml = bodyHtml;
        this.subredditKindWithId = subredditKindWithId;
        this.rtjson = rtjson;
    }
    
    public final String component1() {
        return this.getId();
    }
    
    public final String component2() {
        return this.getKindWithId();
    }
    
    public final String component3() {
        return this.bodyHtml;
    }
    
    public final String component4() {
        return this.subredditKindWithId;
    }
    
    public final RichTextResponse component5() {
        return this.rtjson;
    }
    
    public final ChatPostSystemMessage copy(final String s, @n(name = "name") final String s2, @n(name = "body_html") final String s3, @n(name = "subreddit_id") final String s4, final RichTextResponse richTextResponse) {
        f.f((Object)s, "id");
        f.f((Object)s2, "kindWithId");
        f.f((Object)s4, "subredditKindWithId");
        return new ChatPostSystemMessage(s, s2, s3, s4, richTextResponse);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatPostSystemMessage)) {
            return false;
        }
        final ChatPostSystemMessage chatPostSystemMessage = (ChatPostSystemMessage)o;
        return f.a((Object)this.getId(), (Object)chatPostSystemMessage.getId()) && f.a((Object)this.getKindWithId(), (Object)chatPostSystemMessage.getKindWithId()) && f.a((Object)this.bodyHtml, (Object)chatPostSystemMessage.bodyHtml) && f.a((Object)this.subredditKindWithId, (Object)chatPostSystemMessage.subredditKindWithId) && f.a((Object)this.rtjson, (Object)chatPostSystemMessage.rtjson);
    }
    
    public final String getBodyHtml() {
        return this.bodyHtml;
    }
    
    @Override
    public int getDepth() {
        return this.depth;
    }
    
    @Override
    public String getId() {
        return this.id;
    }
    
    @Override
    public String getKindWithId() {
        return this.kindWithId;
    }
    
    @Override
    public String getParentKindWithId() {
        return this.parentKindWithId;
    }
    
    public final RichTextResponse getRtjson() {
        return this.rtjson;
    }
    
    public final String getSubredditKindWithId() {
        return this.subredditKindWithId;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.getId().hashCode();
        final int hashCode2 = this.getKindWithId().hashCode();
        final String bodyHtml = this.bodyHtml;
        final int n = 0;
        int hashCode3;
        if (bodyHtml == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = bodyHtml.hashCode();
        }
        final int f = a.f(this.subredditKindWithId, ((hashCode2 + hashCode * 31) * 31 + hashCode3) * 31, 31);
        final RichTextResponse rtjson = this.rtjson;
        int hashCode4;
        if (rtjson == null) {
            hashCode4 = n;
        }
        else {
            hashCode4 = rtjson.hashCode();
        }
        return f + hashCode4;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ChatPostSystemMessage(id=");
        k.append(this.getId());
        k.append(", kindWithId=");
        k.append(this.getKindWithId());
        k.append(", bodyHtml=");
        k.append(this.bodyHtml);
        k.append(", subredditKindWithId=");
        k.append(this.subredditKindWithId);
        k.append(", rtjson=");
        k.append(this.rtjson);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.kindWithId);
        parcel.writeString(this.bodyHtml);
        parcel.writeString(this.subredditKindWithId);
        final RichTextResponse rtjson = this.rtjson;
        if (rtjson == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            rtjson.writeToParcel(parcel, n);
        }
    }
}
