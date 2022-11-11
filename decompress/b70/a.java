// 
// Decompiled by Procyon v0.6.0
// 

package b70;

import sg2.e;
import javax.inject.Inject;
import com.reddit.domain.targeting.LowFrequencyData;
import java.util.concurrent.ConcurrentHashMap;

public final class a implements f
{
    public final ConcurrentHashMap<String, LowFrequencyData> a;
    
    @Inject
    public a() {
        this.a = new ConcurrentHashMap<String, LowFrequencyData>();
    }
    
    @Override
    public final LowFrequencyData a() {
        return this.a.get("low_frequency_user_cache_key_v2");
    }
    
    @Override
    public final void b(final LowFrequencyData lowFrequencyData) {
        e.f((Object)lowFrequencyData, "lowFrequencyData");
        this.a.put("low_frequency_user_cache_key_v2", lowFrequencyData);
    }
}
