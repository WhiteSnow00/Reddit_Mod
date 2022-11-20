// 
// Decompiled by Procyon v0.6.0
// 

package xb;

import java.util.ArrayList;
import android.os.Parcel;
import java.util.Collections;
import java.util.List;
import android.os.Parcelable$Creator;

public final class d extends b
{
    public static final Parcelable$Creator<d> CREATOR;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final long l;
    public final List<d.d$b> m;
    public final boolean n;
    public final long o;
    public final int p;
    public final int q;
    public final int r;
    
    static {
        CREATOR = (Parcelable$Creator)new d$a();
    }
    
    public d(final long f, final boolean g, final boolean h, final boolean i, final boolean j, final long k, final long l, final List<d.d$b> list, final boolean n, final long o, final int p13, final int q, final int r) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = Collections.unmodifiableList((List<? extends d.d$b>)list);
        this.n = n;
        this.o = o;
        this.p = p13;
        this.q = q;
        this.r = r;
    }
    
    public d(final Parcel parcel) {
        this.f = parcel.readLong();
        final byte byte1 = parcel.readByte();
        final boolean b = true;
        this.g = (byte1 == 1);
        this.h = (parcel.readByte() == 1);
        this.i = (parcel.readByte() == 1);
        this.j = (parcel.readByte() == 1);
        this.k = parcel.readLong();
        this.l = parcel.readLong();
        final int int1 = parcel.readInt();
        final ArrayList list = new ArrayList<Object>(int1);
        for (int i = 0; i < int1; ++i) {
            list.add(new d.d$b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.m = Collections.unmodifiableList((List<? extends d.d$b>)list);
        this.n = (parcel.readByte() == 1 && b);
        this.o = parcel.readLong();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        parcel.writeLong(this.f);
        parcel.writeByte((byte)(byte)(this.g ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.h ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.i ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.j ? 1 : 0));
        parcel.writeLong(this.k);
        parcel.writeLong(this.l);
        final int size = this.m.size();
        parcel.writeInt(size);
        d.d$b d$b;
        for (i = 0; i < size; ++i) {
            d$b = this.m.get(i);
            parcel.writeInt(d$b.a);
            parcel.writeLong(d$b.b);
            parcel.writeLong(d$b.c);
        }
        parcel.writeByte((byte)(byte)(this.n ? 1 : 0));
        parcel.writeLong(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
    }
}
