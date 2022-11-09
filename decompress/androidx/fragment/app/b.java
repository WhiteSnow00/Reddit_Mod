// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.util.List;
import android.text.TextUtils;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class b implements Parcelable
{
    public static final Parcelable$Creator<b> CREATOR;
    public final int[] f;
    public final ArrayList<String> g;
    public final int[] h;
    public final int[] i;
    public final int j;
    public final String k;
    public final int l;
    public final int m;
    public final CharSequence n;
    public final int o;
    public final CharSequence p;
    public final ArrayList<String> q;
    public final ArrayList<String> r;
    public final boolean s;
    
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
    
    public b(final Parcel parcel) {
        this.f = parcel.createIntArray();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createIntArray();
        this.i = parcel.createIntArray();
        this.j = parcel.readInt();
        this.k = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.o = parcel.readInt();
        this.p = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.q = parcel.createStringArrayList();
        this.r = parcel.createStringArrayList();
        this.s = (parcel.readInt() != 0);
    }
    
    public b(final a a) {
        final int size = a.a.size();
        this.f = new int[size * 6];
        if (a.g) {
            this.g = new ArrayList<String>(size);
            this.h = new int[size];
            this.i = new int[size];
            int i = 0;
            int n = 0;
            while (i < size) {
                final n0.a a2 = a.a.get(i);
                final int[] f = this.f;
                final int n2 = n + 1;
                f[n] = a2.a;
                final ArrayList<String> g = this.g;
                final Fragment b = a2.b;
                String mWho;
                if (b != null) {
                    mWho = b.mWho;
                }
                else {
                    mWho = null;
                }
                g.add(mWho);
                final int[] f2 = this.f;
                final int n3 = n2 + 1;
                f2[n2] = (a2.c ? 1 : 0);
                final int n4 = n3 + 1;
                f2[n3] = a2.d;
                final int n5 = n4 + 1;
                f2[n4] = a2.e;
                final int n6 = n5 + 1;
                f2[n5] = a2.f;
                f2[n6] = a2.g;
                this.h[i] = a2.h.ordinal();
                this.i[i] = a2.i.ordinal();
                ++i;
                n = n6 + 1;
            }
            this.j = a.f;
            this.k = a.i;
            this.l = a.s;
            this.m = a.j;
            this.n = a.k;
            this.o = a.l;
            this.p = a.m;
            this.q = a.n;
            this.r = a.o;
            this.s = a.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeIntArray(this.f);
        parcel.writeStringList((List)this.g);
        parcel.writeIntArray(this.h);
        parcel.writeIntArray(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        TextUtils.writeToParcel(this.n, parcel, 0);
        parcel.writeInt(this.o);
        TextUtils.writeToParcel(this.p, parcel, 0);
        parcel.writeStringList((List)this.q);
        parcel.writeStringList((List)this.r);
        parcel.writeInt((int)(this.s ? 1 : 0));
    }
}
