// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import android.os.BaseBundle;
import com.reddit.data.postsubmit.VideoUploadService$l;
import com.reddit.session.Session;
import com.reddit.screen.BaseScreen;
import android.app.Dialog;
import com.bluelinelabs.conductor.Controller;
import com.reddit.modtools.BaseModeratorsScreen;
import org.json.JSONArray;
import java.io.IOException;
import android.os.Bundle;
import org.json.JSONException;
import com.google.firebase.abt.AbtException;
import android.util.Log;
import we.g;
import com.reddit.domain.model.AbbreviatedComment;
import ug2.k;
import com.reddit.data.postsubmit.VideoUploadService$h;
import com.reddit.domain.model.LiveModel$RemoveByNotCommentAuthor;
import com.reddit.domain.model.LiveModel;
import af2.s;
import kotlin.Pair;
import ff0.p;
import sj0.p$a;
import com.reddit.feature.pagingviewstream.PageableViewStreamPresenter;
import com.reddit.frontpage.presentation.detail.DetailScreen;
import com.reddit.frontpage.presentation.detail.DetailListAdapter$a$a;
import iq0.h;
import com.reddit.data.postsubmit.VideoUploadService$i;
import com.reddit.domain.model.VideoUploadPresentationModel;
import com.instabug.bug.BugReporting;
import com.instabug.library.OnUsageExceededReady;
import android.app.Activity;
import com.reddit.domain.model.flair.FlairScreenMode;
import com.reddit.flairedit.FlairEditScreen;
import com.reddit.frontpage.presentation.detail.video.VideoPlayerScreen;
import android.content.Context;
import android.content.Intent;
import com.reddit.screen.notification.service.ComposeService;
import android.content.DialogInterface$OnDismissListener;
import com.reddit.screen.dialog.RedditAlertDialog$a;
import com.reddit.frontpage.ui.inbox.ComposeScreen;
import com.reddit.events.builders.BaseEventBuilder;
import com.reddit.events.builders.ModNoun;
import com.reddit.modtools.approvedsubmitters.ApprovedSubmittersScreen;
import android.view.MenuItem;
import com.google.android.exoplayer2.i;
import com.google.android.exoplayer2.w$c;
import java.util.Iterator;
import sa.b0;
import com.reddit.instabug.InstabugEventBuilder$Noun;
import com.reddit.instabug.InstabugEventBuilder$Action;
import com.reddit.instabug.InstabugEventBuilder$Source;
import com.reddit.instabug.InstabugEventBuilder;
import com.instabug.library.OnSdkDismissCallback$ReportType;
import com.instabug.library.OnSdkDismissCallback$DismissType;
import af2.v;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import android.database.Cursor;
import zb.f;
import zb.d;
import zb.j;
import com.reddit.frontpage.presentation.listing.all.AllListingScreen;
import com.reddit.frontpage.presentation.listing.saved.comments.SavedCommentsScreen;
import com.reddit.frontpage.presentation.listing.topic.posts.TopicPostsScreen;
import ng2.e;
import com.reddit.frontpage.presentation.modtools.modqueue.ModQueueListingScreen;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import mh.c;
import ii.b;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.reddit.widget.bottomnav.BottomNavView$b;
import com.instabug.library.OnSdkDismissCallback;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f;
import androidx.appcompat.widget.Toolbar;
import ff2.q;
import af2.w;
import com.instabug.library.apichecker.VoidRunnable;
import we.a;
import ad.e$a;
import ac.b$b;
import bd.n$a;
import sa.u;
import ta.a$a;

public final class l implements a$a, a, n$a, b$b, e$a, ii.a$a, we.a, VoidRunnable, w, q, h, SwipeRefreshLayout$f, OnSdkDismissCallback, BottomNavView$b, b
{
    public final int f;
    public final Object g;
    
    public l(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void A(final ii.b b) {
        switch (this.f) {
            default: {
                ((c)this.g).b.set(b.get());
                return;
            }
            case 6: {
                CrashlyticsNativeComponentDeferredProxy.a((CrashlyticsNativeComponentDeferredProxy)this.g, b);
            }
        }
    }
    
    public final void O() {
        switch (this.f) {
            default: {
                final ModQueueListingScreen modQueueListingScreen = (ModQueueListingScreen)this.g;
                e.f((Object)modQueueListingScreen, "this$0");
                ((lf1.k)modQueueListingScreen.oD()).O9();
                return;
            }
            case 22: {
                final TopicPostsScreen topicPostsScreen = (TopicPostsScreen)this.g;
                e.f((Object)topicPostsScreen, "this$0");
                topicPostsScreen.vC().O();
                return;
            }
            case 21: {
                final SavedCommentsScreen savedCommentsScreen = (SavedCommentsScreen)this.g;
                e.f((Object)savedCommentsScreen, "this$0");
                savedCommentsScreen.zC().Di();
                return;
            }
            case 20: {
                final AllListingScreen allListingScreen = (AllListingScreen)this.g;
                e.f((Object)allListingScreen, "this$0");
                allListingScreen.fD().o1.clear();
                ((lf1.k)allListingScreen.iD()).O9();
            }
        }
    }
    
    public final void a(final long n, final long n2, final long n3) {
        final f.a e = ((j)this.g).e;
        if (e != null) {
            float n4;
            if (n != -1L && n != 0L) {
                n4 = n2 * 100.0f / n;
            }
            else {
                n4 = -1.0f;
            }
            ((d.d)e).b(n, n2, n4);
        }
    }
    
    public final Object apply(final Object o) {
        final u u = (u)this.g;
        final Cursor cursor = (Cursor)o;
        final ha.b k = sa.u.k;
        u.getClass();
        while (cursor.moveToNext()) {
            u.j((long)cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }
    
    public final void b(final v v) {
        final mg2.l l = (mg2.l)this.g;
        e.f((Object)l, "$tmp0");
        l.invoke((Object)v);
    }
    
    public final void c(final int n, final int n2, final int n3) {
        final i31.f f = (i31.f)this.g;
        e.f((Object)f, "this$0");
        f.tC().E0(n, n2, n3);
    }
    
    public final void call(final OnSdkDismissCallback$DismissType onSdkDismissCallback$DismissType, final OnSdkDismissCallback$ReportType onSdkDismissCallback$ReportType) {
        final us0.e e = (us0.e)this.g;
        ng2.e.f((Object)e, "this$0");
        if (onSdkDismissCallback$DismissType == OnSdkDismissCallback$DismissType.SUBMIT) {
            final InstabugEventBuilder instabugEventBuilder = new InstabugEventBuilder(e.a.a);
            final InstabugEventBuilder$Source report = InstabugEventBuilder$Source.REPORT;
            ng2.e.f((Object)report, "source");
            ((BaseEventBuilder)instabugEventBuilder).F(report.getValue());
            final InstabugEventBuilder$Action click = InstabugEventBuilder$Action.CLICK;
            ng2.e.f((Object)click, "action");
            ((BaseEventBuilder)instabugEventBuilder).b(click.getValue());
            final InstabugEventBuilder$Noun submit = InstabugEventBuilder$Noun.SUBMIT;
            ng2.e.f((Object)submit, "noun");
            ((BaseEventBuilder)instabugEventBuilder).v(submit.getValue());
            ((BaseEventBuilder)instabugEventBuilder).a();
        }
        if (onSdkDismissCallback$DismissType == OnSdkDismissCallback$DismissType.CANCEL) {
            final InstabugEventBuilder instabugEventBuilder2 = new InstabugEventBuilder(e.a.a);
            final InstabugEventBuilder$Source report2 = InstabugEventBuilder$Source.REPORT;
            ng2.e.f((Object)report2, "source");
            ((BaseEventBuilder)instabugEventBuilder2).F(report2.getValue());
            final InstabugEventBuilder$Action click2 = InstabugEventBuilder$Action.CLICK;
            ng2.e.f((Object)click2, "action");
            ((BaseEventBuilder)instabugEventBuilder2).b(click2.getValue());
            final InstabugEventBuilder$Noun cancel = InstabugEventBuilder$Noun.CANCEL;
            ng2.e.f((Object)cancel, "noun");
            ((BaseEventBuilder)instabugEventBuilder2).v(cancel.getValue());
            ((BaseEventBuilder)instabugEventBuilder2).a();
        }
    }
    
    public final Object d() {
        return ((b0)this.g).getWritableDatabase();
    }
    
    public final Object execute() {
        final m m = (m)this.g;
        final Iterator<com.google.android.datatransport.runtime.c> iterator = m.b.H1().iterator();
        while (iterator.hasNext()) {
            m.c.b(iterator.next(), 1);
        }
        return null;
    }
    
    public final void invoke(final Object o) {
        ((w$c)o).onDeviceInfoChanged((i)this.g);
    }
    
    public final boolean onMenuItemClick(final MenuItem menuItem) {
        switch (this.f) {
            default: {
                final ApprovedSubmittersScreen approvedSubmittersScreen = (ApprovedSubmittersScreen)this.g;
                e.f((Object)approvedSubmittersScreen, "this$0");
                if (menuItem.getItemId() == 2131427496) {
                    final yh0.a r0 = approvedSubmittersScreen.r0;
                    if (r0 == null) {
                        e.n("modAnalytics");
                        throw null;
                    }
                    final String subredditId = ((BaseModeratorsScreen)approvedSubmittersScreen).getSubredditId();
                    final String h = ((BaseModeratorsScreen)approvedSubmittersScreen).H();
                    final ng0.l r2 = b.r(r0, "muted", "click");
                    ((BaseEventBuilder)r2).v(ModNoun.ADD_APPROVED_SUBMITTER.getActionName());
                    BaseEventBuilder.H((BaseEventBuilder)r2, subredditId, h, (String)null, (Boolean)null, (Boolean)null, 28);
                    ((BaseEventBuilder)r2).a();
                    final q11.e t0 = approvedSubmittersScreen.t0;
                    if (t0 == null) {
                        e.n("modToolsNavigator");
                        throw null;
                    }
                    final Activity na = ((Controller)approvedSubmittersScreen).NA();
                    e.c((Object)na);
                    t0.e(na, ((BaseModeratorsScreen)approvedSubmittersScreen).getSubredditId(), ((BaseModeratorsScreen)approvedSubmittersScreen).H(), approvedSubmittersScreen);
                }
                return true;
            }
            case 24: {
                final ComposeScreen composeScreen = (ComposeScreen)this.g;
                composeScreen.getClass();
                if (menuItem.getItemId() == 16908332) {
                    composeScreen.tC();
                }
                else if (menuItem.getItemId() == 2131427517) {
                    composeScreen.r0.onNext(Boolean.TRUE);
                    String s;
                    if (composeScreen.isContactingMods) {
                        s = composeScreen.l0.a(2131953612, new Object[] { composeScreen.h0.getText().toString() });
                    }
                    else {
                        s = composeScreen.h0.getText().toString();
                    }
                    final String string = composeScreen.f0.getText().toString();
                    final String string2 = composeScreen.i0.getText().toString();
                    ((Dialog)(composeScreen.n0 = RedditAlertDialog$a.h(((Controller)composeScreen).NA(), 2131957902, false))).setOnDismissListener((DialogInterface$OnDismissListener)new zj0.c((Object)composeScreen, 1));
                    ((Dialog)composeScreen.n0).show();
                    final String o0 = composeScreen.o0;
                    final Intent intent = new Intent((Context)((Controller)composeScreen).NA(), (Class)ComposeService.class);
                    intent.putExtra("request_id", o0);
                    intent.putExtra("com.reddit.extra.to", s);
                    intent.putExtra("com.reddit.extra.subject", string);
                    intent.putExtra("com.reddit.extra.text", string2);
                    ((Context)((Controller)composeScreen).NA()).startService(intent);
                }
                return true;
            }
            case 19: {
                VideoPlayerScreen.RC((VideoPlayerScreen)this.g, menuItem);
                return true;
            }
            case 17: {
                final FlairEditScreen flairEditScreen = (FlairEditScreen)this.g;
                e.f((Object)flairEditScreen, "this$0");
                if (menuItem.getItemId() == 2131427512) {
                    final s01.a z0 = flairEditScreen.z0;
                    if (z0 == null) {
                        e.n("modFeatures");
                        throw null;
                    }
                    if (z0.Xc()) {
                        if (flairEditScreen.F0 == FlairScreenMode.FLAIR_SELECT) {
                            flairEditScreen.CC();
                            ((BaseScreen)flairEditScreen).d();
                        }
                        else {
                            flairEditScreen.BC();
                        }
                    }
                    else {
                        flairEditScreen.BC();
                        flairEditScreen.CC();
                    }
                }
                return true;
            }
        }
    }
    
    public final void run() {
        BugReporting.b((OnUsageExceededReady)this.g);
    }
    
    public final boolean test(final Object o) {
        final int f = this.f;
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = false;
        switch (f) {
            default: {
                final VideoUploadPresentationModel videoUploadPresentationModel = (VideoUploadPresentationModel)this.g;
                final VideoUploadService$i videoUploadService$i = (VideoUploadService$i)o;
                final int z0 = iq0.h.z0;
                return videoUploadService$i.a.equals(videoUploadPresentationModel.getRequestId());
            }
            case 18: {
                final em0.c c = (em0.c)this.g;
                final DetailListAdapter$a$a detailListAdapter$a$a = (DetailListAdapter$a$a)o;
                final k[] b4 = DetailScreen.b5;
                e.f((Object)c, "$comment");
                e.f((Object)detailListAdapter$a$a, "it");
                if (detailListAdapter$a$a.a == c) {
                    b3 = true;
                }
                return b3;
            }
            case 16: {
                final PageableViewStreamPresenter pageableViewStreamPresenter = (PageableViewStreamPresenter)this.g;
                final s22.h h = (s22.h)o;
                e.f((Object)pageableViewStreamPresenter, "this$0");
                e.f((Object)h, "it");
                return e.a((Object)h.a, (Object)pageableViewStreamPresenter.sn());
            }
            case 15: {
                final p$a p$a = (p$a)this.g;
                final Boolean b5 = (Boolean)o;
                e.f((Object)p$a, "$params");
                e.f((Object)b5, "isConnected");
                boolean b6 = b;
                if (b5) {
                    b6 = b;
                    if (p$a.a) {
                        b6 = true;
                    }
                }
                return b6;
            }
            case 14: {
                final p p = (p)this.g;
                final Pair pair = (Pair)o;
                e.f((Object)p, "this$0");
                e.f((Object)pair, "<name for destructuring parameter 0>");
                final s s = (s)pair.component1();
                final Boolean b7 = (Boolean)pair.component2();
                if (s.g()) {
                    final LiveModel liveModel = (LiveModel)s.d();
                    if (liveModel instanceof LiveModel$RemoveByNotCommentAuthor) {
                        if (e.a((Object)b7, (Object)Boolean.TRUE)) {
                            return b2;
                        }
                        final String username = ((Session)p.h.getActiveSession()).getUsername();
                        final AbbreviatedComment t = p.g.t(((LiveModel$RemoveByNotCommentAuthor)liveModel).getModel().getCommentKindWithId());
                        String author;
                        if (t != null) {
                            author = t.getAuthor();
                        }
                        else {
                            author = null;
                        }
                        final boolean b8 = b2;
                        if (e.a((Object)username, (Object)author)) {
                            return b8;
                        }
                    }
                }
                return true;
            }
            case 13: {
                final VideoUploadService$h videoUploadService$h = (VideoUploadService$h)this.g;
                final VideoUploadService$i videoUploadService$i2 = (VideoUploadService$i)o;
                videoUploadService$h.getClass();
                return videoUploadService$i2.a.equals(((VideoUploadService$l)videoUploadService$h).h);
            }
        }
    }
    
    public final Object then(final g g) {
        switch (this.f) {
            default: {
                final fj.a a = (fj.a)this.g;
                a.getClass();
                if (g.n()) {
                    Object o = a.c;
                    synchronized (o) {
                        ((gj.b)o).c = we.j.e((Object)null);
                        monitorexit(o);
                        o = ((gj.b)o).b;
                        synchronized (o) {
                            ((gj.f)o).a.deleteFile(((gj.f)o).b);
                            monitorexit(o);
                            if (g.j() != null) {
                                final JSONArray d = ((com.google.firebase.remoteconfig.internal.a)g.j()).d;
                                if (a.a != null) {
                                    try {
                                        a.a.b(fj.a.b(d));
                                    }
                                    catch (final AbtException ex) {
                                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", (Throwable)ex);
                                    }
                                    catch (final JSONException ex2) {
                                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", (Throwable)ex2);
                                    }
                                }
                            }
                            else {
                                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
                            }
                            final boolean b = true;
                        }
                    }
                }
                return false;
            }
            case 8: {
                this.g.getClass();
                final Bundle bundle = (Bundle)g.k((Class)IOException.class);
                if (bundle != null) {
                    String s = ((BaseBundle)bundle).getString("registration_id");
                    if (s == null) {
                        s = ((BaseBundle)bundle).getString("unregistered");
                        if (s == null) {
                            final String string = ((BaseBundle)bundle).getString("error");
                            if ("RST".equals(string)) {
                                throw new IOException("INSTANCE_ID_RESET");
                            }
                            if (string != null) {
                                throw new IOException(string);
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Unexpected response: ");
                            sb.append(bundle);
                            Log.w("FirebaseMessaging", sb.toString(), new Throwable());
                            throw new IOException("SERVICE_NOT_AVAILABLE");
                        }
                    }
                    return s;
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        }
    }
}
