// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.os.UserHandle;
import android.util.Log;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import java.lang.reflect.Method;

public final class l0
{
    public static final Method a;
    public static final Method b;
    
    static {
        final Method method = null;
        Method declaredMethod;
        try {
            declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        }
        catch (final NoSuchMethodException ex) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            declaredMethod = null;
        }
        a = declaredMethod;
        Method declaredMethod2;
        try {
            declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", (Class<?>[])new Class[0]);
        }
        catch (final NoSuchMethodException ex2) {
            declaredMethod2 = method;
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
                declaredMethod2 = method;
            }
        }
        b = declaredMethod2;
    }
}
