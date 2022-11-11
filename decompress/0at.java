// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Build$VERSION;
import java.util.Iterator;
import java.util.Map;
import com.bytedance.android.livesdk.livesetting.game.UploadSpeedDetectionMapping;
import java.util.List;
import kotlin.n.y;
import kotlin.n.z;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.livesetting.game.GameLiveBroadcastSpeedDetectionUploadMappingSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;

public final class 0at
{
    public static final 0at LIZ;
    
    static {
        Covode.recordClassIndex(5572);
        LIZ = new 0at();
    }
    
    private final long LIZ(final float n) {
        return (long)(n * 1024.0f * 1024.0f / 8.0f);
    }
    
    public static boolean LIZ() {
        try {
            return 2Nf.LIZ.LIZIZ();
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public final float LIZ(final long n) {
        return n / 1024.0f / 1024.0f * 8.0f;
    }
    
    public final String LIZ(final long n, final DataChannel dataChannel) {
        if (dataChannel == null) {
            return "";
        }
        final UploadSpeedDetectionMapping value = GameLiveBroadcastSpeedDetectionUploadMappingSetting.INSTANCE.getValue();
        while (true) {
            Label_0282: {
                if (n < this.LIZ(value.getSd_min())) {
                    break Label_0282;
                }
                String lizj;
                if (n >= this.LIZ(value.getSd_min()) && n < this.LIZ(value.getHd_min())) {
                    lizj = "sd";
                }
                else if (n >= this.LIZ(value.getHd_min()) && n < this.LIZ(value.getHd_60_min())) {
                    lizj = "hd";
                }
                else if (n >= this.LIZ(value.getHd_60_min()) && n < this.LIZ(value.getUhd_min())) {
                    lizj = "hd_60";
                }
                else if (n >= this.LIZ(value.getUhd_min()) && n < this.LIZ(value.getUhd_60_min())) {
                    lizj = "uhd";
                }
                else {
                    if (n < this.LIZ(value.getUhd_60_min())) {
                        break Label_0282;
                    }
                    lizj = "uhd_60";
                }
                if (H25.LJFF) {
                    final StringBuilder sb = new StringBuilder("getSuggestedDefinitionByUploadSpeed(). matchSdkKey=");
                    sb.append(lizj);
                    sb.append(", uploadSpeed=");
                    sb.append(n);
                    0ba.LIZ(4, "SpeedDetectorBusinessCommonFunction", sb.toString());
                }
                final 0aF.a a = new 0aF.a();
                a.LIZJ = lizj;
                final 1Gw 1Gw = new 1Gw(a);
                final 0aG 0aG = (0aG)dataChannel.LIZIZ((Class)G6A.class);
                if (0aG == null) {
                    return "";
                }
                final Map<Long, 0aF> ljiizilj = 0aG.LJIIZILJ;
                if (ljiizilj != null) {
                    final 0aF 0aF = ljiizilj.get(4L);
                    if (0aF != null) {
                        final List<0aF.a> liziz = 0aF.LIZIZ;
                        n.LIZIZ((Object)liziz, "");
                        final ArrayList list = new ArrayList();
                        for (final 0aF.a next : liziz) {
                            final 0aF.a a2 = next;
                            final String lizj2 = a2.LIZJ;
                            n.LIZIZ((Object)lizj2, "");
                            if (!z.LJ((CharSequence)lizj2, (CharSequence)"auto")) {
                                final String lizj3 = a2.LIZJ;
                                n.LIZIZ((Object)lizj3, "");
                                if (z.LJ((CharSequence)lizj3, (CharSequence)"origin")) {
                                    continue;
                                }
                                final String lizj4 = a2.LIZJ;
                                if (lizj4 == null) {
                                    continue;
                                }
                                if (y.LIZ((CharSequence)lizj4)) {
                                    continue;
                                }
                                list.add(next);
                            }
                        }
                        final List list2 = list;
                        if (list2.isEmpty()) {
                            return "";
                        }
                        final ArrayList list3 = new ArrayList();
                        for (int size = list2.size(), i = 0; i < size; ++i) {
                            final Object value2 = list2.get(i);
                            n.LIZIZ(value2, "");
                            list3.add(new 1Gw((0aF.a)value2));
                        }
                        F75.LIZJ((List)list3);
                        if (H25.LJFF) {
                            0ba.LIZ(4, "SpeedDetectorBusinessCommonFunction", "getSuggestedDefinitionByUploadSpeed(). comparedQualityList=".concat(String.valueOf(list3)));
                        }
                        final int size2 = list3.size();
                        String lizj5 = "";
                        for (int j = 0; j < size2; ++j) {
                            if (1Gw.LIZ((1Gw)list3.get(j)) >= 0) {
                                lizj5 = ((0aF.a)list3.get(j)).LIZJ;
                                n.LIZIZ((Object)lizj5, "");
                            }
                        }
                        String lizj6 = lizj5;
                        if (lizj5.length() == 0) {
                            lizj6 = ((0aF.a)Qsi.LJIIL((List)list3)).LIZJ;
                            n.LIZIZ((Object)lizj6, "");
                        }
                        if (H25.LJFF) {
                            0ba.LIZ(4, "SpeedDetectorBusinessCommonFunction", "getSuggestedDefinitionByUploadSpeed(). suggestSdkKey=".concat(String.valueOf(lizj6)));
                        }
                        return lizj6;
                    }
                }
                return "";
            }
            String lizj = "ld";
            continue;
        }
    }
    
    public final float LIZIZ(final long n) {
        return n / 1024.0f / 1024.0f;
    }
    
    public final String LIZIZ() {
        final String s = "";
        try {
            final String release = Build$VERSION.RELEASE;
            n.LIZIZ((Object)release, "");
            String substring = release;
            if (release != null) {
                substring = release;
                if (release.length() > 10) {
                    substring = release.substring(0, 10);
                    n.LIZIZ((Object)substring, "");
                }
            }
            return substring;
        }
        catch (final Exception ex) {
            return s;
        }
    }
    
    public final boolean LIZJ(final long n) {
        return n > 64000L;
    }
}
