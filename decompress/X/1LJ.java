// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONObject;
import java.util.Iterator;
import java.util.Map;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import android.text.TextUtils;
import java.util.HashMap;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnebleLinkmicRegionBackupSetting;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.List;
import com.ss.avframework.livestreamv2.core.interact.model.Config$VideoQuality;
import com.bytedance.covode.number.Covode;

public final class 1lJ extends 1d5
{
    public boolean LIZ;
    public boolean LIZIZ;
    public double LIZLLL;
    public double LJ;
    
    static {
        Covode.recordClassIndex(7814);
    }
    
    public 1lJ(final Config$VideoQuality config$VideoQuality) {
        this.LIZ = true;
        this.LIZIZ = true;
        final int width = config$VideoQuality.getWidth();
        final int height = config$VideoQuality.getHeight();
        final double n = width * 1.0f / 360.0f;
        this.LIZLLL = 0.1899999976158142;
        this.LJ = n * 260.0 / height;
    }
    
    public final String mixStream(final int n, final int n2, final List<Region> list) {
        String s2;
        final String s = s2 = 1NN.LLFF.LIZ().LJJJJZI;
        if (s == null) {
            s2 = s;
            if (LiveAnebleLinkmicRegionBackupSetting.INSTANCE.getValue()) {
                s2 = 1NN.LLFF.LIZ().LJIJJLI;
            }
        }
        final long lizj = Fk2.LIZ().LIZIZ().LIZJ();
        final long ljff = 1NN.LLFF.LIZ().LJFF;
        final boolean ljjljli = 1NN.LLFF.LIZ().LJJLJLI;
        CTM.LIZ((Object)list);
        final 1NN liz = 1NN.LLFF.LIZ();
        if (LiveAnebleLinkmicRegionBackupSetting.INSTANCE.getValue() && !liz.LIZLLL && s2 != null) {
            list.clear();
        }
        final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (final Region region : list) {
            if (TextUtils.equals((CharSequence)region.getInteractId(), (CharSequence)s2)) {
                region.mediaType(1);
                region.userId(lizj);
                region.status((int)((this.LIZ ^ true) ? 1 : 0));
                if (list.size() <= 1) {
                    region.size(1.0, 1.0);
                    region.position(0.0, 0.0);
                    region.writeToSei(false);
                }
                else {
                    region.size(0.5, this.LJ);
                    region.position(0.0, this.LIZLLL);
                }
                hashMap.put(s2, 0);
            }
            else {
                if (1NN.LLFF.LIZ().LJ != 0L) {
                    1NN.LLFF.LIZ().LJJJLIIL = region.getInteractId();
                }
                region.mediaType(1);
                region.size(0.5, this.LJ);
                region.position(0.5, this.LIZLLL);
                region.userId(ljff);
                region.muteAudio(ljjljli);
                region.status((int)((this.LIZIZ ^ true) ? 1 : 0));
                hashMap.put(region.getInteractId(), 1);
            }
        }
        final ILinkMicService linkMicService = 0jR.LIZ(ILinkMicService.class);
        final Vvm dslManager = linkMicService.getDslManager();
        String s3;
        String string = s3 = "";
        if (dslManager != null) {
            final JSONObject liz2 = 0xZ.LIZ(super.LIZJ, list, n, n2, hashMap, false, linkMicService.getDslManager().LIZ(2, 1).LIZIZ("2000"));
            if (liz2 != null) {
                string = liz2.toString();
            }
            1mk.LIZ(s2, list.size(), string);
            s3 = string;
        }
        return s3;
    }
}
