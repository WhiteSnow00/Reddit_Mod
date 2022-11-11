// 
// Decompiled by Procyon v0.6.0
// 

package com.adm.push;

import X.6jc;
import X.6jQ;
import X.6IT;
import java.util.Collections;
import X.6IU;
import X.6IV;
import java.util.List;
import X.6IS;
import java.util.Arrays;
import X.0IM;
import X.0IL;
import android.content.Context;
import X.6jd;
import X.6ID;
import com.bytedance.covode.number.Covode;
import X.6iW;

public class AdmPushAdapter implements 6iW
{
    public static int ADM_PUSH;
    public static boolean sSupport;
    
    static {
        Covode.recordClassIndex(2103);
        AdmPushAdapter.ADM_PUSH = -1;
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            AdmPushAdapter.sSupport = true;
        }
        finally {}
    }
    
    public static int getAdmPush() {
        if (AdmPushAdapter.ADM_PUSH == -1) {
            AdmPushAdapter.ADM_PUSH = ((6jc)6jd.LIZ((Context)6ID.LIZ)).LIZ(AdmPushAdapter.class.getName());
        }
        return AdmPushAdapter.ADM_PUSH;
    }
    
    private boolean isSupport(final Context context) {
        try {
            if (AdmPushAdapter.sSupport && 0IL.LIZ(context).LIZ.isSupported()) {
                return true;
            }
            return false;
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public boolean checkThirdPushConfig(String string, final Context context) {
        final boolean liz = 0IM.LIZ(context);
        final StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".permission.RECEIVE_ADM_MESSAGE");
        string = sb.toString();
        final boolean b = false;
        final boolean liz2 = 6IS.LIZ(context, "AdmPush error", (List)Arrays.asList(string, "com.amazon.device.messaging.permission.RECEIVE", "android.permission.WAKE_LOCK"));
        final 6IV lizj = 6IV.LIZJ("com.adm.push.ADMMessageHandler");
        lizj.LIZ(context.getPackageName());
        final 6IU liz3 = lizj.LIZ;
        final 6IV lizj2 = 6IV.LIZJ("com.adm.push.ADMMessageHandlerJob");
        lizj2.LIZ(context.getPackageName());
        lizj2.LIZIZ("android.permission.BIND_JOB_SERVICE");
        final boolean liziz = 6IS.LIZIZ(context, "Adm push AndroidManifest.xml configure error", (List)Arrays.asList(liz3, lizj2.LIZ));
        final 6IV lizj3 = 6IV.LIZJ("com.adm.push.ADMMessageHandler$Receiver");
        lizj3.LIZ(context.getPackageName());
        lizj3.LIZIZ("com.amazon.device.messaging.permission.SEND");
        lizj3.LIZ(new 6IT((List)Arrays.asList("com.amazon.device.messaging.intent.REGISTRATION", "com.amazon.device.messaging.intent.RECEIVE"), (List)Collections.singletonList(context.getPackageName())));
        boolean b2 = b;
        if (6IS.LIZJ(context, "Adm push AndroidManifest.xml configure error", (List)Collections.singletonList(lizj3.LIZ))) {
            b2 = b;
            if (liziz) {
                b2 = true;
            }
        }
        return liz & liz2 & b2;
    }
    
    public boolean isPushAvailable(final Context context, final int n) {
        if (6jQ.LIZIZ().LIZ()) {
            this.isSupport(context);
        }
        return this.isSupport(context);
    }
    
    public void registerPush(final Context context, final int n) {
        String s = null;
        Label_0028: {
            if (context != null) {
                if (n == getAdmPush() && this.isSupport(context)) {
                    0IL.LIZ(context).LIZ.startRegister();
                    return;
                }
                s = null;
                if (context != null) {
                    if (n != getAdmPush()) {
                        s = "register sender error";
                        break Label_0028;
                    }
                    if (!this.isSupport(context)) {
                        s = "this device does not support adm sender";
                    }
                    break Label_0028;
                }
            }
            s = "context is empty";
        }
        6jQ.LJ().LIZ(n, 101, "0", s);
    }
    
    public boolean requestNotificationPermission(final int n) {
        return false;
    }
    
    public void setAlias(final Context context, final String s, final int n) {
        if (context != null && n == getAdmPush()) {
            this.isSupport(context);
        }
    }
    
    public void trackPush(final Context context, final int n, final Object o) {
        if (context != null && n == getAdmPush()) {
            this.isSupport(context);
        }
    }
    
    public void unregisterPush(final Context context, final int n) {
        if (context != null && n == getAdmPush() && this.isSupport(context)) {
            0IL.LIZ(context).LIZ.startUnregister();
        }
    }
}
