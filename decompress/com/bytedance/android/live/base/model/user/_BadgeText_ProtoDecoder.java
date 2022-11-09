// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import X.0Tb;
import java.util.ArrayList;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _BadgeText_ProtoDecoder implements 0TU<BadgeText>
{
    static {
        Covode.recordClassIndex(4979);
    }
    
    public static BadgeText LIZ(final 0Ta 0Ta) {
        final BadgeText badgeText = new BadgeText();
        badgeText.LIZJ = new ArrayList<String>();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            if (liziz != 1) {
                if (liziz != 2) {
                    if (liziz != 3) {
                        0Tb.LIZJ(0Ta);
                    }
                    else {
                        badgeText.LIZJ.add(0Ta.LIZLLL());
                    }
                }
                else {
                    badgeText.LIZIZ = 0Ta.LIZLLL();
                }
            }
            else {
                badgeText.LIZ = 0Ta.LIZLLL();
            }
        }
        0Ta.LIZ(liz);
        return badgeText;
    }
}
