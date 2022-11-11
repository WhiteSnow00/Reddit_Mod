// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.netUtils;

import X.7BB;
import X.5zN;
import X.75A;
import X.5zS;
import X.7B9;
import X.5zM;
import com.bytedance.retrofit2.mime.TypedInput;
import X.7CD;
import X.7B4;
import java.util.Map;
import X.5zK;
import com.bytedance.covode.number.Covode;

public interface BytebenchAPI
{
    default static {
        Covode.recordClassIndex(2970);
    }
    
    @5zM
    @7B9
    7CD<TypedInput> doGet(@5zK final String p0, @7B4(LIZ = true) final Map<String, String> p1);
    
    @5zM
    @7BB
    7CD<TypedInput> doPost(@5zK final String p0, @7B4(LIZ = true) final Map<String, String> p1, @5zS final Map<String, String> p2, @5zN final 75A p3);
    
    @7BB(LIZ = "/bytebench/api/sdk/bytebench/config")
    7CD<Object<Object>> getByteBenchGlobalConfig(@5zS final Map<String, String> p0, @7B4 final Map<String, String> p1, @5zN final 75A p2);
    
    @7B9(LIZ = "/bytebench/api/task/group")
    7CD<TypedInput> getDefaultBenchmark(@5zS final Map<String, String> p0, @7B4 final Map<String, String> p1);
    
    @7BB(LIZ = "/bytebench/api/sdk/device/score")
    7CD<Object<Object>> getDeviceScore(@5zS final Map<String, String> p0, @7B4 final Map<String, String> p1, @5zN final 75A p2);
    
    @7B9(LIZ = "/model/api/arithmetics")
    7CD<TypedInput> getModels(@7B4 final Map<String, String> p0);
    
    @7BB(LIZ = "/bytebench/api/sdk/device/strategy/batch/v2")
    7CD<TypedInput> getStrategyCompriseV2(@5zS final Map<String, String> p0, @7B4 final Map<String, String> p1, @5zN final 75A p2);
    
    @7BB(LIZ = "/bytebench/api/task/result")
    7CD<TypedInput> reportResult(@7B4 final Map<String, String> p0, @5zN final 75A p1);
}
