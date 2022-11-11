// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.mod.SchedulePostModel;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0012\u001a\u00020\rH\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\rH\u00d6\u0001R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0007\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%" }, d2 = { "Lcom/reddit/domain/model/ExtraTags;", "Landroid/os/Parcelable;", "", "component1", "component2", "Lcom/reddit/domain/model/mod/SchedulePostModel;", "component3", "isGifPost", "allowVideoThread", "schedulePostModel", "copy", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Z", "()Z", "setGifPost", "(Z)V", "getAllowVideoThread", "setAllowVideoThread", "Lcom/reddit/domain/model/mod/SchedulePostModel;", "getSchedulePostModel", "()Lcom/reddit/domain/model/mod/SchedulePostModel;", "setSchedulePostModel", "(Lcom/reddit/domain/model/mod/SchedulePostModel;)V", "<init>", "(ZZLcom/reddit/domain/model/mod/SchedulePostModel;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class ExtraTags implements Parcelable
{
    public static final Parcelable$Creator<ExtraTags> CREATOR;
    private boolean allowVideoThread;
    private boolean isGifPost;
    private SchedulePostModel schedulePostModel;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public ExtraTags() {
        this(false, false, null, 7, null);
    }
    
    public ExtraTags(final boolean isGifPost, final boolean allowVideoThread, final SchedulePostModel schedulePostModel) {
        this.isGifPost = isGifPost;
        this.allowVideoThread = allowVideoThread;
        this.schedulePostModel = schedulePostModel;
    }
    
    public final boolean component1() {
        return this.isGifPost;
    }
    
    public final boolean component2() {
        return this.allowVideoThread;
    }
    
    public final SchedulePostModel component3() {
        return this.schedulePostModel;
    }
    
    public final ExtraTags copy(final boolean b, final boolean b2, final SchedulePostModel schedulePostModel) {
        return new ExtraTags(b, b2, schedulePostModel);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtraTags)) {
            return false;
        }
        final ExtraTags extraTags = (ExtraTags)o;
        return this.isGifPost == extraTags.isGifPost && this.allowVideoThread == extraTags.allowVideoThread && f.a((Object)this.schedulePostModel, (Object)extraTags.schedulePostModel);
    }
    
    public final boolean getAllowVideoThread() {
        return this.allowVideoThread;
    }
    
    public final SchedulePostModel getSchedulePostModel() {
        return this.schedulePostModel;
    }
    
    @Override
    public int hashCode() {
        final int isGifPost = this.isGifPost ? 1 : 0;
        int n = 1;
        int n2 = isGifPost;
        if (isGifPost != 0) {
            n2 = 1;
        }
        final int allowVideoThread = this.allowVideoThread ? 1 : 0;
        if (allowVideoThread == 0) {
            n = allowVideoThread;
        }
        final SchedulePostModel schedulePostModel = this.schedulePostModel;
        int hashCode;
        if (schedulePostModel == null) {
            hashCode = 0;
        }
        else {
            hashCode = schedulePostModel.hashCode();
        }
        return (n2 * 31 + n) * 31 + hashCode;
    }
    
    public final boolean isGifPost() {
        return this.isGifPost;
    }
    
    public final void setAllowVideoThread(final boolean allowVideoThread) {
        this.allowVideoThread = allowVideoThread;
    }
    
    public final void setGifPost(final boolean isGifPost) {
        this.isGifPost = isGifPost;
    }
    
    public final void setSchedulePostModel(final SchedulePostModel schedulePostModel) {
        this.schedulePostModel = schedulePostModel;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ExtraTags(isGifPost=");
        k.append(this.isGifPost);
        k.append(", allowVideoThread=");
        k.append(this.allowVideoThread);
        k.append(", schedulePostModel=");
        k.append(this.schedulePostModel);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeInt((int)(this.isGifPost ? 1 : 0));
        parcel.writeInt((int)(this.allowVideoThread ? 1 : 0));
        parcel.writeParcelable((Parcelable)this.schedulePostModel, n);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<ExtraTags>
    {
        public final ExtraTags createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final int int1 = parcel.readInt();
            boolean b = true;
            final boolean b2 = int1 != 0;
            if (parcel.readInt() == 0) {
                b = false;
            }
            return new ExtraTags(b2, b, (SchedulePostModel)parcel.readParcelable(ExtraTags.class.getClassLoader()));
        }
        
        public final ExtraTags[] newArray(final int n) {
            return new ExtraTags[n];
        }
    }
}
