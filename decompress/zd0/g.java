// 
// Decompiled by Procyon v0.6.0
// 

package zd0;

import android.os.Parcel;
import al0.f0;
import sg2.e;
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
        e.f((Object)f, "transitionName");
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
        final int hashCode = this.f.hashCode();
        final String g = this.g;
        int hashCode2;
        if (g == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = g.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SharedImageTransitionParams(transitionName=");
        r.append(this.f);
        r.append(", thumbUrl=");
        return f0.n(r, this.g, ')');
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
