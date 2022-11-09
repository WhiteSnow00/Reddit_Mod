// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.annotation;

import com.bytedance.covode.number.Covode;

public @interface Group {
    default static {
        Covode.recordClassIndex(4882);
    }
    
    boolean isDefault() default false;
    
    String value() default "";
}
