// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Intent;
import com.aweme.storage.JobService;
import org.json.JSONException;
import android.os.Build;
import org.json.JSONObject;
import android.app.job.JobScheduler;
import android.app.job.JobInfo$Builder;
import android.content.ComponentName;
import com.aweme.storage.CompatJobService;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import java.util.concurrent.Callable;

public final class 0Mb implements Callable<Object>
{
    public final /* synthetic */ Context LIZ;
    
    static {
        Covode.recordClassIndex(2747);
    }
    
    public 0Mb(final Context liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final Object call() {
        final Context liz = this.LIZ;
        if (!0Me.LIZ && liz != null) {
            if (0MX.LIZ) {
                0Me.LJ(liz);
            }
            final 0Mk lj = 0Me.LJ;
            int n2;
            final int n = n2 = 0;
            Label_0112: {
                if (lj != null) {
                    n2 = n;
                    if (0Me.LJ.LIZIZ()) {
                        final long long1 = 6Fr.LIZ(liz, "clean_storage_pref", 0).getLong("key_clean_date", 0L);
                        final 0MZ lizlll = 0Me.LIZLLL;
                        long n3;
                        if (lizlll != null && lizlll.LIZ > 0) {
                            n3 = lizlll.LIZ * 3600000L;
                        }
                        else {
                            n3 = 259200000L;
                        }
                        if (System.currentTimeMillis() - long1 <= n3) {
                            n2 = n;
                            if (!0Me.LIZ(liz, long1)) {
                                break Label_0112;
                            }
                        }
                        n2 = 1;
                    }
                }
            }
            if (0Me.LIZIZ(liz) || n2 != 0) {
                0Me.LIZ = true;
                if (Build$VERSION.SDK_INT >= 26) {
                    try {
                        if (!CompatJobService.LIZ) {
                            CompatJobService.LIZ = true;
                            final JobInfo$Builder jobInfo$Builder = new JobInfo$Builder(1193041, new ComponentName(liz, (Class)CompatJobService.class));
                            jobInfo$Builder.setMinimumLatency(0L);
                            jobInfo$Builder.setOverrideDeadline(3000L);
                            ((JobScheduler)CompatJobService.LIZ(liz, "jobscheduler")).schedule(jobInfo$Builder.build());
                            return null;
                        }
                        return null;
                    }
                    catch (final Exception ex) {
                        final JSONObject jsonObject = new JSONObject();
                        try {
                            jsonObject.put("model", (Object)Build.MODEL);
                        }
                        catch (final JSONException ex2) {
                            0II.LIZ((Exception)ex2);
                        }
                        return null;
                    }
                }
                0Me.LIZ(liz, new Intent(liz, (Class)JobService.class));
            }
        }
        return null;
    }
}
