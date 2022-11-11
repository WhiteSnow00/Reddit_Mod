// 
// Decompiled by Procyon v0.6.0
// 

package androidx.profileinstaller;

import android.os.BaseBundle;
import android.content.pm.PackageManager;
import java.io.File;
import android.content.pm.PackageManager$NameNotFoundException;
import h5.a;
import java.util.concurrent.Executor;
import h5.d;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class ProfileInstallReceiver extends BroadcastReceiver
{
    public final void onReceive(final Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        final String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            b.b(context, (Executor)new d(0), (b.c)new ProfileInstallReceiver.ProfileInstallReceiver$a(this), true);
        }
        else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            final String string = ((BaseBundle)intent.getExtras()).getString("EXTRA_SKIP_FILE_OPERATION");
            if ("WRITE_SKIP_FILE".equals(string)) {
                intent = (Intent)new ProfileInstallReceiver.ProfileInstallReceiver$a(this);
                final String packageName = context.getApplicationContext().getPackageName();
                final PackageManager packageManager = context.getPackageManager();
                try {
                    b.a(packageManager.getPackageInfo(packageName, 0), context.getFilesDir());
                    ((Runnable)new a(10, 1, (Object)intent, (Object)null)).run();
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    ((Runnable)new a(7, 1, (Object)intent, (Object)ex)).run();
                }
            }
            else if ("DELETE_SKIP_FILE".equals(string)) {
                final ProfileInstallReceiver.ProfileInstallReceiver$a profileInstallReceiver$a = new ProfileInstallReceiver.ProfileInstallReceiver$a(this);
                new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                ((Runnable)new a(11, 1, (Object)profileInstallReceiver$a, (Object)null)).run();
            }
        }
    }
}
