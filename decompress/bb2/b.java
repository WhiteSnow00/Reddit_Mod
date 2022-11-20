// 
// Decompiled by Procyon v0.6.0
// 

package bb2;

import java.util.List;
import af2.t;
import java.io.File;
import com.reddit.video.creation.usecases.render.RenderVideoUseCase;
import ff2.o;

public final class b implements o
{
    public final int f;
    public final RenderVideoUseCase g;
    public final File h;
    
    public b(final RenderVideoUseCase g, final File h, final int f) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final Object apply(final Object o) {
        switch (this.f) {
            default: {
                return RenderVideoUseCase.r(this.g, this.h, (t)o);
            }
            case 1: {
                return RenderVideoUseCase.o(this.g, this.h, (File)o);
            }
            case 0: {
                return RenderVideoUseCase.x(this.g, this.h, (List)o);
            }
        }
    }
}
