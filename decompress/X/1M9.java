// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.avframework.livestreamv2.core.interact.model.Config;
import org.json.JSONObject;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import java.util.Iterator;
import android.text.TextUtils;
import kotlin.jvm.internal.n;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.List;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class 1m9 extends 1d5
{
    public Map<String, Integer> LIZ;
    public final 1m8.a LIZIZ;
    
    static {
        Covode.recordClassIndex(9334);
    }
    
    public 1m9(final 1m8.a liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
        this.LIZ = new HashMap<String, Integer>();
    }
    
    public final String mixStream(final int n, final int n2, final List<? extends Region> list) {
        CTM.LIZ((Object)list);
        final GCe liz = GCe.LIZ();
        final String s = "";
        n.LIZIZ((Object)liz, "");
        final String liziz = liz.LIZIZ();
        final GIK liziz2 = Fk2.LIZ().LIZIZ();
        n.LIZIZ((Object)liziz2, "");
        final long lizj = liziz2.LIZJ();
        this.LIZ.clear();
        final Iterator<Region> iterator = list.iterator();
        boolean lji = false;
        while (iterator.hasNext()) {
            final Region region = iterator.next();
            if (TextUtils.equals((CharSequence)region.getInteractId(), (CharSequence)liziz)) {
                final 1m8.a liziz3 = this.LIZIZ;
                final String interactId = region.getInteractId();
                n.LIZIZ((Object)interactId, "");
                lji = liziz3.LJI(interactId);
                region.size(1.0, 1.0);
                region.position(0.0, 0.0);
                region.userId(lizj);
                region.mediaType(1);
                region.status(0);
            }
        }
        final InteractConfig lizj2 = super.LIZJ;
        if (lizj2 != null) {
            ((Config)lizj2).setSeiVersion(15);
        }
        final JSONObject liz2 = 0xZ.LIZ(super.LIZJ, (List<Region>)list, n, n2, this.LIZ, lji, null);
        String string = s;
        if (liz2 != null) {
            string = liz2.toString();
            if (string == null) {
                string = s;
            }
        }
        return string;
    }
}
