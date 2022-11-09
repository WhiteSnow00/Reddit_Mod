// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.sociallinks;

import o22.v4;
import ah2.f;
import java.util.Iterator;
import zg2.p;
import com.reddit.mutations.x5;
import com.reddit.type.SetSocialLinksInput;
import o22.e3;
import h7.h$a;
import com.reddit.domain.model.SocialLinkInput;
import java.util.ArrayList;
import qg2.m;
import pj2.s;
import java.util.List;
import javax.inject.Inject;
import lb0.c;

public final class a
{
    public final c a;
    
    @Inject
    public a(final c70.a a) {
        this.a = (c)a;
    }
    
    public final s a(final List list) {
        final c70.a a = (c70.a)this.a;
        a.getClass();
        final ArrayList list2 = new ArrayList(m.P0((Iterable)list, 10));
        for (final SocialLinkInput socialLinkInput : list) {
            list2.add(new e3(c70.a.a(socialLinkInput.getType()), h$a.c((Object)socialLinkInput.getTitle()), h$a.c((Object)socialLinkInput.getHandle()), h$a.c((Object)socialLinkInput.getUrl())));
        }
        return new s((p)new RedditSocialLinkGraphqlDataSource$setSocialLinks$1(a, new x5(new SetSocialLinksInput(list2)), (tg2.c)null));
    }
    
    public final s b(final SocialLinkInput socialLinkInput) {
        final c70.a a = (c70.a)this.a;
        a.getClass();
        f.f((Object)socialLinkInput, "socialLinkInput");
        final String id = socialLinkInput.getId();
        f.c((Object)id);
        return new s((p)new RedditSocialLinkGraphqlDataSource$updateSocialLink$1(a, new v4(c70.a.a(socialLinkInput.getType()), h$a.c((Object)socialLinkInput.getTitle()), h$a.c((Object)socialLinkInput.getHandle()), h$a.c((Object)socialLinkInput.getUrl()), id), (tg2.c)null));
    }
}
