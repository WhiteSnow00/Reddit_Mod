// 
// Decompiled by Procyon v0.6.0
// 

package com.evernote.android.state.bundlers;

import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.List;
import com.evernote.android.state.Bundler;

public class BundlerListString implements Bundler<List<String>>
{
    public List<String> get(final String s, final Bundle bundle) {
        return bundle.getStringArrayList(s);
    }
    
    public void put(final String s, final List<String> list, final Bundle bundle) {
        ArrayList list2;
        if (list instanceof ArrayList) {
            list2 = (ArrayList)list;
        }
        else {
            list2 = new ArrayList((Collection<? extends E>)list);
        }
        bundle.putStringArrayList(s, list2);
    }
}
