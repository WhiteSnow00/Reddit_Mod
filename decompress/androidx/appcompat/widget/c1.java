// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.os.BaseBundle;
import com.pedro.rtmp.rtmp.message.RtmpMessage;
import android.app.Service;
import java.util.concurrent.ThreadPoolExecutor;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$o;
import com.reddit.frontpage.presentation.listing.common.LinkListingScreen;
import com.reddit.screen.predictions.tournament.feed.PredictionsTournamentFeedScreen$a;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.widget.EditText;
import java.io.OutputStream;
import java.util.Iterator;
import com.reddit.eventbus.FreeAwardTooltipEventBus;
import com.reddit.screen.discover.feed.DiscoveryFeedAdapter$a;
import android.os.Bundle;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.os.Parcelable;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.reddit.screen.predictions.tournament.feed.PredictionsTournamentFeedScreen;
import hc.l$a;
import java.util.Collections;
import android.os.HandlerThread;
import android.content.Context;
import oi.q;
import android.os.Build$VERSION;
import com.google.firebase.messaging.FirebaseMessaging;
import android.text.TextWatcher;
import em.i;
import com.instabug.fatalhangs.FatalHangsPlugin;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.networkv2.NetworkManager;
import com.instabug.library.Instabug;
import go.b;
import go.c;
import mq.l;
import com.instabug.library.Feature$State;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.Feature;
import com.instabug.survey.SurveyPlugin;
import com.pedro.rtmp.flv.FlvType;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import cu.a;
import com.reddit.data.postsubmit.VideoUploadService;
import com.reddit.feature.feedthemeter.FeedTheMeterView;
import android.widget.TextView;
import n72.m;
import java.util.List;
import n72.n;
import com.reddit.feature.poststream.PostStreamingPresenter;
import com.reddit.frontpage.presentation.detail.DetailScreen;
import com.reddit.frontpage.presentation.listing.discover.DiscoverLinkListingScreen;
import com.reddit.frontpage.presentation.listing.saved.posts.SavedPostsListingScreen;
import com.reddit.frontpage.presentation.listing.ui.widgets.NewContentPill;
import android.view.View;
import androidx.lifecycle.d;
import com.reddit.link.ui.view.LinkFooterView;
import com.reddit.media.player.PlaybackProgressView;
import e61.h;
import com.reddit.postsubmit.common.BasePostSubmitPresenter;
import com.reddit.presence.ui.commentcomposer.CommentComposerPresencePresenter;
import com.reddit.screen.discover.feed.DiscoveryFeedAdapter$c;
import com.reddit.screen.discover.feed.DiscoveryFeedAdapter;
import cg2.j;
import com.reddit.screen.discover.feed.DiscoverScreen;
import ng2.e;
import com.reddit.screen.listing.history.HistoryListingScreen;

public final class c1 implements Runnable
{
    public final int f;
    public final Object g;
    
    public c1(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        Label_2725: {
            switch (this.f) {
                default: {
                    break Label_2725;
                }
                case 28: {
                    final HistoryListingScreen historyListingScreen = (HistoryListingScreen)this.g;
                    e.f((Object)historyListingScreen, "this$0");
                    ((LinkListingScreen)historyListingScreen).ZC();
                    return;
                }
                case 27: {
                    final DiscoverScreen discoverScreen = (DiscoverScreen)this.g;
                    e.f((Object)discoverScreen, "this$0");
                    final Parcelable b0 = discoverScreen.B0;
                    j a;
                    if (b0 != null) {
                        discoverScreen.tC().onRestoreInstanceState(b0);
                        discoverScreen.B0 = null;
                        a = j.a;
                    }
                    else {
                        a = null;
                    }
                    if (a == null) {
                        final StaggeredGridLayoutManager tc = discoverScreen.tC();
                        tc.q.b();
                        ((RecyclerView$o)tc).requestLayout();
                    }
                    final Bundle c0 = discoverScreen.C0;
                    if (c0 != null) {
                        final DiscoveryFeedAdapter$a a2 = DiscoveryFeedAdapter.A;
                        DiscoveryFeedAdapter$c.b(discoverScreen.uC(), c0);
                        discoverScreen.C0 = null;
                    }
                    return;
                }
                case 26: {
                    final CommentComposerPresencePresenter commentComposerPresencePresenter = (CommentComposerPresencePresenter)this.g;
                    e.f((Object)commentComposerPresencePresenter, "this$0");
                    commentComposerPresencePresenter.o.a(0);
                    commentComposerPresencePresenter.h();
                    return;
                }
                case 25: {
                    final BasePostSubmitPresenter basePostSubmitPresenter = (BasePostSubmitPresenter)this.g;
                    e.f((Object)basePostSubmitPresenter, "this$0");
                    basePostSubmitPresenter.g.U4();
                    return;
                }
                case 24: {
                    final h h = (h)this.g;
                    final int o = e61.h.o;
                    e.f((Object)h, "this$0");
                    h.a.performHapticFeedback(1);
                    h.b.requestDisallowInterceptTouchEvent(true);
                    h.h = true;
                    h.a(h.a.getX(), h.a.getY());
                    return;
                }
                case 23: {
                    final PlaybackProgressView playbackProgressView = (PlaybackProgressView)this.g;
                    playbackProgressView.C = true;
                    playbackProgressView.k();
                    return;
                }
                case 22: {
                    final LinkFooterView linkFooterView = (LinkFooterView)this.g;
                    final int c2 = LinkFooterView.c0;
                    e.f((Object)linkFooterView, "this$0");
                    if (linkFooterView.f()) {
                        final FreeAwardTooltipEventBus f = linkFooterView.F;
                        if (f != null) {
                            final ig0.c consume = f.consume();
                            if (consume != null) {
                                if (((View)linkFooterView.f.c).isAttachedToWindow()) {
                                    linkFooterView.j(consume.a);
                                    ((View)linkFooterView.f.c).postDelayed((Runnable)new d(14, (Object)linkFooterView, (Object)consume.b), 300L);
                                }
                            }
                        }
                    }
                    return;
                }
                case 21: {
                    final View view = (View)this.g;
                    final int p = NewContentPill.p;
                    e.f((Object)view, "$view");
                    if (view.isAttachedToWindow()) {
                        view.setVisibility(8);
                    }
                    return;
                }
                case 20: {
                    ((SavedPostsListingScreen)this.g).V3();
                    return;
                }
                case 19: {
                    final DiscoverLinkListingScreen discoverLinkListingScreen = (DiscoverLinkListingScreen)this.g;
                    e.f((Object)discoverLinkListingScreen, "this$0");
                    discoverLinkListingScreen.jD();
                    return;
                }
                case 18: {
                    final DetailScreen detailScreen = (DetailScreen)this.g;
                    e.f((Object)detailScreen, "this$0");
                    ((RecyclerView$Adapter)detailScreen.bD()).notifyDataSetChanged();
                    return;
                }
                case 17: {
                    final PostStreamingPresenter postStreamingPresenter = (PostStreamingPresenter)this.g;
                    final float[] p2 = postStreamingPresenter.p;
                    float n;
                    if (p2 != null) {
                        n = p2[0];
                    }
                    else {
                        n = 0.0f;
                    }
                    float n2;
                    if (p2 != null) {
                        n2 = p2[1];
                    }
                    else {
                        n2 = 0.0f;
                    }
                    final n n3 = (n)postStreamingPresenter.q.getValue();
                    final long nanoTime = System.nanoTime();
                    final float r = postStreamingPresenter.r;
                    final float s = postStreamingPresenter.s;
                    final List list = (List)postStreamingPresenter.t.getValue();
                    n3.getClass();
                    e.f((Object)list, "items");
                    final float min = Math.min((nanoTime - n3.a) / (float)n72.n.b, 0.033333335f);
                    n3.a = nanoTime;
                    final Iterator iterator = list.iterator();
                    int n4 = 0;
                    while (iterator.hasNext()) {
                        final Object next = iterator.next();
                        if (n4 < 0) {
                            cg.d.a4();
                            throw null;
                        }
                        final m m = (m)next;
                        final float a3 = m.a();
                        final float b2 = m.b();
                        m.d(m.l() - min * n * 1000.0f);
                        m.c(min * n2 * 1000.0f + m.k());
                        final float n5 = n4 * 0.5f + 5.0f;
                        m.d(m.l() - m.l() * min * n5);
                        m.c(m.k() - m.k() * min * n5);
                        m.i(m.e() - m.e() * min * 2.0f);
                        m.g(m.l() * min + m.a());
                        m.h(m.k() * min + m.b());
                        final float size = m.getSize();
                        final float n6 = 2;
                        final float n7 = size / n6;
                        final float n8 = r - m.getSize() / n6;
                        final float n9 = m.getSize() / n6;
                        final float n10 = s - m.getSize() / n6;
                        if (m.a() <= n7) {
                            m.g(n7);
                            m.d(Math.max(0.0f, -m.l() * 0.6f));
                        }
                        else if (m.a() >= n8) {
                            m.g(n8);
                            m.d(Math.min(0.0f, -m.l() * 0.6f));
                        }
                        if (m.b() <= n9) {
                            m.h(n9);
                            m.c(Math.max(0.0f, -m.k() * 0.6f));
                        }
                        else if (m.b() >= n10) {
                            m.h(n10);
                            m.c(Math.min(0.0f, -m.k() * 0.6f));
                        }
                        final float n11 = (m.a() - a3) / min;
                        final float n12 = (m.b() - b2) / min;
                        final float n13 = n72.n.a(m.a() - n7) - n72.n.a(n8 - m.a());
                        final float n14 = n72.n.a(n10 - m.b()) - n72.n.a(m.b() - n9);
                        float n15;
                        if ((n15 = 1.0f - Math.abs(n14) - Math.abs(n13)) < 0.0f) {
                            n15 = 0.0f;
                        }
                        m.i(m.e() * n15 + (n11 / (m.getSize() / n6) * 360.0f / 6.2831855f * 0.75f * n14 + n12 / (m.getSize() / n6) * 360.0f / 6.2831855f * 0.75f * n13));
                        float n16 = (m.e() * min + m.getRotation()) % 360.0f;
                        final float n17 = 0.0f;
                        if (n16 < 0.0f) {
                            n16 += 360.0f;
                        }
                        m.j(n16);
                        final float l = m.l();
                        float n18 = l - min * l * 0.5f * Math.abs(n14);
                        if (Math.signum(n18) != Math.signum(l)) {
                            n18 = 0.0f;
                        }
                        m.d(n18);
                        final float k = m.k();
                        float n19 = k - min * k * 0.5f * Math.abs(n13);
                        if (Math.signum(n19) != Math.signum(k)) {
                            n19 = n17;
                        }
                        m.c(n19);
                        ++n4;
                    }
                    postStreamingPresenter.n.Cx((List)postStreamingPresenter.t.getValue());
                    return;
                }
                case 16: {
                    final TextView textView = (TextView)this.g;
                    final int h2 = FeedTheMeterView.h;
                    e.e((Object)textView, "");
                    ((View)textView).setVisibility(8);
                    return;
                }
                case 15: {
                    final VideoUploadService videoUploadService = (VideoUploadService)this.g;
                    if (((ThreadPoolExecutor)videoUploadService.u).getQueue().isEmpty() && !videoUploadService.t.get()) {
                        ((ThreadPoolExecutor)videoUploadService.u).shutdown();
                        ((Service)videoUploadService).stopSelf();
                    }
                    return;
                }
                case 14: {
                    final fu.d d = (fu.d)this.g;
                    e.f((Object)d, "this$0");
                    while (!Thread.interrupted()) {
                        try {
                            final a a4 = d.f.poll(1L, TimeUnit.SECONDS);
                            if (a4 == null) {
                                Log.i("RtmpSender", "Skipping iteration, frame null");
                                continue;
                            }
                            int n21 = 0;
                            Label_2068: {
                                if (a4.d == FlvType.VIDEO) {
                                    final OutputStream h3 = d.h;
                                    if (h3 != null) {
                                        final fu.a b3 = d.b;
                                        b3.getClass();
                                        final gu.h h4 = new gu.h(a4, b3.d);
                                        ((RtmpMessage)h4).g(h3);
                                        ((RtmpMessage)h4).f(h3);
                                        h3.flush();
                                        final int n20 = n21 = ((RtmpMessage)h4).a().a();
                                        if (d.k) {
                                            Log.i("RtmpSender", e.l((Object)n20, "wrote Video packet, size "));
                                            n21 = n20;
                                        }
                                        break Label_2068;
                                    }
                                }
                                else {
                                    final OutputStream h5 = d.h;
                                    if (h5 != null) {
                                        final fu.a b4 = d.b;
                                        b4.getClass();
                                        final gu.d d2 = new gu.d(a4, b4.d);
                                        ((RtmpMessage)d2).g(h5);
                                        ((RtmpMessage)d2).f(h5);
                                        h5.flush();
                                        final int n22 = n21 = ((RtmpMessage)d2).a().a();
                                        if (d.k) {
                                            Log.i("RtmpSender", e.l((Object)n22, "wrote Audio packet, size "));
                                            n21 = n22;
                                        }
                                        break Label_2068;
                                    }
                                }
                                n21 = 0;
                            }
                            final lu.a j = d.j;
                            final long n23 = n21;
                            synchronized (j) {
                                j.b += n23 * 8L;
                                final long n24 = System.currentTimeMillis() - j.c;
                                if (n24 >= 1000L) {
                                    j.a.g((long)(j.b / (n24 / 1000.0f)));
                                    j.c = System.currentTimeMillis();
                                    j.b = 0L;
                                }
                            }
                        }
                        catch (final Exception ex) {
                            if (!(ex instanceof InterruptedException)) {
                                d.a.d(e.l((Object)ex.getMessage(), "Error send packet, "));
                                Log.e("RtmpSender", "send error: ", (Throwable)ex);
                            }
                        }
                        break;
                    }
                    return;
                }
                case 13: {
                    SurveyPlugin.e((SurveyPlugin)this.g);
                    return;
                }
                case 12: {
                    final com.instabug.library.tracking.m i = (com.instabug.library.tracking.m)this.g;
                    e.f((Object)i, "this$0");
                    if (InstabugCore.getFeatureState(Feature.SCREEN_OFF_MONITOR) == Feature$State.ENABLED) {
                        final mq.m m2 = (mq.m)i.a.getValue();
                        if (m2 != null) {
                            m2.a((l)i.b.getValue());
                        }
                    }
                    return;
                }
                case 11: {
                    final c c3 = (c)this.g;
                    if (c3.c.a) {
                        final List c4 = c3.c();
                        if (!c4.isEmpty()) {
                            c3.a.a(c4, new b(c3));
                        }
                    }
                    return;
                }
                case 10: {
                    final jn.b b5 = (jn.b)this.g;
                    e.f((Object)b5, "this$0");
                    final hn.a a5 = hn.a.a;
                    if (NetworkManager.isOnline(Instabug.getApplicationContext())) {
                        InstabugSDKLogger.v("FatalHangsSyncManager", "Starting Fatal hangs sync");
                        b5.f();
                    }
                    return;
                }
                case 9: {
                    FatalHangsPlugin.a((FatalHangsPlugin)this.g);
                    return;
                }
                case 8: {
                    final com.instabug.bug.view.reporting.a a6 = (com.instabug.bug.view.reporting.a)this.g;
                    final EditText f2 = a6.f;
                    if (f2 != null) {
                        ((TextView)f2).addTextChangedListener((TextWatcher)new i(a6));
                    }
                    return;
                }
                case 7: {
                    final Object d3 = ((FirebaseMessaging)this.g).d;
                    Context applicationContext;
                    if ((applicationContext = ((Context)d3).getApplicationContext()) == null) {
                        applicationContext = (Context)d3;
                    }
                    if (applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                        return;
                    }
                    break Label_2725;
                }
                case 6: {
                    break Label_2725;
                }
                case 5: {
                    break Label_2725;
                }
                case 4: {
                    break Label_2725;
                }
                case 3: {
                    break Label_2725;
                }
                case 2: {
                    break Label_2725;
                }
                case 1: {
                    break Label_2725;
                }
                case 0: {
                    Label_2742: {
                        break Label_2742;
                        while (true) {
                            try {
                                final Object d3;
                                final Context applicationContext2 = ((Context)d3).getApplicationContext();
                                final PackageManager packageManager = applicationContext2.getPackageManager();
                                boolean boolean1 = false;
                                Label_2594: {
                                    if (packageManager != null) {
                                        final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128);
                                        if (applicationInfo != null) {
                                            final Bundle metaData = applicationInfo.metaData;
                                            if (metaData != null && ((BaseBundle)metaData).containsKey("firebase_messaging_notification_delegation_enabled")) {
                                                boolean1 = ((BaseBundle)applicationInfo.metaData).getBoolean("firebase_messaging_notification_delegation_enabled");
                                                break Label_2594;
                                            }
                                        }
                                    }
                                    boolean1 = true;
                                }
                                if (Build$VERSION.SDK_INT < 29) {
                                    we.j.e((Object)null);
                                }
                                else {
                                    new q((Context)d3, boolean1, new we.h()).run();
                                }
                                return;
                                ((HandlerThread)this.g).quit();
                                return;
                                this.g.getClass();
                                Collections.emptyList();
                                throw null;
                                ((d1)this.g).c(false);
                                return;
                                ((hc.j)this.g).r();
                                return;
                                final com.google.android.exoplayer2.ui.c c5 = (com.google.android.exoplayer2.ui.c)this.g;
                                final int j2 = com.google.android.exoplayer2.ui.c.j0;
                                c5.j();
                                return;
                                d3 = this.g;
                                final PredictionsTournamentFeedScreen$a t1 = PredictionsTournamentFeedScreen.t1;
                                e.f(d3, "this$0");
                                ((LinkListingScreen)d3).ZC();
                                return;
                                this.g.getClass();
                                throw null;
                                final SsMediaSource ssMediaSource = (SsMediaSource)this.g;
                                final int f3 = SsMediaSource.F;
                                ssMediaSource.w();
                                return;
                            }
                            catch (final PackageManager$NameNotFoundException ex2) {
                                continue;
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}
