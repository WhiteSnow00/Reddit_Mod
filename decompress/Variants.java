// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u0012\u001a\u00020\fH\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fH\u00d6\u0001R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/model/Variants;", "Landroid/os/Parcelable;", "Lcom/reddit/domain/model/Variant;", "component1", "component2", "component3", "obfuscated", "gif", "mp4", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Lcom/reddit/domain/model/Variant;", "getObfuscated", "()Lcom/reddit/domain/model/Variant;", "getGif", "getMp4", "<init>", "(Lcom/reddit/domain/model/Variant;Lcom/reddit/domain/model/Variant;Lcom/reddit/domain/model/Variant;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Variants implements Parcelable
{
    public static final Parcelable$Creator<Variants> CREATOR;
    private final Variant gif;
    private final Variant mp4;
    private final Variant obfuscated;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Variants() {
        this(null, null, null, 7, null);
    }
    
    public Variants(final Variant obfuscated, final Variant gif, final Variant mp4) {
        this.obfuscated = obfuscated;
        this.gif = gif;
        this.mp4 = mp4;
    }
    
    public final Variant component1() {
        return this.obfuscated;
    }
    
    public final Variant component2() {
        return this.gif;
    }
    
    public final Variant component3() {
        return this.mp4;
    }
    
    public final Variants copy(final Variant variant, final Variant variant2, final Variant variant3) {
        return new Variants(variant, variant2, variant3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Variants)) {
            return false;
        }
        final Variants variants = (Variants)o;
        return f.a((Object)this.obfuscated, (Object)variants.obfuscated) && f.a((Object)this.gif, (Object)variants.gif) && f.a((Object)this.mp4, (Object)variants.mp4);
    }
    
    public final Variant getGif() {
        return this.gif;
    }
    
    public final Variant getMp4() {
        return this.mp4;
    }
    
    public final Variant getObfuscated() {
        return this.obfuscated;
    }
    
    @Override
    public int hashCode() {
        final Variant obfuscated = this.obfuscated;
        int hashCode = 0;
        int hashCode2;
        if (obfuscated == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = obfuscated.hashCode();
        }
        final Variant gif = this.gif;
        int hashCode3;
        if (gif == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = gif.hashCode();
        }
        final Variant mp4 = this.mp4;
        if (mp4 != null) {
            hashCode = mp4.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Variants(obfuscated=");
        k.append(this.obfuscated);
        k.append(", gif=");
        k.append(this.gif);
        k.append(", mp4=");
        k.append(this.mp4);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        final Variant obfuscated = this.obfuscated;
        if (obfuscated == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            obfuscated.writeToParcel(parcel, n);
        }
        final Variant gif = this.gif;
        if (gif == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            gif.writeToParcel(parcel, n);
        }
        final Variant mp4 = this.mp4;
        if (mp4 == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            mp4.writeToParcel(parcel, n);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<Variants>
    {
        public final Variants createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final int int1 = parcel.readInt();
            final Variant variant = null;
            Object fromParcel;
            if (int1 == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = Variant.CREATOR.createFromParcel(parcel);
            }
            final Variant variant2 = (Variant)fromParcel;
            Object fromParcel2;
            if (parcel.readInt() == 0) {
                fromParcel2 = null;
            }
            else {
                fromParcel2 = Variant.CREATOR.createFromParcel(parcel);
            }
            final Variant variant3 = (Variant)fromParcel2;
            Object fromParcel3;
            if (parcel.readInt() == 0) {
                fromParcel3 = variant;
            }
            else {
                fromParcel3 = Variant.CREATOR.createFromParcel(parcel);
            }
            return new Variants(variant2, variant3, (Variant)fromParcel3);
        }
        
        public final Variants[] newArray(final int n) {
            return new Variants[n];
        }
    }
}
