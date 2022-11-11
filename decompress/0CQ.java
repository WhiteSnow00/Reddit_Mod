// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;

public final class 0cq
{
    static {
        Covode.recordClassIndex(5761);
    }
    
    public static final G18 LIZ(final G18 g18, final ImageModel imageModel) {
        CTM.LIZ((Object)g18);
        Object o;
        if (imageModel == null || (o = imageModel.getUrls()) == null) {
            o = 6uH.INSTANCE;
        }
        g18.LIZ((List)o);
        return g18;
    }
}
