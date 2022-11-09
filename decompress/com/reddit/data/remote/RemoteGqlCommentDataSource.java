// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.mutations.w6$d;
import com.reddit.mutations.w6$c;
import com.reddit.mutations.w6$b;
import com.reddit.mutations.w6;
import o22.a4;
import com.reddit.data.model.graphql.GqlDataToDomainModelMapperKt;
import com.reddit.domain.model.vote.VoteDirection;
import com.reddit.mutations.q6$d;
import com.reddit.mutations.q6$b;
import com.reddit.mutations.q6;
import o22.w3;
import com.reddit.type.CommentFollowState;
import com.reddit.mutations.u6$d;
import com.reddit.mutations.u6$c;
import com.reddit.mutations.u6$b;
import com.reddit.mutations.u6;
import o22.y3;
import com.reddit.type.CommentSaveState;
import kl0.sh;
import com.reddit.queries.n7$k$a;
import com.reddit.queries.n7$k;
import com.reddit.queries.n7$j;
import com.reddit.queries.n7$i;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import com.reddit.queries.n7$h;
import com.reddit.domain.model.ModComment;
import com.reddit.queries.n7$g;
import com.reddit.queries.n7;
import com.reddit.type.ModQueueItemType;
import java.util.ArrayList;
import qg2.m;
import n11.b;
import com.reddit.type.ModQueueType;
import com.reddit.domain.model.ModQueueCommentResponse;
import com.reddit.domain.repository.ModQueueContentType;
import com.reddit.domain.repository.ModQueueSortingType;
import com.reddit.queries.p2$a$a;
import com.reddit.queries.p2$a;
import com.reddit.queries.p2$c;
import com.reddit.queries.p2;
import com.reddit.mutations.s6$b;
import com.reddit.mutations.s6$f;
import com.reddit.mutations.s6$d;
import com.reddit.mutations.s6$e;
import com.reddit.mutations.s6$c;
import com.reddit.mutations.s6;
import o22.x3;
import com.reddit.domain.model.comment.EditCommentRemoteResponse;
import com.reddit.mutations.o6;
import o22.v3;
import com.reddit.data.adapter.GqlDistinguishTypeMapper;
import com.reddit.type.CommentDistinguishState;
import pg2.j;
import com.reddit.frontpage.presentation.link.DistinguishType;
import com.reddit.mutations.b2$c;
import com.reddit.mutations.b2$d;
import com.reddit.mutations.b2$b;
import com.reddit.mutations.b2;
import com.reddit.domain.model.UpdateResponse;
import java.util.List;
import com.reddit.fragment.CommentFragment;
import com.reddit.mutations.i0$a$a;
import com.reddit.mutations.i0$a;
import com.reddit.mutations.i0$b;
import com.reddit.mutations.i0$d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.Result$Error;
import com.reddit.mutations.i0$f;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.mutations.i0$g;
import com.reddit.domain.model.Result$Success;
import com.squareup.moshi.JsonAdapter;
import com.reddit.data.model.graphql.GqlCommentToCommentDomainModelMapper;
import com.reddit.mutations.i0$e;
import okhttp3.OkHttpClient;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.mutations.i0;
import androidx.appcompat.widget.s0;
import o22.r;
import h7.h;
import o22.o;
import h7.h$a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.Comment;
import com.reddit.domain.model.Result;
import tg2.c;
import java.util.Map;
import com.reddit.domain.model.comment.CreateCommentParentType;
import javax.inject.Inject;
import pg2.f;
import com.squareup.moshi.y;
import u01.a;
import ur0.g;

public final class RemoteGqlCommentDataSource
{
    public final g a;
    public final a b;
    public final y c;
    public final rr0.a d;
    public final f e;
    
    @Inject
    public RemoteGqlCommentDataSource(final g a, final a b, final y c, final rr0.a d) {
        ah2.f.f((Object)a, "graphQlClient");
        ah2.f.f((Object)b, "modActionsDataSource");
        ah2.f.f((Object)c, "moshi");
        ah2.f.f((Object)d, "goldFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = kotlin.a.b((zg2.a)new RemoteGqlCommentDataSource$richTextAdapter.RemoteGqlCommentDataSource$richTextAdapter$2(this));
    }
    
    public final Object a(final CreateCommentParentType createCommentParentType, String s, final String s2, final Map<String, String> map, final c<? super Result<Comment>> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteGqlCommentDataSource$createMarkdown.RemoteGqlCommentDataSource$createMarkdown$1) {
                final RemoteGqlCommentDataSource$createMarkdown.RemoteGqlCommentDataSource$createMarkdown$1 remoteGqlCommentDataSource$createMarkdown$1 = (RemoteGqlCommentDataSource$createMarkdown.RemoteGqlCommentDataSource$createMarkdown$1)c;
                final int label = remoteGqlCommentDataSource$createMarkdown$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlCommentDataSource$createMarkdown$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlCommentDataSource$createMarkdown$1;
                    break Label_0059;
                }
            }
            o = new RemoteGqlCommentDataSource$createMarkdown.RemoteGqlCommentDataSource$createMarkdown$1(this, (c)c);
        }
        final Object result = ((RemoteGqlCommentDataSource$createMarkdown.RemoteGqlCommentDataSource$createMarkdown$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlCommentDataSource$createMarkdown.RemoteGqlCommentDataSource$createMarkdown$1)o).label;
        RemoteGqlCommentDataSource remoteGqlCommentDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlCommentDataSource = (RemoteGqlCommentDataSource)((RemoteGqlCommentDataSource$createMarkdown.RemoteGqlCommentDataSource$createMarkdown$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            String s3;
            if (createCommentParentType == CreateCommentParentType.LINK) {
                s3 = s;
            }
            else {
                s3 = null;
            }
            final h c2 = h$a.c((Object)s3);
            if (createCommentParentType != CreateCommentParentType.COMMENT) {
                s = null;
            }
            final i0 i0 = new i0(new r(c2, h$a.c((Object)s), new o(h$a.c((Object)s2), (h)null, 2)), s0.h(this.d));
            ((RemoteGqlCommentDataSource$createMarkdown.RemoteGqlCommentDataSource$createMarkdown$1)o).L$0 = this;
            ((RemoteGqlCommentDataSource$createMarkdown.RemoteGqlCommentDataSource$createMarkdown$1)o).label = 1;
            b = e$a.b(10, (k)i0, (e)a, (RetryAlgo)null, (Map)map, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlCommentDataSource = this;
        }
        final i0$d a2 = ((i0$e)b).a;
        Object o2;
        if (a2 != null) {
            final i0$b b2 = a2.b;
            CommentFragment a3 = null;
            Label_0293: {
                if (b2 != null) {
                    final i0$a b3 = b2.b;
                    if (b3 != null) {
                        final i0$a$a b4 = b3.b;
                        if (b4 != null) {
                            a3 = b4.a;
                            break Label_0293;
                        }
                    }
                }
                a3 = null;
            }
            if (a2.c && a3 != null) {
                final GqlCommentToCommentDomainModelMapper instance = GqlCommentToCommentDomainModelMapper.INSTANCE;
                final JsonAdapter jsonAdapter = (JsonAdapter)remoteGqlCommentDataSource.e.getValue();
                ah2.f.e((Object)jsonAdapter, "richTextAdapter");
                o2 = new Result$Success((Object)instance.map(a3, jsonAdapter));
            }
            else {
                final List e = a2.e;
                String s4 = null;
                Label_0416: {
                    if (e != null) {
                        final i0$g i0$g = (i0$g)CollectionsKt___CollectionsKt.s1(e);
                        if (i0$g != null) {
                            s = i0$g.c;
                            if ((s4 = s) != null) {
                                break Label_0416;
                            }
                        }
                    }
                    final List d = a2.d;
                    Label_0407: {
                        if (d != null) {
                            final i0$f i0$f = (i0$f)CollectionsKt___CollectionsKt.s1(d);
                            if (i0$f != null) {
                                s = i0$f.b;
                                break Label_0407;
                            }
                        }
                        s = null;
                    }
                    s4 = s;
                    if (s == null) {
                        s4 = "";
                    }
                }
                o2 = new Result$Error(s4, false, 2, (DefaultConstructorMarker)null);
            }
        }
        else {
            o2 = new Result$Error("Empty response from endpoint", false, 2, (DefaultConstructorMarker)null);
        }
        return o2;
    }
    
    public final Object b(String b, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlCommentDataSource$delete.RemoteGqlCommentDataSource$delete$1) {
                final RemoteGqlCommentDataSource$delete.RemoteGqlCommentDataSource$delete$1 remoteGqlCommentDataSource$delete$1 = (RemoteGqlCommentDataSource$delete.RemoteGqlCommentDataSource$delete$1)c;
                final int label = remoteGqlCommentDataSource$delete$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlCommentDataSource$delete$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlCommentDataSource$delete$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlCommentDataSource$delete.RemoteGqlCommentDataSource$delete$1(this, (c)c);
        }
        final Object result = ((RemoteGqlCommentDataSource$delete.RemoteGqlCommentDataSource$delete$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlCommentDataSource$delete.RemoteGqlCommentDataSource$delete$1)o).label;
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
            final b2 b3 = new b2(new o22.i0(b));
            ((RemoteGqlCommentDataSource$delete.RemoteGqlCommentDataSource$delete$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)b3, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final b2$c a2 = ((b2$b)b2).a;
        final String s = null;
        UpdateResponse updateResponse;
        if (a2 != null) {
            final boolean b4 = a2.b;
            final List c2 = a2.c;
            b = s;
            if (c2 != null) {
                final b2$d b2$d = (b2$d)CollectionsKt___CollectionsKt.s1(c2);
                b = s;
                if (b2$d != null) {
                    b = b2$d.b;
                }
            }
            updateResponse = new UpdateResponse(b4, b);
        }
        else {
            updateResponse = new UpdateResponse(false, null);
        }
        return updateResponse;
    }
    
    public final Object c(String l$1, final DistinguishType distinguishType, boolean z$0, final c<? super j> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1) {
                final RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1 remoteGqlCommentDataSource$distinguish$1 = (RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1)c;
                final int label = remoteGqlCommentDataSource$distinguish$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlCommentDataSource$distinguish$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlCommentDataSource$distinguish$1;
                    break Label_0059;
                }
            }
            o = new RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1(this, (c)c);
        }
        final Object result = ((RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1)o).label;
        RemoteGqlCommentDataSource remoteGqlCommentDataSource;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    aj2.c.Q0(result);
                    return j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                z$0 = ((RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1)o).Z$0;
                l$1 = (String)((RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1)o).L$1;
                remoteGqlCommentDataSource = (RemoteGqlCommentDataSource)((RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1)o).L$0;
                aj2.c.Q0(result);
            }
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final o6 o2 = new o6(new v3(l$1, CommentDistinguishState.NONE, GqlDistinguishTypeMapper.INSTANCE.map(distinguishType)));
            ((RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1)o).L$0 = this;
            ((RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1)o).L$1 = l$1;
            ((RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1)o).Z$0 = z$0;
            ((RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1)o).label = 1;
            if (e$a.b(14, (k)o2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlCommentDataSource = this;
        }
        final a b = remoteGqlCommentDataSource.b;
        ((RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1)o).L$0 = null;
        ((RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1)o).L$1 = null;
        ((RemoteGqlCommentDataSource$distinguish.RemoteGqlCommentDataSource$distinguish$1)o).label = 2;
        if (b.b(l$1, z$0, (c)o) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return j.a;
    }
    
    public final Object d(String string, String s, final c<? super Result<EditCommentRemoteResponse>> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlCommentDataSource$editMarkdown.RemoteGqlCommentDataSource$editMarkdown$1) {
                final RemoteGqlCommentDataSource$editMarkdown.RemoteGqlCommentDataSource$editMarkdown$1 remoteGqlCommentDataSource$editMarkdown$1 = (RemoteGqlCommentDataSource$editMarkdown.RemoteGqlCommentDataSource$editMarkdown$1)c;
                final int label = remoteGqlCommentDataSource$editMarkdown$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlCommentDataSource$editMarkdown$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlCommentDataSource$editMarkdown$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlCommentDataSource$editMarkdown.RemoteGqlCommentDataSource$editMarkdown$1(this, (c)c);
        }
        final Object result = ((RemoteGqlCommentDataSource$editMarkdown.RemoteGqlCommentDataSource$editMarkdown$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlCommentDataSource$editMarkdown.RemoteGqlCommentDataSource$editMarkdown$1)o).label;
        final String s2 = null;
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
            final s6 s3 = new s6(new x3(string, new o(h$a.c((Object)s), (h)null, 2)));
            ((RemoteGqlCommentDataSource$editMarkdown.RemoteGqlCommentDataSource$editMarkdown$1)o).label = 1;
            if ((b = e$a.b(14, (k)s3, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final s6$f a2 = ((s6$c)b).a;
        Object o2;
        if (a2 != null) {
            if (a2.c) {
                final s6$b b2 = a2.b;
                if (b2 != null) {
                    s = b2.b;
                    ah2.f.c((Object)b2);
                    final String c2 = b2.c;
                    final s6$b b3 = a2.b;
                    ah2.f.c((Object)b3);
                    final Object d = b3.d;
                    string = s2;
                    if (d != null) {
                        string = d.toString();
                    }
                    o2 = new Result$Success((Object)new EditCommentRemoteResponse(s, c2, string));
                    return o2;
                }
            }
            final List e = a2.e;
            Label_0338: {
                if (e != null) {
                    final s6$e s6$e = (s6$e)CollectionsKt___CollectionsKt.s1(e);
                    if (s6$e != null) {
                        s = s6$e.b;
                        if ((string = s) != null) {
                            break Label_0338;
                        }
                    }
                }
                final List d2 = a2.d;
                Label_0329: {
                    if (d2 != null) {
                        final s6$d s6$d = (s6$d)CollectionsKt___CollectionsKt.s1(d2);
                        if (s6$d != null) {
                            s = s6$d.b;
                            break Label_0329;
                        }
                    }
                    s = null;
                }
                string = s;
                if (s == null) {
                    string = "";
                }
            }
            o2 = new Result$Error(string, false, 2, (DefaultConstructorMarker)null);
        }
        else {
            o2 = new Result$Error("Empty response from endpoint", false, 2, (DefaultConstructorMarker)null);
        }
        return o2;
    }
    
    public final Object e(final String s, final c<? super Result<Comment>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlCommentDataSource$getCommentById.RemoteGqlCommentDataSource$getCommentById$1) {
                final RemoteGqlCommentDataSource$getCommentById.RemoteGqlCommentDataSource$getCommentById$1 remoteGqlCommentDataSource$getCommentById$1 = (RemoteGqlCommentDataSource$getCommentById.RemoteGqlCommentDataSource$getCommentById$1)c;
                final int label = remoteGqlCommentDataSource$getCommentById$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlCommentDataSource$getCommentById$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlCommentDataSource$getCommentById$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlCommentDataSource$getCommentById.RemoteGqlCommentDataSource$getCommentById$1(this, (c)c);
        }
        final Object result = ((RemoteGqlCommentDataSource$getCommentById.RemoteGqlCommentDataSource$getCommentById$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlCommentDataSource$getCommentById.RemoteGqlCommentDataSource$getCommentById$1)o).label;
        RemoteGqlCommentDataSource remoteGqlCommentDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlCommentDataSource = (RemoteGqlCommentDataSource)((RemoteGqlCommentDataSource$getCommentById.RemoteGqlCommentDataSource$getCommentById$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final p2 p2 = new p2(s, s0.h(this.d));
            ((RemoteGqlCommentDataSource$getCommentById.RemoteGqlCommentDataSource$getCommentById$1)o).L$0 = this;
            ((RemoteGqlCommentDataSource$getCommentById.RemoteGqlCommentDataSource$getCommentById$1)o).label = 1;
            b = e$a.b(14, (k)p2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlCommentDataSource = this;
        }
        final p2$a a2 = ((p2$c)b).a;
        if (a2 != null) {
            final p2$a$a b2 = a2.b;
            if (b2 != null) {
                final CommentFragment a3 = b2.a;
                if (a3 != null) {
                    final GqlCommentToCommentDomainModelMapper instance = GqlCommentToCommentDomainModelMapper.INSTANCE;
                    final JsonAdapter jsonAdapter = (JsonAdapter)remoteGqlCommentDataSource.e.getValue();
                    ah2.f.e((Object)jsonAdapter, "richTextAdapter");
                    return new Result$Success((Object)instance.map(a3, jsonAdapter));
                }
            }
        }
        return new Result$Error("Unknown", false, 2, (DefaultConstructorMarker)null);
    }
    
    public final Object f(String c, final ModQueueSortingType modQueueSortingType, final String s, final List<? extends ModQueueContentType> list, final c<? super ModQueueCommentResponse> c2) {
        Object o = null;
        Label_0059: {
            if (c2 instanceof RemoteGqlCommentDataSource$getModQueueItems.RemoteGqlCommentDataSource$getModQueueItems$1) {
                final RemoteGqlCommentDataSource$getModQueueItems.RemoteGqlCommentDataSource$getModQueueItems$1 remoteGqlCommentDataSource$getModQueueItems$1 = (RemoteGqlCommentDataSource$getModQueueItems.RemoteGqlCommentDataSource$getModQueueItems$1)c2;
                final int label = remoteGqlCommentDataSource$getModQueueItems$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlCommentDataSource$getModQueueItems$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlCommentDataSource$getModQueueItems$1;
                    break Label_0059;
                }
            }
            o = new RemoteGqlCommentDataSource$getModQueueItems.RemoteGqlCommentDataSource$getModQueueItems$1(this, (c)c2);
        }
        final Object result = ((RemoteGqlCommentDataSource$getModQueueItems.RemoteGqlCommentDataSource$getModQueueItems$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlCommentDataSource$getModQueueItems.RemoteGqlCommentDataSource$getModQueueItems$1)o).label;
        final String s2 = null;
        RemoteGqlCommentDataSource remoteGqlCommentDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlCommentDataSource = (RemoteGqlCommentDataSource)((RemoteGqlCommentDataSource$getModQueueItems.RemoteGqlCommentDataSource$getModQueueItems$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            List x;
            if (c != null) {
                x = ah2.c.X((Object)c);
            }
            else {
                x = null;
            }
            final h c3 = h$a.c((Object)x);
            final ModQueueType mod = ModQueueType.MOD;
            final h c4 = h$a.c((Object)n11.b.a(modQueueSortingType));
            ah2.f.f((Object)list, "<this>");
            final ArrayList list2 = new ArrayList<ModQueueItemType>(m.P0((Iterable)list, 10));
            for (final ModQueueContentType modQueueContentType : list) {
                ah2.f.f((Object)modQueueContentType, "<this>");
                final int n = n11.a.a[modQueueContentType.ordinal()];
                ModQueueItemType modQueueItemType;
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            modQueueItemType = ModQueueItemType.UNKNOWN__;
                        }
                        else {
                            modQueueItemType = ModQueueItemType.CHAT_COMMENT;
                        }
                    }
                    else {
                        modQueueItemType = ModQueueItemType.COMMENT;
                    }
                }
                else {
                    modQueueItemType = ModQueueItemType.POST;
                }
                list2.add(modQueueItemType);
            }
            final n7 n2 = new n7(c3, mod, c4, h$a.c((Object)list2), h$a.c((Object)s), s0.h(this.d));
            ((RemoteGqlCommentDataSource$getModQueueItems.RemoteGqlCommentDataSource$getModQueueItems$1)o).L$0 = this;
            ((RemoteGqlCommentDataSource$getModQueueItems.RemoteGqlCommentDataSource$getModQueueItems$1)o).label = 1;
            b = e$a.b(14, (k)n2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlCommentDataSource = this;
        }
        final n7$g n7$g = (n7$g)b;
        final n7$i a2 = n7$g.a;
        Object instance = null;
        Label_0489: {
            if (a2 != null) {
                final List c5 = a2.c;
                if (c5 != null) {
                    final ArrayList<ModComment> list3 = new ArrayList<ModComment>();
                    final Iterator iterator2 = c5.iterator();
                    while (true) {
                        instance = list3;
                        if (!iterator2.hasNext()) {
                            break Label_0489;
                        }
                        final n7$h n7$h = (n7$h)iterator2.next();
                        ModComment modComment = null;
                        Label_0472: {
                            if (n7$h != null) {
                                final n7$j b2 = n7$h.b;
                                if (b2 != null) {
                                    final GqlCommentToCommentDomainModelMapper instance2 = GqlCommentToCommentDomainModelMapper.INSTANCE;
                                    final JsonAdapter jsonAdapter = (JsonAdapter)remoteGqlCommentDataSource.e.getValue();
                                    ah2.f.e((Object)jsonAdapter, "richTextAdapter");
                                    modComment = instance2.toModComment(b2, jsonAdapter);
                                    break Label_0472;
                                }
                            }
                            modComment = null;
                        }
                        if (modComment == null) {
                            continue;
                        }
                        list3.add(modComment);
                    }
                }
            }
            instance = EmptyList.INSTANCE;
        }
        final n7$i a3 = n7$g.a;
        c = s2;
        if (a3 != null) {
            final n7$k b3 = a3.b;
            c = s2;
            if (b3 != null) {
                final n7$k$a b4 = b3.b;
                c = s2;
                if (b4 != null) {
                    sh a4 = b4.a;
                    c = s2;
                    if (a4 != null) {
                        if (!a4.b) {
                            a4 = null;
                        }
                        c = s2;
                        if (a4 != null) {
                            c = a4.c;
                        }
                    }
                }
            }
        }
        return new ModQueueCommentResponse((List<ModComment>)instance, c);
    }
    
    public final Object g(String b, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlCommentDataSource$save.RemoteGqlCommentDataSource$save$1) {
                final RemoteGqlCommentDataSource$save.RemoteGqlCommentDataSource$save$1 remoteGqlCommentDataSource$save$1 = (RemoteGqlCommentDataSource$save.RemoteGqlCommentDataSource$save$1)c;
                final int label = remoteGqlCommentDataSource$save$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlCommentDataSource$save$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlCommentDataSource$save$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlCommentDataSource$save.RemoteGqlCommentDataSource$save$1(this, (c)c);
        }
        final Object result = ((RemoteGqlCommentDataSource$save.RemoteGqlCommentDataSource$save$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlCommentDataSource$save.RemoteGqlCommentDataSource$save$1)o).label;
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
            final u6 u6 = new u6(new y3(b, CommentSaveState.SAVED));
            ((RemoteGqlCommentDataSource$save.RemoteGqlCommentDataSource$save$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)u6, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final u6$d a2 = ((u6$b)b2).a;
        final String s = null;
        UpdateResponse updateResponse;
        if (a2 != null) {
            final boolean b3 = a2.b;
            final List c2 = a2.c;
            b = s;
            if (c2 != null) {
                final u6$c u6$c = (u6$c)CollectionsKt___CollectionsKt.s1(c2);
                b = s;
                if (u6$c != null) {
                    b = u6$c.b;
                }
            }
            updateResponse = new UpdateResponse(b3, b);
        }
        else {
            updateResponse = new UpdateResponse(false, null);
        }
        return updateResponse;
    }
    
    public final Object h(final String s, final c<? super Boolean> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlCommentDataSource$subscribeToComment.RemoteGqlCommentDataSource$subscribeToComment$1) {
                final RemoteGqlCommentDataSource$subscribeToComment.RemoteGqlCommentDataSource$subscribeToComment$1 remoteGqlCommentDataSource$subscribeToComment$1 = (RemoteGqlCommentDataSource$subscribeToComment.RemoteGqlCommentDataSource$subscribeToComment$1)c;
                final int label = remoteGqlCommentDataSource$subscribeToComment$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlCommentDataSource$subscribeToComment$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlCommentDataSource$subscribeToComment$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlCommentDataSource$subscribeToComment.RemoteGqlCommentDataSource$subscribeToComment$1(this, (c)c);
        }
        final Object result = ((RemoteGqlCommentDataSource$subscribeToComment.RemoteGqlCommentDataSource$subscribeToComment$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlCommentDataSource$subscribeToComment.RemoteGqlCommentDataSource$subscribeToComment$1)o).label;
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
            final q6 q6 = new q6(new w3(s, CommentFollowState.FOLLOWED));
            ((RemoteGqlCommentDataSource$subscribeToComment.RemoteGqlCommentDataSource$subscribeToComment$1)o).label = 1;
            if ((b = e$a.b(14, (k)q6, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final q6$d a2 = ((q6$b)b).a;
        return a2 != null && a2.b;
    }
    
    public final Object i(String b, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlCommentDataSource$unSave.RemoteGqlCommentDataSource$unSave$1) {
                final RemoteGqlCommentDataSource$unSave.RemoteGqlCommentDataSource$unSave$1 remoteGqlCommentDataSource$unSave$1 = (RemoteGqlCommentDataSource$unSave.RemoteGqlCommentDataSource$unSave$1)c;
                final int label = remoteGqlCommentDataSource$unSave$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlCommentDataSource$unSave$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlCommentDataSource$unSave$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlCommentDataSource$unSave.RemoteGqlCommentDataSource$unSave$1(this, (c)c);
        }
        final Object result = ((RemoteGqlCommentDataSource$unSave.RemoteGqlCommentDataSource$unSave$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlCommentDataSource$unSave.RemoteGqlCommentDataSource$unSave$1)o).label;
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
            final u6 u6 = new u6(new y3(b, CommentSaveState.NONE));
            ((RemoteGqlCommentDataSource$unSave.RemoteGqlCommentDataSource$unSave$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)u6, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final u6$d a2 = ((u6$b)b2).a;
        final String s = null;
        UpdateResponse updateResponse;
        if (a2 != null) {
            final boolean b3 = a2.b;
            final List c2 = a2.c;
            b = s;
            if (c2 != null) {
                final u6$c u6$c = (u6$c)CollectionsKt___CollectionsKt.s1(c2);
                b = s;
                if (u6$c != null) {
                    b = u6$c.b;
                }
            }
            updateResponse = new UpdateResponse(b3, b);
        }
        else {
            updateResponse = new UpdateResponse(false, null);
        }
        return updateResponse;
    }
    
    public final Object j(final String s, final c<? super Boolean> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlCommentDataSource$unsubscribeFromComment.RemoteGqlCommentDataSource$unsubscribeFromComment$1) {
                final RemoteGqlCommentDataSource$unsubscribeFromComment.RemoteGqlCommentDataSource$unsubscribeFromComment$1 remoteGqlCommentDataSource$unsubscribeFromComment$1 = (RemoteGqlCommentDataSource$unsubscribeFromComment.RemoteGqlCommentDataSource$unsubscribeFromComment$1)c;
                final int label = remoteGqlCommentDataSource$unsubscribeFromComment$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlCommentDataSource$unsubscribeFromComment$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlCommentDataSource$unsubscribeFromComment$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlCommentDataSource$unsubscribeFromComment.RemoteGqlCommentDataSource$unsubscribeFromComment$1(this, (c)c);
        }
        final Object result = ((RemoteGqlCommentDataSource$unsubscribeFromComment.RemoteGqlCommentDataSource$unsubscribeFromComment$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlCommentDataSource$unsubscribeFromComment.RemoteGqlCommentDataSource$unsubscribeFromComment$1)o).label;
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
            final q6 q6 = new q6(new w3(s, CommentFollowState.UNFOLLOWED));
            ((RemoteGqlCommentDataSource$unsubscribeFromComment.RemoteGqlCommentDataSource$unsubscribeFromComment$1)o).label = 1;
            if ((b = e$a.b(14, (k)q6, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final q6$d a2 = ((q6$b)b).a;
        return a2 != null && a2.b;
    }
    
    public final Object k(String b, final VoteDirection voteDirection, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlCommentDataSource$vote.RemoteGqlCommentDataSource$vote$1) {
                final RemoteGqlCommentDataSource$vote.RemoteGqlCommentDataSource$vote$1 remoteGqlCommentDataSource$vote$1 = (RemoteGqlCommentDataSource$vote.RemoteGqlCommentDataSource$vote$1)c;
                final int label = remoteGqlCommentDataSource$vote$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlCommentDataSource$vote$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlCommentDataSource$vote$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlCommentDataSource$vote.RemoteGqlCommentDataSource$vote$1(this, (c)c);
        }
        final Object result = ((RemoteGqlCommentDataSource$vote.RemoteGqlCommentDataSource$vote$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlCommentDataSource$vote.RemoteGqlCommentDataSource$vote$1)o).label;
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
            final w6 w6 = new w6(new a4(b, GqlDataToDomainModelMapperKt.toVoteState(voteDirection)));
            ((RemoteGqlCommentDataSource$vote.RemoteGqlCommentDataSource$vote$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)w6, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final w6$d a2 = ((w6$b)b2).a;
        final String s = null;
        UpdateResponse updateResponse;
        if (a2 != null) {
            final boolean b3 = a2.b;
            final List c2 = a2.c;
            b = s;
            if (c2 != null) {
                final w6$c w6$c = (w6$c)CollectionsKt___CollectionsKt.s1(c2);
                b = s;
                if (w6$c != null) {
                    b = w6$c.b;
                }
            }
            updateResponse = new UpdateResponse(b3, b);
        }
        else {
            updateResponse = new UpdateResponse(false, null);
        }
        return updateResponse;
    }
}
