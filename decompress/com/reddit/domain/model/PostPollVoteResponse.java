// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import p1.h;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ng2.e;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\n\u0012\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\n¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0013\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\nH\u00c6\u0003J\u0013\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\nH\u00c6\u0003JZ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\n2\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\nH\u00c6\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0015H\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010\u0007R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'R!\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*R!\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b+\u0010*¨\u0006." }, d2 = { "Lcom/reddit/domain/model/PostPollVoteResponse;", "Landroid/os/Parcelable;", "", "getErrorMessage", "component1", "", "component2", "()Ljava/lang/Boolean;", "Lcom/reddit/domain/model/PostPoll;", "component3", "", "component4", "component5", "postId", "ok", "poll", "errors", "fieldErrors", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/reddit/domain/model/PostPoll;Ljava/util/List;Ljava/util/List;)Lcom/reddit/domain/model/PostPollVoteResponse;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/lang/String;", "getPostId", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getOk", "Lcom/reddit/domain/model/PostPoll;", "getPoll", "()Lcom/reddit/domain/model/PostPoll;", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "getFieldErrors", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/reddit/domain/model/PostPoll;Ljava/util/List;Ljava/util/List;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostPollVoteResponse implements Parcelable
{
    public static final Parcelable$Creator<PostPollVoteResponse> CREATOR;
    private final List<String> errors;
    private final List<String> fieldErrors;
    private final Boolean ok;
    private final PostPoll poll;
    private final String postId;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public PostPollVoteResponse(final String postId, final Boolean ok, final PostPoll poll, final List<String> errors, final List<String> fieldErrors) {
        e.f((Object)postId, "postId");
        this.postId = postId;
        this.ok = ok;
        this.poll = poll;
        this.errors = errors;
        this.fieldErrors = fieldErrors;
    }
    
    public static PostPollVoteResponse copy$default(final PostPollVoteResponse postPollVoteResponse, String postId, Boolean ok, PostPoll poll, List errors, List fieldErrors, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            postId = postPollVoteResponse.postId;
        }
        if ((n & 0x2) != 0x0) {
            ok = postPollVoteResponse.ok;
        }
        if ((n & 0x4) != 0x0) {
            poll = postPollVoteResponse.poll;
        }
        if ((n & 0x8) != 0x0) {
            errors = postPollVoteResponse.errors;
        }
        if ((n & 0x10) != 0x0) {
            fieldErrors = postPollVoteResponse.fieldErrors;
        }
        return postPollVoteResponse.copy(postId, ok, poll, errors, fieldErrors);
    }
    
    public final String component1() {
        return this.postId;
    }
    
    public final Boolean component2() {
        return this.ok;
    }
    
    public final PostPoll component3() {
        return this.poll;
    }
    
    public final List<String> component4() {
        return this.errors;
    }
    
    public final List<String> component5() {
        return this.fieldErrors;
    }
    
    public final PostPollVoteResponse copy(final String s, final Boolean b, final PostPoll postPoll, final List<String> list, final List<String> list2) {
        e.f((Object)s, "postId");
        return new PostPollVoteResponse(s, b, postPoll, list, list2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostPollVoteResponse)) {
            return false;
        }
        final PostPollVoteResponse postPollVoteResponse = (PostPollVoteResponse)o;
        return e.a((Object)this.postId, (Object)postPollVoteResponse.postId) && e.a((Object)this.ok, (Object)postPollVoteResponse.ok) && e.a((Object)this.poll, (Object)postPollVoteResponse.poll) && e.a((Object)this.errors, (Object)postPollVoteResponse.errors) && e.a((Object)this.fieldErrors, (Object)postPollVoteResponse.fieldErrors);
    }
    
    public final String getErrorMessage() {
        final List<String> errors = this.errors;
        if (errors != null) {
            final String s = (String)CollectionsKt___CollectionsKt.U4((List)errors);
            if (s != null) {
                return s;
            }
        }
        return null;
    }
    
    public final List<String> getErrors() {
        return this.errors;
    }
    
    public final List<String> getFieldErrors() {
        return this.fieldErrors;
    }
    
    public final Boolean getOk() {
        return this.ok;
    }
    
    public final PostPoll getPoll() {
        return this.poll;
    }
    
    public final String getPostId() {
        return this.postId;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.postId.hashCode();
        final Boolean ok = this.ok;
        int hashCode2 = 0;
        int hashCode3;
        if (ok == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = ok.hashCode();
        }
        final PostPoll poll = this.poll;
        int hashCode4;
        if (poll == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = poll.hashCode();
        }
        final List<String> errors = this.errors;
        int hashCode5;
        if (errors == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = errors.hashCode();
        }
        final List<String> fieldErrors = this.fieldErrors;
        if (fieldErrors != null) {
            hashCode2 = fieldErrors.hashCode();
        }
        return (((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("PostPollVoteResponse(postId=");
        t.append(this.postId);
        t.append(", ok=");
        t.append(this.ok);
        t.append(", poll=");
        t.append(this.poll);
        t.append(", errors=");
        t.append(this.errors);
        t.append(", fieldErrors=");
        return h.d(t, (List)this.fieldErrors, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.postId);
        final Boolean ok = this.ok;
        if (ok == null) {
            parcel.writeInt(0);
        }
        else {
            aq2.a.w(parcel, 1, ok);
        }
        final PostPoll poll = this.poll;
        if (poll == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            poll.writeToParcel(parcel, n);
        }
        parcel.writeStringList((List)this.errors);
        parcel.writeStringList((List)this.fieldErrors);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<PostPollVoteResponse>
    {
        public final PostPollVoteResponse createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final int int1 = parcel.readInt();
            Object fromParcel = null;
            Boolean value;
            if (int1 == 0) {
                value = null;
            }
            else {
                value = (parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                fromParcel = PostPoll.CREATOR.createFromParcel(parcel);
            }
            return new PostPollVoteResponse(string, value, (PostPoll)fromParcel, parcel.createStringArrayList(), parcel.createStringArrayList());
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final PostPollVoteResponse[] newArray(final int n) {
            return new PostPollVoteResponse[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}
