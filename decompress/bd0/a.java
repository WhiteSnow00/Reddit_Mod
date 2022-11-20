// 
// Decompiled by Procyon v0.6.0
// 

package bd0;

import android.os.Parcel;
import p1.h;
import ng2.e;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public final String f;
    public final String g;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public a(final String f, final String g) {
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
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return e.a((Object)this.f, (Object)a.f) && e.a((Object)this.g, (Object)a.g);
    }
    
    @Override
    public final int hashCode() {
        return this.g.hashCode() + this.f.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("AchievementFlairImage(url=");
        t.append(this.f);
        t.append(", mimeType=");
        return h.c(t, this.g, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
    
    public static final class a implements Parcelable$Creator<bd0.a>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new bd0.a(parcel.readString(), parcel.readString());
        }
        
        public final Object[] newArray(final int n) {
            return new bd0.a[n];
        }
    }
}
