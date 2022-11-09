// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import kotlin.Pair;
import c50.l;
import com.reddit.comment.ui.presentation.b;
import sf2.o;
import nf2.r;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import c50.h;
import nf2.n;
import c50.k;
import nf2.c0;
import java.util.ArrayList;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import c50.g;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.domain.model.MoreComment;
import com.reddit.data.room.model.CommentDataModelType;
import com.reddit.domain.awards.model.Award;
import java.util.Map;
import com.reddit.domain.model.RichTextResponse;
import com.reddit.mod.notes.domain.model.NoteLabel;
import com.reddit.domain.modtools.ModQueueTriggers;
import com.reddit.domain.model.mod.BannedBy;
import com.squareup.moshi.JsonAdapter;
import i60.e;
import com.reddit.listing.model.sort.CommentSortType;
import java.util.Iterator;
import com.reddit.domain.model.IComment;
import com.reddit.domain.model.Comment;
import java.util.List;
import javax.inject.Inject;
import kotlin.a;
import pg2.f;
import h60.m;
import h60.j;
import javax.inject.Provider;
import com.squareup.moshi.y;
import c50.f0;

public final class DatabaseCommentDataSource implements f0
{
    public final y a;
    public final Provider<j> b;
    public final Provider<m> c;
    public final f d;
    public final f e;
    
    @Inject
    public DatabaseCommentDataSource(final y a, final Provider<j> b, final Provider<m> c) {
        ah2.f.f((Object)a, "moshi");
        ah2.f.f((Object)b, "commentDaoProvider");
        ah2.f.f((Object)c, "commentMutationDaoProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = kotlin.a.b((zg2.a)new DatabaseCommentDataSource$commentAdapter.DatabaseCommentDataSource$commentAdapter$2(this));
        this.e = kotlin.a.b((zg2.a)new DatabaseCommentDataSource$moreCommentAdapter.DatabaseCommentDataSource$moreCommentAdapter$2(this));
    }
    
    public static String c(final List list) {
        while (true) {
            for (final Object next : list) {
                if (((IComment)next) instanceof Comment) {
                    ah2.f.d(next, "null cannot be cast to non-null type com.reddit.domain.model.Comment");
                    return ((Comment)next).getLinkKindWithId();
                }
            }
            Object next = null;
            continue;
        }
    }
    
    public static String d(final CommentSortType commentSortType) {
        String string;
        if (commentSortType == null || (string = commentSortType.toString()) == null) {
            string = "NONE";
        }
        return string;
    }
    
    public static e p(final DatabaseCommentDataSource databaseCommentDataSource, final IComment comment, final int n, final CommentSortType commentSortType, String kindWithId, Integer n2, final int n3) {
        final Integer n4 = null;
        if ((n3 & 0x4) != 0x0) {
            kindWithId = null;
        }
        if ((n3 & 0x8) != 0x0) {
            n2 = n4;
        }
        e e;
        if (comment instanceof Comment) {
            kindWithId = comment.getKindWithId();
            final Comment comment2 = (Comment)comment;
            final String parentKindWithId = comment2.getParentKindWithId();
            final String linkKindWithId = comment2.getLinkKindWithId();
            final Object value = databaseCommentDataSource.d.getValue();
            ah2.f.e(value, "<get-commentAdapter>(...)");
            final JsonAdapter jsonAdapter = (JsonAdapter)value;
            Comment copy$default = comment2;
            if (n2 != null) {
                copy$default = Comment.copy$default(comment2, null, null, null, null, null, 0, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, null, n2.intValue(), 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, false, null, -1, 134217695, null);
                if (copy$default == null) {
                    copy$default = comment2;
                }
            }
            final String json = jsonAdapter.toJson((Object)copy$default);
            ah2.f.e((Object)json, "commentAdapter.toJson(\n \u2026     } ?: this,\n        )");
            e = new e(kindWithId, parentKindWithId, linkKindWithId, n, json, d(commentSortType), CommentDataModelType.COMMENT);
        }
        else {
            if (!(comment instanceof MoreComment)) {
                throw new RuntimeException("Unsupported comment type.");
            }
            final String kindWithId2 = comment.getKindWithId();
            final String parentKindWithId2 = ((MoreComment)comment).getParentKindWithId();
            final Object value2 = databaseCommentDataSource.e.getValue();
            ah2.f.e(value2, "<get-moreCommentAdapter>(...)");
            final String json2 = ((JsonAdapter)value2).toJson((Object)comment);
            final CommentDataModelType more = CommentDataModelType.MORE;
            final String d = d(commentSortType);
            ah2.f.e((Object)json2, "toJson(this)");
            e = new e(kindWithId2, parentKindWithId2, kindWithId, n, json2, d, more);
        }
        return e;
    }
    
    public final IComment a(final e e, final i60.f f) {
        final int n = DatabaseCommentDataSource.a.a[e.g.ordinal()];
        IComment copy$default;
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            final Object value = this.e.getValue();
            ah2.f.e(value, "<get-moreCommentAdapter>(...)");
            final Object fromJson = ((JsonAdapter)value).fromJson(e.e);
            ah2.f.c(fromJson);
            copy$default = (IComment)fromJson;
        }
        else {
            final Object value2 = this.d.getValue();
            ah2.f.e(value2, "<get-commentAdapter>(...)");
            final Object fromJson2 = ((JsonAdapter)value2).fromJson(e.e);
            ah2.f.c(fromJson2);
            copy$default = (Comment)fromJson2;
            if (f != null) {
                copy$default = Comment.copy$default((Comment)copy$default, null, null, null, null, null, 0, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, null, 0, 0L, null, null, null, null, null, null, null, null, f.b, null, null, null, null, null, null, null, null, false, false, null, -1, 134184959, null);
            }
        }
        return copy$default;
    }
    
    public final j b() {
        final Object value = this.b.get();
        ah2.f.e(value, "commentDaoProvider.get()");
        return (j)value;
    }
    
    @Override
    public final nf2.a e(final String s, final boolean b) {
        ah2.f.f((Object)s, "commentId");
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new xf2.f((Callable)new g(this, s, b)));
        ah2.f.e((Object)onAssembly, "fromCallable {\n      com\u2026entId, isCollapsed)\n    }");
        return onAssembly;
    }
    
    @Override
    public final nf2.a f() {
        return this.b().c();
    }
    
    @Override
    public final c0 g(final CommentSortType commentSortType, final String s, final ArrayList list) {
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new cg2.j((Callable)new k(this, s, commentSortType, list)));
        ah2.f.e((Object)onAssembly, "fromCallable {\n      com\u2026DataModel()\n      }\n    }");
        return onAssembly;
    }
    
    @Override
    public final nf2.a h() {
        final Object value = this.c.get();
        ah2.f.e(value, "commentMutationDaoProvider.get()");
        return ((m)value).c();
    }
    
    @Override
    public final nf2.a i(final String s) {
        ah2.f.f((Object)s, "commentKindWithId");
        final n v = this.b().y(s).v(n.j((Throwable)new RuntimeException(a40.f.n("Deleted comment with id ", s, " not found"))));
        final h h = new h(this, 0);
        v.getClass();
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new MaybeFlatMapCompletable((r)v, (o)h));
        ah2.f.e((Object)onAssembly, "commentDao.findCommentBy\u2026etable.complete()\n      }");
        return onAssembly;
    }
    
    @Override
    public final nf2.a j(final List<? extends IComment> list, final CommentSortType commentSortType) {
        ah2.f.f((Object)list, "comments");
        final nf2.a q = nf2.a.q((Callable)new c50.j(this, 0, list, commentSortType));
        ah2.f.e((Object)q, "fromCallable {\n      val\u2026tType.toDataType())\n    }");
        return q;
    }
    
    @Override
    public final nf2.a k(final Comment comment) {
        ah2.f.f((Object)comment, "comment");
        n n;
        if (ah2.f.a((Object)comment.getParentKindWithId(), (Object)comment.getLinkKindWithId())) {
            n = nf2.n.o((Object)0);
        }
        else {
            final n<e> y = this.b().y(comment.getKindWithId());
            final StringBuilder k = a.k("Edited comment with id ");
            k.append(comment.getKindWithId());
            k.append(" not found");
            final n v = y.v(nf2.n.j((Throwable)new RuntimeException(k.toString())));
            final b b = new b((Object)this, 2);
            v.getClass();
            n = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((r)v, (o)b));
        }
        ah2.f.e((Object)n, "if (comment.isRootCommen\u2026l().depth\n        }\n    }");
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new MaybeFlatMapCompletable((r)n, (o)new qw.e(1, (Object)this, (Object)comment)));
        ah2.f.e((Object)onAssembly, "depth.flatMapCompletable\u2026pth = it)),\n      )\n    }");
        return onAssembly;
    }
    
    @Override
    public final c0<List<IComment>> l(final String s, final CommentSortType commentSortType, final Integer n) {
        ah2.f.f((Object)s, "linkKindWithId");
        final j b = this.b();
        final String d = d(commentSortType);
        int intValue;
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = Integer.MAX_VALUE;
        }
        final c0 w = b.P(s, intValue, d).w((o)new wu.f((Object)this, 13));
        ah2.f.e((Object)w, "findComments.map { resul\u2026DataModel()\n      }\n    }");
        return (c0<List<IComment>>)w;
    }
    
    @Override
    public final nf2.a m(final CommentSortType commentSortType, final String s, final List list) {
        ah2.f.f((Object)list, "comments");
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new xf2.f((Callable)new l(this, s, commentSortType, list)));
        ah2.f.e((Object)onAssembly, "fromCallable {\n      val\u2026oSave.size,\n      )\n    }");
        return onAssembly;
    }
    
    @Override
    public final n<IComment> n(final String s) {
        ah2.f.f((Object)s, "commentKindWithId");
        final n<e> y = this.b().y(s);
        final h h = new h(this, 1);
        y.getClass();
        final n onAssembly = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((r)y, (o)h));
        ah2.f.e((Object)onAssembly, "commentDao.findCommentBy\u2026fromRoomDataModel()\n    }");
        return (n<IComment>)onAssembly;
    }
    
    @Override
    public final nf2.a o(final Comment comment, final CommentSortType commentSortType) {
        n n;
        if (ah2.f.a((Object)comment.getParentKindWithId(), (Object)comment.getLinkKindWithId())) {
            n = nf2.n.o((Object)new Pair((Object)0, (Object)0));
        }
        else {
            final n<e> y = this.b().y(comment.getParentKindWithId());
            final StringBuilder k = a.k("\n              Parent not found for comment with id ");
            k.append(comment.getKindWithId());
            k.append("\n              and parent id ");
            k.append(comment.getParentKindWithId());
            k.append("\n              ");
            final n v = y.v(nf2.n.j((Throwable)new RuntimeException(k.toString())));
            final he0.b b = new he0.b((Object)this, 7);
            v.getClass();
            n = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((r)v, (o)b));
        }
        ah2.f.e((Object)n, "if (comment.isRootCommen\u2026gPosition\n        }\n    }");
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new MaybeFlatMapCompletable((r)n, (o)new m10.m((Object)this, 2, (Object)comment, (Object)commentSortType)));
        ah2.f.e((Object)onAssembly, "parentInfo.flatMapComple\u2026,\n        )\n      }\n    }");
        return onAssembly;
    }
}
