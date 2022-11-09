// 
// Decompiled by Procyon v0.6.0
// 

package xf;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Bundle;
import j0.i;
import android.os.Parcelable$Creator;

public final class a extends h4.a
{
    public static final Parcelable$Creator<a> CREATOR;
    public final i<String, Bundle> h;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<a>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new a(parcel, null);
            }
            
            public final Object createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
            
            public final Object[] newArray(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        final int int1 = parcel.readInt();
        final String[] array = new String[int1];
        parcel.readStringArray(array);
        final Bundle[] array2 = new Bundle[int1];
        parcel.readTypedArray((Object[])array2, Bundle.CREATOR);
        this.h = (i<String, Bundle>)new i(int1);
        for (int i = 0; i < int1; ++i) {
            this.h.put((Object)array[i], (Object)array2[i]);
        }
    }
    
    public a(final Parcelable parcelable) {
        super(parcelable);
        this.h = (i<String, Bundle>)new i();
    }
    
    public final String toString() {
        final StringBuilder k = a.k("ExtendableSavedState{");
        k.append(Integer.toHexString(System.identityHashCode(this)));
        k.append(" states=");
        k.append(this.h);
        k.append("}");
        return k.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        parcel.writeParcelable(super.f, i);
        final int h = this.h.h;
        parcel.writeInt(h);
        final String[] array = new String[h];
        final Bundle[] array2 = new Bundle[h];
        for (i = 0; i < h; ++i) {
            array[i] = (String)this.h.j(i);
            array2[i] = (Bundle)this.h.n(i);
        }
        parcel.writeStringArray(array);
        parcel.writeTypedArray((Parcelable[])array2, 0);
    }
}
