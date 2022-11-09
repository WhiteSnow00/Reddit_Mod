// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import java.util.Arrays;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import android.os.Parcel;
import java.util.Calendar;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class s implements Comparable<s>, Parcelable
{
    public static final Parcelable$Creator<s> CREATOR;
    public final Calendar f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final long l;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<s>() {
            public final Object createFromParcel(final Parcel parcel) {
                return s.a(parcel.readInt(), parcel.readInt());
            }
            
            public final Object[] newArray(final int n) {
                return new s[n];
            }
        };
    }
    
    public s(final Calendar calendar) {
        calendar.set(5, 1);
        final Calendar b = a0.b(calendar);
        this.f = b;
        this.h = b.get(2);
        this.i = b.get(1);
        this.j = b.getMaximum(7);
        this.k = b.getActualMaximum(5);
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        this.g = simpleDateFormat.format(b.getTime());
        this.l = b.getTimeInMillis();
    }
    
    public static s a(final int n, final int n2) {
        final Calendar d = a0.d((Calendar)null);
        d.set(1, n);
        d.set(2, n2);
        return new s(d);
    }
    
    public final int c() {
        int n2;
        final int n = n2 = this.f.get(7) - this.f.getFirstDayOfWeek();
        if (n < 0) {
            n2 = n + this.j;
        }
        return n2;
    }
    
    @Override
    public final int compareTo(final Object o) {
        return this.f.compareTo(((s)o).f);
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
        if (!(o instanceof s)) {
            return false;
        }
        final s s = (s)o;
        if (this.h != s.h || this.i != s.i) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.h, this.i });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.i);
        parcel.writeInt(this.h);
    }
}
