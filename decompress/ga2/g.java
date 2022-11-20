// 
// Decompiled by Procyon v0.6.0
// 

package ga2;

import android.os.Parcel;
import p1.h;
import ng2.e;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class g implements Parcelable
{
    public static final Parcelable$Creator<g> CREATOR;
    public final String f;
    public final String g;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public g(final String f, final String g) {
        e.f((Object)f, "url");
        e.f((Object)g, "redirectUrl");
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
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        return e.a((Object)this.f, (Object)g.f) && e.a((Object)this.g, (Object)g.g);
    }
    
    @Override
    public final int hashCode() {
        return this.g.hashCode() + this.f.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PaymentRequest(url=");
        t.append(this.f);
        t.append(", redirectUrl=");
        return h.c(t, this.g, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
    
    public static final class a implements Parcelable$Creator<g>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new g(parcel.readString(), parcel.readString());
        }
        
        public final Object[] newArray(final int n) {
            return new g[n];
        }
    }
}
