// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import android.os.Parcelable;
import java.lang.reflect.Method;
import com.bytedance.covode.number.Covode;
import android.os.Parcel;
import android.util.SparseIntArray;

public final class 17g extends 0GY
{
    public final SparseIntArray LIZLLL;
    public final Parcel LJ;
    public final int LJFF;
    public final int LJI;
    public final String LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    
    static {
        Covode.recordClassIndex(1758);
    }
    
    public 17g(final Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new 13j<String, Method>(), new 13j<String, Method>(), new 13j<String, Class>());
    }
    
    public 17g(final Parcel lj, final int n, final int lji, final String ljii, final 13j<String, Method> 13j, final 13j<String, Method> 13j2, final 13j<String, Class> 13j3) {
        super(13j, 13j2, 13j3);
        this.LIZLLL = new SparseIntArray();
        this.LJIIIIZZ = -1;
        this.LJIIIZ = 0;
        this.LJIIJ = -1;
        this.LJ = lj;
        this.LJFF = n;
        this.LJI = lji;
        this.LJIIIZ = n;
        this.LJII = ljii;
    }
    
    @Override
    public final void LIZ() {
        final int ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz >= 0) {
            final int value = this.LIZLLL.get(ljiiiizz);
            final int dataPosition = this.LJ.dataPosition();
            this.LJ.setDataPosition(value);
            this.LJ.writeInt(dataPosition - value);
            this.LJ.setDataPosition(dataPosition);
        }
    }
    
    @Override
    public final void LIZ(final int n) {
        this.LJ.writeInt(n);
    }
    
    @Override
    public final void LIZ(final Parcelable parcelable) {
        this.LJ.writeParcelable(parcelable, 0);
    }
    
    @Override
    public final void LIZ(final CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.LJ, 0);
    }
    
    @Override
    public final void LIZ(final String s) {
        this.LJ.writeString(s);
    }
    
    @Override
    public final void LIZ(final boolean b) {
        this.LJ.writeInt((int)(b ? 1 : 0));
    }
    
    @Override
    public final void LIZ(final byte[] array) {
        if (array != null) {
            this.LJ.writeInt(array.length);
            this.LJ.writeByteArray(array);
            return;
        }
        this.LJ.writeInt(-1);
    }
    
    @Override
    public final 0GY LIZIZ() {
        final Parcel lj = this.LJ;
        final int dataPosition = lj.dataPosition();
        int n;
        if ((n = this.LJIIIZ) == this.LJFF) {
            n = this.LJI;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.LJII);
        sb.append("  ");
        return new 17g(lj, dataPosition, n, sb.toString(), super.LIZ, super.LIZIZ, super.LIZJ);
    }
    
    @Override
    public final boolean LIZIZ(final int n) {
        while (this.LJIIIZ < this.LJI) {
            final int ljiij = this.LJIIJ;
            if (ljiij == n) {
                return true;
            }
            if (String.valueOf(ljiij).compareTo(String.valueOf(n)) > 0) {
                return false;
            }
            this.LJ.setDataPosition(this.LJIIIZ);
            final int int1 = this.LJ.readInt();
            this.LJIIJ = this.LJ.readInt();
            this.LJIIIZ += int1;
        }
        return this.LJIIJ == n;
    }
    
    @Override
    public final int LIZJ() {
        return this.LJ.readInt();
    }
    
    @Override
    public final void LIZJ(final int ljiiiizz) {
        this.LIZ();
        this.LJIIIIZZ = ljiiiizz;
        this.LIZLLL.put(ljiiiizz, this.LJ.dataPosition());
        this.LIZ(0);
        this.LIZ(ljiiiizz);
    }
    
    @Override
    public final String LIZLLL() {
        return this.LJ.readString();
    }
    
    @Override
    public final byte[] LJ() {
        final int int1 = this.LJ.readInt();
        if (int1 < 0) {
            return null;
        }
        final byte[] array = new byte[int1];
        this.LJ.readByteArray(array);
        return array;
    }
    
    @Override
    public final CharSequence LJFF() {
        return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.LJ);
    }
    
    @Override
    public final <T extends Parcelable> T LJI() {
        return (T)this.LJ.readParcelable(this.getClass().getClassLoader());
    }
    
    @Override
    public final boolean LJII() {
        return this.LJ.readInt() != 0;
    }
}
