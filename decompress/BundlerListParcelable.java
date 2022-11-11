// 
// Decompiled by Procyon v0.6.0
// 

package com.evernote.android.state.bundlers;

import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
import com.evernote.android.state.Bundler;

public class BundlerListParcelable implements Bundler<List<? extends Parcelable>>
{
    public List<? extends Parcelable> get(final String s, final Bundle bundle) {
        return bundle.getParcelableArrayList(s);
    }
    
    public void put(final String s, final List<? extends Parcelable> list, final Bundle bundle) {
        ArrayList list2;
        if (list instanceof ArrayList) {
            list2 = (ArrayList)list;
        }
        else {
            list2 = new ArrayList((Collection<? extends E>)list);
        }
        bundle.putParcelableArrayList(s, list2);
    }
}
