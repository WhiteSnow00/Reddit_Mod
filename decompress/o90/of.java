// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import se2.c;
import j20.a;
import com.reddit.common.localization.translations.TranslationsAnalytics;
import javax.inject.Provider;
import com.reddit.screen.BaseScreen;

public final class of
{
    public final BaseScreen a;
    public final z0 b;
    public Provider<TranslationsAnalytics> c;
    
    public of(final z0 b, final BaseScreen a) {
        this.b = b;
        this.a = a;
        this.c = (Provider<TranslationsAnalytics>)se2.c.b((Provider)j20.a.a((Provider)b.h));
    }
}
