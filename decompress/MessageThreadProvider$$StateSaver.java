// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.datalibrary.frontpage.data.provider;

import android.os.Bundle;
import java.util.Map;
import com.evernote.android.state.InjectionHelper;
import com.evernote.android.state.Bundler;
import java.util.HashMap;
import com.evernote.android.state.Injector;

public class MessageThreadProvider$$StateSaver<T extends MessageThreadProvider> extends Object<T>
{
    private static final HashMap<String, Bundler<?>> BUNDLERS;
    private static final InjectionHelper HELPER;
    
    static {
        HELPER = new InjectionHelper("com.reddit.datalibrary.frontpage.data.provider.MessageThreadProvider$$StateSaver", (Map)(BUNDLERS = new HashMap<String, Bundler<?>>()));
    }
    
    public void restore(final T t, final Bundle bundle) {
        t.threadId = MessageThreadProvider$$StateSaver.HELPER.getString(bundle, "threadId");
    }
    
    public void save(final T t, final Bundle bundle) {
        MessageThreadProvider$$StateSaver.HELPER.putString(bundle, "threadId", t.threadId);
    }
}
