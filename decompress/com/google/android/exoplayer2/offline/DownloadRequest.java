// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.offline;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import a81.e;
import java.util.Arrays;
import java.util.Collection;
import ad.d0;
import java.util.Collections;
import java.util.ArrayList;
import ad.c0;
import android.os.Parcel;
import yb.o;
import java.util.List;
import android.net.Uri;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class DownloadRequest implements Parcelable
{
    public static final Parcelable$Creator<DownloadRequest> CREATOR;
    public final String f;
    public final Uri g;
    public final String h;
    public final List<o> i;
    public final byte[] j;
    public final String k;
    public final byte[] l;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<DownloadRequest>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new DownloadRequest(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new DownloadRequest[n];
            }
        };
    }
    
    public DownloadRequest(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = c0.a;
        this.f = string;
        this.g = Uri.parse(parcel.readString());
        this.h = parcel.readString();
        final int int1 = parcel.readInt();
        final ArrayList list = new ArrayList<o>(int1);
        for (int i = 0; i < int1; ++i) {
            list.add((o)parcel.readParcelable(o.class.getClassLoader()));
        }
        this.i = Collections.unmodifiableList((List<? extends o>)list);
        this.j = parcel.createByteArray();
        this.k = parcel.readString();
        this.l = parcel.createByteArray();
    }
    
    public DownloadRequest(final String f, final Uri g, final String h, final List<o> list, final byte[] array, final String k, final byte[] array2) {
        final int f2 = c0.F(g, h);
        boolean b = true;
        if (f2 == 0 || f2 == 2 || f2 == 1) {
            if (k != null) {
                b = false;
            }
            final StringBuilder sb = new StringBuilder(49);
            sb.append("customCacheKey must be null for type: ");
            sb.append(f2);
            d0.d(b, sb.toString());
        }
        this.f = f;
        this.g = g;
        this.h = h;
        final ArrayList<Comparable> list2 = new ArrayList<Comparable>((Collection<? extends Comparable>)list);
        Collections.sort(list2);
        this.i = Collections.unmodifiableList((List<? extends o>)list2);
        byte[] copy;
        if (array != null) {
            copy = Arrays.copyOf(array, array.length);
        }
        else {
            copy = null;
        }
        this.j = copy;
        this.k = k;
        byte[] l;
        if (array2 != null) {
            l = Arrays.copyOf(array2, array2.length);
        }
        else {
            l = c0.f;
        }
        this.l = l;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof DownloadRequest;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final DownloadRequest downloadRequest = (DownloadRequest)o;
        boolean b3 = b2;
        if (this.f.equals(downloadRequest.f)) {
            b3 = b2;
            if (this.g.equals((Object)downloadRequest.g)) {
                b3 = b2;
                if (c0.a(this.h, downloadRequest.h)) {
                    b3 = b2;
                    if (this.i.equals(downloadRequest.i)) {
                        b3 = b2;
                        if (Arrays.equals(this.j, downloadRequest.j)) {
                            b3 = b2;
                            if (c0.a(this.k, downloadRequest.k)) {
                                b3 = b2;
                                if (Arrays.equals(this.l, downloadRequest.l)) {
                                    b3 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.f.hashCode();
        final int hashCode2 = this.g.hashCode();
        final String h = this.h;
        int hashCode3 = 0;
        int hashCode4;
        if (h != null) {
            hashCode4 = h.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int hashCode5 = this.i.hashCode();
        final int hashCode6 = Arrays.hashCode(this.j);
        final String k = this.k;
        if (k != null) {
            hashCode3 = k.hashCode();
        }
        return Arrays.hashCode(this.l) + ((hashCode6 + (hashCode5 + ((hashCode2 + hashCode * 31 * 31) * 31 + hashCode4) * 31) * 31) * 31 + hashCode3) * 31;
    }
    
    @Override
    public final String toString() {
        final String h = this.h;
        final String f = this.f;
        return a.j(e.h(f, e.h(h, 1)), h, ":", f);
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.g.toString());
        parcel.writeString(this.h);
        parcel.writeInt(this.i.size());
        for (i = 0; i < this.i.size(); ++i) {
            parcel.writeParcelable((Parcelable)this.i.get(i), 0);
        }
        parcel.writeByteArray(this.j);
        parcel.writeString(this.k);
        parcel.writeByteArray(this.l);
    }
    
    public static class UnsupportedRequestException extends IOException
    {
    }
    
    public static final class b
    {
        public final String a;
        public final Uri b;
        public String c;
        public List<o> d;
        public byte[] e;
        public String f;
        public byte[] g;
        
        public b(final String a, final Uri b) {
            this.a = a;
            this.b = b;
        }
        
        public final DownloadRequest a() {
            final String a = this.a;
            final Uri b = this.b;
            final String c = this.c;
            Object o = this.d;
            if (o == null) {
                o = ImmutableList.of();
            }
            return new DownloadRequest(a, b, c, (List<o>)o, this.e, this.f, this.g);
        }
    }
}
