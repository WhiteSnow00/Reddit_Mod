// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import X.0Tb;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _PrivilegeLogExtra_ProtoDecoder implements 0TU<PrivilegeLogExtra>
{
    static {
        Covode.recordClassIndex(4984);
    }
    
    public static PrivilegeLogExtra LIZ(final 0Ta 0Ta) {
        final PrivilegeLogExtra privilegeLogExtra = new PrivilegeLogExtra();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            if (liziz != 1) {
                if (liziz != 2) {
                    if (liziz != 3) {
                        if (liziz != 4) {
                            0Tb.LIZJ(0Ta);
                        }
                        else {
                            privilegeLogExtra.LIZLLL = 0Ta.LIZLLL();
                        }
                    }
                    else {
                        privilegeLogExtra.LIZJ = 0Ta.LIZLLL();
                    }
                }
                else {
                    privilegeLogExtra.LIZIZ = 0Ta.LIZLLL();
                }
            }
            else {
                privilegeLogExtra.LIZ = 0Ta.LIZLLL();
            }
        }
        0Ta.LIZ(liz);
        return privilegeLogExtra;
    }
}
