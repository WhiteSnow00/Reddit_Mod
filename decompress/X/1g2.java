// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import android.app.Application;
import android.app.Activity;

public final class 1g2 implements JxD<0Bu.b>
{
    public final Ie2<Activity> LIZ;
    public final Ie2<Application> LIZIZ;
    public final Ie2<Map<String, Ie2<0Ae<? extends 0Bq>>>> LIZJ;
    
    static {
        Covode.recordClassIndex(1113);
    }
    
    public static 0Bu.b LIZ(final Activity activity, final Application application, final Map<String, Ie2<0Ae<? extends 0Bq>>> map) {
        if (activity.getIntent() != null) {
            0Ag.a.LIZ(activity.getIntent());
        }
        final 1nM 1nM = new 1nM(application, new 0Bu.a(application), map);
        IfG.LIZ((Object)1nM, "Cannot return null from a non-@Nullable @Provides method");
        return 1nM;
    }
}
