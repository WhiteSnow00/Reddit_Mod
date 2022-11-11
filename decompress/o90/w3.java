// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import com.reddit.domain.modtools.scheduledposts.ScheduledPostRepository;
import com.reddit.domain.modtools.scheduledposts.usecase.UpdateScheduledPostUseCase_Factory;
import com.reddit.domain.modtools.scheduledposts.UpdateScheduledPostData;
import b21.b;
import t81.c;
import javax.inject.Provider;
import se2.e;

public final class w3
{
    public final z0 a;
    public e b;
    public e c;
    public e d;
    public Provider<c> e;
    
    public w3(final z0 a, final b b, final UpdateScheduledPostData updateScheduledPostData, final b21.c c) {
        this.a = a;
        this.b = se2.e.a((Object)b);
        this.c = se2.e.a((Object)updateScheduledPostData);
        this.d = se2.e.b((Object)c);
        this.e = (Provider<c>)se2.c.b((Provider)new jx.c((Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)UpdateScheduledPostUseCase_Factory.create((Provider<ScheduledPostRepository>)a.o0, (Provider<m20.b>)a.m), 13));
    }
}
