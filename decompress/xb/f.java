// 
// Decompiled by Procyon v0.6.0
// 

package xb;

import java.util.Collections;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

public final class f extends xb.b
{
    public static final Parcelable$Creator<f> CREATOR;
    public final List<c> f;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<f>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new f(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new f[n];
            }
        };
    }
    
    public f(final Parcel parcel) {
        final int int1 = parcel.readInt();
        final ArrayList list = new ArrayList<c>(int1);
        for (int i = 0; i < int1; ++i) {
            list.add(new c(parcel));
        }
        this.f = Collections.unmodifiableList((List<? extends c>)list);
    }
    
    public f(final ArrayList list) {
        this.f = Collections.unmodifiableList((List<? extends c>)list);
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        final int size = this.f.size();
        parcel.writeInt(size);
        c c;
        int size2;
        int j;
        b b;
        for (i = 0; i < size; ++i) {
            c = this.f.get(i);
            parcel.writeLong(c.a);
            parcel.writeByte((byte)(byte)(c.b ? 1 : 0));
            parcel.writeByte((byte)(byte)(c.c ? 1 : 0));
            parcel.writeByte((byte)(byte)(c.d ? 1 : 0));
            size2 = c.f.size();
            parcel.writeInt(size2);
            for (j = 0; j < size2; ++j) {
                b = (b)c.f.get(j);
                parcel.writeInt(b.a);
                parcel.writeLong(b.b);
            }
            parcel.writeLong(c.e);
            parcel.writeByte((byte)(byte)(c.g ? 1 : 0));
            parcel.writeLong(c.h);
            parcel.writeInt(c.i);
            parcel.writeInt(c.j);
            parcel.writeInt(c.k);
        }
    }
    
    public static final class b
    {
        public final int a;
        public final long b;
        
        public b(final int a, final long b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class c
    {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List<b> f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;
        
        public c(final long a, final boolean b, final boolean c, final boolean d, final ArrayList list, final long e, final boolean g, final long h, final int i, final int j, final int k) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.f = Collections.unmodifiableList((List<? extends b>)list);
            this.e = e;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
        }
        
        public c(final Parcel parcel) {
            this.a = parcel.readLong();
            final byte byte1 = parcel.readByte();
            final boolean b = false;
            this.b = (byte1 == 1);
            this.c = (parcel.readByte() == 1);
            this.d = (parcel.readByte() == 1);
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList<Object>(int1);
            for (int i = 0; i < int1; ++i) {
                list.add(new b(parcel.readInt(), parcel.readLong()));
            }
            this.f = Collections.unmodifiableList((List<? extends b>)list);
            this.e = parcel.readLong();
            boolean g = b;
            if (parcel.readByte() == 1) {
                g = true;
            }
            this.g = g;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }
    }
}
