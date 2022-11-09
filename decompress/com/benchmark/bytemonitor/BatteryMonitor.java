// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.bytemonitor;

import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import android.os.BatteryManager;
import X.6G9;
import X.6Nw;
import X.2Lq;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import X.2JT;
import android.os.Build$VERSION;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import com.bytedance.covode.number.Covode;
import android.content.Context;

public class BatteryMonitor
{
    public double batteryLevel;
    public Context mContext;
    public int temperature;
    
    static {
        Covode.recordClassIndex(2889);
    }
    
    public BatteryMonitor(final Context mContext) {
        this.temperature = -1;
        this.batteryLevel = -1.0;
        this.mContext = mContext;
    }
    
    public static Intent INVOKEVIRTUAL_com_benchmark_bytemonitor_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                return context.registerReceiver(broadcastReceiver, intentFilter, (String)null, ReceiverRegisterLancet.sReceiverHandler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        catch (final Exception ex) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw ex;
        }
    }
    
    public static Object INVOKEVIRTUAL_com_benchmark_bytemonitor_BatteryMonitor_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String declaredField) {
        MethodCollector.i(12170);
    Label_0161_Outer:
        while (true) {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(declaredField)) {
                if (!2JT.LIZ) {
                    break Label_0161_Outer;
                }
                monitorenter(ClipboardManager.class);
                try {
                    final Object systemService = context.getSystemService((String)declaredField);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            declaredField = (Exception)ClipboardManager.class.getDeclaredField("mHandler");
                            ((AccessibleObject)declaredField).setAccessible(true);
                            ((Field)declaredField).set(systemService, new 2Lq((Handler)((Field)declaredField).get(systemService)));
                        }
                        catch (final Exception declaredField) {
                            6Nw.LIZ((Throwable)declaredField, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    monitorexit(ClipboardManager.class);
                    break Label_0176;
                }
                finally {
                    monitorexit(ClipboardManager.class);
                    MethodCollector.o(12170);
                }
            }
            while (true) {
                if (2JT.LIZIZ || !"connectivity".equals(declaredField)) {
                    break Label_0161;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)declaredField);
                    MethodCollector.o(12170);
                    return context;
                    context = (Context)context.getSystemService((String)declaredField);
                    continue Label_0161_Outer;
                    context = (Context)context.getSystemService((String)declaredField);
                    continue Label_0161_Outer;
                }
                finally {
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    private void getBattery() {
        try {
            final Intent invokevirtual_com_benchmark_bytemonitor_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver = INVOKEVIRTUAL_com_benchmark_bytemonitor_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(this.mContext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (invokevirtual_com_benchmark_bytemonitor_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver != null) {
                final int intExtra = invokevirtual_com_benchmark_bytemonitor_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("level", -1);
                final int intExtra2 = invokevirtual_com_benchmark_bytemonitor_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("scale", -1);
                if (intExtra != -1 && intExtra2 != -1) {
                    if (intExtra2 == 0) {
                        this.batteryLevel = 0.0;
                    }
                    else {
                        this.batteryLevel = intExtra / (double)intExtra2 * 100.0;
                    }
                }
                this.temperature = invokevirtual_com_benchmark_bytemonitor_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("temperature", -1);
            }
        }
        catch (final Exception ex) {}
    }
    
    public double getBatteryLevel() {
        this.getBattery();
        return this.batteryLevel;
    }
    
    public double getElectricCurrent() {
        long longProperty;
        try {
            longProperty = ((BatteryManager)INVOKEVIRTUAL_com_benchmark_bytemonitor_BatteryMonitor_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this.mContext, "batterymanager")).getLongProperty(2);
        }
        catch (final Exception ex) {
            longProperty = -1L;
        }
        return (double)longProperty;
    }
    
    public double getTemperature() {
        this.getBattery();
        return this.temperature / 10.0;
    }
}
