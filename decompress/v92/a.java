// 
// Decompiled by Procyon v0.6.0
// 

package v92;

import ng2.e;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public final int f;
    public final int g;
    public final int h;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public a(final int f, final int g, final int h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return this.f == a.f && this.g == a.g && this.h == a.h;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.h) + a.c(this.g, Integer.hashCode(this.f) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("CoinsBundle(minCoins=");
        t.append(this.f);
        t.append(", icon=");
        t.append(this.g);
        t.append(", title=");
        return d.j(t, this.h, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }
    
    public static final class a implements Parcelable$Creator<v92.a>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new v92.a(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
        
        public final Object[] newArray(final int n) {
            return new v92.a[n];
        }
    }
}
