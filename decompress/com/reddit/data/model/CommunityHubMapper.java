// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import com.reddit.fragment.MyRedditSubredditFragment$e$a;
import com.reddit.fragment.MyRedditSubredditFragment$e;
import com.reddit.queries.i8$a$a;
import com.reddit.queries.i8$a;
import com.reddit.queries.i8$e;
import com.reddit.queries.i8$c;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.AllowableContent;
import java.util.ArrayList;
import qg2.m;
import com.reddit.queries.i8$d;
import com.reddit.fragment.MyRedditSubredditFragment$f;
import com.reddit.fragment.MyRedditSubredditFragment$c;
import com.reddit.fragment.MyRedditSubredditFragment$a;
import com.reddit.fragment.MyRedditSubredditFragment$b;
import com.reddit.fragment.MyRedditSubredditFragment$d;
import com.reddit.type.PostType;
import com.reddit.domain.model.mod.ModPermissions;
import z10.w;
import ah2.f;
import com.reddit.domain.model.CommunityHubCommunityOwner;
import com.reddit.domain.model.CommunityHub;
import com.reddit.domain.model.Flair;
import com.reddit.fragment.MyRedditSubredditFragment;
import com.reddit.type.GalleryRestrictionPolicy;
import com.reddit.type.BodyRestrictionPolicy;
import java.util.List;
import com.reddit.domain.model.postrequirements.PostBodyRestrictionPolicy;
import com.reddit.domain.model.postrequirements.PostRequirements;
import com.reddit.fragment.PostRequirementsFragment;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J6\u0010\u000b\u001a\u00020\n*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0002J\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007¨\u0006\u0016" }, d2 = { "Lcom/reddit/data/model/CommunityHubMapper;", "", "Lcom/reddit/fragment/MyRedditSubredditFragment;", "Lcom/reddit/domain/model/postrequirements/PostRequirements;", "postRequirements", "", "loggedInUsername", "", "Lcom/reddit/domain/model/Flair;", "flairs", "Lcom/reddit/domain/model/CommunityHub;", "toCommunityHub", "Lcom/reddit/fragment/PostRequirementsFragment;", "mapPostRequirements", "Lcom/reddit/queries/i8$c;", "data", "mapToCommunityHub", "fragment", "Lcom/reddit/queries/i8$d;", "mapFlairs", "<init>", "()V", "data-remote_release" }, k = 1, mv = { 1, 7, 1 })
public final class CommunityHubMapper
{
    public static final CommunityHubMapper INSTANCE;
    
    static {
        INSTANCE = new CommunityHubMapper();
    }
    
    private CommunityHubMapper() {
    }
    
    private final PostRequirements mapPostRequirements(final PostRequirementsFragment postRequirementsFragment) {
        final List b = postRequirementsFragment.b;
        final List c = postRequirementsFragment.c;
        final List d = postRequirementsFragment.d;
        final BodyRestrictionPolicy e = postRequirementsFragment.e;
        final int n = -1;
        int n2;
        if (e == null) {
            n2 = -1;
        }
        else {
            n2 = WhenMappings.$EnumSwitchMapping$0[((Enum)e).ordinal()];
        }
        PostBodyRestrictionPolicy postBodyRestrictionPolicy;
        if (n2 != 1) {
            if (n2 != 2) {
                postBodyRestrictionPolicy = PostBodyRestrictionPolicy.NONE;
            }
            else {
                postBodyRestrictionPolicy = PostBodyRestrictionPolicy.NOT_ALLOWED;
            }
        }
        else {
            postBodyRestrictionPolicy = PostBodyRestrictionPolicy.REQUIRED;
        }
        final List f = postRequirementsFragment.f;
        final List g = postRequirementsFragment.g;
        final GalleryRestrictionPolicy h = postRequirementsFragment.h;
        int n3;
        if (h == null) {
            n3 = -1;
        }
        else {
            n3 = WhenMappings.$EnumSwitchMapping$1[((Enum)h).ordinal()];
        }
        PostBodyRestrictionPolicy postBodyRestrictionPolicy2;
        if (n3 != 1) {
            if (n3 != 2) {
                postBodyRestrictionPolicy2 = PostBodyRestrictionPolicy.NONE;
            }
            else {
                postBodyRestrictionPolicy2 = PostBodyRestrictionPolicy.NOT_ALLOWED;
            }
        }
        else {
            postBodyRestrictionPolicy2 = PostBodyRestrictionPolicy.REQUIRED;
        }
        final Integer i = postRequirementsFragment.i;
        final Integer j = postRequirementsFragment.j;
        final GalleryRestrictionPolicy k = postRequirementsFragment.k;
        int n4;
        if (k == null) {
            n4 = n;
        }
        else {
            n4 = WhenMappings.$EnumSwitchMapping$1[((Enum)k).ordinal()];
        }
        PostBodyRestrictionPolicy postBodyRestrictionPolicy3;
        if (n4 != 1) {
            if (n4 != 2) {
                postBodyRestrictionPolicy3 = PostBodyRestrictionPolicy.NONE;
            }
            else {
                postBodyRestrictionPolicy3 = PostBodyRestrictionPolicy.NOT_ALLOWED;
            }
        }
        else {
            postBodyRestrictionPolicy3 = PostBodyRestrictionPolicy.REQUIRED;
        }
        return new PostRequirements(b, c, d, postBodyRestrictionPolicy, f, g, postBodyRestrictionPolicy2, i, j, postBodyRestrictionPolicy3, postRequirementsFragment.l, postRequirementsFragment.m, postRequirementsFragment.t, postRequirementsFragment.s, postRequirementsFragment.r, postRequirementsFragment.p, postRequirementsFragment.q);
    }
    
    private final CommunityHub toCommunityHub(final MyRedditSubredditFragment myRedditSubredditFragment, final PostRequirements postRequirements, final String s, final List<Flair> list) {
        final MyRedditSubredditFragment$d o = myRedditSubredditFragment.o;
        CommunityHubCommunityOwner communityHubCommunityOwner = null;
        Label_0065: {
            if (o != null) {
                final MyRedditSubredditFragment$b c = o.c;
                if (c != null) {
                    final MyRedditSubredditFragment$a b = c.b;
                    if (b != null) {
                        communityHubCommunityOwner = new CommunityHubCommunityOwner(b.b, b.c, b.d);
                        break Label_0065;
                    }
                }
            }
            communityHubCommunityOwner = null;
        }
        String name;
        if (communityHubCommunityOwner != null) {
            name = communityHubCommunityOwner.getName();
        }
        else {
            name = null;
        }
        final boolean a = f.a((Object)s, (Object)name);
        final String c2 = myRedditSubredditFragment.c;
        final String b2 = myRedditSubredditFragment.b;
        final String e = myRedditSubredditFragment.e;
        final String d = myRedditSubredditFragment.d;
        final String g = w.g(b2);
        final String h = myRedditSubredditFragment.h;
        final MyRedditSubredditFragment$c j = myRedditSubredditFragment.j;
        final boolean b3 = j != null;
        final int n = (int)myRedditSubredditFragment.f;
        ModPermissions modPermissions;
        if (j != null) {
            modPermissions = new ModPermissions(j.c, j.d, j.e, j.f, j.g, j.h, j.i, j.j, j.b);
        }
        else {
            modPermissions = null;
        }
        final MyRedditSubredditFragment$f i = myRedditSubredditFragment.i;
        Object b4;
        if (i != null) {
            b4 = i.b;
        }
        else {
            b4 = null;
        }
        String s2;
        if (b4 instanceof String) {
            s2 = (String)b4;
        }
        else {
            s2 = null;
        }
        final boolean g2 = myRedditSubredditFragment.g;
        final boolean n2 = myRedditSubredditFragment.n;
        final boolean m = myRedditSubredditFragment.m;
        final boolean contains = myRedditSubredditFragment.l.contains(PostType.VIDEOGIF);
        final boolean contains2 = myRedditSubredditFragment.l.contains(PostType.LINK);
        final boolean contains3 = myRedditSubredditFragment.l.contains(PostType.POLL);
        final boolean contains4 = myRedditSubredditFragment.l.contains(PostType.TALK);
        final boolean contains5 = myRedditSubredditFragment.l.contains(PostType.TEXT);
        final MyRedditSubredditFragment$f k = myRedditSubredditFragment.i;
        Object c3;
        if (k != null) {
            c3 = k.c;
        }
        else {
            c3 = null;
        }
        String s3;
        if (c3 instanceof String) {
            s3 = (String)c3;
        }
        else {
            s3 = null;
        }
        final boolean contains6 = myRedditSubredditFragment.l.contains(PostType.VIDEO);
        final boolean contains7 = myRedditSubredditFragment.l.contains(PostType.IMAGE);
        CommunityHubCommunityOwner communityHubCommunityOwner2 = communityHubCommunityOwner;
        if (communityHubCommunityOwner == null) {
            communityHubCommunityOwner2 = new CommunityHubCommunityOwner("", "", "");
        }
        final MyRedditSubredditFragment$d o2 = myRedditSubredditFragment.o;
        return new CommunityHub(g, c2, n, 0, e, b2, h, d, contains, b3, s2, contains4, contains5, contains2, contains3, n2, contains6, contains7, a, g2, s3, modPermissions, communityHubCommunityOwner2, m, postRequirements, o2 != null && o2.b, (List)list);
    }
    
    public static /* synthetic */ CommunityHub toCommunityHub$default(final CommunityHubMapper communityHubMapper, final MyRedditSubredditFragment myRedditSubredditFragment, PostRequirements postRequirements, String s, List list, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            postRequirements = null;
        }
        if ((n & 0x2) != 0x0) {
            s = null;
        }
        if ((n & 0x4) != 0x0) {
            list = null;
        }
        return communityHubMapper.toCommunityHub(myRedditSubredditFragment, postRequirements, s, list);
    }
    
    public final List<Flair> mapFlairs(final List<i8$d> list) {
        f.f((Object)list, "flairs");
        final ArrayList list2 = new ArrayList(m.P0((Iterable)list, 10));
        for (final i8$d i8$d : list) {
            String b;
            if ((b = i8$d.b) == null) {
                b = "";
            }
            final String d = i8$d.d;
            final String c = i8$d.c;
            final boolean e = i8$d.e;
            final boolean f = i8$d.f;
            final String rawValue = i8$d.g.getRawValue();
            final Object h = i8$d.h;
            String string;
            if (h != null) {
                string = h.toString();
            }
            else {
                string = null;
            }
            list2.add((Object)new Flair(d, e, b, c, string, rawValue, null, f, i8$d.i, null, 576, null));
        }
        return (List<Flair>)list2;
    }
    
    public final CommunityHub mapToCommunityHub(final MyRedditSubredditFragment myRedditSubredditFragment) {
        f.f((Object)myRedditSubredditFragment, "fragment");
        return toCommunityHub$default(this, myRedditSubredditFragment, null, null, null, 7, null);
    }
    
    public final CommunityHub mapToCommunityHub(final i8$c i8$c, final String s) {
        f.f((Object)i8$c, "data");
        final i8$e a = i8$c.a;
        CommunityHub communityHub = null;
        MyRedditSubredditFragment a2 = null;
        Label_0047: {
            if (a != null) {
                final i8$a b = a.b;
                if (b != null) {
                    final i8$a$a c = b.c;
                    if (c != null) {
                        a2 = c.a;
                        break Label_0047;
                    }
                }
            }
            a2 = null;
        }
        PostRequirements mapPostRequirements = null;
        Label_0102: {
            if (a2 != null) {
                final MyRedditSubredditFragment$e k = a2.k;
                if (k != null) {
                    final MyRedditSubredditFragment$e$a b2 = k.b;
                    if (b2 != null) {
                        final PostRequirementsFragment a3 = b2.a;
                        if (a3 != null) {
                            mapPostRequirements = CommunityHubMapper.INSTANCE.mapPostRequirements(a3);
                            break Label_0102;
                        }
                    }
                }
            }
            mapPostRequirements = null;
        }
        final i8$e a4 = i8$c.a;
        List<Flair> mapFlairs = null;
        Label_0142: {
            if (a4 != null) {
                final i8$a b3 = a4.b;
                if (b3 != null) {
                    final List b4 = b3.b;
                    if (b4 != null) {
                        mapFlairs = CommunityHubMapper.INSTANCE.mapFlairs(b4);
                        break Label_0142;
                    }
                }
            }
            mapFlairs = null;
        }
        if (a2 != null) {
            communityHub = this.toCommunityHub(a2, mapPostRequirements, s, mapFlairs);
        }
        return communityHub;
    }
}
