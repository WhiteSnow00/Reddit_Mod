// 
// Decompiled by Procyon v0.6.0
// 

package ia;

import android.os.BaseBundle;
import we.j;
import com.google.firebase.remoteconfig.internal.b$a;
import ug2.k;
import com.reddit.frontpage.presentation.detail.DetailListAdapter$a$a;
import com.reddit.frontpage.presentation.detail.DetailScreen;
import com.reddit.frontpage.presentation.detail.DetailListAdapter$a;
import pu2.a;
import com.reddit.frontpage.presentation.detail.PostDetailPresenter;
import ng2.e;
import com.reddit.domain.model.Subreddit;
import com.reddit.video.creation.widgets.edit.presenter.EditUGCPresenter;
import com.reddit.video.creation.usecases.render.RenderAudioResult;
import com.reddit.video.creation.widgets.recording.view.RecordButtonExtensionsKt;
import android.view.MotionEvent;
import com.reddit.video.creation.widgets.voiceover.VoiceoverPresenter;
import java.util.List;
import com.instabug.survey.common.userInteractions.UserInteractionCacheManager;
import com.instabug.survey.announcements.cache.AnnouncementCacheManager;
import android.os.Build$VERSION;
import android.content.Context;
import com.google.android.exoplayer2.y;
import android.net.Uri;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.r$a;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.f0;
import bc.s;
import android.os.Bundle;
import com.google.android.exoplayer2.upstream.b;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.android.exoplayer2.source.p$b;
import ff2.q;
import com.instabug.library.internal.storage.cache.db.InstabugDBInsertionListener;
import ha.d;
import bd.f;
import com.google.android.exoplayer2.f$a;
import ha.g;

public final class c implements g, f$a, f, ad.c, ej.f$a, d, we.f, InstabugDBInsertionListener, q
{
    public final int f;
    
    public c(final int f) {
        this.f = f;
    }
    
    public final void a(final Exception ex) {
    }
    
    public final void accept(final Object o) {
        ((p$b)o).b.release();
    }
    
    public final Object apply(final Object o) {
        return ((com.google.protobuf.a)o).toByteArray();
    }
    
    public final String b(final b b) {
        final String h = b.h;
        String string;
        if (h != null) {
            string = h;
        }
        else {
            string = b.a.toString();
        }
        return string;
    }
    
    public final com.google.android.exoplayer2.f c(final Bundle bundle) {
        switch (this.f) {
            default: {
                final s s = (s)bd.b.c((f$a)bc.s.j, bundle.getBundle(f0.a.a(0)));
                s.getClass();
                return (com.google.android.exoplayer2.f)new f0.a(s, (int[])sg.f.a((Object)((BaseBundle)bundle).getIntArray(f0.a.a(1)), (Object)new int[s.f]), ((BaseBundle)bundle).getInt(f0.a.a(2), -1), (boolean[])sg.f.a((Object)((BaseBundle)bundle).getBooleanArray(f0.a.a(3)), (Object)new boolean[s.f]));
            }
            case 4: {
                ah0.b.C(((BaseBundle)bundle).getInt(d0.a(0), -1) == 3);
                d0 d0;
                if (((BaseBundle)bundle).getBoolean(com.google.android.exoplayer2.d0.a(1), false)) {
                    d0 = new d0(((BaseBundle)bundle).getBoolean(com.google.android.exoplayer2.d0.a(2), false));
                }
                else {
                    d0 = new d0();
                }
                return (com.google.android.exoplayer2.f)d0;
            }
            case 2: {
                final r$a r$a = new r$a();
                r$a.a = bundle.getCharSequence(r.a(0));
                r$a.b = bundle.getCharSequence(r.a(1));
                r$a.c = bundle.getCharSequence(r.a(2));
                r$a.d = bundle.getCharSequence(r.a(3));
                r$a.e = bundle.getCharSequence(r.a(4));
                r$a.f = bundle.getCharSequence(r.a(5));
                r$a.g = bundle.getCharSequence(r.a(6));
                r$a.h = (Uri)bundle.getParcelable(r.a(7));
                final byte[] byteArray = bundle.getByteArray(r.a(10));
                final boolean containsKey = ((BaseBundle)bundle).containsKey(r.a(29));
                byte[] k = null;
                Integer value;
                if (containsKey) {
                    value = ((BaseBundle)bundle).getInt(r.a(29));
                }
                else {
                    value = null;
                }
                if (byteArray != null) {
                    k = byteArray.clone();
                }
                r$a.k = k;
                r$a.l = value;
                r$a.m = (Uri)bundle.getParcelable(r.a(11));
                r$a.x = bundle.getCharSequence(r.a(22));
                r$a.y = bundle.getCharSequence(r.a(23));
                r$a.z = bundle.getCharSequence(r.a(24));
                r$a.C = bundle.getCharSequence(r.a(27));
                r$a.D = bundle.getCharSequence(r.a(28));
                r$a.E = bundle.getCharSequence(r.a(30));
                r$a.F = bundle.getBundle(r.a(1000));
                if (((BaseBundle)bundle).containsKey(r.a(8))) {
                    final Bundle bundle2 = bundle.getBundle(r.a(8));
                    if (bundle2 != null) {
                        r$a.i = (y)y.f.c(bundle2);
                    }
                }
                if (((BaseBundle)bundle).containsKey(r.a(9))) {
                    final Bundle bundle3 = bundle.getBundle(r.a(9));
                    if (bundle3 != null) {
                        r$a.j = (y)y.f.c(bundle3);
                    }
                }
                if (((BaseBundle)bundle).containsKey(r.a(12))) {
                    r$a.n = ((BaseBundle)bundle).getInt(r.a(12));
                }
                if (((BaseBundle)bundle).containsKey(r.a(13))) {
                    r$a.o = ((BaseBundle)bundle).getInt(r.a(13));
                }
                if (((BaseBundle)bundle).containsKey(r.a(14))) {
                    r$a.p = ((BaseBundle)bundle).getInt(r.a(14));
                }
                if (((BaseBundle)bundle).containsKey(r.a(15))) {
                    r$a.q = ((BaseBundle)bundle).getBoolean(r.a(15));
                }
                if (((BaseBundle)bundle).containsKey(r.a(16))) {
                    r$a.r = ((BaseBundle)bundle).getInt(r.a(16));
                }
                if (((BaseBundle)bundle).containsKey(r.a(17))) {
                    r$a.s = ((BaseBundle)bundle).getInt(r.a(17));
                }
                if (((BaseBundle)bundle).containsKey(r.a(18))) {
                    r$a.t = ((BaseBundle)bundle).getInt(r.a(18));
                }
                if (((BaseBundle)bundle).containsKey(r.a(19))) {
                    r$a.u = ((BaseBundle)bundle).getInt(r.a(19));
                }
                if (((BaseBundle)bundle).containsKey(r.a(20))) {
                    r$a.v = ((BaseBundle)bundle).getInt(r.a(20));
                }
                if (((BaseBundle)bundle).containsKey(r.a(21))) {
                    r$a.w = ((BaseBundle)bundle).getInt(r.a(21));
                }
                if (((BaseBundle)bundle).containsKey(r.a(25))) {
                    r$a.A = ((BaseBundle)bundle).getInt(r.a(25));
                }
                if (((BaseBundle)bundle).containsKey(r.a(26))) {
                    r$a.B = ((BaseBundle)bundle).getInt(r.a(26));
                }
                return (com.google.android.exoplayer2.f)new r(r$a);
            }
        }
    }
    
    public final String e(final Context context) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        String s;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            s = "tv";
        }
        else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            s = "watch";
        }
        else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            s = "auto";
        }
        else if (sdk_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            s = "embedded";
        }
        else {
            s = "";
        }
        return s;
    }
    
    public final void onDataInserted(final Object o) {
        final String s = (String)o;
        final List allAnnouncement = AnnouncementCacheManager.getAllAnnouncement();
        if (!allAnnouncement.isEmpty()) {
            UserInteractionCacheManager.insertUserInteractions(allAnnouncement, s);
            AnnouncementCacheManager.resetAnnouncementUserInteraction(allAnnouncement);
        }
    }
    
    public final boolean test(final Object o) {
        final int f = this.f;
        final boolean b = false;
        final boolean b2 = false;
        switch (f) {
            default: {
                return VoiceoverPresenter.y((Boolean)o);
            }
            case 21: {
                return RecordButtonExtensionsKt.b((MotionEvent)o);
            }
            case 20: {
                return EditUGCPresenter.j((RenderAudioResult)o);
            }
            case 19: {
                final Subreddit subreddit = (Subreddit)o;
                e.f((Object)subreddit, "subreddit");
                final Boolean userIsSubscriber = subreddit.getUserIsSubscriber();
                final Boolean false = Boolean.FALSE;
                boolean b3 = b2;
                if (e.a((Object)userIsSubscriber, (Object)false)) {
                    b3 = b2;
                    if (e.a((Object)subreddit.getUserIsModerator(), (Object)false)) {
                        b3 = true;
                    }
                }
                return b3;
            }
            case 18: {
                final Throwable t = (Throwable)o;
                final Boolean u4 = PostDetailPresenter.u4;
                e.f((Object)t, "throwable");
                a.a.f(t, "Unable to turn off notifications for trending subreddit", new Object[0]);
                return true;
            }
            case 17: {
                final DetailListAdapter$a detailListAdapter$a = (DetailListAdapter$a)o;
                final k[] b4 = DetailScreen.b5;
                e.f((Object)detailListAdapter$a, "it");
                return detailListAdapter$a instanceof DetailListAdapter$a$a;
            }
            case 16: {
                final Boolean b5 = (Boolean)o;
                e.f((Object)b5, "it");
                return b5;
            }
            case 15: {
                final Boolean b6 = (Boolean)o;
                e.f((Object)b6, "it");
                return b6;
            }
            case 14: {
                final af2.s s = (af2.s)o;
                e.f((Object)s, "notification");
                boolean b7 = b;
                if (s.g()) {
                    b7 = b;
                    if (s.d() != null) {
                        b7 = true;
                    }
                }
                return b7;
            }
            case 13: {
                final List list = (List)o;
                e.f((Object)list, "sets");
                return list.isEmpty() ^ true;
            }
            case 12: {
                final Throwable t2 = (Throwable)o;
                e.f((Object)t2, "e");
                a.a.f(t2, "Unable to save  more comment tree to local data source.", new Object[0]);
                return true;
            }
        }
    }
    
    public final we.g then(final Object o) {
        final b$a b$a = (b$a)o;
        return j.e((Object)null);
    }
}
