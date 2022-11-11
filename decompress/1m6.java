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

public final class 1m6 extends 1d5
{
    public final Map<String, Integer> LIZ;
    public final 1m8.a LIZIZ;
    
    static {
        Covode.recordClassIndex(9328);
    }
    
    public 1m6(final 1m8.a liziz) {
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
            if (TextUtils.equals((CharSequence)region.getInteractId(), (CharSequence)liziz)) {
                region.size(0.4965469613259669, 0.42971147943523635);
                region.position(0.0, 0.06837016574585635);
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
                final int ljiiiizz = liziz5.LJIIIIZZ(interactId3);
                final Map<String, Integer> liz2 = this.LIZ;
                final String interactId4 = region.getInteractId();
                n.LIZIZ((Object)interactId4, "");
                liz2.put(interactId4, ljiiiizz);
                double n3 = 0.5034530386740331;
                double n4;
                if (ljiiiizz != 1) {
                    if (ljiiiizz != 2) {
                        if (ljiiiizz != 3) {
                            n4 = 1.0;
                            n3 = 1.0;
                        }
                        else {
                            n4 = 0.5019183548189073;
                        }
                    }
                    else {
                        n4 = 0.5019183548189073;
                        n3 = 0.0;
                    }
                }
                else {
                    n4 = 0.06837016574585635;
                }
                final 8si liz3 = 8sj.LIZ((Object)n3, (Object)n4);
                region.size(0.4965469613259669, 0.42971147943523635);
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
            }
        }
        final InteractConfig lizj2 = super.LIZJ;
        if (lizj2 != null) {
            ((Config)lizj2).setSeiVersion(14);
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
