// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import android.content.Context;
import java.util.Observer;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.Observable;

public abstract class cl extends Observable
{
    public long AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final Runnable AFKeystoreWrapper;
    public a valueOf;
    public final Map<String, Object> values;
    
    static {
        Covode.recordClassIndex(2677);
    }
    
    public cl(final String afInAppEventType, final Runnable afKeystoreWrapper) {
        this.values = new HashMap<String, Object>();
        this.valueOf = a.AFInAppEventType;
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.AFInAppEventType = afInAppEventType;
    }
    
    public final void AFInAppEventType() {
        this.AFInAppEventParameterName = System.currentTimeMillis();
        this.valueOf = a.valueOf;
        this.addObserver(new Observer() {
            static {
                Covode.recordClassIndex(2678);
            }
            
            @Override
            public final void update(final Observable observable, final Object o) {
                cl.this.AFKeystoreWrapper.run();
            }
        });
    }
    
    public final void AFKeystoreWrapper() {
        this.values.put("source", this.AFInAppEventType);
        this.values.putAll(new ci());
        this.values.put("latency", System.currentTimeMillis() - this.AFInAppEventParameterName);
        this.valueOf = a.values;
        this.setChanged();
        this.notifyObservers();
    }
    
    public abstract void AFKeystoreWrapper(final Context p0);
    
    public enum a
    {
        AFInAppEventType, 
        valueOf, 
        values;
        
        static {
            Covode.recordClassIndex(2679);
        }
    }
}
