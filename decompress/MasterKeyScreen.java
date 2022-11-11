// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.masterkey;

import com.bumptech.glide.i;
import com.reddit.screen.BaseScreen;
import com.bluelinelabs.conductor.Controller;
import com.reddit.vault.feature.registration.importvault.ImportVaultScreen$a;
import android.widget.Button;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.text.SpannableString;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator$AnimatorListener;
import com.reddit.vault.feature.registration.masterkey.widget.MasterKeyRequirementsView;
import android.widget.TextView;
import p92.h;
import s82.p;
import com.google.android.material.textfield.TextInputEditText;
import android.view.View$OnClickListener;
import android.widget.TextView$OnEditorActionListener;
import android.text.TextWatcher;
import java.util.Map;
import o90.xt;
import o90.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import android.os.Parcelable;
import p92.f;
import o90.yt;
import o90.tt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import java.util.ArrayList;
import p92.g;
import com.reddit.presentation.CoroutinesPresenter;
import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kb1.l;
import com.reddit.screen.util.b;
import android.os.Bundle;
import com.reddit.screen.util.ScreenViewBindingDelegate;
import javax.inject.Inject;
import zg2.k;
import p92.e;
import com.reddit.vault.d;

public final class MasterKeyScreen extends d implements e
{
    public static final /* synthetic */ k<Object>[] k0;
    @Inject
    public p92.d i0;
    public final ScreenViewBindingDelegate j0;
    
    static {
        k0 = new k[] { (k)a81.e.v((Class)MasterKeyScreen.class, "binding", "getBinding()Lcom/reddit/vault/databinding/ScreenMasterKeyBinding;", 0) };
    }
    
    public MasterKeyScreen(final Bundle bundle) {
        sg2.e.f((Object)bundle, "args");
        super(2131625245, bundle);
        this.j0 = b.a((l)this, (rg2.l)MasterKeyScreen$binding.MasterKeyScreen$binding$2.INSTANCE);
    }
    
    public final boolean KA() {
        final ConstraintLayout a = this.oC().d.a;
        sg2.e.e((Object)a, "binding.loadingView.root");
        return ((View)a).getVisibility() == 0 || super.KA();
    }
    
    public final void PA(final View view) {
        sg2.e.f((Object)view, "view");
        super.PA(view);
        ((MasterKeyPresenter)this.pC()).A();
    }
    
    public final void XA() {
        super.XA();
        final Activity ba = ((Controller)this).BA();
        sg2.e.c((Object)ba);
        yd.b.J(ba, (IBinder)null);
    }
    
    public final void YA(final View view) {
        sg2.e.f((Object)view, "view");
        super.YA(view);
        this.oC().d.c.n.g.removeAllListeners();
    }
    
    public final void Z6() {
        this.oC().f.setHint(((View)this.oC().f).getContext().getString(2131953840));
    }
    
    public final void ZA(final View view) {
        sg2.e.f((Object)view, "view");
        super.ZA(view);
        ((CoroutinesPresenter)this.pC()).o();
    }
    
    public final void ZB() {
        ((CoroutinesPresenter)this.pC()).destroy();
    }
    
    public final void aC() {
        super.aC();
        final Activity ba = ((Controller)this).BA();
        sg2.e.c((Object)ba);
        yd.b.g0(ba);
        final Parcelable parcelable = ((Controller)this).f.getParcelable("state");
        sg2.e.c((Object)parcelable);
        final MasterKeyScreen$onInitialize.MasterKeyScreen$onInitialize$1 masterKeyScreen$onInitialize$1 = new MasterKeyScreen$onInitialize.MasterKeyScreen$onInitialize$1((g)parcelable, this);
        final Object d4;
        Label_0243: {
            if (o90.b.a) {
                synchronized (o90.b.b) {
                    final LinkedHashSet c = o90.b.c;
                    final ArrayList<Object> list = new ArrayList<Object>();
                    for (final Object next : c) {
                        if (next instanceof ut) {
                            list.add(next);
                        }
                    }
                    if (CollectionsKt___CollectionsKt.d4((List)list) != null) {
                        break Label_0243;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to find a component of type ");
                    sb.append(ut.class.getSimpleName());
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            final LinkedHashSet c2 = o90.b.c;
            final ArrayList list2 = new ArrayList();
            for (final Object next2 : c2) {
                if (next2 instanceof ut) {
                    list2.add(next2);
                }
            }
            d4 = CollectionsKt___CollectionsKt.d4((List)list2);
            if (d4 == null) {
                throw new IllegalStateException(aw.b.e((Class)ut.class, a.r("Unable to find a component of type ")));
            }
        }
        final tt<?, ?> value = ((ut)d4).k().get(MasterKeyScreen.class);
        final boolean b = value instanceof tt;
        final tt tt = null;
        tt<?, ?> tt2;
        if (b) {
            tt2 = value;
        }
        else {
            tt2 = null;
        }
        tt<?, ?> tt3 = tt2;
        if (tt2 == null) {
            final c zk = ((BaseScreen)this).Zk();
            tt tt4 = null;
            Label_0398: {
                if (zk != null) {
                    final xt se = zk.se();
                    if (se != null) {
                        Object a;
                        if (!((a = se.a) instanceof yt)) {
                            a = null;
                        }
                        final yt yt = (yt)a;
                        if (yt == null) {
                            throw new IllegalStateException(android.support.v4.media.a.i(se.a, a.r("Component("), ") is not an instance of (", (Class)yt.class, ')'));
                        }
                        final Map subFeatureInjectors = yt.getSubFeatureInjectors();
                        if (subFeatureInjectors != null) {
                            tt4 = subFeatureInjectors.get(MasterKeyScreen.class);
                            break Label_0398;
                        }
                    }
                }
                tt4 = null;
            }
            tt3 = tt;
            if (tt4 instanceof tt) {
                tt3 = tt4;
            }
        }
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)masterKeyScreen$onInitialize$1) != null) {
            return;
        }
        final StringBuilder r = a.r("\n    Unable to find any FeatureInjector for target class ");
        b.n((Class)MasterKeyScreen.class, r, " with a\n    dependency factory of type ", (Class)f.class, ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ");
        throw new IllegalStateException(a.n(r, " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public final void hideKeyboard() {
        final View q = ((Controller)this).q;
        if (q != null) {
            ui.b.G(q);
        }
    }
    
    public final void nC(final View view) {
        ((i)a92.b.l0((View)this.oC().d.b).r("https://www.redditstatic.com/crypto-assets/v2/marketplace/mobile/animations/secure_your_vault_finish.webp")).into(this.oC().d.b);
        ((View)this.oC().h).setEnabled(false);
        final TextInputEditText e = this.oC().e;
        sg2.e.e((Object)e, "binding.masterKey");
        ((TextView)e).addTextChangedListener((TextWatcher)new MasterKeyScreen$c(this));
        ((View)this.oC().e).requestFocus();
        ((TextView)this.oC().e).setOnEditorActionListener((TextView$OnEditorActionListener)new pv1.b((Object)this, 1));
        ((View)this.oC().h).setOnClickListener((View$OnClickListener)new jp1.e((Object)this, 28));
        ((View)this.oC().j).setOnClickListener((View$OnClickListener)new m42.a((Object)this, 6));
    }
    
    public final p oC() {
        return (p)this.j0.d((l)this, (k)MasterKeyScreen.k0[0]);
    }
    
    public final p92.d pC() {
        final p92.d i0 = this.i0;
        if (i0 != null) {
            return i0;
        }
        sg2.e.n("presenter");
        throw null;
    }
    
    public final void sa(final ArrayList list) {
        final MasterKeyRequirementsView g = this.oC().g;
        g.getClass();
        for (final h h : list) {
            final TextView textView = (TextView)((View)g).findViewWithTag((Object)h.a);
            sg2.e.e((Object)textView, "itemView");
            g.a(textView, h.b);
        }
    }
    
    public final void tn(final MasterKeyContract$VaultStatus masterKeyContract$VaultStatus) {
        sg2.e.f((Object)masterKeyContract$VaultStatus, "status");
        switch (MasterKeyScreen.MasterKeyScreen$b.a[((Enum)masterKeyContract$VaultStatus).ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {
                final ConstraintLayout a = this.oC().d.a;
                sg2.e.e((Object)a, "binding.loadingView.root");
                ((View)a).setVisibility(0);
                final TextView e = this.oC().d.e;
                final Integer statusMessage = masterKeyContract$VaultStatus.getStatusMessage();
                sg2.e.c((Object)statusMessage);
                e.setText((int)statusMessage);
                if (masterKeyContract$VaultStatus.getResultMessage() != null) {
                    final TextView d = this.oC().d.d;
                    sg2.e.e((Object)d, "binding.loadingView.resultMessage");
                    ((View)d).setVisibility(0);
                    this.oC().d.d.setText((int)masterKeyContract$VaultStatus.getResultMessage());
                }
                else {
                    final TextView d2 = this.oC().d.d;
                    sg2.e.e((Object)d2, "binding.loadingView.resultMessage");
                    ((View)d2).setVisibility(8);
                }
                if (masterKeyContract$VaultStatus.getShowSuccessAnimation()) {
                    final LottieAnimationView c = this.oC().d.c;
                    sg2.e.e((Object)c, "");
                    ((View)c).setVisibility(0);
                    c.h();
                    c.n.g.addListener((Animator$AnimatorListener)new com.reddit.vault.feature.registration.masterkey.a(this));
                    break;
                }
                break;
            }
            case 1: {
                final ConstraintLayout a2 = this.oC().d.a;
                sg2.e.e((Object)a2, "binding.loadingView.root");
                ((View)a2).setVisibility(8);
                final TextView d3 = this.oC().d.d;
                sg2.e.e((Object)d3, "binding.loadingView.resultMessage");
                ((View)d3).setVisibility(8);
                final LottieAnimationView c2 = this.oC().d.c;
                sg2.e.e((Object)c2, "binding.loadingView.iconVaultSuccess");
                ((View)c2).setVisibility(8);
                break;
            }
        }
    }
    
    public final void uf() {
        this.oC().f.setError(((View)this.oC().a).getResources().getString(2131953238));
    }
    
    public final void vb(final boolean enabled) {
        ((View)this.oC().h).setEnabled(enabled);
    }
    
    public final void xk(int u, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        this.oC().i.setText(u);
        final MasterKeyRequirementsView g = this.oC().g;
        sg2.e.e((Object)g, "binding.masterKeyRequirementsView");
        final int n = 4;
        final int n2 = 0;
        if (b ^ true) {
            u = 4;
        }
        else {
            u = 0;
        }
        ((View)g).setVisibility(u);
        final TextView c = this.oC().c;
        sg2.e.e((Object)c, "binding.createKeyBody");
        final CharSequence text = ((View)c).getContext().getText(2131954796);
        sg2.e.e((Object)text, "context.getText(R.string\u2026ey_create_body_main_text)");
        final CharSequence text2 = ((View)c).getContext().getText(2131954795);
        sg2.e.e((Object)text2, "context.getText(R.string\u2026y_create_body_alert_text)");
        final Context context = ((View)c).getContext();
        sg2.e.e((Object)context, "context");
        u = lq0.k.U(2130969929, context);
        final SpannableString spannableString = new SpannableString(text2);
        spannableString.setSpan((Object)new TextAppearanceSpan(((View)c).getContext(), u), 0, text2.length(), 33);
        spannableString.setSpan((Object)new ForegroundColorSpan(-65536), 0, text2.length(), 33);
        c.setText((CharSequence)new SpannableStringBuilder().append(text).append((CharSequence)"\n").append((CharSequence)spannableString));
        final TextView c2 = this.oC().c;
        sg2.e.e((Object)c2, "binding.createKeyBody");
        if (b2 ^ true) {
            u = 4;
        }
        else {
            u = 0;
        }
        ((View)c2).setVisibility(u);
        final TextView b5 = this.oC().b;
        sg2.e.e((Object)b5, "binding.confirmKeyBody");
        if (b3 ^ true) {
            u = n;
        }
        else {
            u = 0;
        }
        ((View)b5).setVisibility(u);
        final Button j = this.oC().j;
        sg2.e.e((Object)j, "binding.usePhraseButton");
        u = n2;
        if (b4 ^ true) {
            u = 8;
        }
        ((View)j).setVisibility(u);
    }
    
    public interface a extends ImportVaultScreen$a
    {
        void Yk();
    }
}
