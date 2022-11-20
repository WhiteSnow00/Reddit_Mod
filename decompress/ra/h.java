// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.widget.TextView;
import com.reddit.modtools.BaseModeratorsScreen;
import com.reddit.screen.presentation.CompositionViewModel;
import lf1.k;
import com.google.firebase.crashlytics.internal.common.Utils;
import java.util.Set;
import y10.t;
import com.reddit.feature.viewstream.ViewStreamPresenter;
import com.reddit.media.player.VideoEventBus$a;
import com.reddit.media.player.PlaybackControlView;
import com.instabug.survey.Surveys;
import com.instabug.library.OnUsageExceededReady;
import android.content.res.Resources;
import com.reddit.flairselect.FlairSelectScreen$b;
import android.widget.Button;
import android.text.Editable;
import android.app.Activity;
import ng0.l;
import com.reddit.screens.chat.groupchat.presentation.GroupMessagingPresenter;
import com.reddit.domain.model.flair.FlairScreenMode;
import android.view.View;
import com.reddit.ui.ViewUtilKt;
import com.reddit.flairselect.FlairSelectScreen;
import q20.d;
import af2.c0;
import android.widget.EditText;
import com.reddit.modtools.approvedsubmitters.add.AddApprovedSubmitterScreen;
import com.reddit.screen.BaseScreen;
import com.reddit.screen.Routing;
import com.bluelinelabs.conductor.Controller;
import ho0.i;
import com.reddit.frontpage.presentation.modtools.ban.add.AddBannedUserScreen;
import ho0.i$e;
import com.reddit.events.builders.BaseEventBuilder;
import com.reddit.events.builders.ModNoun;
import com.reddit.modtools.ban.BannedUsersScreen;
import android.content.Context;
import com.reddit.screens.chat.groupchat.view.GroupMessagingScreen;
import hp1.g$a;
import com.reddit.screens.chat.inbox.livechat.LiveChatScreen;
import android.view.MenuItem;
import com.reddit.instabug.InstabugEventBuilder$Noun;
import com.reddit.instabug.InstabugEventBuilder$Action;
import com.reddit.instabug.InstabugEventBuilder$Source;
import com.reddit.instabug.InstabugEventBuilder;
import oi.d0;
import oi.e0$a;
import we.g;
import java.util.List;
import com.google.android.exoplayer2.w$c;
import xa.b$a;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import android.database.Cursor;
import com.reddit.debug.logging.DataLoggingActivity;
import com.reddit.feature.fullbleedplayer.pager.PageableFullBleedScreen;
import com.reddit.frontpage.presentation.listing.comment.UserCommentsListingScreen;
import com.reddit.frontpage.presentation.listing.discover.DiscoverLinkListingScreen;
import ng2.e;
import com.reddit.frontpage.presentation.listing.saved.posts.SavedPostsListingScreen;
import vd1.f;
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.instabug.library.invocation.OnInvokeCallback;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f;
import ff2.b;
import ff2.q;
import com.instabug.library.apichecker.VoidRunnable;
import com.instabug.library.apichecker.ReturnableRunnable;
import com.instabug.library.annotation.AnnotationView$g;
import we.c;
import we.a;
import bd.n$a;
import com.google.android.exoplayer2.m$e;
import sa.u;
import ta.a$a;

public final class h implements a$a, a, m$e, n$a, we.a, we.c, AnnotationView$g, ReturnableRunnable, VoidRunnable, q, ff2.b, SwipeRefreshLayout$f, Toolbar.h, OnInvokeCallback, b, c
{
    public final int f;
    public final Object g;
    
    public h(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void O() {
        switch (this.f) {
            default: {
                ((f)this.g).r0();
                return;
            }
            case 19: {
                final SavedPostsListingScreen savedPostsListingScreen = (SavedPostsListingScreen)this.g;
                e.f((Object)savedPostsListingScreen, "this$0");
                savedPostsListingScreen.AC().r0();
                return;
            }
            case 18: {
                final DiscoverLinkListingScreen discoverLinkListingScreen = (DiscoverLinkListingScreen)this.g;
                e.f((Object)discoverLinkListingScreen, "this$0");
                discoverLinkListingScreen.fD().o1.clear();
                ((k)discoverLinkListingScreen.hD()).O9();
                return;
            }
            case 17: {
                final UserCommentsListingScreen userCommentsListingScreen = (UserCommentsListingScreen)this.g;
                e.f((Object)userCommentsListingScreen, "this$0");
                ((k)userCommentsListingScreen.wC()).O9();
                return;
            }
            case 14: {
                final PageableFullBleedScreen pageableFullBleedScreen = (PageableFullBleedScreen)this.g;
                e.f((Object)pageableFullBleedScreen, "this$0");
                pageableFullBleedScreen.zC();
            }
        }
    }
    
    public final void accept(final Object o, final Object o2) {
        DataLoggingActivity.m0((DataLoggingActivity)this.g, (String)o, (Throwable)o2);
    }
    
    public final Object apply(final Object o) {
        final u u = (u)this.g;
        final Cursor cursor = (Cursor)o;
        final ha.b k = sa.u.k;
        u.getClass();
        while (cursor.moveToNext()) {
            u.j((long)cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }
    
    public final void c(final int n, final int n2, final int n3) {
        final mg2.q q = (mg2.q)this.g;
        e.f((Object)q, "$callback");
        q.invoke((Object)n, (Object)n2, (Object)n3);
    }
    
    public final Object execute() {
        ((j)this.g).i.b();
        return null;
    }
    
    public final void invoke(final Object o) {
        switch (this.f) {
            default: {
                ((xa.b)o).onDrmKeysRemoved((b$a)this.g);
                return;
            }
            case 3: {
                ((w$c)o).onCues((List)this.g);
            }
        }
    }
    
    public final void k(final g g) {
        final e0$a e0$a = (e0$a)this.g;
        final int b = d0.b;
        e0$a.b.d((Object)null);
    }
    
    public final void onInvoke() {
        final us0.e e = (us0.e)this.g;
        ng2.e.f((Object)e, "this$0");
        final InstabugEventBuilder instabugEventBuilder = new InstabugEventBuilder(e.a.a);
        final InstabugEventBuilder$Source report = InstabugEventBuilder$Source.REPORT;
        ng2.e.f((Object)report, "source");
        ((BaseEventBuilder)instabugEventBuilder).F(report.getValue());
        final InstabugEventBuilder$Action shake = InstabugEventBuilder$Action.SHAKE;
        ng2.e.f((Object)shake, "action");
        ((BaseEventBuilder)instabugEventBuilder).b(shake.getValue());
        final InstabugEventBuilder$Noun invoked = InstabugEventBuilder$Noun.INVOKED;
        ng2.e.f((Object)invoked, "noun");
        ((BaseEventBuilder)instabugEventBuilder).v(invoked.getValue());
        ((BaseEventBuilder)instabugEventBuilder).a();
    }
    
    public final boolean onMenuItemClick(final MenuItem menuItem) {
        switch (this.f) {
            default: {
                final LiveChatScreen liveChatScreen = (LiveChatScreen)this.g;
                e.f((Object)liveChatScreen, "this$0");
                if (menuItem.getItemId() == 2131427445) {
                    ((CompositionViewModel)liveChatScreen.wC()).onEvent((Object)g$a.a);
                }
                return true;
            }
            case 28: {
                final GroupMessagingScreen groupMessagingScreen = (GroupMessagingScreen)this.g;
                e.f((Object)groupMessagingScreen, "this$0");
                if (menuItem.getItemId() == 2131427446) {
                    final GroupMessagingPresenter yc = groupMessagingScreen.yC();
                    final oq1.a z = yc.z;
                    final String b = yc.g.b;
                    z.getClass();
                    e.f((Object)b, "url");
                    ((jc0.c)z.c).v1((Context)z.a.invoke(), b);
                }
                return true;
            }
            case 24: {
                final i31.f f = (i31.f)this.g;
                e.f((Object)f, "this$0");
                if (menuItem.getItemId() == 2131427512) {
                    f.tC().j();
                }
                return true;
            }
            case 23: {
                final BannedUsersScreen bannedUsersScreen = (BannedUsersScreen)this.g;
                e.f((Object)bannedUsersScreen, "this$0");
                if (menuItem.getItemId() == 2131427496) {
                    final yh0.a r0 = bannedUsersScreen.r0;
                    if (r0 == null) {
                        e.n("modAnalytics");
                        throw null;
                    }
                    final String subredditId = ((BaseModeratorsScreen)bannedUsersScreen).getSubredditId();
                    final String h = ((BaseModeratorsScreen)bannedUsersScreen).H();
                    final l r2 = b.r(r0, "banned", "click");
                    ((BaseEventBuilder)r2).v(ModNoun.BAN_DIALOG_BANPAGE.getActionName());
                    BaseEventBuilder.H((BaseEventBuilder)r2, subredditId, h, (String)null, (Boolean)null, (Boolean)null, 28);
                    ((BaseEventBuilder)r2).a();
                    if (bannedUsersScreen.s0 == null) {
                        e.n("modtoolsExternalNavigator");
                        throw null;
                    }
                    final Activity na = ((Controller)bannedUsersScreen).NA();
                    e.c((Object)na);
                    final AddBannedUserScreen addBannedUserScreen = new AddBannedUserScreen((i)new i$e(((BaseModeratorsScreen)bannedUsersScreen).getSubredditId(), ((BaseModeratorsScreen)bannedUsersScreen).H()));
                    ((Controller)addBannedUserScreen).EB((Controller)bannedUsersScreen);
                    Routing.g((Context)na, (BaseScreen)addBannedUserScreen);
                }
                return true;
            }
            case 22: {
                final AddApprovedSubmitterScreen addApprovedSubmitterScreen = (AddApprovedSubmitterScreen)this.g;
                e.f((Object)addApprovedSubmitterScreen, "this$0");
                if (menuItem.getItemId() == 2131427496) {
                    menuItem.setEnabled(false);
                    final yh0.a k0 = addApprovedSubmitterScreen.k0;
                    if (k0 == null) {
                        e.n("modAnalytics");
                        throw null;
                    }
                    final String subredditId2 = addApprovedSubmitterScreen.subredditId;
                    if (subredditId2 == null) {
                        e.n("subredditId");
                        throw null;
                    }
                    final String h2 = addApprovedSubmitterScreen.H();
                    final l r3 = b.r(k0, "contributors", "click");
                    ((BaseEventBuilder)r3).v(ModNoun.ADD.getActionName());
                    BaseEventBuilder.H((BaseEventBuilder)r3, subredditId2, h2, (String)null, (Boolean)null, (Boolean)null, 28);
                    ((BaseEventBuilder)r3).a();
                    final v11.a j0 = addApprovedSubmitterScreen.j0;
                    if (j0 == null) {
                        e.n("presenter");
                        throw null;
                    }
                    final Editable text = ((EditText)addApprovedSubmitterScreen.h0.getValue()).getText();
                    e.e((Object)text, "username.text");
                    final String string = kotlin.text.b.u1((CharSequence)text).toString();
                    e.f((Object)string, "username");
                    ((com.reddit.presentation.a)j0).gn(px1.a.o0((c0)j0.h.f(j0.g.H(), string), (d)j0.i).F((ff2.g)new w10.h(5, (Object)j0, (Object)string), (ff2.g)new qm.a((Object)j0, 26)));
                }
                return true;
            }
            case 16: {
                final FlairSelectScreen flairSelectScreen = (FlairSelectScreen)this.g;
                e.f((Object)flairSelectScreen, "this$0");
                final int itemId = menuItem.getItemId();
                if (itemId == 2131427465) {
                    if (flairSelectScreen.A0 == null) {
                        flairSelectScreen.A0 = flairSelectScreen.z0;
                    }
                    final m41.a d0 = flairSelectScreen.D0;
                    if (d0 == null) {
                        e.n("networkConnection");
                        throw null;
                    }
                    if (!d0.b()) {
                        ((BaseScreen)flairSelectScreen).do(2131953342, new Object[0]);
                    }
                    else {
                        if (!(flairSelectScreen.p0 ^= true)) {
                            flairSelectScreen.FC();
                            ViewUtilKt.g((View)flairSelectScreen.yC());
                        }
                        else {
                            flairSelectScreen.yC().setCurrentQuery("");
                            ViewUtilKt.e((View)flairSelectScreen.yC());
                        }
                        final Button h3 = flairSelectScreen.H0;
                        if (h3 == null) {
                            e.n("doneView");
                            throw null;
                        }
                        ((View)h3).setEnabled(flairSelectScreen.CC());
                        flairSelectScreen.BC();
                        flairSelectScreen.EC();
                        final FlairSelectScreen$b i0 = flairSelectScreen.I0;
                        if (i0 == null) {
                            e.n("flairAdapter");
                            throw null;
                        }
                        if (i0.l().isEmpty() && flairSelectScreen.p0) {
                            ViewUtilKt.e((View)flairSelectScreen.wC());
                            ViewUtilKt.g((View)flairSelectScreen.uC());
                            final Button g0 = flairSelectScreen.G0;
                            if (g0 == null) {
                                e.n("clearView");
                                throw null;
                            }
                            ViewUtilKt.e((View)g0);
                            final MenuItem t0 = flairSelectScreen.T0;
                            if (t0 == null) {
                                e.n("editItem");
                                throw null;
                            }
                            final Activity na2 = ((Controller)flairSelectScreen).NA();
                            e.c((Object)na2);
                            t0.setTitle((CharSequence)((Context)na2).getString(2131951792));
                        }
                        else {
                            ViewUtilKt.e((View)flairSelectScreen.uC());
                            if (flairSelectScreen.o0 == FlairScreenMode.FLAIR_SELECT) {
                                final Button g2 = flairSelectScreen.G0;
                                if (g2 == null) {
                                    e.n("clearView");
                                    throw null;
                                }
                                ViewUtilKt.g((View)g2);
                            }
                            ViewUtilKt.e((View)flairSelectScreen.wC());
                            if (!flairSelectScreen.p0) {
                                final Button h4 = flairSelectScreen.H0;
                                if (h4 == null) {
                                    e.n("doneView");
                                    throw null;
                                }
                                final Resources ua = ((Controller)flairSelectScreen).UA();
                                String string2;
                                if (ua != null) {
                                    string2 = ua.getString(2131951725);
                                }
                                else {
                                    string2 = null;
                                }
                                ((TextView)h4).setText((CharSequence)string2);
                            }
                            final FlairSelectScreen$b i2 = flairSelectScreen.I0;
                            if (i2 == null) {
                                e.n("flairAdapter");
                                throw null;
                            }
                            flairSelectScreen.AC(i2.m.isEmpty() ^ true);
                        }
                        final FlairSelectScreen$b i3 = flairSelectScreen.I0;
                        if (i3 == null) {
                            e.n("flairAdapter");
                            throw null;
                        }
                        ((RecyclerView$Adapter)i3).notifyDataSetChanged();
                    }
                }
                else if (itemId == 2131427472) {
                    flairSelectScreen.xC().we(flairSelectScreen.n0);
                }
                return true;
            }
        }
    }
    
    public final Object run() {
        final fp.c c = (fp.c)this.g;
        e.f((Object)c, "this$0");
        c.a.clear();
        return c;
    }
    
    public final void run() {
        Surveys.a((OnUsageExceededReady)this.g);
    }
    
    public final boolean test(final Object o) {
        final int f = this.f;
        boolean b = true;
        switch (f) {
            default: {
                final PlaybackControlView playbackControlView = (PlaybackControlView)this.g;
                final VideoEventBus$a videoEventBus$a = (VideoEventBus$a)o;
                final int x = PlaybackControlView.x;
                playbackControlView.getClass();
                if (videoEventBus$a.b == playbackControlView.r) {
                    b = false;
                }
                return b;
            }
            case 15: {
                final ViewStreamPresenter viewStreamPresenter = (ViewStreamPresenter)this.g;
                final t t = (t)o;
                final Long[] r0 = ViewStreamPresenter.R0;
                e.f((Object)viewStreamPresenter, "this$0");
                e.f((Object)t, "change");
                return e.a((Object)viewStreamPresenter.k, (Object)t.a);
            }
            case 13: {
                final yd0.a a = (yd0.a)this.g;
                final Set set = (Set)o;
                e.f((Object)a, "$params");
                e.f((Object)set, "subredditKindWithIds");
                return set.contains(a.a);
            }
            case 12: {
                final cb0.g g = (cb0.g)this.g;
                final Set set2 = (Set)o;
                e.f((Object)g, "$params");
                e.f((Object)set2, "it");
                return set2.contains(g.a);
            }
            case 10: {
                final b20.b b2 = (b20.b)this.g;
                final CharSequence charSequence = (CharSequence)o;
                e.f((Object)b2, "this$0");
                e.f((Object)charSequence, "it");
                return b2.Wh() ^ true;
            }
        }
    }
    
    public final Object then(final g g) {
        return Utils.a((we.h)this.g, g);
    }
    
    public final void w(final int n, final int n2) {
        final pj1.i i = (pj1.i)this.g;
        e.f((Object)i, "this$0");
        i.tC().d0(n, n2);
    }
}
