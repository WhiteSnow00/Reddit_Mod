// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.api.soundeffect;

import X.0go;
import kotlin.jvm.internal.n;
import X.0GA;
import X.0cB;
import com.bytedance.covode.number.Covode;
import X.0GE;

public abstract class SoundEffectDatabase extends 0GE
{
    public static SoundEffectDatabase LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(6234);
        final a<SoundEffectDatabase> liz = 0GA.LIZ(0cB.LJ(), SoundEffectDatabase.class, "db_live_effect");
        liz.LIZ();
        final SoundEffectDatabase liziz = liz.LIZIZ();
        n.LIZIZ((Object)liziz, "");
        SoundEffectDatabase.LJIIIIZZ = liziz;
    }
    
    public abstract 0go LJIIIIZZ();
}
