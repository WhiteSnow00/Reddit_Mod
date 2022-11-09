// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collections;
import X.5WL;
import java.lang.reflect.Field;
import X.6G9;
import X.6Nw;
import X.2Lq;
import android.content.ClipboardManager;
import X.2JT;
import android.os.Build$VERSION;
import X.6uu;
import X.6v3;
import X.6ut;
import X.6v6;
import java.util.concurrent.ExecutorService;
import android.content.Context;
import java.util.Iterator;
import android.hardware.SensorEventListener;
import android.hardware.Sensor;
import X.5an;
import X.5dv;
import X.5aq;
import java.util.List;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import android.hardware.SensorManager;
import java.util.concurrent.Executor;
import android.os.Handler;
import java.util.BitSet;

public final class ab
{
    public static final BitSet AFLogger$LogLevel;
    public static final Handler AppsFlyer2dXConversionCallback;
    public static volatile ab init;
    public final Object AFInAppEventParameterName;
    public final Handler AFInAppEventType;
    public final Runnable AFKeystoreWrapper;
    public final Executor AFVersionDeclaration;
    public final Runnable getLevel;
    public final SensorManager onAppOpenAttributionNative;
    public long onAttributionFailure;
    public final Map<w, Map<String, Object>> onAttributionFailureNative;
    public final Runnable onDeepLinking;
    public final Map<w, w> onDeepLinkingNative;
    public int onInstallConversionDataLoadedNative;
    public boolean onInstallConversionFailureNative;
    public final Runnable valueOf;
    public boolean values;
    
    static {
        Covode.recordClassIndex(2571);
        final BitSet set = AFLogger$LogLevel = new BitSet(6);
        AppsFlyer2dXConversionCallback = new Handler(Looper.getMainLooper());
        set.set(1);
        set.set(2);
        set.set(4);
    }
    
    public ab(final SensorManager onAppOpenAttributionNative, final Handler afInAppEventType) {
        this.AFInAppEventParameterName = new Object();
        final BitSet afLogger$LogLevel = ab.AFLogger$LogLevel;
        this.onDeepLinkingNative = new HashMap<w, w>(afLogger$LogLevel.size());
        this.onAttributionFailureNative = new ConcurrentHashMap<w, Map<String, Object>>(afLogger$LogLevel.size());
        this.valueOf = new Runnable() {
            static {
                Covode.recordClassIndex(2575);
            }
            
            @Override
            public final void run() {
                MethodCollector.i(5185);
                final Object afInAppEventParameterName = ab.this.AFInAppEventParameterName;
                monitorenter(afInAppEventParameterName);
                try {
                    final ab afInAppEventType = ab.this;
                    afInAppEventType.AFVersionDeclaration.execute(new Runnable() {
                        static {
                            Covode.recordClassIndex(2574);
                        }
                        
                        public static List com_appsflyer_internal_ab$3_android_hardware_SensorManager_getSensorList(final SensorManager sensorManager, final int n) {
                            final 5an liz = new 5aq().LIZ(100702, "android/hardware/SensorManager", "getSensorList", (Object)sensorManager, new Object[] { n }, "java.util.List", new 5dv(false));
                            if (liz.LIZ) {
                                return (List)liz.LIZIZ;
                            }
                            return sensorManager.getSensorList(n);
                        }
                        
                        @Override
                        public final void run() {
                            while (true) {
                                try {
                                    for (final Sensor sensor : com_appsflyer_internal_ab$3_android_hardware_SensorManager_getSensorList(ab.AFInAppEventParameterName(afInAppEventType), -1)) {
                                        if (AFInAppEventParameterName(sensor.getType())) {
                                            final w w = new w(sensor, ab.values(afInAppEventType));
                                            if (!ab.AFInAppEventType(afInAppEventType).containsKey(w)) {
                                                ab.AFInAppEventType(afInAppEventType).put(w, w);
                                            }
                                            ab.AFInAppEventParameterName(afInAppEventType).registerListener((SensorEventListener)ab.AFInAppEventType(afInAppEventType).get(w), sensor, 0);
                                        }
                                    }
                                    ab.AFKeystoreWrapper(afInAppEventType, true);
                                }
                                finally {
                                    continue;
                                }
                                break;
                            }
                        }
                    });
                    ab.this.AFInAppEventType.postDelayed(ab.valueOf(ab.this), 100L);
                    ab.this.values = true;
                }
                finally {
                    monitorexit(afInAppEventParameterName);
                    MethodCollector.o(5185);
                }
            }
        };
        this.AFKeystoreWrapper = new Runnable() {
            static {
                Covode.recordClassIndex(2576);
            }
            
            @Override
            public final void run() {
                MethodCollector.i(3411);
                final Object afInAppEventParameterName = ab.this.AFInAppEventParameterName;
                monitorenter(afInAppEventParameterName);
                try {
                    final ab afInAppEventType = ab.this;
                    afInAppEventType.AFVersionDeclaration.execute(new Runnable() {
                        static {
                            Covode.recordClassIndex(2577);
                        }
                        
                        @Override
                        public final void run() {
                            while (true) {
                                try {
                                    if (!ab.AFInAppEventType(ab.this).isEmpty()) {
                                        for (final w w : ab.AFInAppEventType(ab.this).values()) {
                                            ab.AFInAppEventParameterName(ab.this).unregisterListener((SensorEventListener)w);
                                            w.values(ab.AFVersionDeclaration(ab.this), true);
                                        }
                                    }
                                    ab.AFInAppEventParameterName(ab.this, 0);
                                    ab.AFKeystoreWrapper(ab.this, false);
                                }
                                finally {
                                    continue;
                                }
                                break;
                            }
                        }
                    });
                }
                finally {
                    monitorexit(afInAppEventParameterName);
                    MethodCollector.o(3411);
                }
            }
        };
        this.getLevel = new Runnable() {
            static {
                Covode.recordClassIndex(2572);
            }
            
            @Override
            public final void run() {
                MethodCollector.i(3948);
                final Object afInAppEventParameterName = ab.this.AFInAppEventParameterName;
                monitorenter(afInAppEventParameterName);
                try {
                    if (ab.this.values) {
                        ab.this.AFInAppEventType.removeCallbacks(ab.this.valueOf);
                        ab.this.AFInAppEventType.removeCallbacks(ab.this.AFKeystoreWrapper);
                        final ab afInAppEventParameterName2 = ab.this;
                        afInAppEventParameterName2.AFVersionDeclaration.execute(new Runnable() {
                            static {
                                Covode.recordClassIndex(2577);
                            }
                            
                            @Override
                            public final void run() {
                                while (true) {
                                    try {
                                        if (!ab.AFInAppEventType(afInAppEventType).isEmpty()) {
                                            for (final w w : ab.AFInAppEventType(afInAppEventType).values()) {
                                                ab.AFInAppEventParameterName(afInAppEventType).unregisterListener((SensorEventListener)w);
                                                w.values(ab.AFVersionDeclaration(afInAppEventType), true);
                                            }
                                        }
                                        ab.AFInAppEventParameterName(afInAppEventType, 0);
                                        ab.AFKeystoreWrapper(afInAppEventType, false);
                                    }
                                    finally {
                                        continue;
                                    }
                                    break;
                                }
                            }
                        });
                        ab.this.values = false;
                    }
                }
                finally {
                    monitorexit(afInAppEventParameterName);
                    MethodCollector.o(3948);
                }
            }
        };
        this.onInstallConversionDataLoadedNative = 1;
        this.onAttributionFailure = 0L;
        this.onDeepLinking = new Runnable() {
            static {
                Covode.recordClassIndex(2573);
            }
            
            @Override
            public final void run() {
                MethodCollector.i(3767);
                final Object afInAppEventParameterName = ab.this.AFInAppEventParameterName;
                monitorenter(afInAppEventParameterName);
                try {
                    if (ab.AFKeystoreWrapper(ab.this) == 0) {
                        ab.AFInAppEventParameterName(ab.this, 1);
                    }
                    ab.this.AFInAppEventType.postDelayed(ab.this.AFKeystoreWrapper, ab.AFKeystoreWrapper(ab.this) * 500L);
                }
                finally {
                    monitorexit(afInAppEventParameterName);
                    MethodCollector.o(3767);
                }
            }
        };
        this.AFVersionDeclaration = INVOKESTATIC_com_appsflyer_internal_ab_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor();
        this.onAppOpenAttributionNative = onAppOpenAttributionNative;
        this.AFInAppEventType = afInAppEventType;
    }
    
    public static /* synthetic */ int AFInAppEventParameterName(final ab ab, final int onInstallConversionDataLoadedNative) {
        return ab.onInstallConversionDataLoadedNative = onInstallConversionDataLoadedNative;
    }
    
    public static /* synthetic */ SensorManager AFInAppEventParameterName(final ab ab) {
        return ab.onAppOpenAttributionNative;
    }
    
    public static ab AFInAppEventParameterName(final SensorManager sensorManager, final Handler handler) {
        MethodCollector.i(4545);
        if (ab.init == null) {
            monitorenter(ab.class);
            try {
                if (ab.init == null) {
                    ab.init = new ab(sensorManager, handler);
                }
                monitorexit(ab.class);
            }
            finally {
                monitorexit(ab.class);
                MethodCollector.o(4545);
            }
        }
        final ab init = ab.init;
        MethodCollector.o(4545);
        return init;
    }
    
    public static boolean AFInAppEventParameterName(final int n) {
        return n >= 0 && ab.AFLogger$LogLevel.get(n);
    }
    
    public static /* synthetic */ Map AFInAppEventType(final ab ab) {
        return ab.onDeepLinkingNative;
    }
    
    public static /* synthetic */ int AFKeystoreWrapper(final ab ab) {
        return ab.onInstallConversionDataLoadedNative;
    }
    
    public static ab AFKeystoreWrapper(final Context context) {
        if (ab.init != null) {
            return ab.init;
        }
        return AFInAppEventParameterName((SensorManager)INVOKEVIRTUAL_com_appsflyer_internal_ab_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(INVOKEVIRTUAL_com_appsflyer_internal_ab_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context), "sensor"), ab.AppsFlyer2dXConversionCallback);
    }
    
    public static /* synthetic */ boolean AFKeystoreWrapper(final ab ab, final boolean onInstallConversionFailureNative) {
        return ab.onInstallConversionFailureNative = onInstallConversionFailureNative;
    }
    
    public static /* synthetic */ Map AFVersionDeclaration(final ab ab) {
        return ab.onAttributionFailureNative;
    }
    
    public static ExecutorService INVOKESTATIC_com_appsflyer_internal_ab_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor() {
        final 6uu liz = 6ut.LIZ(6v6.FIXED);
        liz.LIZJ = 1;
        return 6v3.LIZ(liz.LIZ());
    }
    
    public static Object INVOKEVIRTUAL_com_appsflyer_internal_ab_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String ex) {
        MethodCollector.i(3538);
    Label_0162_Outer:
        while (true) {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0162_Outer;
                }
                monitorenter(ClipboardManager.class);
                try {
                    final Object systemService = context.getSystemService((String)ex);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            ex = (Exception)new 2Lq((Handler)declaredField.get(systemService));
                            declaredField.set(systemService, ex);
                        }
                        catch (final Exception ex) {
                            6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    monitorexit(ClipboardManager.class);
                    break Label_0177;
                }
                finally {
                    monitorexit(ClipboardManager.class);
                    MethodCollector.o(3538);
                }
            }
            while (true) {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0162;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    MethodCollector.o(3538);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0162_Outer;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0162_Outer;
                }
                finally {
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    public static Context INVOKEVIRTUAL_com_appsflyer_internal_ab_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        if (!5WL.LIZIZ) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return (Context)5WL.LIZ;
    }
    
    public static /* synthetic */ Runnable valueOf(final ab ab) {
        return ab.onDeepLinking;
    }
    
    public static /* synthetic */ Executor values(final ab ab) {
        return ab.AFVersionDeclaration;
    }
    
    public final List<Map<String, Object>> AFInAppEventType() {
        final Iterator<w> iterator = this.onDeepLinkingNative.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().values(this.onAttributionFailureNative, true);
        }
        final Map<w, Map<String, Object>> onAttributionFailureNative = this.onAttributionFailureNative;
        if (onAttributionFailureNative == null || onAttributionFailureNative.isEmpty()) {
            return new CopyOnWriteArrayList<Map<String, Object>>((Collection<? extends Map<String, Object>>)Collections.emptyList());
        }
        return new CopyOnWriteArrayList<Map<String, Object>>(this.onAttributionFailureNative.values());
    }
    
    public final void valueOf() {
        final long currentTimeMillis = System.currentTimeMillis();
        final long onAttributionFailure = this.onAttributionFailure;
        if (onAttributionFailure != 0L) {
            ++this.onInstallConversionDataLoadedNative;
            if (onAttributionFailure - currentTimeMillis < 500L) {
                this.AFInAppEventType.removeCallbacks(this.AFKeystoreWrapper);
                this.AFInAppEventType.post(this.valueOf);
            }
        }
        else {
            this.AFInAppEventType.post(this.getLevel);
            this.AFInAppEventType.post(this.valueOf);
        }
        this.onAttributionFailure = currentTimeMillis;
    }
    
    public final List<Map<String, Object>> values() {
        MethodCollector.i(521);
        final Object afInAppEventParameterName = this.AFInAppEventParameterName;
        monitorenter(afInAppEventParameterName);
        try {
            if (!this.onDeepLinkingNative.isEmpty() && this.onInstallConversionFailureNative) {
                final Iterator<w> iterator = this.onDeepLinkingNative.values().iterator();
                while (iterator.hasNext()) {
                    iterator.next().values(this.onAttributionFailureNative, false);
                }
            }
            if (this.onAttributionFailureNative.isEmpty()) {
                return new CopyOnWriteArrayList<Map<String, Object>>((Collection<? extends Map<String, Object>>)Collections.emptyList());
            }
            return new CopyOnWriteArrayList<Map<String, Object>>(this.onAttributionFailureNative.values());
        }
        finally {
            monitorexit(afInAppEventParameterName);
            MethodCollector.o(521);
        }
    }
}
