// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.webembed.browser;

import android.webkit.WebSettings;
import android.os.BaseBundle;
import java.util.Locale;
import android.graphics.Bitmap;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.MenuItem;
import android.widget.Toast;
import android.content.Context;
import androidx.lifecycle.q;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import com.reddit.session.Session;
import android.accounts.Account;
import android.webkit.DownloadListener;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.view.View$OnClickListener;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.Menu;
import com.reddit.ui.localization.RedditLocalizationDelegate;
import o90.s0;
import android.text.TextUtils;
import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import ix.g;
import w70.b;
import com.reddit.session.p;
import javax.inject.Inject;
import xd0.a;
import androidx.fragment.app.Fragment;

public class WebBrowserFragment extends Fragment
{
    @Inject
    public a f;
    @Inject
    public p g;
    @Inject
    public w70.b h;
    @Inject
    public sw.a i;
    @Inject
    public yb0.a j;
    @Inject
    public g k;
    public View l;
    public View m;
    public Toolbar n;
    public TextView o;
    public WebView p;
    public View q;
    public dt0.b r;
    public boolean s;
    public String t;
    public boolean u;
    public final WebBrowserFragment$a v;
    
    public WebBrowserFragment() {
        this.v = new WebBrowserFragment$a(this);
    }
    
    public static void F(final WebBrowserFragment webBrowserFragment, final String s) {
        if (webBrowserFragment.s) {
            webBrowserFragment.n.setTitle((CharSequence)s);
        }
        else {
            webBrowserFragment.o.setText((CharSequence)s);
        }
        final View q = webBrowserFragment.q;
        if (q != null) {
            int visibility;
            if (webBrowserFragment.p.canGoForward()) {
                visibility = 0;
            }
            else {
                visibility = 4;
            }
            q.setVisibility(visibility);
        }
    }
    
    public final void onAttach(final Activity activity) {
        super.onAttach(activity);
        this.r = (dt0.b)activity;
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final s0 create = ((d)((p90.a)((Context)this.requireActivity()).getApplicationContext()).o((Class)d.class)).create();
        final a u4 = create.a.a.u4();
        ui.b.n((Object)u4);
        this.f = u4;
        final p c8 = create.a.a.C8();
        ui.b.n((Object)c8);
        this.g = c8;
        final w70.b r = create.a.a.r();
        ui.b.n((Object)r);
        this.h = r;
        final sw.a k1 = create.a.a.k1();
        ui.b.n((Object)k1);
        this.i = k1;
        final RedditLocalizationDelegate z1 = create.a.a.Z1();
        ui.b.n((Object)z1);
        this.j = (yb0.a)z1;
        final ix.d a = create.a.a.A();
        ui.b.n((Object)a);
        this.k = (g)a;
        final String string = ((BaseBundle)this.getArguments()).getString("com.reddit.arg.title_override", (String)null);
        this.t = string;
        this.s = (TextUtils.isEmpty((CharSequence)string) ^ true);
        this.u = ((BaseBundle)this.getArguments()).getBoolean("com.reddit.arg.open_non_reddit_links_ext_browser");
        this.setHasOptionsMenu(true);
    }
    
    public final void onCreateOptionsMenu(final Menu menu, final MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (!this.s) {
            menuInflater.inflate(2131689530, menu);
            this.o.setPadding(0, 0, 0, 0);
        }
    }
    
    public final View onCreateView(LayoutInflater q, ViewGroup viewGroup, final Bundle bundle) {
        try {
            final View inflate = q.inflate(2131624287, viewGroup, false);
            this.m = inflate;
            q = (LayoutInflater)inflate.findViewById(2131431792);
            this.n = (Toolbar)q;
            this.o = (TextView)((View)q).findViewById(2131427587);
            this.p = (WebView)this.m.findViewById(2131432225);
            lw0.b.K1((View)this.n, true, false);
            ((View)this.p).setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new com.reddit.webembed.browser.a());
            ((View)this.n).setBackgroundColor(((BaseBundle)this.getArguments()).getInt("com.reddit.arg.color"));
            this.n.setNavigationOnClickListener((View$OnClickListener)new x62.a((Object)this, 16));
            q = (LayoutInflater)((View)this.n).findViewById(2131432226);
            this.l = (View)q;
            if (this.s) {
                ((View)q).setVisibility(8);
            }
            else {
                q = (LayoutInflater)((View)q).findViewById(2131432227);
                (this.q = (View)q).setOnClickListener((View$OnClickListener)new dv1.a((Object)this, 21));
            }
            lw0.b.K1((View)this.p, false, true);
            viewGroup = (ViewGroup)this.p.getSettings();
            ((WebSettings)viewGroup).setJavaScriptEnabled(true);
            ((WebSettings)viewGroup).setDomStorageEnabled(true);
            ((WebSettings)viewGroup).setLoadWithOverviewMode(true);
            ((WebSettings)viewGroup).setUseWideViewPort(true);
            ((WebSettings)viewGroup).setBuiltInZoomControls(true);
            ((WebSettings)viewGroup).setDisplayZoomControls(false);
            ((WebSettings)viewGroup).setDomStorageEnabled(true);
            ((WebSettings)viewGroup).setMediaPlaybackRequiresUserGesture(false);
            q = (LayoutInflater)new StringBuilder();
            ((StringBuilder)q).append(((WebSettings)viewGroup).getUserAgentString());
            ((StringBuilder)q).append(" ");
            ((StringBuilder)q).append(this.i.a());
            ((WebSettings)viewGroup).setUserAgentString(((StringBuilder)q).toString());
            this.p.setWebChromeClient((WebChromeClient)new c());
            this.p.setWebViewClient((WebViewClient)new b());
            this.p.setDownloadListener((DownloadListener)new com.reddit.webembed.browser.b(this));
            if (bundle == null) {
                viewGroup = (ViewGroup)((BaseBundle)this.getArguments()).getString("com.reddit.args.initial_url");
                if (((BaseBundle)this.getArguments()).getBoolean("com.reddit.arg.use_cookie_auth") && this.f.b() != null) {
                    q = (LayoutInflater)this.f.b();
                    q = (LayoutInflater)this.k.a(this.getContext(), (Account)q, (Session)this.g.c(), (nw1.d)this.g.getState());
                    viewGroup = (ViewGroup)new b40.p((Object)this, (String)viewGroup, 3);
                    q.getClass();
                    viewGroup = (ViewGroup)new CallbackCompletableObserver((kf2.a)viewGroup);
                    ((ff2.a)q).b((ff2.c)viewGroup);
                    this.getViewLifecycleOwner().getLifecycle().a((androidx.lifecycle.p)new androidx.lifecycle.c() {
                        public final void onDestroy(final q q) {
                            ((if2.a)viewGroup).dispose();
                        }
                    });
                }
                else {
                    this.p.loadUrl((String)viewGroup);
                }
            }
            this.j.e((Context)this.getActivity());
            return this.m;
        }
        catch (final Exception ex) {
            if (ex.getMessage() != null) {
                ex.getMessage();
                Toast.makeText(this.getContext(), 2131953253, 1).show();
            }
            ((Activity)this.getActivity()).finish();
            return super.onCreateView(q, viewGroup, bundle);
        }
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            ((Activity)this.getActivity()).finish();
            return true;
        }
        if (menuItem.getItemId() == 2131427506) {
            this.p.reload();
            return true;
        }
        if (menuItem.getItemId() == 2131427456) {
            ((ClipboardManager)((Context)this.getActivity()).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"url", (CharSequence)this.p.getUrl()));
            return true;
        }
        if (menuItem.getItemId() == 2131427503) {
            this.p0(this.p.getUrl());
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
    
    public final void onPause() {
        super.onPause();
        this.p.onPause();
        this.r.w.remove(this.v);
    }
    
    public final void onResume() {
        super.onResume();
        final WebView p = this.p;
        if (p != null) {
            p.onResume();
        }
        this.r.w.add(this.v);
    }
    
    public final void p0(final String s) {
        final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
        try {
            this.startActivity(intent);
        }
        catch (final ActivityNotFoundException ex) {
            Toast.makeText(this.getContext(), 2131953324, 1).show();
        }
    }
    
    public final class b extends WebViewClient
    {
        public final void onPageFinished(final WebView webView, final String s) {
            super.onPageFinished(webView, s);
            final Uri parse = Uri.parse(s);
            final WebBrowserFragment a = WebBrowserFragment.this;
            String s2;
            if (a.s) {
                s2 = a.t;
            }
            else {
                s2 = parse.getHost();
            }
            WebBrowserFragment.F(a, s2);
        }
        
        public final void onPageStarted(final WebView webView, final String s, final Bitmap bitmap) {
            super.onPageStarted(webView, s, bitmap);
            final Uri parse = Uri.parse(s);
            final WebBrowserFragment a = WebBrowserFragment.this;
            String s2;
            if (a.s) {
                s2 = a.t;
            }
            else {
                s2 = parse.getHost();
            }
            WebBrowserFragment.F(a, s2);
        }
        
        public final boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
            final Context context = ((View)webView).getContext();
            if (s != null && context != null) {
                final Uri parse = Uri.parse(s);
                final String scheme = parse.getScheme();
                String lowerCase = "";
                String lowerCase2;
                if (scheme != null) {
                    lowerCase2 = parse.getScheme().toLowerCase(Locale.US);
                }
                else {
                    lowerCase2 = "";
                }
                if (parse.getHost() != null) {
                    lowerCase = parse.getHost().toLowerCase(Locale.US);
                }
                if (!lowerCase2.equals("http") && !lowerCase2.equals("https")) {
                    final Intent intent = new Intent("android.intent.action.VIEW", parse);
                    if (context.getPackageManager().resolveActivity(intent, 0) != null) {
                        context.startActivity(intent);
                    }
                    return true;
                }
                if (!lowerCase.startsWith("mod") && lowerCase.endsWith(".reddit.com")) {
                    WebBrowserFragment.this.h.a(context, s);
                    return true;
                }
                if (WebBrowserFragment.this.u && !lowerCase.equals("reddit.com") && !lowerCase.endsWith(".reddit.com")) {
                    WebBrowserFragment.this.p0(s);
                    return true;
                }
            }
            return super.shouldOverrideUrlLoading(webView, s);
        }
    }
}
