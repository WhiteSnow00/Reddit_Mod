// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.netUtils;

import X.7BB;
import com.bytedance.retrofit2.mime.TypedInput;
import X.7CD;
import X.5zN;
import X.75A;
import X.7B4;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public interface BytebenchFaasAPI
{
    default static {
        Covode.recordClassIndex(2971);
    }
    
    @7BB(LIZ = "/")
    7CD<TypedInput> reportResult(@7B4 final Map<String, String> p0, @5zN final 75A p1);
}
