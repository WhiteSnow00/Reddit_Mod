// 
// Decompiled by Procyon v0.6.0
// 

package w5;

import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.reflect.Method;
import android.os.Parcel;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;

public final class b extends VersionedParcel
{
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;
    
    public b(final Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new j0.b<String, Method>(), new j0.b<String, Method>(), new j0.b<String, Class>());
    }
    
    public b(final Parcel e, final int n, final int g, final String h, final j0.b<String, Method> b, final j0.b<String, Method> b2, final j0.b<String, Class> b3) {
        super((j0.b)b, (j0.b)b2, (j0.b)b3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = e;
        this.f = n;
        this.g = g;
        this.j = n;
        this.h = h;
    }
    
    public final b a() {
        final Parcel e = this.e;
        final int dataPosition = e.dataPosition();
        int n;
        if ((n = this.j) == this.f) {
            n = this.g;
        }
        return new b(e, dataPosition, n, a.o(new StringBuilder(), this.h, "  "), super.a, super.b, super.c);
    }
    
    public final boolean e() {
        return this.e.readInt() != 0;
    }
    
    public final byte[] f() {
        final int int1 = this.e.readInt();
        if (int1 < 0) {
            return null;
        }
        final byte[] array = new byte[int1];
        this.e.readByteArray(array);
        return array;
    }
    
    public final CharSequence g() {
        return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }
    
    public final boolean h(final int n) {
        while (true) {
            final int j = this.j;
            final int g = this.g;
            boolean b = true;
            if (j >= g) {
                if (this.k != n) {
                    b = false;
                }
                return b;
            }
            final int k = this.k;
            if (k == n) {
                return true;
            }
            if (String.valueOf(k).compareTo(String.valueOf(n)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            final int int1 = this.e.readInt();
            this.k = this.e.readInt();
            this.j += int1;
        }
    }
    
    public final int i() {
        return this.e.readInt();
    }
    
    public final <T extends Parcelable> T k() {
        return (T)this.e.readParcelable(b.class.getClassLoader());
    }
    
    public final String m() {
        return this.e.readString();
    }
    
    public final void o(final int i) {
        this.x();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        this.s(0);
        this.s(i);
    }
    
    public final void p(final boolean b) {
        this.e.writeInt((int)(b ? 1 : 0));
    }
    
    public final void q(final byte[] array) {
        if (array != null) {
            this.e.writeInt(array.length);
            this.e.writeByteArray(array);
        }
        else {
            this.e.writeInt(-1);
        }
    }
    
    public final void r(final CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }
    
    public final void s(final int n) {
        this.e.writeInt(n);
    }
    
    public final void u(final Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }
    
    public final void v(final String s) {
        this.e.writeString(s);
    }
    
    public final void x() {
        final int i = this.i;
        if (i >= 0) {
            final int value = this.d.get(i);
            final int dataPosition = this.e.dataPosition();
            this.e.setDataPosition(value);
            this.e.writeInt(dataPosition - value);
            this.e.setDataPosition(dataPosition);
        }
    }
}
