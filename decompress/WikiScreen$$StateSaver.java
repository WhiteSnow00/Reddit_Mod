// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.wiki.wiki;

import android.os.Parcelable;
import com.reddit.events.deeplink.DeepLinkAnalytics;
import android.os.Bundle;
import java.util.Map;
import com.evernote.android.state.InjectionHelper;
import com.evernote.android.state.Bundler;
import java.util.HashMap;
import com.evernote.android.state.Injector;

public class WikiScreen$$StateSaver<T extends WikiScreen> extends Object<T>
{
    private static final HashMap<String, Bundler<?>> BUNDLERS;
    private static final InjectionHelper HELPER;
    
    static {
        HELPER = new InjectionHelper("com.reddit.wiki.wiki.WikiScreen$$StateSaver", (Map)(BUNDLERS = new HashMap<String, Bundler<?>>()));
    }
    
    public void restore(final T t, final Bundle bundle) {
        t.ki((DeepLinkAnalytics)WikiScreen$$StateSaver.HELPER.getParcelable(bundle, "DeepLinkAnalytics"));
    }
    
    public void save(final T t, final Bundle bundle) {
        WikiScreen$$StateSaver.HELPER.putParcelable(bundle, "DeepLinkAnalytics", (Parcelable)t.Ha());
    }
}
