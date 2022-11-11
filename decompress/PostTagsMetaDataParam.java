// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;
import com.reddit.domain.model.postsubmit.PostTagsData;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0005H\u00c6\u0003J)\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000eH\u00d6\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\t\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\n\u0010\u001d¨\u0006 " }, d2 = { "Lcom/reddit/domain/model/PostTagsMetaDataParam;", "Lcom/reddit/domain/model/postsubmit/PostTagsData;", "Landroid/os/Parcelable;", "Lcom/reddit/domain/model/Flair;", "component1", "", "component2", "component3", "flair", "isNsfw", "isSpoiler", "copy", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Lcom/reddit/domain/model/Flair;", "getFlair", "()Lcom/reddit/domain/model/Flair;", "Z", "()Z", "<init>", "(Lcom/reddit/domain/model/Flair;ZZ)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostTagsMetaDataParam implements PostTagsData, Parcelable
{
    public static final Parcelable$Creator<PostTagsMetaDataParam> CREATOR;
    private final Flair flair;
    private final boolean isNsfw;
    private final boolean isSpoiler;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public PostTagsMetaDataParam(final Flair flair, final boolean isNsfw, final boolean isSpoiler) {
        this.flair = flair;
        this.isNsfw = isNsfw;
        this.isSpoiler = isSpoiler;
    }
    
    public final Flair component1() {
        return this.getFlair();
    }
    
    public final boolean component2() {
        return this.isNsfw();
    }
    
    public final boolean component3() {
        return this.isSpoiler();
    }
    
    public final PostTagsMetaDataParam copy(final Flair flair, final boolean b, final boolean b2) {
        return new PostTagsMetaDataParam(flair, b, b2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostTagsMetaDataParam)) {
            return false;
        }
        final PostTagsMetaDataParam postTagsMetaDataParam = (PostTagsMetaDataParam)o;
        return e.a((Object)this.getFlair(), (Object)postTagsMetaDataParam.getFlair()) && this.isNsfw() == postTagsMetaDataParam.isNsfw() && this.isSpoiler() == postTagsMetaDataParam.isSpoiler();
    }
    
    public Flair getFlair() {
        return this.flair;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.getFlair() == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.getFlair().hashCode();
        }
        final int nsfw = this.isNsfw() ? 1 : 0;
        int n = 1;
        int n2 = nsfw;
        if (nsfw != 0) {
            n2 = 1;
        }
        final int spoiler = this.isSpoiler() ? 1 : 0;
        if (spoiler == 0) {
            n = spoiler;
        }
        return (hashCode * 31 + n2) * 31 + n;
    }
    
    public boolean isNsfw() {
        return this.isNsfw;
    }
    
    public boolean isSpoiler() {
        return this.isSpoiler;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("PostTagsMetaDataParam(flair=");
        r.append(this.getFlair());
        r.append(", isNsfw=");
        r.append(this.isNsfw());
        r.append(", isSpoiler=");
        r.append(this.isSpoiler());
        r.append(')');
        return r.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        final Flair flair = this.flair;
        if (flair == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            flair.writeToParcel(parcel, n);
        }
        parcel.writeInt((int)(this.isNsfw ? 1 : 0));
        parcel.writeInt((int)(this.isSpoiler ? 1 : 0));
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<PostTagsMetaDataParam>
    {
        public final PostTagsMetaDataParam createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            Object fromParcel;
            if (parcel.readInt() == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = Flair.CREATOR.createFromParcel(parcel);
            }
            final Flair flair = (Flair)fromParcel;
            final int int1 = parcel.readInt();
            boolean b = true;
            final boolean b2 = int1 != 0;
            if (parcel.readInt() == 0) {
                b = false;
            }
            return new PostTagsMetaDataParam(flair, b2, b);
        }
        
        public final PostTagsMetaDataParam[] newArray(final int n) {
            return new PostTagsMetaDataParam[n];
        }
    }
}
