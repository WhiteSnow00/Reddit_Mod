// 
// Decompiled by Procyon v0.6.0
// 

package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import com.bytedance.covode.number.Covode;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class AbsSavedState implements Parcelable
{
    public static final Parcelable$Creator<AbsSavedState> CREATOR;
    public static final AbsSavedState LIZJ;
    public final Parcelable LIZLLL;
    
    static {
        Covode.recordClassIndex(933);
        LIZJ = new AbsSavedState() {
            static {
                Covode.recordClassIndex(934);
            }
        };
        CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<AbsSavedState>() {
            static {
                Covode.recordClassIndex(935);
            }
            
            private AbsSavedState LIZ(final Parcel parcel, final ClassLoader classLoader) {
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.LIZJ;
                }
                throw new IllegalStateException("superState must be null");
            }
        };
    }
    
    public AbsSavedState() {
    }
    
    public AbsSavedState(final Parcel parcel, final ClassLoader classLoader) {
        Object lizlll = parcel.readParcelable(classLoader);
        if (lizlll == null) {
            lizlll = AbsSavedState.LIZJ;
        }
        this.LIZLLL = (Parcelable)lizlll;
    }
    
    public AbsSavedState(Parcelable lizlll) {
        if (lizlll != null) {
            if (lizlll == AbsSavedState.LIZJ) {
                lizlll = null;
            }
            this.LIZLLL = lizlll;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable(this.LIZLLL, n);
    }
}
