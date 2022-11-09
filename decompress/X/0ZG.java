// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.Map;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 0ZG
{
    public static final 0ZG LIZ;
    
    static {
        Covode.recordClassIndex(5375);
        LIZ = new 0ZG();
    }
    
    public final SparkContext LIZ(final Context context, final Map<String, String> map, final boolean b) {
        CTM.LIZ((Object)context, (Object)map);
        final String liziz = 0ZH.LIZ.LIZIZ;
        if (liziz.length() == 0) {
            return null;
        }
        final Giv lizj = Giv.LIZ.LIZJ(liziz);
        final int n = (int)Math.min(0cB.LJ(0cB.LIZJ()), 0cB.LJ(0cB.LIZIZ()));
        lizj.LIZIZ(n, Gix.DP);
        Giv.LIZLLL(lizj, n);
        Giv.LIZJ(lizj, n);
        lizj.LIZIZ((Map)map);
        if (b) {
            lizj.LJ("right");
        }
        else {
            lizj.LIZLLL("bottom");
        }
        final IHybridContainerService hybridContainerService = 0jR.LIZ(IHybridContainerService.class);
        final String string = ((Giy)lizj).LJIIIIZZ().toString();
        kotlin.jvm.internal.n.LIZIZ((Object)string, "");
        return IHybridContainerService.a.LIZ(hybridContainerService, context, string);
    }
}
