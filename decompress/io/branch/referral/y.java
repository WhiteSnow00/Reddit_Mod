// 
// Decompiled by Procyon v0.6.0
// 

package io.branch.referral;

import java.util.TimerTask;
import java.util.Timer;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import android.content.Context;
import ai2.h;

public final class y extends h
{
    public static y.y$c b;
    public static boolean c;
    
    public static void r0(final Context context, final y.y$c b) {
        y.b = b;
        y.c = true;
        try {
            InstallReferrerClient.newBuilder(context).build().startConnection((InstallReferrerStateListener)new y$a());
            new Timer().schedule((TimerTask)new y$b(), 1500L);
        }
        catch (final Exception ex) {
            ex.getMessage();
            ex.printStackTrace();
        }
    }
}
