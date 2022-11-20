// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import java.util.Date;
import com.google.common.collect.ImmutableCollection$a;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import android.content.Intent;
import oi.f;
import com.google.android.exoplayer2.k;
import com.google.android.exoplayer2.w$c;
import wa.d0;
import com.google.android.exoplayer2.PlaybackException;
import bc.i;
import java.util.List;
import xa.b$a;
import com.google.common.collect.ImmutableList$a;
import com.google.android.exoplayer2.n;
import com.google.common.collect.Ordering;
import xc.d$h;
import android.graphics.Point;
import bd.c0;
import com.google.common.collect.ImmutableList;
import bc.s;
import com.reddit.screen.settings.preferences.PreferencesFragment;
import androidx.preference.Preference;
import com.sendbird.android.SendBird$b;
import com.sendbird.android.SendBird;
import f40.i0;
import com.reddit.data.chat.repository.RedditChatRepository;
import af2.v;
import android.content.res.ColorStateList;
import ff2.g;
import o50.h;
import af2.t;
import android.widget.TextView;
import e4.j$c;
import cg.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewStub;
import com.reddit.marketplace.ui.NftBadgeView;
import com.reddit.ui.AccountStatsView;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.Space;
import com.reddit.ui.button.RedditButton;
import android.widget.LinearLayout;
import com.reddit.snoovatar.ui.widgets.SnoovatarFullBodyView;
import androidx.appcompat.widget.AppCompatImageView;
import com.reddit.snoovatar.ui.widgets.SnoovatarMarketingUnitView;
import androidx.constraintlayout.widget.Barrier;
import android.content.Context;
import com.reddit.presentation.RedditNavHeaderView;
import android.view.ViewGroup;
import android.view.View;
import ii.b;
import androidx.preference.Preference$e;
import af2.w;
import com.instabug.library.apichecker.ReturnableRunnable;
import we.a;
import we.c;
import xc.d$g$a;
import bd.n$a;
import ta.a$a;

public final class e implements ta.a$a, n$a, d$g$a, ii.a$a, we.c, we.a, ReturnableRunnable, w, a.e, Preference$e
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public e(final int f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void A(final ii.b b) {
        ((gh.a)b.get()).a();
    }
    
    public final void a(int o, final View view, final ViewGroup viewGroup) {
        final RedditNavHeaderView redditNavHeaderView = (RedditNavHeaderView)this.g;
        final Context context = (Context)this.h;
        o = RedditNavHeaderView.o;
        ng2.e.f((Object)redditNavHeaderView, "this$0");
        ng2.e.f((Object)context, "$context");
        ng2.e.f((Object)view, "view");
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
        o = 2131427696;
        if (ah0.b.d0(2131427696, view) != null) {
            o = 2131427697;
            if (ah0.b.d0(2131427697, view) != null) {
                o = 2131430223;
                final SnoovatarMarketingUnitView snoovatarMarketingUnitView = (SnoovatarMarketingUnitView)ah0.b.d0(2131430223, view);
                if (snoovatarMarketingUnitView != null) {
                    o = 2131430225;
                    final AppCompatImageView appCompatImageView = (AppCompatImageView)ah0.b.d0(2131430225, view);
                    if (appCompatImageView != null) {
                        o = 2131430226;
                        final View d0 = ah0.b.d0(2131430226, view);
                        if (d0 != null) {
                            o = 2131430227;
                            final SnoovatarFullBodyView snoovatarFullBodyView = (SnoovatarFullBodyView)ah0.b.d0(2131430227, view);
                            if (snoovatarFullBodyView != null) {
                                o = 2131430232;
                                final LinearLayout linearLayout = (LinearLayout)ah0.b.d0(2131430232, view);
                                if (linearLayout != null) {
                                    o = 2131430233;
                                    final RedditButton redditButton = (RedditButton)ah0.b.d0(2131430233, view);
                                    if (redditButton != null) {
                                        o = 2131430234;
                                        final Space space = (Space)ah0.b.d0(2131430234, view);
                                        if (space != null) {
                                            o = 2131430235;
                                            final AppCompatTextView appCompatTextView = (AppCompatTextView)ah0.b.d0(2131430235, view);
                                            if (appCompatTextView != null) {
                                                o = 2131430236;
                                                final RedditButton redditButton2 = (RedditButton)ah0.b.d0(2131430236, view);
                                                if (redditButton2 != null) {
                                                    o = 2131430238;
                                                    final AppCompatImageView appCompatImageView2 = (AppCompatImageView)ah0.b.d0(2131430238, view);
                                                    if (appCompatImageView2 != null) {
                                                        o = 2131430239;
                                                        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)ah0.b.d0(2131430239, view);
                                                        if (appCompatTextView2 != null) {
                                                            o = 2131430240;
                                                            final LinearLayout linearLayout2 = (LinearLayout)ah0.b.d0(2131430240, view);
                                                            if (linearLayout2 != null) {
                                                                o = 2131430241;
                                                                final AppCompatImageView appCompatImageView3 = (AppCompatImageView)ah0.b.d0(2131430241, view);
                                                                if (appCompatImageView3 != null) {
                                                                    o = 2131430242;
                                                                    final AccountStatsView accountStatsView = (AccountStatsView)ah0.b.d0(2131430242, view);
                                                                    if (accountStatsView != null) {
                                                                        o = 2131430273;
                                                                        final NftBadgeView nftBadgeView = (NftBadgeView)ah0.b.d0(2131430273, view);
                                                                        if (nftBadgeView != null) {
                                                                            o = 2131430889;
                                                                            final View d2 = ah0.b.d0(2131430889, view);
                                                                            if (d2 != null) {
                                                                                o = 2131430891;
                                                                                final AppCompatTextView appCompatTextView3 = (AppCompatTextView)ah0.b.d0(2131430891, view);
                                                                                if (appCompatTextView3 != null) {
                                                                                    o = 2131431510;
                                                                                    final ViewStub viewStub = (ViewStub)ah0.b.d0(2131431510, view);
                                                                                    if (viewStub != null) {
                                                                                        redditNavHeaderView.k = new fl0.a((ConstraintLayout)view, snoovatarMarketingUnitView, appCompatImageView, d0, snoovatarFullBodyView, linearLayout, redditButton, space, appCompatTextView, redditButton2, appCompatImageView2, appCompatTextView2, linearLayout2, appCompatImageView3, accountStatsView, nftBadgeView, d2, appCompatTextView3, viewStub);
                                                                                        final ColorStateList a2 = cg.d.A2(2130969657, context);
                                                                                        ng2.e.c((Object)a2);
                                                                                        j$c.f((TextView)appCompatTextView2, a2);
                                                                                        px0.c.J2((t)redditNavHeaderView.h, (q20.d)q20.e.a).subscribe((g)new h(5));
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(o)));
    }
    
    public final void b(final v v) {
        final RedditChatRepository redditChatRepository = (RedditChatRepository)this.g;
        final String s = (String)this.h;
        ng2.e.f((Object)redditChatRepository, "this$0");
        ng2.e.f((Object)s, "$channelHandlerId");
        final g40.b v2 = redditChatRepository.v;
        final i0 i0 = new i0(v);
        v2.getClass();
        SendBird.a(s, (SendBird$b)i0);
    }
    
    public final boolean d(final Preference preference) {
        ((PreferencesFragment)this.g).F.L2((Context)this.h);
        return true;
    }
    
    public final ImmutableList e(final int n, final s s, final int[] array) {
        final xc.d.c c = (xc.d.c)this.g;
        final int[] array2 = (int[])this.h;
        final Ordering<Integer> e = xc.d.e;
        final int n2 = array2[n];
        final int n3 = c.n;
        final int o = c.o;
        final boolean p3 = c.p;
        int n4;
        if (n3 != Integer.MAX_VALUE && o != Integer.MAX_VALUE) {
            n4 = Integer.MAX_VALUE;
            int n6;
            for (int i = 0; i < s.f; ++i, n4 = n6) {
                final n n5 = s.h[i];
                final int v = n5.v;
                n6 = n4;
                if (v > 0) {
                    final int w = n5.w;
                    n6 = n4;
                    if (w > 0) {
                        int n7;
                        int n8;
                        if (p3 && v > w != n3 > o) {
                            n7 = n3;
                            n8 = o;
                        }
                        else {
                            n8 = n3;
                            n7 = o;
                        }
                        final int n9 = v * n7;
                        final int n10 = w * n8;
                        Point point;
                        if (n9 >= n10) {
                            final int a = c0.a;
                            point = new Point(n8, (n10 + v - 1) / v);
                        }
                        else {
                            final int a2 = c0.a;
                            point = new Point((n9 + w - 1) / w, n7);
                        }
                        final int v2 = n5.v;
                        final int w2 = n5.w;
                        final int n11 = v2 * w2;
                        n6 = n4;
                        if (v2 >= (int)(point.x * 0.98f)) {
                            n6 = n4;
                            if (w2 >= (int)(point.y * 0.98f) && n11 < (n6 = n4)) {
                                n6 = n11;
                            }
                        }
                    }
                }
            }
        }
        else {
            n4 = Integer.MAX_VALUE;
        }
        final ImmutableList$a builder = ImmutableList.builder();
        for (int j = 0; j < s.f; ++j) {
            final n n12 = s.h[j];
            final int v3 = n12.v;
            int n13 = 0;
            Label_0428: {
                if (v3 != -1) {
                    final int w3 = n12.w;
                    if (w3 != -1) {
                        n13 = v3 * w3;
                        break Label_0428;
                    }
                }
                n13 = -1;
            }
            ((ImmutableCollection$a)builder).c((Object)new d$h(n, s, j, c, array[j], n2, n4 == Integer.MAX_VALUE || (n13 != -1 && n13 <= n4)));
        }
        return builder.f();
    }
    
    public final Object execute() {
        return ((j)this.g).c.a2((com.google.android.datatransport.runtime.c)this.h);
    }
    
    public final void invoke(final Object o) {
        switch (this.f) {
            default: {
                ((xa.b)o).onCues((b$a)this.g, (List)this.h);
                return;
            }
            case 6: {
                ((xa.b)o).onPlaybackParametersChanged((b$a)this.g, (com.google.android.exoplayer2.v)this.h);
                return;
            }
            case 5: {
                final b$a b$a = (b$a)this.g;
                final ab.e e = (ab.e)this.h;
                final xa.b b = (xa.b)o;
                b.onAudioDisabled(b$a, e);
                b.onDecoderDisabled(b$a, 1, e);
                return;
            }
            case 4: {
                ((xa.b)o).onDownstreamFormatChanged((b$a)this.g, (i)this.h);
                return;
            }
            case 3: {
                ((xa.b)o).onPlayerError((b$a)this.g, (PlaybackException)this.h);
                return;
            }
            case 2: {
                ((xa.b)o).onVideoDecoderReleased((b$a)this.g, (String)this.h);
                return;
            }
            case 1: {
                final d0 d0 = (d0)this.g;
                final xc.i i = (xc.i)this.h;
                final w$c w$c = (w$c)o;
                final int n0 = k.n0;
                w$c.onTracksChanged(d0.h, i);
            }
        }
    }
    
    public final void k(final we.g g) {
        final f f = (f)this.g;
        final Intent intent = (Intent)this.h;
        final int k = oi.f.k;
        f.a(intent);
    }
    
    public final Object run() {
        final fp.c c = (fp.c)this.g;
        final String s = (String)this.h;
        ng2.e.f((Object)c, "this$0");
        c.a.remove(s);
        return c;
    }
    
    public final Object then(final we.g g) {
        final com.google.firebase.remoteconfig.internal.b b = (com.google.firebase.remoteconfig.internal.b)this.g;
        Object i = this.h;
        final int[] j = com.google.firebase.remoteconfig.internal.b.j;
        b.getClass();
        if (g.n()) {
            final com.google.firebase.remoteconfig.internal.c g2 = b.g;
            synchronized (g2.b) {
                g2.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", ((Date)i).getTime()).apply();
                return g;
            }
        }
        i = g.i();
        if (i == null) {
            return g;
        }
        if (i instanceof FirebaseRemoteConfigFetchThrottledException) {
            final com.google.firebase.remoteconfig.internal.c g3 = b.g;
            synchronized (g3.b) {
                g3.a.edit().putInt("last_fetch_status", 2).apply();
                return g;
            }
        }
        final com.google.firebase.remoteconfig.internal.c g4 = b.g;
        synchronized (g4.b) {
            g4.a.edit().putInt("last_fetch_status", 1).apply();
            return g;
        }
    }
}
