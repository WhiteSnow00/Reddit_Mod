// 
// Decompiled by Procyon v0.6.0
// 

package ad0;

import android.os.Parcel;
import aq2.a;
import ng2.e;
import p1.h;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class d implements Parcelable
{
    public static final Parcelable$Creator<d> CREATOR;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public d(final String f, final String g, final String h, final String i, final String j) {
        p1.h.h(f, "id", g, "name", i, "upvoteCount", j, "commentCount");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return e.a((Object)this.f, (Object)d.f) && e.a((Object)this.g, (Object)d.g) && e.a((Object)this.h, (Object)d.h) && e.a((Object)this.i, (Object)d.i) && e.a((Object)this.j, (Object)d.j);
    }
    
    @Override
    public final int hashCode() {
        final int e = aq2.a.e(this.g, this.f.hashCode() * 31, 31);
        final String h = this.h;
        int hashCode;
        if (h == null) {
            hashCode = 0;
        }
        else {
            hashCode = h.hashCode();
        }
        return this.j.hashCode() + aq2.a.e(this.i, (e + hashCode) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PostSetCommunityData(id=");
        t.append(this.f);
        t.append(", name=");
        t.append(this.g);
        t.append(", icon=");
        t.append(this.h);
        t.append(", upvoteCount=");
        t.append(this.i);
        t.append(", commentCount=");
        return p1.h.c(t, this.j, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }
    
    public static final class a implements Parcelable$Creator<d>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
        
        public final Object[] newArray(final int n) {
            return new d[n];
        }
    }
}
