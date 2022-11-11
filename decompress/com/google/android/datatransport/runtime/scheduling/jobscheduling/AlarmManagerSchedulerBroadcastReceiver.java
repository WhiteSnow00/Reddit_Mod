// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.os.BaseBundle;
import qa.k;
import com.google.android.datatransport.runtime.b$a;
import android.util.Base64;
import ua.a;
import com.google.android.datatransport.runtime.c;
import com.google.android.datatransport.runtime.d;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver
{
    public final void onReceive(final Context context, final Intent intent) {
        final String queryParameter = intent.getData().getQueryParameter("backendName");
        final String queryParameter2 = intent.getData().getQueryParameter("extras");
        final int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority"));
        final int int1 = ((BaseBundle)intent.getExtras()).getInt("attemptNumber");
        d.b(context);
        final b$a a = c.a();
        a.b(queryParameter);
        a.c(ua.a.b(intValue));
        if (queryParameter2 != null) {
            a.b = Base64.decode(queryParameter2, 0);
        }
        final k d = com.google.android.datatransport.runtime.d.a().d;
        d.e.execute((Runnable)new qa.c(d, a.a(), int1, (Runnable)new qa.a(0)));
    }
}
