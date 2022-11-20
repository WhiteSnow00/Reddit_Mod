// 
// Decompiled by Procyon v0.6.0
// 

package bb2;

import android.graphics.Bitmap;
import af2.t;
import java.io.File;
import com.reddit.video.creation.usecases.render.RenderVideoUseCase;
import ff2.o;

public final class c implements o
{
    public final int f;
    public final RenderVideoUseCase g;
    public final File h;
    
    public c(final RenderVideoUseCase g, final File h, final int f) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final Object apply(final Object o) {
        switch (this.f) {
            default: {
                return RenderVideoUseCase.s(this.g, this.h, (t)o);
            }
            case 0: {
                return RenderVideoUseCase.i(this.g, this.h, (Bitmap)o);
            }
        }
    }
}
