// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import com.reddit.mod.notes.domain.model.NoteFilter;
import com.reddit.screen.BaseScreen;

public final class ur implements du
{
    public final kl a;
    
    public ur(final kl a, final BaseScreen baseScreen, final String s, final String s2, final String s3, final String s4, final NoteFilter noteFilter, final String s5) {
        this.a = a;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
