// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import java.util.Arrays;
import java.util.GregorianCalendar;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public final s f;
    public final s g;
    public final s h;
    public final c i;
    public final int j;
    public final int k;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new a((s)parcel.readParcelable(s.class.getClassLoader()), (s)parcel.readParcelable(s.class.getClassLoader()), (s)parcel.readParcelable(s.class.getClassLoader()), (c)parcel.readParcelable(c.class.getClassLoader()));
            }
            
            public final Object[] newArray(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final s f, final s g, final s h, final c i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        if (f.f.compareTo(h.f) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (h.f.compareTo(g.f) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (f.f instanceof GregorianCalendar) {
            final int j = g.i;
            final int k = f.i;
            this.k = g.h - f.h + (j - k) * 12 + 1;
            this.j = j - k + 1;
            return;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
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
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        if (!this.f.equals(a.f) || !this.g.equals(a.g) || !this.h.equals(a.h) || !this.i.equals(a.i)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.f, this.g, this.h, this.i });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.f, 0);
        parcel.writeParcelable((Parcelable)this.g, 0);
        parcel.writeParcelable((Parcelable)this.h, 0);
        parcel.writeParcelable((Parcelable)this.i, 0);
    }
    
    public static final class b
    {
        public static final long e;
        public static final long f;
        public long a;
        public long b;
        public Long c;
        public c d;
        
        static {
            e = a0.a(s.a(1900, 0).l);
            f = a0.a(s.a(2100, 11).l);
        }
        
        public b(final a a) {
            this.a = b.e;
            this.b = b.f;
            this.d = (c)new e(Long.MIN_VALUE);
            this.a = a.f.l;
            this.b = a.g.l;
            this.c = a.h.l;
            this.d = a.i;
        }
    }
    
    public interface c extends Parcelable
    {
        boolean K(final long p0);
    }
}
