// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.sociallinks;

import y12.v4;
import ng2.e;
import java.util.Iterator;
import cg2.j;
import cj2.f;
import mg2.p;
import com.reddit.mutations.x5;
import com.reddit.type.SetSocialLinksInput;
import y12.e3;
import h7.h$a;
import com.reddit.domain.model.SocialLinkInput;
import java.util.ArrayList;
import dg2.m;
import cj2.s;
import java.util.List;
import javax.inject.Inject;
import eb0.c;

public final class a
{
    public final c a;
    
    @Inject
    public a(final w60.a a) {
        this.a = (c)a;
    }
    
    public final s a(final List list) {
        final w60.a a = (w60.a)this.a;
        a.getClass();
        final ArrayList list2 = new ArrayList(m.u4((Iterable)list, 10));
        for (final SocialLinkInput socialLinkInput : list) {
            list2.add(new e3(w60.a.a(socialLinkInput.getType()), h$a.c((Object)socialLinkInput.getTitle()), h$a.c((Object)socialLinkInput.getHandle()), h$a.c((Object)socialLinkInput.getUrl())));
        }
        return new s((mg2.p<? super cj2.f<? super Object>, ? super gg2.c<? super j>, ?>)new RedditSocialLinkGraphqlDataSource$setSocialLinks$1(a, new x5(new SetSocialLinksInput(list2)), (gg2.c)null));
    }
    
    public final s b(final SocialLinkInput socialLinkInput) {
        final w60.a a = (w60.a)this.a;
        a.getClass();
        e.f((Object)socialLinkInput, "socialLinkInput");
        final String id = socialLinkInput.getId();
        e.c((Object)id);
        return new s((mg2.p<? super cj2.f<? super Object>, ? super gg2.c<? super j>, ?>)new RedditSocialLinkGraphqlDataSource$updateSocialLink$1(a, new v4(w60.a.a(socialLinkInput.getType()), h$a.c((Object)socialLinkInput.getTitle()), h$a.c((Object)socialLinkInput.getHandle()), h$a.c((Object)socialLinkInput.getUrl()), id), (gg2.c)null));
    }
}
