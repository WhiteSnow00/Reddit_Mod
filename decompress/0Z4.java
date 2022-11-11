// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.network.response.RequestError;
import com.google.gson.a.c;
import com.bytedance.android.livesdk.model.Extra;

public class 0z4<T, R extends Extra>
{
    @c(LIZ = "data")
    public T data;
    public transient RequestError error;
    @c(LIZ = "extra")
    public R extra;
    public String logId;
    public 6xW metrics;
    public 6vz requestInfo;
    public int requestType;
    @c(LIZ = "status_code")
    public int statusCode;
    
    static {
        Covode.recordClassIndex(10479);
    }
}
