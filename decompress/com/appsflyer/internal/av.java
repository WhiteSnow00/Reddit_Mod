// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import X.0Ly;
import java.util.Iterator;
import java.io.IOException;
import com.appsflyer.AFLogger;
import java.util.Collections;
import org.json.JSONObject;
import java.util.ArrayList;
import android.os.Build$VERSION;
import android.content.Context;
import java.lang.ref.WeakReference;
import com.appsflyer.AppsFlyerProperties;
import java.util.HashMap;
import com.android.billingclient.api.Purchase;
import java.util.Map;
import java.util.List;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import X.0Lx;

public final class av implements Runnable
{
    public bh AFInAppEventParameterName;
    public 0Lx AFInAppEventType;
    public final bd AFKeystoreWrapper;
    public final bg AFVersionDeclaration;
    public final ba valueOf;
    public final ExecutorService values;
    
    static {
        Covode.recordClassIndex(2623);
    }
    
    public av(final bd afKeystoreWrapper, final bh afInAppEventParameterName, final ba valueOf, final ExecutorService values, final bg afVersionDeclaration) {
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.AFInAppEventParameterName = afInAppEventParameterName;
        this.valueOf = valueOf;
        this.values = values;
        this.AFVersionDeclaration = afVersionDeclaration;
    }
    
    @Override
    public final void run() {
        try {
            if (this.AFInAppEventType == null) {
                final bh afInAppEventParameterName = this.AFInAppEventParameterName;
                final at liziz = new at(this);
                final 0Lx.a liz = 0Lx.LIZ(afInAppEventParameterName.values);
                liz.LIZIZ = liziz;
                liz.LIZ = true;
                (this.AFInAppEventType = liz.LIZ()).LIZ(new aw(this));
            }
        }
        finally {
            final Throwable t;
            if (t instanceof NoSuchMethodError || t instanceof NoClassDefFoundError) {
                AFLogger.AFLogger$LogLevel("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.values("Failed to setup Play billing", t);
        }
    }
}
