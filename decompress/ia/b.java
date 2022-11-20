// 
// Decompiled by Procyon v0.6.0
// 

package ia;

import com.reddit.video.creation.widgets.adjustclips.view.AdjustClipsFragment;
import xa.y;
import com.google.firebase.crashlytics.internal.common.Utils;
import we.h;
import android.content.SharedPreferences$Editor;
import android.text.Editable;
import com.reddit.screen.listing.history.HistoryListingPresenter;
import com.reddit.modtools.modlist.add.AddModeratorScreen;
import android.widget.EditText;
import com.reddit.events.builders.BaseEventBuilder;
import com.reddit.events.builders.ModNoun;
import com.reddit.modtools.common.ModScreenMode;
import com.reddit.modtools.mute.add.AddMutedUserScreen;
import com.reddit.postsubmit.common.BasePostSubmitScreen;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import com.reddit.listing.model.sort.HistorySortType;
import com.reddit.screen.listing.history.HistoryListingScreen;
import com.reddit.screens.profile.details.ProfilePagerScreen;
import android.view.MenuItem;
import mg2.l;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import android.os.Bundle;
import oi.c0;
import android.content.Intent;
import we.g;
import wa.d0;
import com.google.android.exoplayer2.w$c;
import xa.b$a;
import android.util.Log;
import android.view.Display;
import java.util.regex.Pattern;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.d;
import com.google.android.exoplayer2.n;
import ug2.k;
import com.reddit.postsubmit.tags.SchedulePostViewModel;
import pj1.i;
import android.net.Uri;
import com.reddit.screens.profile.edit.ProfileImageIntentLauncher;
import java.util.Iterator;
import vq0.c$a;
import kotlin.Pair;
import com.reddit.domain.model.GeopopularRegionSelectFilter;
import xi2.j;
import com.reddit.domain.model.Region;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.location.Address;
import vq0.c$b;
import ng2.e;
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog;
import com.wdullaer.materialdatetimepicker.time.Timepoint;
import com.wdullaer.materialdatetimepicker.time.RadialPickerLayout;
import com.wdullaer.materialdatetimepicker.time.d$b;
import af2.f0;
import jb1.a$b;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import androidx.appcompat.widget.Toolbar;
import com.instabug.library.apichecker.ReturnableRunnable;
import com.instabug.library.annotation.AnnotationView$f;
import we.f;
import we.c;
import we.a;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import cd.k$b;
import ab.f$a;
import com.google.android.exoplayer2.source.l$a;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$f;
import bd.n$a;
import ta.a$a;

public final class b implements a$a, n$a, MediaCodecUtil$f, l$a, f$a, a, AnalyticsEventLogger, we.a, c, f, com.instabug.featuresrequest.ui.custom.f$a, AnnotationView$f, ReturnableRunnable, pt.b, ff2.b, h, DatePickerDialog.b, a$b, androidx.activity.result.b, f0, d$b
{
    public final int f;
    public final Object g;
    
    public b(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        ia/b.f:I
        //     4: tableswitch {
        //               28: 27
        //          default: 24
        //        }
        //    24: goto            222
        //    27: aload_0        
        //    28: getfield        ia/b.g:Ljava/lang/Object;
        //    31: checkcast       Lsn/a;
        //    34: astore_1       
        //    35: aload_1        
        //    36: iconst_1       
        //    37: putfield        sn/a.w:Z
        //    40: aload_1        
        //    41: getfield        com/instabug/library/core/ui/InstabugBaseFragment.presenter:Lcom/instabug/library/core/ui/BaseContract$Presenter;
        //    44: astore_2       
        //    45: aload_2        
        //    46: ifnull          221
        //    49: aload_1        
        //    50: getfield        sn/a.g:Lcom/instabug/featuresrequest/models/b;
        //    53: astore_1       
        //    54: aload_1        
        //    55: ifnull          221
        //    58: aload_2        
        //    59: checkcast       Lsn/f;
        //    62: astore_2       
        //    63: aload_1        
        //    64: invokevirtual   com/instabug/featuresrequest/models/b.p:()Z
        //    67: ifeq            139
        //    70: aload_1        
        //    71: iconst_0       
        //    72: invokevirtual   com/instabug/featuresrequest/models/b.a:(Z)V
        //    75: aload_1        
        //    76: aload_1        
        //    77: invokevirtual   com/instabug/featuresrequest/models/b.i:()I
        //    80: iconst_1       
        //    81: isub           
        //    82: invokevirtual   com/instabug/featuresrequest/models/b.b:(I)V
        //    85: aload_1        
        //    86: getstatic       com/instabug/featuresrequest/models/b$b.USER_UN_VOTED:Lcom/instabug/featuresrequest/models/b$b;
        //    89: invokevirtual   com/instabug/featuresrequest/models/b.a:(Lcom/instabug/featuresrequest/models/b$b;)V
        //    92: aload_1        
        //    93: invokestatic    kn/a.b:(Lcom/instabug/featuresrequest/models/b;)V
        //    96: aload_2        
        //    97: getfield        sn/f.f:Lsn/c;
        //   100: astore_3       
        //   101: aload_3        
        //   102: ifnonnull       108
        //   105: goto            129
        //   108: aload_3        
        //   109: invokeinterface com/instabug/library/core/ui/BaseContract$View.getViewContext:()Ljava/lang/Object;
        //   114: checkcast       Landroidx/fragment/app/Fragment;
        //   117: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   120: ifnull          129
        //   123: invokestatic    mn/j.c:()Lmn/j;
        //   126: invokevirtual   mn/j.start:()V
        //   129: invokestatic    com/instabug/featuresrequest/eventbus/FeatureRequestsEventBus.getInstance:()Lcom/instabug/featuresrequest/eventbus/FeatureRequestsEventBus;
        //   132: aload_1        
        //   133: invokevirtual   com/instabug/library/core/eventbus/EventBus.post:(Ljava/lang/Object;)V
        //   136: goto            205
        //   139: aload_1        
        //   140: iconst_1       
        //   141: invokevirtual   com/instabug/featuresrequest/models/b.a:(Z)V
        //   144: aload_1        
        //   145: aload_1        
        //   146: invokevirtual   com/instabug/featuresrequest/models/b.i:()I
        //   149: iconst_1       
        //   150: iadd           
        //   151: invokevirtual   com/instabug/featuresrequest/models/b.b:(I)V
        //   154: aload_1        
        //   155: getstatic       com/instabug/featuresrequest/models/b$b.USER_VOTED_UP:Lcom/instabug/featuresrequest/models/b$b;
        //   158: invokevirtual   com/instabug/featuresrequest/models/b.a:(Lcom/instabug/featuresrequest/models/b$b;)V
        //   161: aload_1        
        //   162: invokestatic    kn/a.b:(Lcom/instabug/featuresrequest/models/b;)V
        //   165: aload_2        
        //   166: getfield        sn/f.f:Lsn/c;
        //   169: astore_3       
        //   170: aload_3        
        //   171: ifnonnull       177
        //   174: goto            198
        //   177: aload_3        
        //   178: invokeinterface com/instabug/library/core/ui/BaseContract$View.getViewContext:()Ljava/lang/Object;
        //   183: checkcast       Landroidx/fragment/app/Fragment;
        //   186: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   189: ifnull          198
        //   192: invokestatic    mn/j.c:()Lmn/j;
        //   195: invokevirtual   mn/j.start:()V
        //   198: invokestatic    com/instabug/featuresrequest/eventbus/FeatureRequestsEventBus.getInstance:()Lcom/instabug/featuresrequest/eventbus/FeatureRequestsEventBus;
        //   201: aload_1        
        //   202: invokevirtual   com/instabug/library/core/eventbus/EventBus.post:(Ljava/lang/Object;)V
        //   205: aload_2        
        //   206: getfield        sn/f.f:Lsn/c;
        //   209: astore_2       
        //   210: aload_2        
        //   211: ifnull          221
        //   214: aload_2        
        //   215: aload_1        
        //   216: invokeinterface sn/c.A:(Lcom/instabug/featuresrequest/models/b;)V
        //   221: return         
        //   222: aload_0        
        //   223: getfield        ia/b.g:Ljava/lang/Object;
        //   226: checkcast       Lcom/instabug/library/annotation/AnnotationLayout;
        //   229: invokestatic    com/instabug/library/annotation/AnnotationLayout.d:(Lcom/instabug/library/annotation/AnnotationLayout;)V
        //   232: return         
        //   233: astore_3       
        //   234: goto            96
        //   237: astore_3       
        //   238: goto            165
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  92     96     233    237    Lorg/json/JSONException;
        //  161    165    237    241    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0165:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final boolean a(final int n) {
        final RadialPickerLayout radialPickerLayout = (RadialPickerLayout)this.g;
        final Timepoint l = radialPickerLayout.l;
        final Timepoint timepoint = new Timepoint(l.f, l.g, n);
        final TimePickerDialog timePickerDialog = (TimePickerDialog)radialPickerLayout.i;
        final com.wdullaer.materialdatetimepicker.time.f r = timePickerDialog.R;
        Timepoint.TYPE type;
        if (timePickerDialog.H) {
            type = Timepoint.TYPE.SECOND;
        }
        else if (timePickerDialog.I) {
            type = Timepoint.TYPE.MINUTE;
        }
        else {
            type = Timepoint.TYPE.HOUR;
        }
        return r.e0(timepoint, 2, type) ^ true;
    }
    
    public final void accept(Object next, final Object o) {
        final yq0.a a = (yq0.a)this.g;
        final vq0.c c = (vq0.c)next;
        final Throwable t = (Throwable)o;
        e.f((Object)a, "this$0");
        if (c instanceof c$b) {
            final Address address = (Address)CollectionsKt___CollectionsKt.S4(((c$b)c).a);
            final Iterator iterator = a.m.iterator();
            while (true) {
                while (iterator.hasNext()) {
                    next = iterator.next();
                    if (j.z0(((Region)next).getId(), address.getCountryCode(), true)) {
                        final Region region = (Region)next;
                        Pair pair;
                        if (region == null) {
                            a.g.f(a.l.getString(2131953781));
                            pair = new Pair((Object)GeopopularRegionSelectFilter.Companion.getDEFAULT(), (Object)null);
                        }
                        else {
                            pair = new Pair((Object)new GeopopularRegionSelectFilter(region.getId(), region.getName()), (Object)region);
                        }
                        final GeopopularRegionSelectFilter geopopularRegionSelectFilter = (GeopopularRegionSelectFilter)pair.component1();
                        ((com.reddit.presentation.a)a).fn(a.i.e0(geopopularRegionSelectFilter).u());
                        a.g.d4(geopopularRegionSelectFilter);
                        return;
                    }
                }
                next = null;
                continue;
            }
        }
        if (c instanceof c$a) {
            pu2.a.a.d("LocationDataProvider.publishLocation(): lastLocation is null", new Object[0]);
            a.g.f(a.l.getString(2131953279));
        }
    }
    
    public final void b(final Object o) {
        ProfileImageIntentLauncher.b((ProfileImageIntentLauncher)this.g, (Uri)o);
    }
    
    public final void c(final int n, final int n2, final int n3) {
        switch (this.f) {
            default: {
                final i i = (i)this.g;
                e.f((Object)i, "this$0");
                i.tC().E0(n, n2, n3);
                return;
            }
            case 22: {
                final SchedulePostViewModel schedulePostViewModel = (SchedulePostViewModel)this.g;
                final k[] w = SchedulePostViewModel.w;
                e.f((Object)schedulePostViewModel, "this$0");
                schedulePostViewModel.o(n, n2, n3);
            }
        }
    }
    
    public final int d(final Object o) {
        final n n = (n)this.g;
        final d d = (d)o;
        final Pattern a = MediaCodecUtil.a;
        int c;
        try {
            c = (d.c(n) ? 1 : 0);
        }
        catch (final MediaCodecUtil$DecoderQueryException ex) {
            c = -1;
        }
        return c;
    }
    
    public final void e(final Display display) {
        final cd.k k = (cd.k)this.g;
        k.getClass();
        if (display != null) {
            final long i = (long)(1.0E9 / display.getRefreshRate());
            k.k = i;
            k.l = i * 80L / 100L;
        }
        else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            k.k = -9223372036854775807L;
            k.l = -9223372036854775807L;
        }
    }
    
    public final Object execute() {
        return ((sa.c)this.g).h();
    }
    
    public final void invoke(final Object o) {
        switch (this.f) {
            default: {
                ((xa.b)o).onSeekStarted((b$a)this.g);
                return;
            }
            case 3: {
                ((w$c)o).onMediaMetadataChanged(((com.google.android.exoplayer2.k$b)this.g).f.O);
                return;
            }
            case 2: {
                final d0 d0 = (d0)this.g;
                final w$c w$c = (w$c)o;
                final int n0 = com.google.android.exoplayer2.k.n0;
                w$c.onTracksInfoChanged(d0.i.d);
            }
        }
    }
    
    public final void k(final g g) {
        c0.a((Intent)this.g);
    }
    
    public final void logEvent(final String s, final Bundle bundle) {
        AnalyticsDeferredProxy.b((AnalyticsDeferredProxy)this.g, s, bundle);
    }
    
    public final af2.c0 m(final Object o) {
        return com.reddit.data.snoovatar.repository.store.a.f((l)this.g, (cg2.j)o);
    }
    
    public final boolean onMenuItemClick(final MenuItem menuItem) {
        switch (this.f) {
            default: {
                ProfilePagerScreen.wC((ProfilePagerScreen)this.g, menuItem);
                return true;
            }
            case 23: {
                final HistoryListingScreen historyListingScreen = (HistoryListingScreen)this.g;
                e.f((Object)historyListingScreen, "this$0");
                if (menuItem.getItemId() == 2131427448) {
                    final HistoryListingPresenter id = historyListingScreen.iD();
                    if (id.J == HistorySortType.RECENT) {
                        id.K = null;
                        id.g.T0();
                        final af2.a z0 = mg.d0.z0(id.k.J(), id.s);
                        final CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver((ff2.a)new pw.a((Object)id, 6));
                        z0.a((af2.c)callbackCompletableObserver);
                        ((com.reddit.presentation.a)id).gn((df2.a)callbackCompletableObserver);
                    }
                }
                return true;
            }
            case 21: {
                final BasePostSubmitScreen basePostSubmitScreen = (BasePostSubmitScreen)this.g;
                e.f((Object)basePostSubmitScreen, "this$0");
                e.e((Object)menuItem, "item");
                final com.reddit.postsubmit.poll.a a = (com.reddit.postsubmit.poll.a)basePostSubmitScreen;
                final int itemId = menuItem.getItemId();
                if (itemId == 2131427523) {
                    ((BasePostSubmitScreen)a).BC();
                }
                else if (itemId == 2131427513) {
                    a.PC();
                }
                return true;
            }
            case 20: {
                final AddMutedUserScreen addMutedUserScreen = (AddMutedUserScreen)this.g;
                e.f((Object)addMutedUserScreen, "this$0");
                if (menuItem.getItemId() == 2131427496) {
                    menuItem.setEnabled(false);
                    final yh0.a p = addMutedUserScreen.p0;
                    if (p == null) {
                        e.n("modAnalytics");
                        throw null;
                    }
                    final ModScreenMode l0 = addMutedUserScreen.l0;
                    if (l0 == null) {
                        e.n("screenMode");
                        throw null;
                    }
                    String s;
                    if (l0 == ModScreenMode.New) {
                        s = ModNoun.ADD_MUTEPAGE.getActionName();
                    }
                    else {
                        s = ModNoun.EDIT_SAVE.getActionName();
                    }
                    final String subredditId = addMutedUserScreen.getSubredditId();
                    final String h = addMutedUserScreen.H();
                    e.f((Object)s, "noun");
                    final ng0.l a2 = p.a();
                    ((BaseEventBuilder)a2).F("muted");
                    ((BaseEventBuilder)a2).b("click");
                    ((BaseEventBuilder)a2).v(s);
                    BaseEventBuilder.H((BaseEventBuilder)a2, subredditId, h, (String)null, (Boolean)null, (Boolean)null, 28);
                    ((BaseEventBuilder)a2).a();
                    final t21.b o0 = addMutedUserScreen.o0;
                    if (o0 == null) {
                        e.n("presenter");
                        throw null;
                    }
                    final Editable text = addMutedUserScreen.tC().getText();
                    e.e((Object)text, "username.text");
                    final String string = kotlin.text.b.u1((CharSequence)text).toString();
                    final String string2 = ((EditText)addMutedUserScreen.j0.getValue()).getText().toString();
                    e.f((Object)string, "username");
                    e.f((Object)string2, "modNote");
                    ((com.reddit.presentation.a)o0).gn(px1.a.o0((af2.c0)o0.h.o(r20.a.h(o0.g.H()), string, string2), (q20.d)o0.i).F((ff2.g)new u10.n(8, (Object)o0, (Object)string), (ff2.g)new k21.b((Object)o0, 3)));
                }
                return true;
            }
            case 19: {
                final AddModeratorScreen addModeratorScreen = (AddModeratorScreen)this.g;
                e.f((Object)addModeratorScreen, "this$0");
                if (menuItem.getItemId() == 2131427497) {
                    menuItem.setEnabled(false);
                    final yh0.a w0 = addModeratorScreen.w0;
                    if (w0 == null) {
                        e.n("modAnalytics");
                        throw null;
                    }
                    final ModScreenMode t0 = addModeratorScreen.t0;
                    if (t0 == null) {
                        e.n("screenMode");
                        throw null;
                    }
                    final ModScreenMode new1 = ModScreenMode.New;
                    String s2;
                    if (t0 == new1) {
                        s2 = ModNoun.INVITE_MODERATOR.getActionName();
                    }
                    else {
                        s2 = ModNoun.EDIT_SAVE.getActionName();
                    }
                    final String subredditId2 = addModeratorScreen.subredditId;
                    if (subredditId2 == null) {
                        e.n("subredditId");
                        throw null;
                    }
                    final String h2 = addModeratorScreen.H();
                    e.f((Object)s2, "noun");
                    final ng0.l a3 = w0.a();
                    ((BaseEventBuilder)a3).F("modmanagement");
                    ((BaseEventBuilder)a3).b("submit");
                    ((BaseEventBuilder)a3).v(s2);
                    BaseEventBuilder.H((BaseEventBuilder)a3, subredditId2, h2, (String)null, (Boolean)null, (Boolean)null, 28);
                    ((BaseEventBuilder)a3).a();
                    final ModScreenMode t2 = addModeratorScreen.t0;
                    if (t2 == null) {
                        e.n("screenMode");
                        throw null;
                    }
                    if (t2 == new1) {
                        final k21.c v0 = addModeratorScreen.v0;
                        if (v0 == null) {
                            e.n("presenter");
                            throw null;
                        }
                        final Editable text2 = addModeratorScreen.DC().getText();
                        e.e((Object)text2, "username.text");
                        final String string3 = kotlin.text.b.u1((CharSequence)text2).toString();
                        final String bc = addModeratorScreen.BC();
                        e.f((Object)string3, "username");
                        ((com.reddit.presentation.a)v0).gn(px1.a.o0((af2.c0)v0.h.h(v0.g.H(), string3, bc), (q20.d)v0.i).F((ff2.g)new u10.n(6, (Object)v0, (Object)string3), (ff2.g)new k21.b((Object)v0, 0)));
                    }
                    else {
                        final k21.c v2 = addModeratorScreen.v0;
                        if (v2 == null) {
                            e.n("presenter");
                            throw null;
                        }
                        final Editable text3 = addModeratorScreen.DC().getText();
                        e.e((Object)text3, "username.text");
                        final String string4 = kotlin.text.b.u1((CharSequence)text3).toString();
                        final String bc2 = addModeratorScreen.BC();
                        e.f((Object)string4, "username");
                        ((com.reddit.presentation.a)v2).gn(px1.a.o0((af2.c0)v2.h.j(v2.g.H(), string4, bc2), (q20.d)v2.i).F((ff2.g)new u10.l(6, (Object)v2, (Object)string4), (ff2.g)new y11.e((Object)v2, 1)));
                    }
                }
                return true;
            }
        }
    }
    
    public final Object run() {
        final fp.g g = (fp.g)this.g;
        e.f((Object)g, "this$0");
        final SharedPreferences$Editor edit = g.a.edit();
        e.e((Object)edit, "sharedPreferences.edit()");
        return new fp.c(edit);
    }
    
    public final Object then(final g g) {
        return Utils.b((we.h)this.g, g);
    }
    
    public final g then(final Object o) {
        switch (this.f) {
            default: {
                final com.google.firebase.remoteconfig.internal.b$a b$a = (com.google.firebase.remoteconfig.internal.b$a)this.g;
                final com.google.firebase.remoteconfig.internal.a a = (com.google.firebase.remoteconfig.internal.a)o;
                final int[] j = com.google.firebase.remoteconfig.internal.b.j;
                return we.j.e((Object)b$a);
            }
            case 12: {
                final fj.a a2 = (fj.a)this.g;
                final Void void1 = (Void)o;
                final g b = a2.c.b();
                final g b2 = a2.d.b();
                return we.j.g(new g[] { b, b2 }).h(a2.b, (we.a)new y((Object)a2, 2, (Object)b, (Object)b2));
            }
        }
    }
    
    public final void y(final af2.d0 d0) {
        AdjustClipsFragment.x0((AdjustClipsFragment)this.g, d0);
    }
}
