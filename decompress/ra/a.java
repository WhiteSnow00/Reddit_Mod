// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.instabug.library.util.InstabugSDKLogger;
import cn.e;
import com.instabug.library.Instabug;

public final class a implements Runnable
{
    public final int f;
    
    public a(final int f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                if (Instabug.getApplicationContext() != null) {
                    try {
                        e.c(Instabug.getApplicationContext());
                        e.e(Instabug.getApplicationContext());
                    }
                    catch (final Exception ex) {
                        final StringBuilder t = a.t("Error ");
                        t.append(ex.getMessage());
                        t.append("occurred while uploading crashes");
                        InstabugSDKLogger.e("IBG-CR", t.toString(), (Throwable)ex);
                    }
                }
                else {
                    InstabugSDKLogger.d("IBG-CR", "Context was null while uploading Crashes");
                }
                return;
            }
            case 0: {
                final int a = AlarmManagerSchedulerBroadcastReceiver.a;
            }
        }
    }
}
