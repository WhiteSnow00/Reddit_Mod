// 
// Decompiled by Procyon v0.6.0
// 

package wb;

import bd.c0;
import java.util.Arrays;
import android.os.Parcelable;
import t5.w;
import ah0.b;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import qb.a$b;

public final class c implements a$b
{
    public static final Parcelable$Creator<c> CREATOR;
    public final List<b> f;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<c>() {
            public final Object createFromParcel(final Parcel parcel) {
                final ArrayList list = new ArrayList();
                parcel.readList((List)list, b.class.getClassLoader());
                return new c(list);
            }
            
            public final Object[] newArray(final int n) {
                return new c[n];
            }
        };
    }
    
    public c(final ArrayList f) {
        this.f = f;
        final boolean empty = f.isEmpty();
        final int n = 0;
        int n2;
        if (empty) {
            n2 = n;
        }
        else {
            long n3 = f.get(0).g;
            int n4 = 1;
            while (true) {
                n2 = n;
                if (n4 >= f.size()) {
                    break;
                }
                if (((b)f.get(n4)).f < n3) {
                    n2 = 1;
                    break;
                }
                n3 = ((b)f.get(n4)).g;
                ++n4;
            }
        }
        ah0.b.C((boolean)((n2 ^ 0x1) != 0x0));
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && c.class == o.getClass() && this.f.equals(((c)o).f));
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.f);
        return w.f(value.length() + 21, "SlowMotion: segments=", value);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeList((List)this.f);
    }
    
    public static final class b implements Parcelable
    {
        public static final Parcelable$Creator<b> CREATOR;
        public final long f;
        public final long g;
        public final int h;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<b>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
                }
                
                public final Object[] newArray(final int n) {
                    return new b[n];
                }
            };
        }
        
        public b(final int h, final long f, final long g) {
            ah0.b.C(f < g);
            this.f = f;
            this.g = g;
            this.h = h;
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
            if (o != null && b.class == o.getClass()) {
                final b b2 = (b)o;
                if (this.f != b2.f || this.g != b2.g || this.h != b2.h) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return Arrays.hashCode(new Object[] { this.f, this.g, this.h });
        }
        
        @Override
        public final String toString() {
            return c0.n("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", new Object[] { this.f, this.g, this.h });
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeLong(this.f);
            parcel.writeLong(this.g);
            parcel.writeInt(this.h);
        }
    }
}
