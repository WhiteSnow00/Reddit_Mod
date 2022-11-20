// 
// Decompiled by Procyon v0.6.0
// 

package bb2;

import af2.t;
import java.io.File;
import com.reddit.video.creation.usecases.render.RenderVideoUseCase;
import ff2.o;

public final class e implements o
{
    public final int f;
    public final RenderVideoUseCase g;
    public final File h;
    
    public e(final RenderVideoUseCase g, final File h, final int f) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final Object apply(final Object o) {
        switch (this.f) {
            default: {
                return RenderVideoUseCase.n(this.g, this.h, (t)o);
            }
            case 0: {
                return RenderVideoUseCase.l(this.g, this.h, (t)o);
            }
        }
    }
}
