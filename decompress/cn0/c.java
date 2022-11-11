// 
// Decompiled by Procyon v0.6.0
// 

package cn0;

import android.os.Parcel;
import al0.g7;
import sg2.e;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class c implements Parcelable
{
    public static final Parcelable$Creator<c> CREATOR;
    public final Integer f;
    public final String g;
    public final String h;
    public final boolean i;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public c() {
        this(null, null, null, false);
    }
    
    public c(final Integer f, final String g, final String h, final boolean i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return e.a((Object)this.f, (Object)c.f) && e.a((Object)this.g, (Object)c.g) && e.a((Object)this.h, (Object)c.h) && this.i == c.i;
    }
    
    @Override
    public final int hashCode() {
        final Integer f = this.f;
        int hashCode = 0;
        int hashCode2;
        if (f == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = f.hashCode();
        }
        final String g = this.g;
        int hashCode3;
        if (g == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = g.hashCode();
        }
        final String h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        int i;
        if ((i = (this.i ? 1 : 0)) != 0) {
            i = 1;
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode) * 31 + i;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("PlaceholderPresentationModel(placeholderColor=");
        r.append(this.f);
        r.append(", placeholderIcon=");
        r.append(this.g);
        r.append(", placeholderPosition=");
        r.append(this.h);
        r.append(", showCustomPlaceholderIcon=");
        return g7.m(r, this.i, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, int intValue) {
        e.f((Object)parcel, "out");
        final Integer f = this.f;
        if (f == null) {
            intValue = 0;
        }
        else {
            parcel.writeInt(1);
            intValue = f;
        }
        parcel.writeInt(intValue);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt((int)(this.i ? 1 : 0));
    }
    
    public static final class a implements Parcelable$Creator<c>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            Integer value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = parcel.readInt();
            }
            return new c(value, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }
        
        public final Object[] newArray(final int n) {
            return new c[n];
        }
    }
}
