// 
// Decompiled by Procyon v0.6.0
// 

package xb;

import java.util.ArrayList;
import java.util.Collections;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

public final class d extends xb.b
{
    public static final Parcelable$Creator<d> CREATOR;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final long l;
    public final List<b> m;
    public final boolean n;
    public final long o;
    public final int p;
    public final int q;
    public final int r;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<d>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new d(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new d[n];
            }
        };
    }
    
    public d(final long f, final boolean g, final boolean h, final boolean i, final boolean j, final long k, final long l, final List<b> list, final boolean n, final long o, final int p13, final int q, final int r) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = Collections.unmodifiableList((List<? extends b>)list);
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
            list.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.m = Collections.unmodifiableList((List<? extends b>)list);
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
        b b;
        for (i = 0; i < size; ++i) {
            b = this.m.get(i);
            parcel.writeInt(b.a);
            parcel.writeLong(b.b);
            parcel.writeLong(b.c);
        }
        parcel.writeByte((byte)(byte)(this.n ? 1 : 0));
        parcel.writeLong(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
    }
    
    public static final class b
    {
        public final int a;
        public final long b;
        public final long c;
        
        public b(final int a, final long b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
