// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import com.bytedance.covode.number.Covode;

public final class 06c
{
    static {
        Covode.recordClassIndex(734);
    }
    
    public static <T> Parcelable$Creator<T> LIZ(final 06d<T> 06d) {
        return (Parcelable$Creator<T>)new a((06d<Object>)06d);
    }
    
    public static final class a<T> implements Parcelable$ClassLoaderCreator<T>
    {
        public final 06d<T> LIZ;
        
        static {
            Covode.recordClassIndex(735);
        }
        
        public a(final 06d<T> liz) {
            this.LIZ = liz;
        }
        
        public final T createFromParcel(final Parcel parcel) {
            return this.LIZ.LIZ(parcel, null);
        }
        
        public final T createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
            return this.LIZ.LIZ(parcel, classLoader);
        }
        
        public final T[] newArray(final int n) {
            return this.LIZ.LIZ(n);
        }
    }
}
