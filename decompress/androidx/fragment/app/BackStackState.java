// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.util.List;
import X.0CC;
import android.text.TextUtils;
import X.0AO;
import X.159;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class BackStackState implements Parcelable
{
    public static final Parcelable$Creator<BackStackState> CREATOR;
    public final int[] LIZ;
    public final ArrayList<String> LIZIZ;
    public final int[] LIZJ;
    public final int[] LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final String LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final CharSequence LJIIIZ;
    public final int LJIIJ;
    public final CharSequence LJIIJJI;
    public final ArrayList<String> LJIIL;
    public final ArrayList<String> LJIILIIL;
    public final boolean LJIILJJIL;
    
    static {
        Covode.recordClassIndex(1027);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<BackStackState>() {
            static {
                Covode.recordClassIndex(1028);
            }
        };
    }
    
    public BackStackState(final 159 159) {
        final int size = 159.LIZLLL.size();
        this.LIZ = new int[size * 5];
        if (159.LJIIJ) {
            this.LIZIZ = new ArrayList<String>(size);
            this.LIZJ = new int[size];
            this.LIZLLL = new int[size];
            int i = 0;
            int n = 0;
            while (i < size) {
                final 0AO.a a = 159.LIZLLL.get(i);
                final int[] liz = this.LIZ;
                final int n2 = n + 1;
                liz[n] = a.LIZ;
                final ArrayList<String> liziz = this.LIZIZ;
                String mWho;
                if (a.LIZIZ != null) {
                    mWho = a.LIZIZ.mWho;
                }
                else {
                    mWho = null;
                }
                liziz.add(mWho);
                final int[] liz2 = this.LIZ;
                final int n3 = n2 + 1;
                liz2[n2] = a.LIZJ;
                final int[] liz3 = this.LIZ;
                final int n4 = n3 + 1;
                liz3[n3] = a.LIZLLL;
                final int[] liz4 = this.LIZ;
                final int n5 = n4 + 1;
                liz4[n4] = a.LJ;
                final int[] liz5 = this.LIZ;
                n = n5 + 1;
                liz5[n5] = a.LJFF;
                this.LIZJ[i] = a.LJI.ordinal();
                this.LIZLLL[i] = a.LJII.ordinal();
                ++i;
            }
            this.LJ = 159.LJIIIIZZ;
            this.LJFF = 159.LJIIIZ;
            this.LJI = 159.LJIIL;
            this.LJII = 159.LIZJ;
            this.LJIIIIZZ = 159.LJIILIIL;
            this.LJIIIZ = 159.LJIILJJIL;
            this.LJIIJ = 159.LJIILL;
            this.LJIIJJI = 159.LJIILLIIL;
            this.LJIIL = 159.LJIIZILJ;
            this.LJIILIIL = 159.LJIJ;
            this.LJIILJJIL = 159.LJIJI;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
    
    public BackStackState(final Parcel parcel) {
        this.LIZ = parcel.createIntArray();
        this.LIZIZ = parcel.createStringArrayList();
        this.LIZJ = parcel.createIntArray();
        this.LIZLLL = parcel.createIntArray();
        this.LJ = parcel.readInt();
        this.LJFF = parcel.readInt();
        this.LJI = parcel.readString();
        this.LJII = parcel.readInt();
        this.LJIIIIZZ = parcel.readInt();
        this.LJIIIZ = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LJIIJ = parcel.readInt();
        this.LJIIJJI = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LJIIL = parcel.createStringArrayList();
        this.LJIILIIL = parcel.createStringArrayList();
        this.LJIILJJIL = (parcel.readInt() != 0);
    }
    
    public final 159 LIZ(final m m) {
        final 159 159 = new 159(m);
        int i = 0;
        int n = 0;
        while (i < this.LIZ.length) {
            final 0AO.a a = new 0AO.a();
            final int[] liz = this.LIZ;
            final int n2 = i + 1;
            a.LIZ = liz[i];
            final String value = this.LIZIZ.get(n);
            if (value != null) {
                a.LIZIZ = m.LJII.get(value);
            }
            else {
                a.LIZIZ = null;
            }
            a.LJI = 0CC.b.values()[this.LIZJ[n]];
            a.LJII = 0CC.b.values()[this.LIZLLL[n]];
            final int[] liz2 = this.LIZ;
            final int n3 = n2 + 1;
            a.LIZJ = liz2[n2];
            final int[] liz3 = this.LIZ;
            final int n4 = n3 + 1;
            a.LIZLLL = liz3[n3];
            final int[] liz4 = this.LIZ;
            final int n5 = n4 + 1;
            a.LJ = liz4[n4];
            final int[] liz5 = this.LIZ;
            i = n5 + 1;
            a.LJFF = liz5[n5];
            159.LJ = a.LIZJ;
            159.LJFF = a.LIZLLL;
            159.LJI = a.LJ;
            159.LJII = a.LJFF;
            159.LIZIZ(a);
            ++n;
        }
        159.LJIIIIZZ = this.LJ;
        159.LJIIIZ = this.LJFF;
        159.LJIIL = this.LJI;
        159.LIZJ = this.LJII;
        159.LJIIJ = true;
        159.LJIILIIL = this.LJIIIIZZ;
        159.LJIILJJIL = this.LJIIIZ;
        159.LJIILL = this.LJIIJ;
        159.LJIILLIIL = this.LJIIJJI;
        159.LJIIZILJ = this.LJIIL;
        159.LJIJ = this.LJIILIIL;
        159.LJIJI = this.LJIILJJIL;
        159.LIZ(1);
        return 159;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeIntArray(this.LIZ);
        parcel.writeStringList((List)this.LIZIZ);
        parcel.writeIntArray(this.LIZJ);
        parcel.writeIntArray(this.LIZLLL);
        parcel.writeInt(this.LJ);
        parcel.writeInt(this.LJFF);
        parcel.writeString(this.LJI);
        parcel.writeInt(this.LJII);
        parcel.writeInt(this.LJIIIIZZ);
        TextUtils.writeToParcel(this.LJIIIZ, parcel, 0);
        parcel.writeInt(this.LJIIJ);
        TextUtils.writeToParcel(this.LJIIJJI, parcel, 0);
        parcel.writeStringList((List)this.LJIIL);
        parcel.writeStringList((List)this.LJIILIIL);
        parcel.writeInt((int)(this.LJIILJJIL ? 1 : 0));
    }
}
