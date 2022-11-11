// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import android.os.Parcelable;
import androidx.fragment.app.FragmentState;
import androidx.fragment.app.FragmentManagerState;
import android.os.Parcel;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class 0A4
{
    static {
        Covode.recordClassIndex(1061);
    }
    
    public static void LIZ(final Bundle bundle, final Class<?> clazz, final String s) {
        final Parcelable parcelable = bundle.getParcelable(s);
        if (parcelable == null) {
            return;
        }
        Object obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel((Parcel)obtain, 0);
            ((Parcel)obtain).setDataPosition(0);
            final FragmentManagerState fragmentManagerState = (FragmentManagerState)FragmentManagerState.CREATOR.createFromParcel((Parcel)obtain);
            ((Parcel)obtain).recycle();
            if (fragmentManagerState != null && fragmentManagerState.LIZ != null) {
                if (fragmentManagerState.LIZ.size() != 0) {
                    try {
                        final Iterator<FragmentState> iterator = fragmentManagerState.LIZ.iterator();
                        while (iterator.hasNext()) {
                            obtain = iterator.next();
                            if (obtain != null && !clazz.isAssignableFrom(Class.forName(((FragmentState)obtain).LIZ))) {
                                bundle.putParcelable(s, (Parcelable)null);
                                break;
                            }
                        }
                    }
                    catch (final ClassNotFoundException ex) {
                        bundle.putParcelable(s, (Parcelable)null);
                    }
                }
            }
        }
        catch (final IllegalStateException ex2) {
            ((Parcel)obtain).recycle();
        }
        finally {
            ((Parcel)obtain).recycle();
        }
    }
}
