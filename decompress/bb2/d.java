// 
// Decompiled by Procyon v0.6.0
// 

package bb2;

import com.reddit.video.creation.usecases.render.RenderVideoResult;
import com.reddit.video.creation.usecases.render.RenderVideoUseCase;
import ff2.g;

public final class d implements g
{
    public final RenderVideoUseCase f;
    public final long g;
    
    public d(final RenderVideoUseCase f, final long g) {
        this.f = f;
        this.g = g;
    }
    
    public final void accept(final Object o) {
        RenderVideoUseCase.f(this.f, this.g, (RenderVideoResult)o);
    }
}
