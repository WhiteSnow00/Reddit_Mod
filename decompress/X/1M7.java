// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.avframework.livestreamv2.core.interact.model.Config;
import org.json.JSONObject;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.concurrent.ConcurrentHashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class 1m7 extends 1d5
{
    public final Map<String, Integer> LIZ;
    public final 1m8.a LIZIZ;
    
    static {
        Covode.recordClassIndex(9329);
    }
    
    public 1m7(final 1m8.a liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
        this.LIZ = new ConcurrentHashMap<String, Integer>();
    }
    
    private final Region LIZ(int n, final Region region) {
        final 1m8.a liziz = this.LIZIZ;
        final String interactId = region.getInteractId();
        n.LIZIZ((Object)interactId, "");
        final boolean lji = liziz.LJI(interactId);
        final 1m8.a liziz2 = this.LIZIZ;
        final String interactId2 = region.getInteractId();
        n.LIZIZ((Object)interactId2, "");
        final boolean ljii = liziz2.LJII(interactId2);
        final 1m8.a liziz3 = this.LIZIZ;
        final String interactId3 = region.getInteractId();
        n.LIZIZ((Object)interactId3, "");
        final int ljiiiz = liziz3.LJIIIZ(interactId3);
        final int n2 = 1;
        int n3;
        if (n == 0 || n == 1 || n == 5) {
            n3 = 0;
        }
        else if ((n3 = ljiiiz) < 0) {
            return region;
        }
        final Map<String, Integer> liz = this.LIZ;
        final String interactId4 = region.getInteractId();
        n.LIZIZ((Object)interactId4, "");
        liz.put(interactId4, n3);
        double n4 = 0.5019183548189073;
        double n5 = 0.4972375690607735;
        Double n6 = null;
        double n7 = 0.0;
        Label_0294: {
            Label_0286: {
                Label_0258: {
                    switch (n) {
                        default: {
                            return region;
                        }
                        case 0: {
                            n6 = 0.0;
                            n4 = 0.0;
                            n7 = 1.0;
                            n5 = 1.0;
                            break Label_0294;
                        }
                        case 1: {
                            n6 = 0.0;
                            break;
                        }
                        case 2: {
                            n6 = 0.5041436464088398;
                            break;
                        }
                        case 3: {
                            n6 = 0.0;
                            break Label_0258;
                        }
                        case 4: {
                            n6 = 0.5041436464088398;
                            break Label_0258;
                        }
                        case 5: {
                            n6 = 0.0;
                            n4 = 0.06837016574585635;
                            break Label_0286;
                        }
                        case 6: {
                            n6 = 0.0;
                            break Label_0286;
                        }
                    }
                    n4 = 0.06837016574585635;
                }
                n7 = 0.42971147943523635;
                break Label_0294;
            }
            n7 = 0.42971147943523635;
            n5 = 1.0;
        }
        if (n6 != null) {
            n6.doubleValue();
            region.size(n5, n7);
            region.position((double)n6, n4);
            if (!lji) {
                n = n2;
            }
            else {
                n = 2;
            }
            region.mediaType(n);
            region.muteAudio(ljii);
            region.muteVideo(lji);
            final 1m8.a liziz4 = this.LIZIZ;
            final String interactId5 = region.getInteractId();
            n.LIZIZ((Object)interactId5, "");
            region.userId(liziz4.LJFF(interactId5));
            return region;
        }
        return region;
    }
    
    public final String mixStream(final int n, final int n2, final List<? extends Region> list) {
        CTM.LIZ((Object)list);
        final GIK liziz = Fk2.LIZ().LIZIZ();
        final String s = "";
        n.LIZIZ((Object)liziz, "");
        final long lizj = liziz.LIZJ();
        this.LIZ.clear();
        final Iterator<Region> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().size(0.0, 0.0);
        }
        final int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    final Region region = list.get(0);
                    this.LIZ(1, region);
                    region.userId(lizj);
                    region.mediaType(1);
                    region.status(0);
                    this.LIZ(2, list.get(1));
                    this.LIZ(3, list.get(2));
                    this.LIZ(4, list.get(3));
                }
                else {
                    final Region region2 = list.get(0);
                    this.LIZ(5, region2);
                    region2.userId(lizj);
                    region2.mediaType(1);
                    region2.status(0);
                    this.LIZ(3, list.get(1));
                    this.LIZ(4, list.get(2));
                }
            }
            else {
                final Region region3 = list.get(0);
                this.LIZ(5, region3);
                region3.userId(lizj);
                region3.mediaType(1);
                region3.status(0);
                this.LIZ(6, list.get(1));
            }
        }
        else {
            final Region region4 = list.get(0);
            this.LIZ(0, region4);
            region4.userId(lizj);
            region4.mediaType(1);
            region4.status(0);
        }
        final InteractConfig lizj2 = super.LIZJ;
        n.LIZIZ((Object)lizj2, "");
        ((Config)lizj2).setSeiVersion(13);
        final 1m8.a liziz2 = this.LIZIZ;
        final String interactId = list.get(0).getInteractId();
        n.LIZIZ((Object)interactId, "");
        final JSONObject liz = 0xZ.LIZ(super.LIZJ, (List<Region>)list, n, n2, this.LIZ, liziz2.LJI(interactId), null);
        String string = s;
        if (liz != null) {
            string = liz.toString();
            if (string == null) {
                string = s;
            }
        }
        return string;
    }
}
