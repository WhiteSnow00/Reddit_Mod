// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity.result;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import android.content.Intent;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class ActivityResult implements Parcelable
{
    public static final Parcelable$Creator<ActivityResult> CREATOR;
    public final int LIZ;
    public final Intent LIZIZ;
    
    static {
        Covode.recordClassIndex(220);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ActivityResult>() {
            static {
                Covode.recordClassIndex(221);
            }
        };
    }
    
    public ActivityResult(final int liz, final Intent liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public ActivityResult(final Parcel parcel) {
        this.LIZ = parcel.readInt();
        Intent liziz;
        if (parcel.readInt() == 0) {
            liziz = null;
        }
        else {
            liziz = (Intent)Intent.CREATOR.createFromParcel(parcel);
        }
        this.LIZIZ = liziz;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        final int liz = this.LIZ;
        String value;
        if (liz != -1) {
            if (liz != 0) {
                value = String.valueOf(liz);
            }
            else {
                value = "RESULT_CANCELED";
            }
        }
        else {
            value = "RESULT_OK";
        }
        sb.append(value);
        sb.append(", data=");
        sb.append(this.LIZIZ);
        sb.append('}');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.LIZ);
        int n2;
        if (this.LIZIZ == null) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        parcel.writeInt(n2);
        final Intent liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.writeToParcel(parcel, n);
        }
    }
}
