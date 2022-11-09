// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcelable$Creator;
import android.os.Parcel;
import androidx.viewpager.widget.c;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0012\u0012\u0006\u0010\u0019\u001a\u00020\r\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000fJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\rH\u00d6\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0004H\u00d6\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0088\u0001\u0019\u0092\u0001\u00020\r\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/model/MultiredditPath;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lpg2/j;", "writeToParcel-impl", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "writeToParcel", "describeContents-impl", "(Ljava/lang/String;)I", "describeContents", "", "toString-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "constructor-impl", "CREATOR", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class MultiredditPath implements Parcelable
{
    public static final CREATOR CREATOR;
    private final String value = value;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public static String constructor-impl(final String s) {
        f.f((Object)s, "value");
        return s;
    }
    
    public static int describeContents-impl(final String s) {
        return 0;
    }
    
    public static boolean equals-impl(final String s, final Object o) {
        return o instanceof MultiredditPath && f.a((Object)s, (Object)((MultiredditPath)o).unbox-impl());
    }
    
    public static final boolean equals-impl0(final String s, final String s2) {
        return f.a((Object)s, (Object)s2);
    }
    
    public static int hashCode-impl(final String s) {
        return s.hashCode();
    }
    
    public static String toString-impl(final String s) {
        return c.i("MultiredditPath(value=", s, ')');
    }
    
    public static void writeToParcel-impl(final String s, final Parcel parcel, final int n) {
        f.f((Object)parcel, "parcel");
        parcel.writeString(s);
    }
    
    public int describeContents() {
        return describeContents-impl(this.value);
    }
    
    @Override
    public boolean equals(final Object o) {
        return equals-impl(this.value, o);
    }
    
    public final String getValue() {
        return this.value;
    }
    
    @Override
    public int hashCode() {
        return hashCode-impl(this.value);
    }
    
    @Override
    public String toString() {
        return toString-impl(this.value);
    }
    
    public final /* synthetic */ String unbox-impl() {
        return this.value;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "parcel");
        writeToParcel-impl(this.value, parcel, n);
    }
    
    @Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00f8\u0001\u0002¢\u0006\u0002\u0010\r\u00f8\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e" }, d2 = { "Lcom/reddit/domain/model/MultiredditPath$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/reddit/domain/model/MultiredditPath;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "createFromParcel-7R6UsMI", "(Landroid/os/Parcel;)Ljava/lang/String;", "newArray", "", "size", "", "(I)[Lcom/reddit/domain/model/MultiredditPath;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class CREATOR implements Parcelable$Creator<MultiredditPath>
    {
        private CREATOR() {
        }
        
        public String createFromParcel-7R6UsMI(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            f.c((Object)string);
            return MultiredditPath.constructor-impl(string);
        }
        
        public MultiredditPath[] newArray(final int n) {
            return new MultiredditPath[n];
        }
    }
}
