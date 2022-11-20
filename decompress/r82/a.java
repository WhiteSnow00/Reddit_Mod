// 
// Decompiled by Procyon v0.6.0
// 

package r82;

import xi2.j;
import java.io.Serializable;
import android.os.Parcel;
import dg.l0;
import ng2.e;
import java.math.BigInteger;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a implements Parcelable, Comparable<a>
{
    public static final Parcelable$Creator<a> CREATOR;
    public final BigInteger f;
    
    static {
        CREATOR = (Parcelable$Creator)new b();
    }
    
    public a(final String s) {
        e.f((Object)s, "hex");
        this(l0.w0(s));
    }
    
    public a(final BigInteger f) {
        e.f((Object)f, "value");
        this.f = f;
    }
    
    public final String c() {
        return l0.p1(this.f, 40, true);
    }
    
    public final int compareTo(final Object o) {
        final a a = (a)o;
        e.f((Object)a, "other");
        return this.c().compareTo(a.c());
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof a && e.a((Object)this.f, (Object)((a)o).f));
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Address(value=");
        t.append(this.f);
        t.append(')');
        return t.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeSerializable((Serializable)this.f);
    }
    
    public static final class a
    {
        public static boolean a(final String s) {
            e.f((Object)s, "text");
            boolean b2;
            final boolean b = b2 = false;
            if (j.I0(s, "0x", false)) {
                b2 = b;
                if (s.length() == 42) {
                    boolean b3;
                    try {
                        new r82.a(s);
                        b3 = true;
                    }
                    catch (final Exception ex) {
                        b3 = false;
                    }
                    b2 = b;
                    if (b3) {
                        b2 = true;
                    }
                }
            }
            return b2;
        }
    }
    
    public static final class b implements Parcelable$Creator<a>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new a((BigInteger)parcel.readSerializable());
        }
        
        public final Object[] newArray(final int n) {
            return new a[n];
        }
    }
}
