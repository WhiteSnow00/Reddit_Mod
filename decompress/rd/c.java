// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.Parcel;
import mg.d0;
import android.os.Parcelable$Creator;
import android.content.Intent;

public final class c
{
    public static <T extends b> T a(final Intent intent, final String s, final Parcelable$Creator<T> parcelable$Creator) {
        final byte[] byteArrayExtra = intent.getByteArrayExtra(s);
        if (byteArrayExtra == null) {
            return null;
        }
        d0.y((Object)parcelable$Creator);
        final Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
        obtain.setDataPosition(0);
        final b b = (b)parcelable$Creator.createFromParcel(obtain);
        obtain.recycle();
        return (T)b;
    }
}
