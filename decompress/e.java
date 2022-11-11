// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.content.IntentFilter;

public final class e
{
    public IntentFilter AFInAppEventType;
    
    static {
        Covode.recordClassIndex(2690);
    }
    
    public e() {
        this.AFInAppEventType = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }
    
    public static Intent INVOKEVIRTUAL_com_appsflyer_internal_e_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
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
    
    public final b AFInAppEventType(final Context context) {
        final String s = null;
        final String s2 = null;
        final float n = 0.0f;
        String s3 = s;
        try {
            final Intent invokevirtual_com_appsflyer_internal_e_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver = INVOKEVIRTUAL_com_appsflyer_internal_e_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(context, null, this.AFInAppEventType);
            float n2 = n;
            s3 = s2;
            if (invokevirtual_com_appsflyer_internal_e_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver != null) {
                s3 = s;
                String s4;
                if (2 == invokevirtual_com_appsflyer_internal_e_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("status", -1)) {
                    s3 = s;
                    final int intExtra = invokevirtual_com_appsflyer_internal_e_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra != 1) {
                        if (intExtra != 2) {
                            if (intExtra != 4) {
                                s4 = "other";
                            }
                            else {
                                s4 = "wireless";
                            }
                        }
                        else {
                            s4 = "usb";
                        }
                    }
                    else {
                        s4 = "ac";
                    }
                }
                else {
                    s4 = "no";
                }
                s3 = s4;
                final int intExtra2 = invokevirtual_com_appsflyer_internal_e_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("level", -1);
                s3 = s4;
                final int intExtra3 = invokevirtual_com_appsflyer_internal_e_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("scale", -1);
                n2 = n;
                s3 = s4;
                if (-1 != intExtra2) {
                    n2 = n;
                    s3 = s4;
                    if (-1 != intExtra3) {
                        n2 = intExtra2 * 100.0f / intExtra3;
                        s3 = s4;
                    }
                }
            }
            return new b(n2, s3);
        }
        finally {
            final float n2 = n;
            return new b(n2, s3);
        }
    }
    
    public static final class b
    {
        public final float AFInAppEventParameterName;
        public final String AFKeystoreWrapper;
        
        static {
            Covode.recordClassIndex(2691);
        }
        
        public b(final float afInAppEventParameterName, final String afKeystoreWrapper) {
            this.AFInAppEventParameterName = afInAppEventParameterName;
            this.AFKeystoreWrapper = afKeystoreWrapper;
        }
    }
    
    public static final class e
    {
        public static final com.appsflyer.internal.e AFInAppEventParameterName;
        
        static {
            Covode.recordClassIndex(2692);
            AFInAppEventParameterName = new com.appsflyer.internal.e();
        }
    }
}
