// 
// Decompiled by Procyon v0.6.0
// 

package xb;

import java.util.Collections;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

public final class f extends b
{
    public static final Parcelable$Creator<f> CREATOR;
    public final List<f.f$c> f;
    
    static {
        CREATOR = (Parcelable$Creator)new f$a();
    }
    
    public f(final Parcel parcel) {
        final int int1 = parcel.readInt();
        final ArrayList list = new ArrayList<f.f$c>(int1);
        for (int i = 0; i < int1; ++i) {
            list.add(new f.f$c(parcel));
        }
        this.f = Collections.unmodifiableList((List<? extends f.f$c>)list);
    }
    
    public f(final ArrayList list) {
        this.f = Collections.unmodifiableList((List<? extends f.f$c>)list);
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        final int size = this.f.size();
        parcel.writeInt(size);
        f.f$c f$c;
        int size2;
        int j;
        f.f$b f$b;
        for (i = 0; i < size; ++i) {
            f$c = this.f.get(i);
            parcel.writeLong(f$c.a);
            parcel.writeByte((byte)(byte)(f$c.b ? 1 : 0));
            parcel.writeByte((byte)(byte)(f$c.c ? 1 : 0));
            parcel.writeByte((byte)(byte)(f$c.d ? 1 : 0));
            size2 = f$c.f.size();
            parcel.writeInt(size2);
            for (j = 0; j < size2; ++j) {
                f$b = f$c.f.get(j);
                parcel.writeInt(f$b.a);
                parcel.writeLong(f$b.b);
            }
            parcel.writeLong(f$c.e);
            parcel.writeByte((byte)(byte)(f$c.g ? 1 : 0));
            parcel.writeLong(f$c.h);
            parcel.writeInt(f$c.i);
            parcel.writeInt(f$c.j);
            parcel.writeInt(f$c.k);
        }
    }
}
