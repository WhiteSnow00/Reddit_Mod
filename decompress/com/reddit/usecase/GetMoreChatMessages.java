// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.usecase;

import java.util.List;
import mg2.p;
import ah0.b;
import gg2.c;
import af2.c0;
import com.reddit.domain.model.MoreComment;
import com.reddit.domain.model.Link;
import javax.inject.Inject;
import ng2.e;
import android.content.Context;
import com.reddit.mapping.ChatMapper;
import s10.a;

public final class GetMoreChatMessages
{
    public final s10.a a;
    public final n10.a b;
    public final ChatMapper c;
    public final d20.a d;
    public final Context e;
    
    @Inject
    public GetMoreChatMessages(final s10.a a, final n10.a b, final ChatMapper c, final d20.a d, final Context e) {
        ng2.e.f((Object)a, "commentRepository");
        ng2.e.f((Object)b, "localCommentFetcher");
        ng2.e.f((Object)c, "chatMapper");
        ng2.e.f((Object)d, "dispatcherProvider");
        ng2.e.f((Object)e, "context");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final c0<a> a(final Link link, final MoreComment moreComment) {
        return ah0.b.m1((p)new GetMoreChatMessages$loadMoreMessagesSingle$1(this, link, moreComment, (c)null));
    }
    
    public static final class a
    {
        public final List<em0.c> a;
        public final MoreComment b;
        
        public a(final List<? extends em0.c> a, final MoreComment b) {
            e.f((Object)a, "models");
            this.a = (List<em0.c>)a;
            this.b = b;
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
            return ng2.e.a((Object)this.a, (Object)a.a) && ng2.e.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final MoreComment b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            return hashCode * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("LoadMoreResult(models=");
            t.append(this.a);
            t.append(", lastMoreComment=");
            t.append(this.b);
            t.append(')');
            return t.toString();
        }
    }
}
