// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.drm;

import java.util.UUID;
import va.c;
import java.util.Arrays;
import java.util.ArrayList;
import ad.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import java.util.Comparator;

public final class b implements Comparator<b>, Parcelable
{
    public static final Parcelable$Creator<b> CREATOR;
    public final b[] f;
    public int g;
    public final String h;
    public final int i;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<b>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new b(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new b[n];
            }
        };
    }
    
    public b() {
        throw null;
    }
    
    public b(final Parcel parcel) {
        this.h = parcel.readString();
        final b[] f = (b[])parcel.createTypedArray((Parcelable$Creator)b.CREATOR);
        final int a = c0.a;
        this.f = f;
        this.i = f.length;
    }
    
    public b(final String s, final ArrayList list) {
        this(s, false, (b[])list.toArray(new b[0]));
    }
    
    public b(final String h, final boolean b, final b... array) {
        this.h = h;
        b[] f = array;
        if (b) {
            f = array.clone();
        }
        this.f = f;
        this.i = f.length;
        Arrays.sort(f, this);
    }
    
    public b(final b... array) {
        this(null, true, array);
    }
    
    public final b a(final String s) {
        if (c0.a(this.h, s)) {
            return this;
        }
        return new b(s, false, this.f);
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        final b b = (b)o;
        final b b2 = (b)o2;
        final UUID a = c.a;
        int compareTo;
        if (a.equals(b.g)) {
            if (a.equals(b2.g)) {
                compareTo = 0;
            }
            else {
                compareTo = 1;
            }
        }
        else {
            compareTo = b.g.compareTo(b2.g);
        }
        return compareTo;
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
            if (!c0.a(this.h, b2.h) || !Arrays.equals(this.f, b2.f)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.g == 0) {
            final String h = this.h;
            int hashCode;
            if (h == null) {
                hashCode = 0;
            }
            else {
                hashCode = h.hashCode();
            }
            this.g = hashCode * 31 + Arrays.hashCode(this.f);
        }
        return this.g;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.h);
        parcel.writeTypedArray((Parcelable[])this.f, 0);
    }
    
    public static final class b implements Parcelable
    {
        public static final Parcelable$Creator<b> CREATOR;
        public int f;
        public final UUID g;
        public final String h;
        public final String i;
        public final byte[] j;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<b>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new b(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new b[n];
                }
            };
        }
        
        public b() {
            throw null;
        }
        
        public b(final Parcel parcel) {
            this.g = new UUID(parcel.readLong(), parcel.readLong());
            this.h = parcel.readString();
            final String string = parcel.readString();
            final int a = c0.a;
            this.i = string;
            this.j = parcel.createByteArray();
        }
        
        public b(final UUID g, final String h, final String i, final byte[] j) {
            g.getClass();
            this.g = g;
            this.h = h;
            i.getClass();
            this.i = i;
            this.j = j;
        }
        
        public final boolean a(final UUID uuid) {
            return c.a.equals(this.g) || uuid.equals(this.g);
        }
        
        public final int describeContents() {
            return 0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            final boolean b = o instanceof b;
            final boolean b2 = false;
            if (!b) {
                return false;
            }
            if (o == this) {
                return true;
            }
            final b b3 = (b)o;
            boolean b4 = b2;
            if (c0.a(this.h, b3.h)) {
                b4 = b2;
                if (c0.a(this.i, b3.i)) {
                    b4 = b2;
                    if (c0.a(this.g, b3.g)) {
                        b4 = b2;
                        if (Arrays.equals(this.j, b3.j)) {
                            b4 = true;
                        }
                    }
                }
            }
            return b4;
        }
        
        @Override
        public final int hashCode() {
            if (this.f == 0) {
                final int hashCode = this.g.hashCode();
                final String h = this.h;
                int hashCode2;
                if (h == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = h.hashCode();
                }
                this.f = Arrays.hashCode(this.j) + b.c(this.i, (hashCode * 31 + hashCode2) * 31, 31);
            }
            return this.f;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeLong(this.g.getMostSignificantBits());
            parcel.writeLong(this.g.getLeastSignificantBits());
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeByteArray(this.j);
        }
    }
}
