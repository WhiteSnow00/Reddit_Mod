// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.util.List;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class f0 implements Parcelable
{
    public static final Parcelable$Creator<f0> CREATOR;
    public ArrayList<String> f;
    public ArrayList<String> g;
    public b[] h;
    public int i;
    public String j;
    public ArrayList<String> k;
    public ArrayList<c> l;
    public ArrayList<d0.l> m;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<f0>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new f0(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new f0[n];
            }
        };
    }
    
    public f0() {
        this.j = null;
        this.k = new ArrayList<String>();
        this.l = new ArrayList<c>();
    }
    
    public f0(final Parcel parcel) {
        this.j = null;
        this.k = new ArrayList<String>();
        this.l = new ArrayList<c>();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createStringArrayList();
        this.h = (b[])parcel.createTypedArray((Parcelable$Creator)b.CREATOR);
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.createStringArrayList();
        this.l = parcel.createTypedArrayList((Parcelable$Creator)c.CREATOR);
        this.m = parcel.createTypedArrayList((Parcelable$Creator)d0.l.CREATOR);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeStringList((List)this.f);
        parcel.writeStringList((List)this.g);
        parcel.writeTypedArray((Parcelable[])this.h, n);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeStringList((List)this.k);
        parcel.writeTypedList((List)this.l);
        parcel.writeTypedList((List)this.m);
    }
}
