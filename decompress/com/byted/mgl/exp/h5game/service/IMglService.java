// 
// Decompiled by Procyon v0.6.0
// 

package com.byted.mgl.exp.h5game.service;

import com.bytedance.covode.number.Covode;

public interface IMglService
{
    default static {
        Covode.recordClassIndex(3780);
    }
    
    void onInstanceDestroy();
    
    public static final class DefaultImpls
    {
        static {
            Covode.recordClassIndex(3781);
        }
        
        public static void onInstanceDestroy(final IMglService mglService) {
        }
    }
}
