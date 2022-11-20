// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import fk2.b0;
import c60.f;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import com.airbnb.lottie.parser.moshi.JsonReader;
import fk2.g0;
import java.io.InputStream;
import fk2.u;
import java.io.ByteArrayInputStream;
import uw.a;
import java.util.ArrayList;
import dg2.m;
import com.reddit.data.local.DatabaseAnnouncementsDataSource;
import com.reddit.domain.model.streaming.StreamSubredditPromptState;
import x40.t;
import d60.o;
import c60.i0;
import com.reddit.domain.model.search.Query;
import x40.u0;
import nb2.s;
import java.util.Collection;
import dg2.p;
import em0.h;
import em0.c;
import ng2.e;
import com.reddit.feature.chat.StreamChatPresenter;
import com.reddit.domain.model.Comment;
import com.reddit.data.postsubmit.VideoUploadService;
import java.util.concurrent.Callable;

public final class j implements Callable
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public j(final int f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public j(final VideoUploadService h, final String g) {
        this.f = 4;
        this.h = h;
        this.g = g;
    }
    
    @Override
    public final Object call() {
        final int f = this.f;
        final int n = -1;
        final int n2 = 0;
        int n3 = 0;
        final int n4 = 0;
        switch (f) {
            default: {
                final Comment comment = (Comment)this.g;
                final StreamChatPresenter streamChatPresenter = (StreamChatPresenter)this.h;
                e.f((Object)streamChatPresenter, "this$0");
                if (comment != null) {
                    final Iterator iterator = streamChatPresenter.Y.iterator();
                    n3 = n2;
                    while (true) {
                        final int n5 = n;
                        if (!iterator.hasNext()) {
                            return n5;
                        }
                        if (e.a((Object)((c)iterator.next()).e(), (Object)comment.getKindWithId())) {
                            break;
                        }
                        ++n3;
                    }
                }
                else {
                    final Iterator iterator2 = p.G4((Collection)streamChatPresenter.Y, (Class)h.class).iterator();
                    while (true) {
                        final int n5 = n;
                        if (!iterator2.hasNext()) {
                            return n5;
                        }
                        if (((h)iterator2.next()).m0) {
                            break;
                        }
                        ++n3;
                    }
                }
                return n3;
            }
            case 5: {
                final StreamChatPresenter streamChatPresenter2 = (StreamChatPresenter)this.g;
                final s s = (s)this.h;
                e.f((Object)streamChatPresenter2, "this$0");
                e.f((Object)s, "$action");
                final Iterator iterator3 = streamChatPresenter2.Y.iterator();
                int n6 = n4;
                int n7;
                while (true) {
                    n7 = n;
                    if (!iterator3.hasNext()) {
                        break;
                    }
                    if (e.a((Object)((c)iterator3.next()).e(), (Object)s.b)) {
                        n7 = n6;
                        break;
                    }
                    ++n6;
                }
                return n7;
            }
            case 4: {
                final VideoUploadService videoUploadService = (VideoUploadService)this.h;
                final String s2 = (String)this.g;
                final PublishSubject h = VideoUploadService.H;
                videoUploadService.getClass();
                return VideoUploadService.h(s2);
            }
            case 3: {
                final u0 u0 = (u0)this.g;
                final Query query = (Query)this.h;
                e.f((Object)u0, "this$0");
                e.f((Object)query, "$query");
                final Object value = u0.a.get();
                e.e(value, "queryDaoProvider.get()");
                final i0 i0 = (i0)value;
                final String query2 = query.getQuery();
                String subreddit = query.getSubreddit();
                if (subreddit == null) {
                    subreddit = "";
                }
                String subredditId = query.getSubredditId();
                if (subredditId == null) {
                    subredditId = "";
                }
                final Boolean subredditQuarantined = query.getSubredditQuarantined();
                final Boolean subredditNsfw = query.getSubredditNsfw();
                String userSubreddit = query.getUserSubreddit();
                if (userSubreddit == null) {
                    userSubreddit = "";
                }
                String userSubredditKindWithId = query.getUserSubredditKindWithId();
                if (userSubredditKindWithId == null) {
                    userSubredditKindWithId = "";
                }
                final Boolean userSubredditNsfw = query.getUserSubredditNsfw();
                String flairText = query.getFlairText();
                if (flairText == null) {
                    flairText = "";
                }
                String flairApiText = query.getFlairApiText();
                if (flairApiText == null) {
                    flairApiText = "";
                }
                String flairRichText = query.getFlairRichText();
                if (flairRichText == null) {
                    flairRichText = "";
                }
                String flairTextColor = query.getFlairTextColor();
                if (flairTextColor == null) {
                    flairTextColor = "";
                }
                String flairBackgroundColorHex = query.getFlairBackgroundColorHex();
                if (flairBackgroundColorHex == null) {
                    flairBackgroundColorHex = "";
                }
                i0.o0(new o(query2, subreddit, subredditId, subredditQuarantined, subredditNsfw, userSubreddit, userSubredditKindWithId, userSubredditNsfw, flairText, flairRichText, flairTextColor, flairBackgroundColorHex, flairApiText, query.getIconUrl(), 114689));
                return cg2.j.a;
            }
            case 2: {
                final t t = (t)this.g;
                final StreamSubredditPromptState streamSubredditPromptState = (StreamSubredditPromptState)this.h;
                e.f((Object)t, "this$0");
                e.f((Object)streamSubredditPromptState, "$model");
                return ((l70.a)t.a).D((Object)new d60.t(streamSubredditPromptState.getTimestamp(), streamSubredditPromptState.getSubreddit(), ((Enum)streamSubredditPromptState.getType()).name()));
            }
            case 1: {
                final DatabaseAnnouncementsDataSource databaseAnnouncementsDataSource = (DatabaseAnnouncementsDataSource)this.g;
                final Iterable iterable = (Iterable)this.h;
                e.f((Object)databaseAnnouncementsDataSource, "this$0");
                e.f((Object)iterable, "$ids");
                final f c = databaseAnnouncementsDataSource.c();
                final ArrayList list = new ArrayList<String>(m.u4(iterable, 10));
                final Iterator iterator4 = iterable.iterator();
                while (iterator4.hasNext()) {
                    list.add(((a)iterator4.next()).a);
                }
                c.K(list);
                return cg2.j.a;
            }
            case 0: {
                final String s3 = (String)this.g;
                final String s4 = (String)this.h;
                final b0 b = u.b((g0)u.g(new ByteArrayInputStream(s3.getBytes())));
                final String[] j = JsonReader.j;
                return r.e(new com.airbnb.lottie.parser.moshi.a(b), s4, true);
            }
        }
    }
}
