// 
// Decompiled by Procyon v0.6.0
// 

package sb;

import java.util.Arrays;
import bd.c0;
import android.os.Parcel;
import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.n;
import android.os.Parcelable$Creator;
import qb.a$b;

public final class a implements a$b
{
    public static final Parcelable$Creator<a> CREATOR;
    public static final n l;
    public static final n m;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final byte[] j;
    public int k;
    
    static {
        final n$a n$a = new n$a();
        n$a.k = "application/id3";
        l = n$a.a();
        final n$a n$a2 = new n$a();
        n$a2.k = "application/x-scte35";
        m = n$a2.a();
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new a(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = c0.a;
        this.f = string;
        this.g = parcel.readString();
        this.h = parcel.readLong();
        this.i = parcel.readLong();
        this.j = parcel.createByteArray();
    }
    
    public a(final String f, final String g, final long h, final long i, final byte[] j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
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
            if (this.h != a.h || this.i != a.i || !c0.a(this.f, a.f) || !c0.a(this.g, a.g) || !Arrays.equals(this.j, a.j)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.k == 0) {
            final String f = this.f;
            int hashCode = 0;
            int hashCode2;
            if (f != null) {
                hashCode2 = f.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final String g = this.g;
            if (g != null) {
                hashCode = g.hashCode();
            }
            final long h = this.h;
            final int n = (int)(h ^ h >>> 32);
            final long i = this.i;
            this.k = Arrays.hashCode(this.j) + ((((527 + hashCode2) * 31 + hashCode) * 31 + n) * 31 + (int)(i ^ i >>> 32)) * 31;
        }
        return this.k;
    }
    
    public final byte[] i0() {
        byte[] j;
        if (this.p0() != null) {
            j = this.j;
        }
        else {
            j = null;
        }
        return j;
    }
    
    public final n p0() {
        final String f = this.f;
        f.getClass();
        final int hashCode = f.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1303648457: {
                if (!f.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    break;
                }
                n = 2;
                break;
            }
            case -795945609: {
                if (!f.equals("https://aomedia.org/emsg/ID3")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1468477611: {
                if (!f.equals("urn:scte:scte35:2014:bin")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return null;
            }
            case 1:
            case 2: {
                return a.l;
            }
            case 0: {
                return a.m;
            }
        }
    }
    
    @Override
    public final String toString() {
        final String f = this.f;
        final long i = this.i;
        final long h = this.h;
        final String g = this.g;
        final StringBuilder sb = new StringBuilder(ak0.n.f(g, ak0.n.f(f, 79)));
        sb.append("EMSG: scheme=");
        sb.append(f);
        sb.append(", id=");
        sb.append(i);
        sb.append(", durationMs=");
        sb.append(h);
        sb.append(", value=");
        sb.append(g);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
        parcel.writeByteArray(this.j);
    }
}
