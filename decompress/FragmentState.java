// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import X.0CC;
import X.0A7;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class FragmentState implements Parcelable
{
    public static final Parcelable$Creator<FragmentState> CREATOR;
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final Bundle LJIIIZ;
    public final boolean LJIIJ;
    public final int LJIIJJI;
    public Bundle LJIIL;
    public Fragment LJIILIIL;
    
    static {
        Covode.recordClassIndex(1045);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<FragmentState>() {
            static {
                Covode.recordClassIndex(1046);
            }
        };
    }
    
    public FragmentState(final Parcel parcel) {
        this.LIZ = parcel.readString();
        this.LIZIZ = parcel.readString();
        final int int1 = parcel.readInt();
        final boolean b = true;
        this.LIZJ = (int1 != 0);
        this.LIZLLL = parcel.readInt();
        this.LJ = parcel.readInt();
        this.LJFF = parcel.readString();
        this.LJI = (parcel.readInt() != 0);
        this.LJII = (parcel.readInt() != 0);
        this.LJIIIIZZ = (parcel.readInt() != 0);
        this.LJIIIZ = parcel.readBundle();
        this.LJIIJ = (parcel.readInt() != 0 && b);
        this.LJIIL = parcel.readBundle();
        this.LJIIJJI = parcel.readInt();
    }
    
    public FragmentState(final Fragment fragment) {
        this.LIZ = fragment.getClass().getName();
        this.LIZIZ = fragment.mWho;
        this.LIZJ = fragment.mFromLayout;
        this.LIZLLL = fragment.mFragmentId;
        this.LJ = fragment.mContainerId;
        this.LJFF = fragment.mTag;
        this.LJI = fragment.mRetainInstance;
        this.LJII = fragment.mRemoving;
        this.LJIIIIZZ = fragment.mDetached;
        this.LJIIIZ = fragment.mArguments;
        this.LJIIJ = fragment.mHidden;
        this.LJIIJJI = fragment.mMaxState.ordinal();
    }
    
    public final Fragment LIZ(final ClassLoader classLoader, final 0A7 0a7) {
        if (this.LJIILIIL == null) {
            final Bundle ljiiiz = this.LJIIIZ;
            if (ljiiiz != null) {
                ljiiiz.setClassLoader(classLoader);
            }
            (this.LJIILIIL = 0a7.LIZJ(classLoader, this.LIZ)).setArguments(this.LJIIIZ);
            final Bundle ljiil = this.LJIIL;
            if (ljiil != null) {
                ljiil.setClassLoader(classLoader);
                this.LJIILIIL.mSavedFragmentState = this.LJIIL;
            }
            else {
                this.LJIILIIL.mSavedFragmentState = new Bundle();
            }
            this.LJIILIIL.mWho = this.LIZIZ;
            this.LJIILIIL.mFromLayout = this.LIZJ;
            this.LJIILIIL.mRestored = true;
            this.LJIILIIL.mFragmentId = this.LIZLLL;
            this.LJIILIIL.mContainerId = this.LJ;
            this.LJIILIIL.mTag = this.LJFF;
            this.LJIILIIL.mRetainInstance = this.LJI;
            this.LJIILIIL.mRemoving = this.LJII;
            this.LJIILIIL.mDetached = this.LJIIIIZZ;
            this.LJIILIIL.mHidden = this.LJIIJ;
            this.LJIILIIL.mMaxState = 0CC.b.values()[this.LJIIJJI];
        }
        return this.LJIILIIL;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.LIZ);
        sb.append(" (");
        sb.append(this.LIZIZ);
        sb.append(")}:");
        if (this.LIZJ) {
            sb.append(" fromLayout");
        }
        if (this.LJ != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.LJ));
        }
        final String ljff = this.LJFF;
        if (ljff != null && !ljff.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.LJFF);
        }
        if (this.LJI) {
            sb.append(" retainInstance");
        }
        if (this.LJII) {
            sb.append(" removing");
        }
        if (this.LJIIIIZZ) {
            sb.append(" detached");
        }
        if (this.LJIIJ) {
            sb.append(" hidden");
        }
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.LIZ);
        parcel.writeString(this.LIZIZ);
        parcel.writeInt((int)(this.LIZJ ? 1 : 0));
        parcel.writeInt(this.LIZLLL);
        parcel.writeInt(this.LJ);
        parcel.writeString(this.LJFF);
        parcel.writeInt((int)(this.LJI ? 1 : 0));
        parcel.writeInt((int)(this.LJII ? 1 : 0));
        parcel.writeInt((int)(this.LJIIIIZZ ? 1 : 0));
        parcel.writeBundle(this.LJIIIZ);
        parcel.writeInt((int)(this.LJIIJ ? 1 : 0));
        parcel.writeBundle(this.LJIIL);
        parcel.writeInt(this.LJIIJJI);
    }
}
