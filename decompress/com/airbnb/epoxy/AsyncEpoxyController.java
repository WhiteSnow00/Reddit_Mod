// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.epoxy;

import X.0Iy;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import X.0J4;

public abstract class AsyncEpoxyController extends 0J4
{
    static {
        Covode.recordClassIndex(2106);
    }
    
    public AsyncEpoxyController() {
        this(true);
    }
    
    public AsyncEpoxyController(final boolean b) {
        this(b, b);
    }
    
    public AsyncEpoxyController(final boolean b, final boolean b2) {
        super(getHandler(b), getHandler(b2));
    }
    
    public static Handler getHandler(final boolean b) {
        if (b) {
            return 0Iy.LIZ();
        }
        return 0Iy.LIZ;
    }
}
