// 
// Decompiled by Procyon v0.6.0
// 

package r82;

import java.io.Serializable;
import android.os.Parcel;
import ng2.e;
import java.math.BigInteger;
import java.util.Date;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class b implements Parcelable
{
    public static final Parcelable$Creator<b> CREATOR;
    public final Date f;
    public final BigInteger g;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public b(final Date f, final BigInteger g) {
        e.f((Object)f, "expiresAt");
        e.f((Object)g, "points");
        this.f = f;
        this.g = g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return e.a((Object)this.f, (Object)b.f) && e.a((Object)this.g, (Object)b.g);
    }
    
    @Override
    public final int hashCode() {
        return this.g.hashCode() + this.f.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("AirdroppingPointsRound(expiresAt=");
        t.append(this.f);
        t.append(", points=");
        t.append(this.g);
        t.append(')');
        return t.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeSerializable((Serializable)this.f);
        parcel.writeSerializable((Serializable)this.g);
    }
    
    public static final class a implements Parcelable$Creator<b>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new b((Date)parcel.readSerializable(), (BigInteger)parcel.readSerializable());
        }
        
        public final Object[] newArray(final int n) {
            return new b[n];
        }
    }
}
