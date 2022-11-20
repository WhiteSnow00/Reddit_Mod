// 
// Decompiled by Procyon v0.6.0
// 

package y50;

import jw1.b;
import com.reddit.type.MultiVisibility;
import com.reddit.fragment.ProfileFragment$f;
import com.reddit.fragment.ProfileFragment$a;
import com.reddit.fragment.ProfileFragment;
import com.reddit.fragment.CustomFeedMultiredditFragment$j;
import com.reddit.fragment.CustomFeedMultiredditFragment$f;
import com.reddit.fragment.CustomFeedMultiredditFragment$k;
import java.util.Iterator;
import com.reddit.fragment.CustomFeedMultiredditFragment$l;
import com.reddit.fragment.CustomFeedMultiredditFragment$b;
import com.reddit.fragment.CustomFeedMultiredditFragment$a;
import com.reddit.fragment.CustomFeedMultiredditFragment$i;
import com.reddit.domain.model.MyAccount;
import com.reddit.fragment.CustomFeedMultiredditFragment$c;
import com.reddit.domain.model.User;
import com.reddit.fragment.CustomFeedMultiredditFragment$d;
import com.reddit.fragment.CustomFeedMultiredditFragment$g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.SubredditCountrySiteSettings;
import java.util.List;
import com.reddit.notification.common.NotificationLevel;
import com.reddit.domain.model.Subreddit;
import com.reddit.fragment.CustomFeedMultiredditFragment$e;
import com.reddit.fragment.CustomFeedMultiredditFragment$h;
import java.util.ArrayList;
import dg2.m;
import com.reddit.domain.model.Multireddit$Visibility;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.domain.model.MultiredditPath;
import y10.w;
import com.reddit.domain.model.Multireddit;
import com.reddit.fragment.CustomFeedMultiredditFragment;
import javax.inject.Inject;
import ng2.e;
import com.reddit.session.n;
import mr0.g;

public final class u
{
    public final g a;
    public final n b;
    
    @Inject
    public u(final g a, final n b) {
        e.f((Object)a, "graphQlClient");
        e.f((Object)b, "sessionManager");
        this.a = a;
        this.b = b;
    }
    
    public final Multireddit a(final CustomFeedMultiredditFragment customFeedMultiredditFragment) {
        final String b = customFeedMultiredditFragment.b;
        final String c = customFeedMultiredditFragment.c;
        final CustomFeedMultiredditFragment$c d = customFeedMultiredditFragment.d;
        String string = null;
        Label_0048: {
            if (d != null) {
                final Object b2 = d.b;
                if (b2 != null) {
                    string = b2.toString();
                    break Label_0048;
                }
            }
            string = null;
        }
        final MyAccount c2 = this.b.C();
        boolean b4 = false;
        Label_0118: {
            if (c2 != null) {
                final CustomFeedMultiredditFragment$i e = customFeedMultiredditFragment.e;
                String b3;
                if (e != null) {
                    b3 = e.b;
                }
                else {
                    b3 = null;
                }
                if (ng2.e.a((Object)w.f(b3), (Object)w.g(((b)c2).getId()))) {
                    b4 = true;
                    break Label_0118;
                }
            }
            b4 = false;
        }
        final CustomFeedMultiredditFragment$i e2 = customFeedMultiredditFragment.e;
        e.c((Object)e2);
        final String b5 = e2.b;
        final CustomFeedMultiredditFragment$i e3 = customFeedMultiredditFragment.e;
        e.c((Object)e3);
        final CustomFeedMultiredditFragment$a c3 = e3.c;
        String s = null;
        Label_0202: {
            if (c3 != null) {
                s = c3.c;
                if (s != null) {
                    break Label_0202;
                }
            }
            final CustomFeedMultiredditFragment$b d2 = e3.d;
            if (d2 != null) {
                s = d2.c;
            }
            else {
                s = null;
            }
        }
        final String constructor-impl = MultiredditPath.constructor-impl(customFeedMultiredditFragment.h);
        final int n = u.a.a[((Enum)customFeedMultiredditFragment.g).ordinal()];
        Multireddit$Visibility multireddit$Visibility;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    multireddit$Visibility = Multireddit$Visibility.PRIVATE;
                }
                else {
                    multireddit$Visibility = Multireddit$Visibility.HIDDEN;
                }
            }
            else {
                multireddit$Visibility = Multireddit$Visibility.PUBLIC;
            }
        }
        else {
            multireddit$Visibility = Multireddit$Visibility.PRIVATE;
        }
        final String string2 = customFeedMultiredditFragment.i.toString();
        final CustomFeedMultiredditFragment$l l = customFeedMultiredditFragment.l;
        String s3 = null;
        List<Subreddit> list3 = null;
        Multireddit$Visibility multireddit$Visibility2 = null;
        String s4 = null;
        Label_0730: {
            if (l != null) {
                final List b6 = l.b;
                if (b6 != null) {
                    final ArrayList list = new ArrayList<CustomFeedMultiredditFragment$h>(m.u4((Iterable)b6, 10));
                    for (final CustomFeedMultiredditFragment$e customFeedMultiredditFragment$e : b6) {
                        e.c((Object)customFeedMultiredditFragment$e);
                        final CustomFeedMultiredditFragment$h b7 = customFeedMultiredditFragment$e.b;
                        e.c((Object)b7);
                        list.add(b7);
                    }
                    final ArrayList list2 = new ArrayList<Subreddit>(m.u4((Iterable)list, 10));
                    for (final CustomFeedMultiredditFragment$h customFeedMultiredditFragment$h : list) {
                        final String b8 = customFeedMultiredditFragment$h.b;
                        final String c4 = customFeedMultiredditFragment$h.c;
                        final String d3 = customFeedMultiredditFragment$h.d;
                        final long n2 = (long)customFeedMultiredditFragment$h.e;
                        final CustomFeedMultiredditFragment$k f = customFeedMultiredditFragment$h.f;
                        String string3 = null;
                        Label_0517: {
                            if (f != null) {
                                Object o;
                                if ((o = f.b) == null) {
                                    o = f.c;
                                }
                                if (o != null) {
                                    string3 = o.toString();
                                    break Label_0517;
                                }
                            }
                            string3 = null;
                        }
                        final CustomFeedMultiredditFragment$k f2 = customFeedMultiredditFragment$h.f;
                        String string4 = null;
                        Label_0588: {
                            if (f2 != null) {
                                Object o2;
                                if ((o2 = f2.d) == null) {
                                    final CustomFeedMultiredditFragment$f e4 = f2.e;
                                    if (e4 != null) {
                                        o2 = e4.b;
                                    }
                                    else {
                                        o2 = null;
                                    }
                                }
                                if (o2 != null) {
                                    string4 = o2.toString();
                                    break Label_0588;
                                }
                            }
                            string4 = null;
                        }
                        list2.add(new Subreddit(b8, null, c4, d3, string4, string3, null, null, null, null, null, n2, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, -2110, -1, 31, null));
                    }
                    final String s2 = s;
                    s3 = string2;
                    list3 = (List<Subreddit>)list2;
                    multireddit$Visibility2 = multireddit$Visibility;
                    s4 = s2;
                    break Label_0730;
                }
            }
            s3 = string2;
            multireddit$Visibility2 = multireddit$Visibility;
            final List list4 = null;
            s4 = s;
            list3 = list4;
        }
        final CustomFeedMultiredditFragment$j m = customFeedMultiredditFragment.m;
        if (m != null) {
            final List b9 = m.b;
            if (b9 != null) {
                final ArrayList list5 = new ArrayList<CustomFeedMultiredditFragment$g>(dg2.m.u4((Iterable)b9, 10));
                for (final CustomFeedMultiredditFragment$d customFeedMultiredditFragment$d : b9) {
                    e.c((Object)customFeedMultiredditFragment$d);
                    final CustomFeedMultiredditFragment$g b10 = customFeedMultiredditFragment$d.b;
                    e.c((Object)b10);
                    list5.add(b10);
                }
                final ArrayList list6 = new ArrayList<User>(dg2.m.u4((Iterable)list5, 10));
                final Iterator<CustomFeedMultiredditFragment$g> iterator4 = list5.iterator();
                while (iterator4.hasNext()) {
                    final ProfileFragment a = iterator4.next().b.a;
                    final ProfileFragment$a b11 = a.b.b;
                    String c5;
                    if (b11 != null) {
                        c5 = b11.c;
                    }
                    else {
                        c5 = null;
                    }
                    String c6;
                    if (b11 != null) {
                        c6 = b11.c;
                    }
                    else {
                        c6 = null;
                    }
                    final ProfileFragment$f o3 = a.o;
                    String string5 = null;
                    Label_0962: {
                        if (o3 != null) {
                            final Object b12 = o3.b;
                            if (b12 != null) {
                                string5 = b12.toString();
                                break Label_0962;
                            }
                        }
                        string5 = null;
                    }
                    list6.add(new User(c5, c6, string5));
                }
                final List<User> list7 = (List<User>)list6;
                return new Multireddit(b, c, string, b4, constructor-impl, b5, s4, s3, customFeedMultiredditFragment.j, Boolean.valueOf(customFeedMultiredditFragment.k), (List)list3, (List)list7, (int)customFeedMultiredditFragment.f, multireddit$Visibility2, (DefaultConstructorMarker)null);
            }
        }
        final List<User> list7 = null;
        return new Multireddit(b, c, string, b4, constructor-impl, b5, s4, s3, customFeedMultiredditFragment.j, Boolean.valueOf(customFeedMultiredditFragment.k), (List)list3, (List)list7, (int)customFeedMultiredditFragment.f, multireddit$Visibility2, (DefaultConstructorMarker)null);
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[MultiVisibility.values().length];
            a2[((Enum)MultiVisibility.PRIVATE).ordinal()] = 1;
            a2[((Enum)MultiVisibility.PUBLIC).ordinal()] = 2;
            a2[((Enum)MultiVisibility.HIDDEN).ordinal()] = 3;
            a2[((Enum)MultiVisibility.UNKNOWN__).ordinal()] = 4;
            a = a2;
        }
    }
}
