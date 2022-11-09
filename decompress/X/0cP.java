// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.comp.api.image.IImageService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;

public final class 0cp
{
    public static final 0cp LIZ;
    public static final 5DO LIZIZ;
    
    static {
        Covode.recordClassIndex(5759);
        LIZ = new 0cp();
        LIZIZ = 3Os.LIZ((QgG)1sb.LIZ);
    }
    
    public static final G18 LIZ() {
        return 0cp.LIZ.LIZIZ().getImageLoader();
    }
    
    public static final boolean LIZ(final ImageModel imageModel) {
        return imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() > 0;
    }
    
    private final IImageService LIZIZ() {
        return (IImageService)0cp.LIZIZ.getValue();
    }
}
