// 
// Decompiled by Procyon v0.6.0
// 

package tb;

import androidx.viewpager.widget.c;
import ak0.n;
import java.util.Arrays;
import com.google.android.exoplayer2.r$a;
import tg.b;
import bd.s;
import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import qb.a$b;

public final class a implements a$b
{
    public static final Parcelable$Creator<a> CREATOR;
    public final int f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final byte[] m;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new a(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final int f, final String g, final String h, final int i, final int j, final int k, final int l, final byte[] m) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public a(final Parcel parcel) {
        this.f = parcel.readInt();
        final String string = parcel.readString();
        final int a = c0.a;
        this.g = string;
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.createByteArray();
    }
    
    public static a a(final s s) {
        final int c = s.c();
        final String p = s.p(s.c(), b.a);
        final String o = s.o(s.c());
        final int c2 = s.c();
        final int c3 = s.c();
        final int c4 = s.c();
        final int c5 = s.c();
        final int c6 = s.c();
        final byte[] array = new byte[c6];
        s.b(0, c6, array);
        return new a(c, p, o, c2, c3, c4, c5, array);
    }
    
    public final void Q(final r$a r$a) {
        r$a.a(this.f, this.m);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && a.class == o.getClass()) {
            final a a = (a)o;
            if (this.f != a.f || !this.g.equals(a.g) || !this.h.equals(a.h) || this.i != a.i || this.j != a.j || this.k != a.k || this.l != a.l || !Arrays.equals(this.m, a.m)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.m) + ((((ag0.a.f(this.h, ag0.a.f(this.g, (this.f + 527) * 31, 31), 31) + this.i) * 31 + this.j) * 31 + this.k) * 31 + this.l) * 31;
    }
    
    @Override
    public final String toString() {
        final String g = this.g;
        final String h = this.h;
        return c.f(n.f(h, n.f(g, 32)), "Picture: mimeType=", g, ", description=", h);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeByteArray(this.m);
    }
}
