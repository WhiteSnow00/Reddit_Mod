// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.widget.bottomnav;

import java.io.Serializable;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Map;
import com.evernote.android.state.InjectionHelper;
import com.evernote.android.state.Bundler;
import java.util.HashMap;
import com.evernote.android.state.Injector;

public class BottomNavView$$StateSaver<T extends BottomNavView> extends View<T>
{
    private static final HashMap<String, Bundler<?>> BUNDLERS;
    private static final InjectionHelper HELPER;
    
    static {
        HELPER = new InjectionHelper("com.reddit.widget.bottomnav.BottomNavView$$StateSaver", (Map)(BUNDLERS = new HashMap<String, Bundler<?>>()));
    }
    
    public Parcelable restore(final T t, final Parcelable parcelable) {
        final Bundle bundle = (Bundle)parcelable;
        final InjectionHelper helper = BottomNavView$$StateSaver.HELPER;
        t.setSelectedItemType((BottomNavView.Item.Type)helper.getSerializable(bundle, "SelectedItemType"));
        return helper.getParent(bundle);
    }
    
    public Parcelable save(final T t, final Parcelable parcelable) {
        final InjectionHelper helper = BottomNavView$$StateSaver.HELPER;
        final Bundle putParent = helper.putParent(parcelable);
        helper.putSerializable(putParent, "SelectedItemType", (Serializable)t.getSelectedItemType());
        return (Parcelable)putParent;
    }
}
