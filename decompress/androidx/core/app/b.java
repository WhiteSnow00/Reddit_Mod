// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.os.BaseBundle;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import android.os.Bundle;

public final class b
{
    public static final Object a;
    public static final Object b;
    
    static {
        a = new Object();
        b = new Object();
    }
    
    public static RemoteInput[] a(final Bundle[] array) {
        if (array == null) {
            return null;
        }
        final RemoteInput[] array2 = new RemoteInput[array.length];
        for (int i = 0; i < array.length; ++i) {
            final Bundle bundle = array[i];
            final ArrayList stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            final HashSet<String> set = new HashSet<String>();
            if (stringArrayList != null) {
                final Iterator iterator = stringArrayList.iterator();
                while (iterator.hasNext()) {
                    set.add((String)iterator.next());
                }
            }
            array2[i] = new RemoteInput(((BaseBundle)bundle).getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), ((BaseBundle)bundle).getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), set);
        }
        return array2;
    }
    
    public static Bundle[] b(final Bundle bundle, final String s) {
        final Parcelable[] parcelableArray = bundle.getParcelableArray(s);
        if (!(parcelableArray instanceof Bundle[]) && parcelableArray != null) {
            final Bundle[] array = Arrays.copyOf(parcelableArray, parcelableArray.length, (Class<? extends Bundle[]>)Bundle[].class);
            bundle.putParcelableArray(s, (Parcelable[])array);
            return array;
        }
        return (Bundle[])parcelableArray;
    }
}
