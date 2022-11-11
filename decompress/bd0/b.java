// 
// Decompiled by Procyon v0.6.0
// 

package bd0;

import android.os.Parcel;
import al0.f0;
import sg2.e;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class b implements Parcelable
{
    public static final Parcelable$Creator<b> CREATOR;
    public final String f;
    public final String g;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public b(final String f, final String g) {
        e.f((Object)f, "url");
        e.f((Object)g, "mimeType");
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
        final StringBuilder r = a.r("AchievementFlairImage(url=");
        r.append(this.f);
        r.append(", mimeType=");
        return f0.n(r, this.g, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
    
    public static final class a implements Parcelable$Creator<b>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new b(parcel.readString(), parcel.readString());
        }
        
        public final Object[] newArray(final int n) {
            return new b[n];
        }
    }
}
