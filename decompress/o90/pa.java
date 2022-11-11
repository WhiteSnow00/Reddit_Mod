// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import xy.k;
import ff0.q1;
import com.reddit.domain.modtools.language.LanguageRepository;
import c21.g;
import javax.inject.Provider;
import zz.c;
import qy.b;
import uw.f;
import com.reddit.domain.modtools.language.usecase.LoadActiveLanguagesUseCase_Factory;
import se2.e;

public final class pa
{
    public e a;
    public e b;
    public LoadActiveLanguagesUseCase_Factory c;
    public f d;
    public b e;
    public c f;
    public Provider<sg0.c> g;
    public Provider<c21.f> h;
    
    public pa(final z0 z0, final g g, final c21.e e) {
        this.a = se2.e.a((Object)g);
        this.b = se2.e.a((Object)e);
        this.c = LoadActiveLanguagesUseCase_Factory.create((Provider<LanguageRepository>)z0.H3, (Provider<m20.b>)z0.m);
        this.d = uw.f.b((Provider)z0.y, (Provider)z0.m);
        this.e = qy.b.c((Provider)z0.y, (Provider)z0.m, (Provider)z0.r);
        this.f = new c((Provider)z0.y, (Provider)z0.m, 25);
        final Provider b = se2.c.b((Provider)new q1((Provider)z0.h, 5));
        this.g = (Provider<sg0.c>)b;
        this.h = (Provider<c21.f>)se2.c.b((Provider)new k((Provider)this.a, (Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)this.e, (Provider)this.f, (Provider)z0.y, (Provider)z0.m, (Provider)z0.w, b, (Provider)z0.r, (Provider)z0.s1, 1));
    }
}
