// 
// Decompiled by Procyon v0.6.0
// 

package com.byted.mgl.exp.h5game.service.platform;

import android.content.Context;
import X.2P9;
import X.SRT;
import com.bytedance.covode.number.Covode;
import com.byted.mgl.exp.h5game.service.IMglService;

public interface IMglPlatformService extends IMglService
{
    default static {
        Covode.recordClassIndex(3844);
    }
    
    void open(final String p0, final SRT<? super Boolean, ? super String, 2P9> p1);
    
    void preload(final String... p0);
    
    void prepare(final Context p0);
    
    public static final class DefaultImpls
    {
        static {
            Covode.recordClassIndex(3845);
        }
        
        public static void onInstanceDestroy(final IMglPlatformService mglPlatformService) {
            IMglService.DefaultImpls.onInstanceDestroy(mglPlatformService);
        }
    }
}
