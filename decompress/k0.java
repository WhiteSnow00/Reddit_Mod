// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class k0 implements Parcelable
{
    public static final Parcelable$Creator<k0> CREATOR;
    public final String f;
    public final String g;
    public final boolean h;
    public final int i;
    public final int j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final Bundle o;
    public final boolean p;
    public final int q;
    public Bundle r;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<k0>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new k0(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new k0[n];
            }
        };
    }
    
    public k0(final Parcel parcel) {
        this.f = parcel.readString();
        this.g = parcel.readString();
        final int int1 = parcel.readInt();
        final boolean b = true;
        this.h = (int1 != 0);
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readString();
        this.l = (parcel.readInt() != 0);
        this.m = (parcel.readInt() != 0);
        this.n = (parcel.readInt() != 0);
        this.o = parcel.readBundle();
        this.p = (parcel.readInt() != 0 && b);
        this.r = parcel.readBundle();
        this.q = parcel.readInt();
    }
    
    public k0(final Fragment fragment) {
        this.f = fragment.getClass().getName();
        this.g = fragment.mWho;
        this.h = fragment.mFromLayout;
        this.i = fragment.mFragmentId;
        this.j = fragment.mContainerId;
        this.k = fragment.mTag;
        this.l = fragment.mRetainInstance;
        this.m = fragment.mRemoving;
        this.n = fragment.mDetached;
        this.o = fragment.mArguments;
        this.p = fragment.mHidden;
        this.q = fragment.mMaxState.ordinal();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f);
        sb.append(" (");
        sb.append(this.g);
        sb.append(")}:");
        if (this.h) {
            sb.append(" fromLayout");
        }
        if (this.j != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.j));
        }
        final String k = this.k;
        if (k != null && !k.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.k);
        }
        if (this.l) {
            sb.append(" retainInstance");
        }
        if (this.m) {
            sb.append(" removing");
        }
        if (this.n) {
            sb.append(" detached");
        }
        if (this.p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt((int)(this.h ? 1 : 0));
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
        parcel.writeInt((int)(this.l ? 1 : 0));
        parcel.writeInt((int)(this.m ? 1 : 0));
        parcel.writeInt((int)(this.n ? 1 : 0));
        parcel.writeBundle(this.o);
        parcel.writeInt((int)(this.p ? 1 : 0));
        parcel.writeBundle(this.r);
        parcel.writeInt(this.q);
    }
}
