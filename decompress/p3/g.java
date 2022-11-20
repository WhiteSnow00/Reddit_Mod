// 
// Decompiled by Procyon v0.6.0
// 

package p3;

import android.app.job.JobService;
import android.view.View;
import android.text.Spanned;
import android.widget.EditText;
import androidx.fragment.app.strictmode.FragmentStrictMode$b;
import android.os.Looper;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.Set;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewPropertyAnimator;
import com.reddit.screens.chat.widgets.tokenautocomplete.TokenCompleteTextView$e;
import java.util.Iterator;
import android.text.Editable;
import hj0.d;
import android.graphics.Typeface;
import android.util.Log;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.x;
import com.google.android.exoplayer2.audio.a$a;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.c$a;
import db.u$b;
import db.u;
import com.google.android.exoplayer2.source.m;
import bd.c0;
import cd.p$a;
import java.lang.reflect.InvocationTargetException;
import tg.f;
import java.util.Map;
import we.h;
import java.lang.ref.WeakReference;
import android.app.Activity;
import wk.b;
import com.instabug.library.model.Attachment;
import em.n;
import qn.k;
import com.instabug.library.InstabugNetworkJob;
import com.instabug.library.apichecker.APIChecker;
import com.instabug.library.apichecker.VoidRunnable;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.PresentationManager;
import com.reddit.ads.impl.analytics.RedditAdsAnalytics;
import com.reddit.ads.link.models.AdEvent$EventType;
import com.reddit.ads.impl.analytics.RedditAdsAnalyticsLegacy;
import xw.l;
import com.reddit.announcement.ui.carousel.AnnouncementCarouselView;
import mg2.a;
import com.reddit.feature.fullbleedplayer.FullBleedVideoScreen;
import com.reddit.screen.BaseScreen;
import android.content.Context;
import com.reddit.screen.Routing;
import android.net.Uri;
import z61.c;
import com.reddit.frontpage.main.MainActivity;
import com.reddit.livepost.widgets.award.StreamAwardCtaButtonLegacy;
import android.text.Spannable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.screens.chat.widgets.tokenautocomplete.TokenCompleteTextView$b;
import java.util.ArrayList;
import ng2.e;
import com.reddit.screens.chat.widgets.tokenautocomplete.TokenCompleteTextView;
import androidx.lifecycle.p;
import androidx.lifecycle.Lifecycle;
import com.reddit.session.RedditSessionManager;
import java.util.List;
import com.reddit.video.creation.widgets.adjustclips.view.AdjustClipsFragment;

public final class g implements Runnable
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public g(final int f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        final int f = this.f;
        final int n = 1;
        final int n2 = 1;
        final int n3 = 0;
        final boolean b = false;
        int i = 0;
        switch (f) {
            default: {
                AdjustClipsFragment.q0((AdjustClipsFragment)this.g, (List)this.h);
                return;
            }
            case 28: {
                final RedditSessionManager redditSessionManager = (RedditSessionManager)this.g;
                final Lifecycle lifecycle = (Lifecycle)this.h;
                lifecycle.c(redditSessionManager.M);
                lifecycle.c((p)redditSessionManager.r.g());
                final d f2 = redditSessionManager.r.F();
                f2.cancel();
                lifecycle.c((p)f2);
                redditSessionManager.q.getLifecycle().c((p)redditSessionManager.r.z());
                return;
            }
            case 27: {
                final TokenCompleteTextView tokenCompleteTextView = (TokenCompleteTextView)this.g;
                final Object h = this.h;
                final int f3 = TokenCompleteTextView.F;
                e.f((Object)tokenCompleteTextView, "this$0");
                e.f(h, "$obj");
                final Editable text = ((EditText)tokenCompleteTextView).getText();
                if (text != null) {
                    final ArrayList list = new ArrayList();
                    final ArrayList q = tokenCompleteTextView.q;
                    e.c((Object)q);
                    for (final TokenCompleteTextView$b tokenCompleteTextView$b : q) {
                        Object h2;
                        if (tokenCompleteTextView$b != null) {
                            h2 = tokenCompleteTextView$b.h;
                        }
                        else {
                            h2 = null;
                        }
                        if (e.a(h2, h)) {
                            list.add(tokenCompleteTextView$b);
                        }
                    }
                    for (final TokenCompleteTextView$b tokenCompleteTextView$b2 : CollectionsKt___CollectionsKt.Q4((Iterable)list)) {
                        final ArrayList q2 = tokenCompleteTextView.q;
                        if (q2 != null) {
                            q2.remove(tokenCompleteTextView$b2);
                        }
                        final TokenCompleteTextView$e n4 = tokenCompleteTextView.n;
                        if (n4 != null) {
                            n4.onSpanRemoved((Spannable)text, (Object)tokenCompleteTextView$b2, 0, 0);
                        }
                    }
                    tokenCompleteTextView.p();
                    final Object[] spans = ((Spanned)text).getSpans(0, ((CharSequence)text).length(), (Class)TokenCompleteTextView$b.class);
                    e.d((Object)spans, "null cannot be cast to non-null type kotlin.Array<com.reddit.screens.chat.widgets.tokenautocomplete.TokenCompleteTextView.TokenImageSpan<T of com.reddit.screens.chat.widgets.tokenautocomplete.TokenCompleteTextView.removeObject$lambda-4>>");
                    for (TokenCompleteTextView$b[] array = (TokenCompleteTextView$b[])spans; i < array.length; ++i) {
                        final TokenCompleteTextView$b tokenCompleteTextView$b3 = array[i];
                        if (e.a(tokenCompleteTextView$b3.h, h)) {
                            tokenCompleteTextView.n(tokenCompleteTextView$b3);
                        }
                    }
                }
                return;
            }
            case 26: {
                final StreamAwardCtaButtonLegacy streamAwardCtaButtonLegacy = (StreamAwardCtaButtonLegacy)this.g;
                final s22.e e = (s22.e)this.h;
                final int j = StreamAwardCtaButtonLegacy.j;
                ng2.e.f((Object)streamAwardCtaButtonLegacy, "this$0");
                ng2.e.f((Object)e, "$animation");
                final ViewPropertyAnimator animate = ((View)streamAwardCtaButtonLegacy.i).animate();
                ng2.e.e((Object)animate, "awardButtonImageView\n          .animate()");
                streamAwardCtaButtonLegacy.o(animate, 0.0f, e.g);
                animate.start();
                final ViewPropertyAnimator animate2 = ((View)streamAwardCtaButtonLegacy.h).animate();
                ng2.e.e((Object)animate2, "awardButtonIconView\n          .animate()");
                streamAwardCtaButtonLegacy.o(animate2, 1.0f, e.g + 100L);
                animate2.start();
                return;
            }
            case 25: {
                final MainActivity mainActivity = (MainActivity)this.g;
                Routing.g((Context)mainActivity, (BaseScreen)((c)mainActivity.i0.get()).a(((Uri)this.h).toString()));
                return;
            }
            case 24: {
                final FullBleedVideoScreen fullBleedVideoScreen = (FullBleedVideoScreen)this.g;
                final a a = (a)this.h;
                e.f((Object)fullBleedVideoScreen, "this$0");
                e.f((Object)a, "$afterResize");
                if (fullBleedVideoScreen.AC().K5()) {
                    if (!((BaseScreen)fullBleedVideoScreen).fC()) {
                        a.invoke();
                    }
                }
                else {
                    a.invoke();
                }
                return;
            }
            case 23: {
                final xw.c c = (xw.c)this.g;
                final AnnouncementCarouselView announcementCarouselView = (AnnouncementCarouselView)this.h;
                final int p = AnnouncementCarouselView.p;
                e.f((Object)c, "$model");
                e.f((Object)announcementCarouselView, "this$0");
                final String g = c.g;
                if (g != null) {
                    final RecyclerView m = announcementCarouselView.m;
                    final Iterator iterator3 = c.f.iterator();
                    int n5 = n3;
                    while (true) {
                        while (iterator3.hasNext()) {
                            if (e.a((Object)((l)iterator3.next()).a, (Object)g)) {
                                m.scrollToPosition(n5);
                                return;
                            }
                            ++n5;
                        }
                        n5 = -1;
                        continue;
                    }
                }
                return;
            }
            case 22: {
                final RedditAdsAnalyticsLegacy redditAdsAnalyticsLegacy = (RedditAdsAnalyticsLegacy)this.g;
                final wu.a a2 = (wu.a)this.h;
                final Set w = RedditAdsAnalyticsLegacy.W;
                e.f((Object)redditAdsAnalyticsLegacy, "this$0");
                redditAdsAnalyticsLegacy.D(a2, "ad vendor fully in view (100ms)", new AdEvent$EventType[] { AdEvent$EventType.VENDOR_FULLY_IN_VIEW });
                return;
            }
            case 21: {
                final RedditAdsAnalytics redditAdsAnalytics = (RedditAdsAnalytics)this.g;
                final wu.a a3 = (wu.a)this.h;
                final Set r = RedditAdsAnalytics.R;
                e.f((Object)redditAdsAnalytics, "this$0");
                int n6;
                if (a3 != null && a3.k) {
                    n6 = n2;
                }
                else {
                    n6 = 0;
                }
                if (n6 != 0) {
                    pu2.a.a.m("ad viewable impression", new Object[0]);
                    RedditAdsAnalytics.z(redditAdsAnalytics, a3, redditAdsAnalytics.d.a(), AdEvent$EventType.VIEWABLE_IMPRESSION);
                }
                return;
            }
            case 20: {
                final zq.a a4 = (zq.a)this.g;
                final com.instabug.survey.announcements.models.a a5 = (com.instabug.survey.announcements.models.a)this.h;
                a4.getClass();
                try {
                    Thread.sleep(a5.n().f().a() * 1000L);
                    final ir.c a6 = ir.c.a();
                    a6.getClass();
                    a6.a = new ir.a(a6, a5);
                    PresentationManager.getInstance().show((Runnable)a6.a);
                }
                catch (final InterruptedException ex) {
                    String s;
                    if (a5.p() == 101) {
                        s = "Something went wrong while scheduling update msg announcement";
                    }
                    else {
                        if (a5.p() != 100) {
                            return;
                        }
                        s = "Something went wrong while scheduling what's new announcement";
                    }
                    InstabugSDKLogger.e("IBG-Surveys", s, (Throwable)ex);
                }
                return;
            }
            case 19: {
                final fp.g g2 = (fp.g)this.g;
                final SharedPreferences$OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener = (SharedPreferences$OnSharedPreferenceChangeListener)this.h;
                e.f((Object)g2, "this$0");
                g2.a.registerOnSharedPreferenceChangeListener(sharedPreferences$OnSharedPreferenceChangeListener);
                return;
            }
            case 18: {
                APIChecker.e((VoidRunnable)this.g, (String)this.h);
                return;
            }
            case 17: {
                InstabugNetworkJob.a((Runnable)this.h, (String)this.g);
                return;
            }
            case 16: {
                final k k = (k)this.g;
                final dc.g g3 = (dc.g)this.h;
                if (k.f != null) {
                    final int l = ((ab.a)g3.b).m();
                    final qn.d f4 = k.f;
                    if (l == 0) {
                        f4.y();
                    }
                    else {
                        f4.w();
                    }
                }
                return;
            }
            case 15: {
                ((n)this.g).e((Attachment)this.h);
                return;
            }
            case 14: {
                final b b2 = (b)this.g;
                final Activity activity = (Activity)this.h;
                b2.getClass();
                final WeakReference h3 = new WeakReference(new ll.c((ll.b)b2));
                b2.h = h3;
                final ll.c c2 = (ll.c)h3.get();
                if (c2 != null) {
                    c2.a((Context)activity);
                }
                final WeakReference g4 = new WeakReference(new ll.a((ll.b)b2));
                b2.g = g4;
                final ll.a a7 = (ll.a)g4.get();
                if (a7 != null) {
                    a7.a((Context)activity);
                }
                return;
            }
            case 13: {
                final aj.e e2 = (aj.e)this.g;
                final cj.e e3 = (cj.e)this.h;
                final vi.a f5 = aj.e.f;
                final AndroidMemoryReading b3 = e2.b(e3);
                if (b3 != null) {
                    e2.b.add(b3);
                }
                return;
            }
            case 12: {
                final oi.l l2 = (oi.l)this.g;
                final h h4 = (h)this.h;
                l2.getClass();
                try {
                    h4.b((Object)l2.b());
                }
                catch (final Exception ex2) {
                    h4.a(ex2);
                }
                return;
            }
            case 11: {
                ((Map.Entry)this.g).getKey().a((fi.a)this.h);
                return;
            }
            case 10: {
                final tg.e e4 = (tg.e)this.g;
                final Object h5 = this.h;
                e4.getClass();
                try {
                    e4.a(h5);
                }
                catch (final InvocationTargetException ex3) {
                    e4.a.handleSubscriberException(ex3.getCause(), new f(e4.a, h5, e4.b, e4.c));
                }
                return;
            }
            case 9: {
                final p$a p$a = (p$a)this.g;
                final String s2 = (String)this.h;
                final cd.p b4 = p$a.b;
                final int a8 = c0.a;
                b4.a(s2);
                return;
            }
            case 8: {
                final m m2 = (m)this.g;
                final u u = (u)this.h;
                Object d;
                if (m2.w == null) {
                    d = u;
                }
                else {
                    d = new u$b(-9223372036854775807L);
                }
                m2.D = (u)d;
                m2.E = u.i();
                boolean f6 = b;
                if (m2.K == -1L) {
                    f6 = b;
                    if (u.i() == -9223372036854775807L) {
                        f6 = true;
                    }
                }
                m2.F = f6;
                int g5 = n;
                if (f6) {
                    g5 = 7;
                }
                m2.G = g5;
                ((com.google.android.exoplayer2.source.n)m2.l).w(m2.E, u.e(), m2.F);
                if (!m2.A) {
                    m2.z();
                }
                return;
            }
            case 7: {
                final c$a c$a = (c$a)this.g;
                ((com.google.android.exoplayer2.drm.c)this.h).E(c$a.a, c$a.b);
                return;
            }
            case 6: {
                final DefaultDrmSessionManager.e e5 = (DefaultDrmSessionManager.e)this.g;
                final com.google.android.exoplayer2.n n7 = (com.google.android.exoplayer2.n)this.h;
                final DefaultDrmSessionManager i2 = e5.i;
                if (i2.p != 0) {
                    if (!e5.h) {
                        final Looper t = i2.t;
                        t.getClass();
                        e5.g = i2.e(t, e5.f, n7, false);
                        e5.i.n.add(e5);
                    }
                }
                return;
            }
            case 5: {
                final a$a a$a = (a$a)this.g;
                final Exception ex4 = (Exception)this.h;
                final com.google.android.exoplayer2.audio.a b5 = a$a.b;
                final int a9 = c0.a;
                b5.l(ex4);
                return;
            }
            case 4: {
                final com.google.android.exoplayer2.m m3 = (com.google.android.exoplayer2.m)this.g;
                final x x = (x)this.h;
                m3.getClass();
                try {
                    monitorenter(x);
                    monitorexit(x);
                    try {
                        x.a.i(x.d, x.e);
                    }
                    finally {
                        x.b(true);
                    }
                }
                catch (final ExoPlaybackException ex5) {
                    ah0.b.U("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", (Throwable)ex5);
                    throw new RuntimeException((Throwable)ex5);
                }
            }
            case 3: {
                final JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService)this.g;
                final JobParameters jobParameters = (JobParameters)this.h;
                final int f7 = JobInfoSchedulerService.f;
                ((JobService)jobInfoSchedulerService).jobFinished(jobParameters, false);
                return;
            }
            case 2: {
                this.g.getClass();
                new ArrayList(0);
                throw null;
            }
            case 1: {
                final String s3 = (String)this.g;
                final Violation violation = (Violation)this.h;
                final FragmentStrictMode$b a10 = FragmentStrictMode.a;
                e.f((Object)violation, "$violation");
                final StringBuilder sb = new StringBuilder();
                sb.append("Policy violation with PENALTY_DEATH in ");
                sb.append(s3);
                Log.e("FragmentStrictMode", sb.toString(), (Throwable)violation);
                throw violation;
            }
            case 0: {
                ((p3.f.e)this.g).d((Typeface)this.h);
            }
        }
    }
}
