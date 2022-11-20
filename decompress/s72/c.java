// 
// Decompiled by Procyon v0.6.0
// 

package s72;

import android.os.Parcel;
import aq2.a;
import ng2.e;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class c implements Parcelable
{
    public static final Parcelable$Creator<c> CREATOR;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final Parcelable j;
    public final boolean k;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public c(final String f, final String g, final int h, final int i, final Parcelable j, final boolean k) {
        e.f((Object)f, "title");
        e.f((Object)g, "message");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
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
        return e.a((Object)this.f, (Object)c.f) && e.a((Object)this.g, (Object)c.g) && this.h == c.h && this.i == c.i && e.a((Object)this.j, (Object)c.j) && this.k == c.k;
    }
    
    @Override
    public final int hashCode() {
        final int c = aq2.a.c(this.i, aq2.a.c(this.h, aq2.a.e(this.g, this.f.hashCode() * 31, 31), 31), 31);
        final Parcelable j = this.j;
        int hashCode;
        if (j == null) {
            hashCode = 0;
        }
        else {
            hashCode = j.hashCode();
        }
        int k;
        if ((k = (this.k ? 1 : 0)) != 0) {
            k = 1;
        }
        return (c + hashCode) * 31 + k;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("DialogScreenModel(title=");
        t.append(this.f);
        t.append(", message=");
        t.append(this.g);
        t.append(", negativeButtonText=");
        t.append(this.h);
        t.append(", positiveButtonText=");
        t.append(this.i);
        t.append(", payload=");
        t.append(this.j);
        t.append(", colorPositiveActionRed=");
        return d.n(t, this.k, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeParcelable(this.j, n);
        parcel.writeInt((int)(this.k ? 1 : 0));
    }
    
    public static final class a implements Parcelable$Creator<c>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new c(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readParcelable(c.class.getClassLoader()), parcel.readInt() != 0);
        }
        
        public final Object[] newArray(final int n) {
            return new c[n];
        }
    }
}
