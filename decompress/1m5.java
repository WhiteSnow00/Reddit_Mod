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
import java.util.concurrent.ConcurrentHashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class 1m5 extends 1d5
{
    public final Map<String, Integer> LIZ;
    public final 1m8.a LIZIZ;
    
    static {
        Covode.recordClassIndex(9327);
    }
    
    public 1m5(final 1m8.a liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
        this.LIZ = new ConcurrentHashMap<String, Integer>();
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
        boolean b = false;
    Label_0335_Outer:
        while (iterator.hasNext()) {
            final Region region = iterator.next();
            region.size(0.0, 0.0);
            final 1m8.a liziz3 = this.LIZIZ;
            final String interactId = region.getInteractId();
            n.LIZIZ((Object)interactId, "");
            final boolean lji = liziz3.LJI(interactId);
            final 1m8.a liziz4 = this.LIZIZ;
            final String interactId2 = region.getInteractId();
            n.LIZIZ((Object)interactId2, "");
            final boolean ljii = liziz4.LJII(interactId2);
            final boolean equals = TextUtils.equals((CharSequence)region.getInteractId(), (CharSequence)liziz);
            double n3 = 1.0;
            if (equals) {
                region.size(1.0, 1.0);
                region.position(0.0, 0.0);
                region.userId(lizj);
                region.mediaType(1);
                region.muteAudio(ljii);
                region.muteVideo(false);
                region.status(0);
                b = lji;
            }
            else {
                final 1m8.a liziz5 = this.LIZIZ;
                final String interactId3 = region.getInteractId();
                n.LIZIZ((Object)interactId3, "");
                final int ljiiiz = liziz5.LJIIIZ(interactId3);
                if (ljiiiz >= 0) {
                    final Map<String, Integer> liz2 = this.LIZ;
                    final String interactId4 = region.getInteractId();
                    n.LIZIZ((Object)interactId4, "");
                    liz2.put(interactId4, ljiiiz);
                    while (true) {
                        Label_0487: {
                            if (ljiiiz == 1) {
                                final double n4 = 0.7068965517241379;
                                break Label_0487;
                            }
                            if (ljiiiz == 2) {
                                final double n4 = 0.5073891625615763;
                                break Label_0487;
                            }
                            if (ljiiiz == 3) {
                                final double n4 = 0.30788177339901485;
                                break Label_0487;
                            }
                            final double n4 = 1.0;
                            final 8si liz3 = 8sj.LIZ((Object)n3, (Object)n4);
                            region.size(0.2660164043449346, 0.1921182266009852);
                            region.position(((Number)liz3.getFirst()).doubleValue(), ((Number)liz3.getSecond()).doubleValue());
                            int n5;
                            if (!lji) {
                                n5 = 1;
                            }
                            else {
                                n5 = 2;
                            }
                            region.mediaType(n5);
                            region.muteAudio(ljii);
                            region.muteVideo(lji);
                            final 1m8.a liziz6 = this.LIZIZ;
                            final String interactId5 = region.getInteractId();
                            n.LIZIZ((Object)interactId5, "");
                            region.userId(liziz6.LJFF(interactId5));
                            continue Label_0335_Outer;
                        }
                        n3 = 0.7162491686987364;
                        continue;
                    }
                }
                continue;
            }
        }
        final InteractConfig lizj2 = super.LIZJ;
        if (lizj2 != null) {
            ((Config)lizj2).setSeiVersion(11);
        }
        final JSONObject liz4 = 0xZ.LIZ(super.LIZJ, (List<Region>)list, n, n2, this.LIZ, b, null);
        String string = s;
        if (liz4 != null) {
            string = liz4.toString();
            if (string == null) {
                string = s;
            }
        }
        return string;
    }
}
