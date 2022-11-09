// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import af2.c;
import com.reddit.domain.modtools.scheduledposts.ScheduledPostRepository;
import zg2.a;
import r31.g;
import r31.f;
import javax.inject.Provider;
import qb0.b;
import com.reddit.domain.modtools.scheduledposts.usecase.ConvertRichTextToMarkdownUseCase_Factory;
import com.reddit.domain.modtools.scheduledposts.usecase.UpdateScheduledPostUseCase_Factory;
import com.reddit.domain.modtools.scheduledposts.usecase.SubmitScheduledPostUseCase_Factory;
import uz.i;
import af2.e;

public final class lc
{
    public final a1 a;
    public e b;
    public i c;
    public SubmitScheduledPostUseCase_Factory d;
    public UpdateScheduledPostUseCase_Factory e;
    public ConvertRichTextToMarkdownUseCase_Factory f;
    public e g;
    public b h;
    public Provider<f> i;
    
    public lc(final a1 a, final g g, final r31.e e, final a a2) {
        this.a = a;
        this.b = af2.e.a((Object)g);
        final a1$t6 n0 = a.n0;
        final a1$p9 m = a.m;
        this.c = new i((Provider)n0, (Provider)m, 18);
        this.d = SubmitScheduledPostUseCase_Factory.create((Provider<ScheduledPostRepository>)n0, (Provider<q20.b>)m);
        this.e = UpdateScheduledPostUseCase_Factory.create((Provider<ScheduledPostRepository>)a.n0, (Provider<q20.b>)a.m);
        this.f = ConvertRichTextToMarkdownUseCase_Factory.create((Provider<ScheduledPostRepository>)a.n0, (Provider<q20.b>)a.m);
        this.g = af2.e.a((Object)e);
        this.h = new b((Provider)a.h, 22);
        this.i = (Provider<f>)af2.c.b((Provider)new yk0.e((Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)this.e, (Provider)this.f, (Provider)a.n0, (Provider)this.g, (Provider)a.y, (Provider)a.j0, (Provider)a.i, (Provider)this.h, (Provider)new cx.b((Provider)af2.e.a((Object)a2), (Provider)a.w, (Provider)a.A1, (Provider)a.r1, (Provider)a.J0, 9), (Provider)a.m, (Provider)a.r, 2));
    }
}
