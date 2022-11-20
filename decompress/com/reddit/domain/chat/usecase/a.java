// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.usecase;

import com.reddit.domain.chat.model.ChatChannel;
import java.util.List;
import mg2.q;
import kotlinx.coroutines.flow.f;
import gg2.c;
import javax.inject.Inject;
import ng2.e;
import pa0.b;

public final class a
{
    public final b a;
    
    @Inject
    public a(final b a) {
        e.f((Object)a, "repository");
        this.a = a;
    }
    
    public final GetChannelsUseCase$execute$$inlined$map$2 a() {
        return new GetChannelsUseCase$execute$$inlined$map$2(new GetChannelsUseCase$execute$$inlined$map$1(new GetChannelsUseCase$execute$$inlined$filter$1(new f((cj2.e)this.a.a(), (cj2.e)this.a.b(), (q)new GetChannelsUseCase$pair$1((c)null)))));
    }
    
    public final f b() {
        return new f((cj2.e)new GetChannelsUseCase$execute$$inlined$filterIsInstance$1((cj2.e)this.a.a()), (cj2.e)new GetChannelsUseCase$execute$$inlined$filterIsInstance$2((cj2.e)this.a.b()), (q)new GetChannelsUseCase$execute$2((c)null));
    }
    
    public static final class a
    {
        public final List<ChatChannel> a;
        public final int b;
        public final List<ChatChannel> c;
        public final boolean d;
        
        public a(final int b, final List a, final List c, final boolean d) {
            e.f((Object)a, "invites");
            e.f((Object)c, "joinedChannels");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return e.a((Object)this.a, (Object)a.a) && this.b == a.b && e.a((Object)this.c, (Object)a.c) && this.d == a.d;
        }
        
        @Override
        public final int hashCode() {
            final int b = ph0.a.b((List)this.c, aq2.a.c(this.b, this.a.hashCode() * 31, 31), 31);
            int d;
            if ((d = (this.d ? 1 : 0)) != 0) {
                d = 1;
            }
            return b + d;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("Result(invites=");
            t.append(this.a);
            t.append(", invitesCount=");
            t.append(this.b);
            t.append(", joinedChannels=");
            t.append(this.c);
            t.append(", canLoadMoreJoinedChannels=");
            return d.n(t, this.d, ')');
        }
    }
}
