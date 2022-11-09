// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.modtools.remote;

import com.reddit.fragment.ModPnSettingsRowFragment$b;
import com.reddit.fragment.ModPnSettingsRowFragment$d;
import com.reddit.fragment.ModPnSettingsRowFragment$c;
import com.reddit.domain.modtools.pnsettings.model.Row$Range;
import com.reddit.domain.modtools.pnsettings.model.Row$Toggle;
import com.reddit.domain.modtools.pnsettings.model.ModNotificationSettingsIcon;
import com.reddit.type.ModPnSettingsLayoutIcon;
import com.reddit.mutations.e7$d;
import com.reddit.mutations.e7$c;
import com.reddit.mutations.e7$b;
import com.reddit.mutations.e7;
import o22.d4;
import o22.u1$a;
import com.reddit.mutations.c7$d;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.mutations.c7$c;
import com.reddit.mutations.c7$b;
import com.reddit.mutations.c7;
import o22.c4;
import o22.t1$a;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.type.ModPnStatus;
import com.reddit.domain.model.UpdateResponse;
import com.reddit.queries.l3$c;
import com.reddit.queries.l3$b;
import com.reddit.queries.l3$a;
import com.reddit.queries.l3$d;
import kl0.zf;
import java.util.Iterator;
import com.reddit.fragment.ModPnSettingsRowFragment$a;
import com.reddit.fragment.ModPnSettingsRowFragment;
import com.reddit.queries.l3$i;
import com.reddit.queries.l3$h;
import com.reddit.queries.l3$e;
import com.reddit.queries.l3$t;
import java.util.List;
import kotlin.collections.EmptyList;
import com.reddit.queries.l3$j;
import com.reddit.queries.l3$s;
import com.reddit.queries.l3$k;
import com.reddit.queries.l3$r;
import com.reddit.queries.l3$l;
import com.reddit.queries.l3$q;
import com.reddit.queries.l3$m;
import com.reddit.queries.l3$p;
import com.reddit.queries.l3$n;
import com.reddit.domain.modtools.pnsettings.model.Row;
import com.reddit.queries.l3$o;
import com.reddit.domain.modtools.pnsettings.model.Section;
import java.util.ArrayList;
import qg2.m;
import com.reddit.queries.l3$g;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.l3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.modtools.pnsettings.model.Row$Group;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import ur0.g;

public final class RemoteModNotificationSettingsDataSource
{
    public final g a;
    
    @Inject
    public RemoteModNotificationSettingsDataSource(final g a) {
        f.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public final Object a(String c, final c<? super Row$Group> c2) {
        Object o = null;
        Label_0050: {
            if (c2 instanceof RemoteModNotificationSettingsDataSource$getSettingsLayout.RemoteModNotificationSettingsDataSource$getSettingsLayout$1) {
                final RemoteModNotificationSettingsDataSource$getSettingsLayout.RemoteModNotificationSettingsDataSource$getSettingsLayout$1 remoteModNotificationSettingsDataSource$getSettingsLayout$1 = (RemoteModNotificationSettingsDataSource$getSettingsLayout.RemoteModNotificationSettingsDataSource$getSettingsLayout$1)c2;
                final int label = remoteModNotificationSettingsDataSource$getSettingsLayout$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteModNotificationSettingsDataSource$getSettingsLayout$1.label = label + Integer.MIN_VALUE;
                    o = remoteModNotificationSettingsDataSource$getSettingsLayout$1;
                    break Label_0050;
                }
            }
            o = new RemoteModNotificationSettingsDataSource$getSettingsLayout.RemoteModNotificationSettingsDataSource$getSettingsLayout$1(this, (c)c2);
        }
        final Object result = ((RemoteModNotificationSettingsDataSource$getSettingsLayout.RemoteModNotificationSettingsDataSource$getSettingsLayout$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteModNotificationSettingsDataSource$getSettingsLayout.RemoteModNotificationSettingsDataSource$getSettingsLayout$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final l3 l3 = new l3(c);
            ((RemoteModNotificationSettingsDataSource$getSettingsLayout.RemoteModNotificationSettingsDataSource$getSettingsLayout$1)o).label = 1;
            if ((b = e$a.b(14, (k)l3, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final l3$t a2 = ((l3$g)b).a;
        if (a2 != null) {
            final l3$e b2 = a2.b;
            if (b2 != null) {
                final l3$h b3 = b2.b;
                if (b3 != null) {
                    final l3$i c3 = b3.c;
                    if (c3 != null) {
                        final ModPnSettingsRowFragment a3 = c3.c.a;
                        if (a3 != null) {
                            ModPnSettingsRowFragment$a e = a3.e;
                            if (e != null) {
                                final List b4 = c3.b;
                                ArrayList<Section> list = new ArrayList<Section>(m.P0((Iterable)b4, 10));
                                Iterator iterator = b4.iterator();
                                while (iterator.hasNext()) {
                                    final l3$o l3$o = (l3$o)iterator.next();
                                    zf a4 = l3$o.c.a;
                                    final List b5 = l3$o.b;
                                    ArrayList<Row> list2 = new ArrayList<Row>();
                                    Iterator iterator2 = b5.iterator();
                                    while (iterator2.hasNext()) {
                                        final l3$n l3$n = (l3$n)iterator2.next();
                                        ModPnSettingsRowFragment a5 = l3$n.b.a;
                                        final l3$d c4 = l3$n.c;
                                        ArrayList<Section> list3 = null;
                                        zf zf7 = null;
                                        ArrayList<Row> list28 = null;
                                        ModPnSettingsRowFragment$a modPnSettingsRowFragment$a6 = null;
                                        Label_1406: {
                                            if (c4 != null) {
                                                final List b6 = c4.b;
                                                if (b6 != null) {
                                                    list3 = new ArrayList<Section>(m.P0((Iterable)b6, 10));
                                                    Iterator iterator3 = b6.iterator();
                                                    ModPnSettingsRowFragment$a modPnSettingsRowFragment$a = e;
                                                    Iterator iterator4 = iterator;
                                                    while (iterator3.hasNext()) {
                                                        final l3$p l3$p = (l3$p)iterator3.next();
                                                        final zf a6 = l3$p.c.a;
                                                        final List b7 = l3$p.b;
                                                        final ArrayList<Row> list4 = new ArrayList<Row>();
                                                        Iterator iterator5 = b7.iterator();
                                                        ArrayList<Row> list5 = list2;
                                                        zf zf = a4;
                                                        ModPnSettingsRowFragment$a modPnSettingsRowFragment$a2 = modPnSettingsRowFragment$a;
                                                        final Iterator iterator6 = iterator4;
                                                        while (iterator5.hasNext()) {
                                                            final l3$m l3$m = (l3$m)iterator5.next();
                                                            final ModPnSettingsRowFragment a7 = l3$m.b.a;
                                                            final l3$a c5 = l3$m.c;
                                                            ModPnSettingsRowFragment$a modPnSettingsRowFragment$a4 = null;
                                                            ArrayList<Row> list18 = null;
                                                            Iterator iterator15 = null;
                                                            List<Section> list20 = null;
                                                            ModPnSettingsRowFragment modPnSettingsRowFragment3 = null;
                                                            Iterator iterator16 = null;
                                                            Iterator iterator17 = null;
                                                            ArrayList<Section> list21 = null;
                                                            zf zf5 = null;
                                                            ArrayList<Section> list22 = null;
                                                            Label_1237: {
                                                                if (c5 != null) {
                                                                    final List b8 = c5.b;
                                                                    if (b8 != null) {
                                                                        final ArrayList list6 = new ArrayList<Section>(m.P0((Iterable)b8, 10));
                                                                        final Iterator iterator7 = b8.iterator();
                                                                        ModPnSettingsRowFragment modPnSettingsRowFragment = a5;
                                                                        final Iterator iterator8 = iterator3;
                                                                        ArrayList<Row> list7 = list5;
                                                                        zf zf2 = zf;
                                                                        final Iterator iterator9 = iterator2;
                                                                        final ModPnSettingsRowFragment$a modPnSettingsRowFragment$a3 = modPnSettingsRowFragment$a2;
                                                                        while (iterator7.hasNext()) {
                                                                            final l3$q l3$q = (l3$q)iterator7.next();
                                                                            final zf a8 = l3$q.c.a;
                                                                            final List b9 = l3$q.b;
                                                                            final ArrayList<Row> list8 = new ArrayList<Row>();
                                                                            final Iterator iterator10 = b9.iterator();
                                                                            final ArrayList<Section> list9 = list3;
                                                                            final ModPnSettingsRowFragment modPnSettingsRowFragment2 = modPnSettingsRowFragment;
                                                                            final ArrayList<Section> list10 = list;
                                                                            final ArrayList<Row> list11 = list7;
                                                                            final zf zf3 = zf2;
                                                                            while (iterator10.hasNext()) {
                                                                                final l3$l l3$l = (l3$l)iterator10.next();
                                                                                final ModPnSettingsRowFragment a9 = l3$l.b.a;
                                                                                final l3$b c6 = l3$l.c;
                                                                                List<Section> list17 = null;
                                                                                Label_1048: {
                                                                                    if (c6 != null) {
                                                                                        final List b10 = c6.b;
                                                                                        if (b10 != null) {
                                                                                            final ArrayList list12 = new ArrayList<Section>(m.P0((Iterable)b10, 10));
                                                                                            for (final l3$r l3$r : b10) {
                                                                                                final zf a10 = l3$r.c.a;
                                                                                                final List b11 = l3$r.b;
                                                                                                final ArrayList<Row> list13 = new ArrayList<Row>();
                                                                                                for (final l3$k l3$k : b11) {
                                                                                                    final ModPnSettingsRowFragment a11 = l3$k.b.a;
                                                                                                    final l3$c c7 = l3$k.c;
                                                                                                    List<Section> list16 = null;
                                                                                                    Label_0971: {
                                                                                                        if (c7 != null) {
                                                                                                            final List b12 = c7.b;
                                                                                                            if (b12 != null) {
                                                                                                                final ArrayList list14 = new ArrayList<Section>(m.P0((Iterable)b12, 10));
                                                                                                                for (final l3$s l3$s : b12) {
                                                                                                                    final zf a12 = l3$s.c.a;
                                                                                                                    final List b13 = l3$s.b;
                                                                                                                    final ArrayList<Row> list15 = new ArrayList<Row>();
                                                                                                                    final Iterator iterator14 = b13.iterator();
                                                                                                                    while (iterator14.hasNext()) {
                                                                                                                        final Row b14 = RemoteModNotificationSettingsDataSource.a.b(((l3$j)iterator14.next()).b.a, (List)EmptyList.INSTANCE);
                                                                                                                        if (b14 != null) {
                                                                                                                            list15.add(b14);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    list14.add(new Section(a12.b, a12.c, list15));
                                                                                                                }
                                                                                                                list16 = (List<Section>)list14;
                                                                                                                break Label_0971;
                                                                                                            }
                                                                                                        }
                                                                                                        list16 = null;
                                                                                                    }
                                                                                                    Object instance = list16;
                                                                                                    if (list16 == null) {
                                                                                                        instance = EmptyList.INSTANCE;
                                                                                                    }
                                                                                                    final Row b15 = RemoteModNotificationSettingsDataSource.a.b(a11, (List)instance);
                                                                                                    if (b15 != null) {
                                                                                                        list13.add(b15);
                                                                                                    }
                                                                                                }
                                                                                                list12.add(new Section(a10.b, a10.c, list13));
                                                                                            }
                                                                                            list17 = (List<Section>)list12;
                                                                                            break Label_1048;
                                                                                        }
                                                                                    }
                                                                                    list17 = null;
                                                                                }
                                                                                Object instance2 = list17;
                                                                                if (list17 == null) {
                                                                                    instance2 = EmptyList.INSTANCE;
                                                                                }
                                                                                final Row b16 = RemoteModNotificationSettingsDataSource.a.b(a9, (List)instance2);
                                                                                if (b16 != null) {
                                                                                    list8.add(b16);
                                                                                }
                                                                            }
                                                                            list6.add(new Section(a8.b, a8.c, list8));
                                                                            zf2 = zf3;
                                                                            list7 = list11;
                                                                            list = list10;
                                                                            modPnSettingsRowFragment = modPnSettingsRowFragment2;
                                                                            list3 = list9;
                                                                        }
                                                                        modPnSettingsRowFragment$a4 = modPnSettingsRowFragment$a3;
                                                                        final zf zf4 = zf2;
                                                                        list18 = list7;
                                                                        final ArrayList<Section> list19 = list3;
                                                                        iterator15 = iterator5;
                                                                        list20 = (List<Section>)list6;
                                                                        modPnSettingsRowFragment3 = modPnSettingsRowFragment;
                                                                        iterator16 = iterator8;
                                                                        iterator17 = iterator9;
                                                                        list21 = list;
                                                                        zf5 = zf4;
                                                                        list22 = list19;
                                                                        break Label_1237;
                                                                    }
                                                                }
                                                                final ModPnSettingsRowFragment$a modPnSettingsRowFragment$a5 = modPnSettingsRowFragment$a2;
                                                                final Iterator iterator18 = iterator2;
                                                                final zf zf6 = zf;
                                                                list18 = list5;
                                                                final Iterator iterator19 = iterator3;
                                                                final ArrayList<Section> list23 = list;
                                                                final ModPnSettingsRowFragment modPnSettingsRowFragment4 = a5;
                                                                list22 = list3;
                                                                iterator15 = iterator5;
                                                                final List list24 = null;
                                                                zf5 = zf6;
                                                                list21 = list23;
                                                                modPnSettingsRowFragment$a4 = modPnSettingsRowFragment$a5;
                                                                iterator17 = iterator18;
                                                                iterator16 = iterator19;
                                                                modPnSettingsRowFragment3 = modPnSettingsRowFragment4;
                                                                list20 = list24;
                                                            }
                                                            Object instance3 = list20;
                                                            if (list20 == null) {
                                                                instance3 = EmptyList.INSTANCE;
                                                            }
                                                            final Row b17 = RemoteModNotificationSettingsDataSource.a.b(a7, (List)instance3);
                                                            if (b17 != null) {
                                                                list4.add(b17);
                                                            }
                                                            final Iterator iterator20 = iterator17;
                                                            final Iterator iterator21 = iterator15;
                                                            final ArrayList<Section> list25 = list21;
                                                            final ArrayList<Row> list26 = list18;
                                                            final ArrayList<Section> list27 = list22;
                                                            modPnSettingsRowFragment$a2 = modPnSettingsRowFragment$a4;
                                                            iterator2 = iterator20;
                                                            zf = zf5;
                                                            list5 = list26;
                                                            iterator3 = iterator16;
                                                            list = list25;
                                                            a5 = modPnSettingsRowFragment3;
                                                            list3 = list27;
                                                            iterator5 = iterator21;
                                                        }
                                                        list3.add(new Section(a6.b, a6.c, list4));
                                                        iterator4 = iterator6;
                                                        modPnSettingsRowFragment$a = modPnSettingsRowFragment$a2;
                                                        a4 = zf;
                                                        list2 = list5;
                                                    }
                                                    iterator = iterator4;
                                                    zf7 = a4;
                                                    list28 = list2;
                                                    modPnSettingsRowFragment$a6 = modPnSettingsRowFragment$a;
                                                    break Label_1406;
                                                }
                                            }
                                            final ModPnSettingsRowFragment$a modPnSettingsRowFragment$a7 = e;
                                            zf7 = a4;
                                            final ArrayList<Section> list29 = null;
                                            list28 = list2;
                                            modPnSettingsRowFragment$a6 = modPnSettingsRowFragment$a7;
                                            list3 = list29;
                                        }
                                        Object instance4 = list3;
                                        if (list3 == null) {
                                            instance4 = EmptyList.INSTANCE;
                                        }
                                        final Row b18 = RemoteModNotificationSettingsDataSource.a.b(a5, (List)instance4);
                                        if (b18 != null) {
                                            list28.add(b18);
                                        }
                                        a4 = zf7;
                                        e = modPnSettingsRowFragment$a6;
                                        list2 = list28;
                                    }
                                    list.add(new Section(a4.b, a4.c, list2));
                                }
                                final String b19 = e.b;
                                if ((c = e.c) == null) {
                                    c = "";
                                }
                                return new Row$Group(b19, c, e.d, e.f, (List)list);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public final Object b(String b, final String s, final Boolean b2, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteModNotificationSettingsDataSource$updateModPnSettingStatus.RemoteModNotificationSettingsDataSource$updateModPnSettingStatus$1) {
                final RemoteModNotificationSettingsDataSource$updateModPnSettingStatus.RemoteModNotificationSettingsDataSource$updateModPnSettingStatus$1 remoteModNotificationSettingsDataSource$updateModPnSettingStatus$1 = (RemoteModNotificationSettingsDataSource$updateModPnSettingStatus.RemoteModNotificationSettingsDataSource$updateModPnSettingStatus$1)c;
                final int label = remoteModNotificationSettingsDataSource$updateModPnSettingStatus$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteModNotificationSettingsDataSource$updateModPnSettingStatus$1.label = label + Integer.MIN_VALUE;
                    o = remoteModNotificationSettingsDataSource$updateModPnSettingStatus$1;
                    break Label_0059;
                }
            }
            o = new RemoteModNotificationSettingsDataSource$updateModPnSettingStatus.RemoteModNotificationSettingsDataSource$updateModPnSettingStatus$1(this, (c)c);
        }
        final Object result = ((RemoteModNotificationSettingsDataSource$updateModPnSettingStatus.RemoteModNotificationSettingsDataSource$updateModPnSettingStatus$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteModNotificationSettingsDataSource$updateModPnSettingStatus.RemoteModNotificationSettingsDataSource$updateModPnSettingStatus$1)o).label;
        Object b3;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b3 = result;
        }
        else {
            aj2.c.Q0(result);
            ModPnStatus modPnStatus;
            if (f.a((Object)b2, (Object)Boolean.TRUE)) {
                modPnStatus = ModPnStatus.ENABLED;
            }
            else if (f.a((Object)b2, (Object)Boolean.FALSE)) {
                modPnStatus = ModPnStatus.DISABLED;
            }
            else {
                if (b2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                modPnStatus = ModPnStatus.AUTO;
            }
            final g a = this.a;
            final c7 c2 = new c7(new c4(b, t1$a.a(s), modPnStatus));
            ((RemoteModNotificationSettingsDataSource$updateModPnSettingStatus.RemoteModNotificationSettingsDataSource$updateModPnSettingStatus$1)o).label = 1;
            if ((b3 = e$a.b(14, (k)c2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final c7$d a2 = ((c7$b)b3).a;
        Object o2 = null;
        final String s2 = null;
        if (a2 != null) {
            final boolean b4 = a2.b;
            final List c3 = a2.c;
            b = s2;
            if (c3 != null) {
                final c7$c c7$c = (c7$c)CollectionsKt___CollectionsKt.s1(c3);
                b = s2;
                if (c7$c != null) {
                    b = c7$c.b;
                }
            }
            o2 = new UpdateResponse(b4, b);
        }
        return o2;
    }
    
    public final Object c(String b, final String s, final int n, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteModNotificationSettingsDataSource$updateModPnSettingThreshold.RemoteModNotificationSettingsDataSource$updateModPnSettingThreshold$1) {
                final RemoteModNotificationSettingsDataSource$updateModPnSettingThreshold.RemoteModNotificationSettingsDataSource$updateModPnSettingThreshold$1 remoteModNotificationSettingsDataSource$updateModPnSettingThreshold$1 = (RemoteModNotificationSettingsDataSource$updateModPnSettingThreshold.RemoteModNotificationSettingsDataSource$updateModPnSettingThreshold$1)c;
                final int label = remoteModNotificationSettingsDataSource$updateModPnSettingThreshold$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteModNotificationSettingsDataSource$updateModPnSettingThreshold$1.label = label + Integer.MIN_VALUE;
                    o = remoteModNotificationSettingsDataSource$updateModPnSettingThreshold$1;
                    break Label_0059;
                }
            }
            o = new RemoteModNotificationSettingsDataSource$updateModPnSettingThreshold.RemoteModNotificationSettingsDataSource$updateModPnSettingThreshold$1(this, (c)c);
        }
        final Object result = ((RemoteModNotificationSettingsDataSource$updateModPnSettingThreshold.RemoteModNotificationSettingsDataSource$updateModPnSettingThreshold$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteModNotificationSettingsDataSource$updateModPnSettingThreshold.RemoteModNotificationSettingsDataSource$updateModPnSettingThreshold$1)o).label;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final e7 e7 = new e7(new d4(b, u1$a.a(s), n));
            ((RemoteModNotificationSettingsDataSource$updateModPnSettingThreshold.RemoteModNotificationSettingsDataSource$updateModPnSettingThreshold$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)e7, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final e7$d a2 = ((e7$b)b2).a;
        Object o2 = null;
        final String s2 = null;
        if (a2 != null) {
            final boolean b3 = a2.b;
            final List c2 = a2.c;
            b = s2;
            if (c2 != null) {
                final e7$c e7$c = (e7$c)CollectionsKt___CollectionsKt.s1(c2);
                b = s2;
                if (e7$c != null) {
                    b = e7$c.b;
                }
            }
            o2 = new UpdateResponse(b3, b);
        }
        return o2;
    }
    
    public static final class a
    {
        public static ModNotificationSettingsIcon a(final ModPnSettingsLayoutIcon modPnSettingsLayoutIcon) {
            ModNotificationSettingsIcon modNotificationSettingsIcon = null;
            switch (RemoteModNotificationSettingsDataSource.a.a.a[((Enum)modPnSettingsLayoutIcon).ordinal()]) {
                default: {
                    modNotificationSettingsIcon = null;
                    break;
                }
                case 9: {
                    modNotificationSettingsIcon = ModNotificationSettingsIcon.REPORT;
                    break;
                }
                case 8: {
                    modNotificationSettingsIcon = ModNotificationSettingsIcon.MESSAGE;
                    break;
                }
                case 7: {
                    modNotificationSettingsIcon = ModNotificationSettingsIcon.RISING;
                    break;
                }
                case 6: {
                    modNotificationSettingsIcon = ModNotificationSettingsIcon.FEED_POSTS;
                    break;
                }
                case 5: {
                    modNotificationSettingsIcon = ModNotificationSettingsIcon.CROSSPOST;
                    break;
                }
                case 4: {
                    modNotificationSettingsIcon = ModNotificationSettingsIcon.COMMENT;
                    break;
                }
                case 3: {
                    modNotificationSettingsIcon = ModNotificationSettingsIcon.INFO;
                    break;
                }
                case 2: {
                    modNotificationSettingsIcon = ModNotificationSettingsIcon.TOP;
                    break;
                }
                case 1: {
                    modNotificationSettingsIcon = ModNotificationSettingsIcon.NOTIFY;
                    break;
                }
            }
            return modNotificationSettingsIcon;
        }
        
        public static Row b(final ModPnSettingsRowFragment modPnSettingsRowFragment, final List list) {
            final ModPnSettingsRowFragment$c d = modPnSettingsRowFragment.d;
            final ModNotificationSettingsIcon modNotificationSettingsIcon = null;
            final Row row = null;
            final ModNotificationSettingsIcon modNotificationSettingsIcon2 = null;
            Object o;
            if (d != null) {
                final String b = d.b;
                String c = d.c;
                if (c == null) {
                    c = "";
                }
                final String d2 = d.d;
                final boolean f = d.f;
                final ModPnSettingsLayoutIcon e = d.e;
                ModNotificationSettingsIcon a = modNotificationSettingsIcon2;
                if (e != null) {
                    a = a(e);
                }
                o = new Row$Toggle(b, c, a, d2, f, true, d.h.f);
            }
            else {
                final ModPnSettingsRowFragment$d c2 = modPnSettingsRowFragment.c;
                if (c2 != null) {
                    final String b2 = c2.b;
                    String c3 = c2.c;
                    if (c3 == null) {
                        c3 = "";
                    }
                    final String d3 = c2.d;
                    final boolean f2 = c2.f;
                    final ModPnSettingsLayoutIcon e2 = c2.e;
                    ModNotificationSettingsIcon a2 = modNotificationSettingsIcon;
                    if (e2 != null) {
                        a2 = a(e2);
                    }
                    o = new Row$Toggle(b2, c3, a2, d3, f2, false, c2.h.f);
                }
                else {
                    final ModPnSettingsRowFragment$b b3 = modPnSettingsRowFragment.b;
                    Object o2;
                    if (b3 != null) {
                        final String b4 = b3.b;
                        String c4 = b3.c;
                        if (c4 == null) {
                            c4 = "";
                        }
                        o2 = new Row$Range(b4, c4, b3.d, b3.g, b3.j ^ true, b3.f, b3.i, b3.k.f);
                    }
                    else {
                        o2 = null;
                    }
                    if (o2 != null) {
                        o = o2;
                    }
                    else {
                        final ModPnSettingsRowFragment$a e3 = modPnSettingsRowFragment.e;
                        o = row;
                        if (e3 != null) {
                            final String b5 = e3.b;
                            String c5 = e3.c;
                            if (c5 == null) {
                                c5 = "";
                            }
                            o = new Row$Group(b5, c5, e3.d, e3.f, list);
                        }
                    }
                }
            }
            return (Row)o;
        }
    }
}
