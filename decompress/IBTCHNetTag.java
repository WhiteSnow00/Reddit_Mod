// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark;

import java.util.Map;
import com.bytedance.covode.number.Covode;

public interface IBTCHNetTag
{
    default static {
        Covode.recordClassIndex(2877);
    }
    
    Map<String, String> getNetTag();
}
