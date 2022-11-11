// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.webembed.webview;

import com.reddit.session.Session;
import com.reddit.session.RedditSession;
import javax.inject.Inject;
import sg2.e;
import a20.a;
import va0.k;
import com.reddit.session.o;
import rb2.f;
import com.reddit.presentation.CoroutinesPresenter;

public final class WebEmbedPresenter extends CoroutinesPresenter
{
    public final f j;
    public final o k;
    public final k l;
    public final a m;
    
    @Inject
    public WebEmbedPresenter(final f j, final o k, final k l, final a m) {
        e.f((Object)j, "webView");
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        l.o();
        j.setDebuggingEnabled(false);
        this.Ac();
    }
    
    public final void A() {
        super.A();
        this.Ac();
        if (!this.j.getIgnoreInternalJsInterface()) {
            this.j.setJsCallbacks((WebEmbedWebView.JsCallbacks)new WebEmbedPresenter$attach$1$1(this));
        }
    }
    
    public final void Ac() {
        final f j = this.j;
        final RedditSession activeSession = this.k.getActiveSession();
        j.b(((Session)activeSession).getExpiration(), ((Session)activeSession).getToken());
        j.a();
    }
}
