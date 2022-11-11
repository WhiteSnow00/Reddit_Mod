// 
// Decompiled by Procyon v0.6.0
// 

package ap0;

import android.os.Parcel;
import al0.g7;
import sg2.e;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public a() {
        this(31, null, null, null);
    }
    
    public a(final String f, final String g, final String h, final boolean i, final boolean j) {
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
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return e.a((Object)this.f, (Object)a.f) && e.a((Object)this.g, (Object)a.g) && e.a((Object)this.h, (Object)a.h) && this.i == a.i && this.j == a.j;
    }
    
    @Override
    public final int hashCode() {
        final String f = this.f;
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
        final int i = this.i ? 1 : 0;
        int n = 1;
        int n2 = i;
        if (i != 0) {
            n2 = 1;
        }
        final int j = this.j ? 1 : 0;
        if (j == 0) {
            n = j;
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode) * 31 + n2) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("CommunityAvatarAwardRedesignArgs(cx=");
        r.append(this.f);
        r.append(", cy=");
        r.append(this.g);
        r.append(", px=");
        r.append(this.h);
        r.append(", fullscreen=");
        r.append(this.i);
        r.append(", edit=");
        return g7.m(r, this.j, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt((int)(this.i ? 1 : 0));
        parcel.writeInt((int)(this.j ? 1 : 0));
    }
    
    public static final class a implements Parcelable$Creator<ap0.a>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final int int1 = parcel.readInt();
            boolean b = false;
            final boolean b2 = int1 != 0;
            if (parcel.readInt() != 0) {
                b = true;
            }
            return new ap0.a(string, string2, string3, b2, b);
        }
        
        public final Object[] newArray(final int n) {
            return new ap0.a[n];
        }
    }
}
