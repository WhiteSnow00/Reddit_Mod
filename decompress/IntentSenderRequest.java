// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity.result;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class IntentSenderRequest implements Parcelable
{
    public static final Parcelable$Creator<IntentSenderRequest> CREATOR;
    public final IntentSender LIZ;
    public final Intent LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    
    static {
        Covode.recordClassIndex(223);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<IntentSenderRequest>() {
            static {
                Covode.recordClassIndex(224);
            }
        };
    }
    
    public IntentSenderRequest(final Parcel parcel) {
        this.LIZ = (IntentSender)parcel.readParcelable(IntentSender.class.getClassLoader());
        this.LIZIZ = (Intent)parcel.readParcelable(Intent.class.getClassLoader());
        this.LIZJ = parcel.readInt();
        this.LIZLLL = parcel.readInt();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.LIZ, n);
        parcel.writeParcelable((Parcelable)this.LIZIZ, n);
        parcel.writeInt(this.LIZJ);
        parcel.writeInt(this.LIZLLL);
    }
}
