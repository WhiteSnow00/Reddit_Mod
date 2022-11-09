// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.util.List;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class FragmentManagerState implements Parcelable
{
    public static final Parcelable$Creator<FragmentManagerState> CREATOR;
    public ArrayList<FragmentState> LIZ;
    public ArrayList<String> LIZIZ;
    public BackStackState[] LIZJ;
    public String LIZLLL;
    public int LJ;
    
    static {
        Covode.recordClassIndex(1041);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<FragmentManagerState>() {
            static {
                Covode.recordClassIndex(1042);
            }
        };
    }
    
    public FragmentManagerState() {
    }
    
    public FragmentManagerState(final Parcel parcel) {
        this.LIZ = parcel.createTypedArrayList((Parcelable$Creator)FragmentState.CREATOR);
        this.LIZIZ = parcel.createStringArrayList();
        this.LIZJ = (BackStackState[])parcel.createTypedArray((Parcelable$Creator)BackStackState.CREATOR);
        this.LIZLLL = parcel.readString();
        this.LJ = parcel.readInt();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeTypedList((List)this.LIZ);
        parcel.writeStringList((List)this.LIZIZ);
        parcel.writeTypedArray((Parcelable[])this.LIZJ, n);
        parcel.writeString(this.LIZLLL);
        parcel.writeInt(this.LJ);
    }
}
