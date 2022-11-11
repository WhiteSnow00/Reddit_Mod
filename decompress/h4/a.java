// 
// Decompiled by Procyon v0.6.0
// 

package h4;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public static final a$a g;
    public final Parcelable f;
    
    static {
        g = new a$a();
        CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<a>() {
            public final Object createFromParcel(final Parcel parcel) {
                if (parcel.readParcelable((ClassLoader)null) == null) {
                    return a.g;
                }
                throw new IllegalStateException("superState must be null");
            }
            
            public final Object createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
                if (parcel.readParcelable(classLoader) == null) {
                    return a.g;
                }
                throw new IllegalStateException("superState must be null");
            }
            
            public final Object[] newArray(final int n) {
                return new a[n];
            }
        };
    }
    
    public a() {
        this.f = null;
    }
    
    public a(final Parcel parcel, final ClassLoader classLoader) {
        Object f = parcel.readParcelable(classLoader);
        if (f == null) {
            f = a.g;
        }
        this.f = (Parcelable)f;
    }
    
    public a(Parcelable f) {
        if (f != null) {
            if (f == a.g) {
                f = null;
            }
            this.f = f;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable(this.f, n);
    }
}
