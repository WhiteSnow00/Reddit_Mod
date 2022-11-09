// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.detector;

import kotlin.Metadata;
import com.reddit.data.events.models.AnalyticsPlatform;
import s40.e$a;
import com.reddit.data.events.models.components.ActionInfo;
import com.reddit.data.events.models.Event;
import com.reddit.logging.RedditLogger;
import com.reddit.session.loid.LoId$a;
import com.reddit.session.loid.LoId;
import com.reddit.session.mode.common.SessionMode;
import javax.inject.Inject;
import ah2.f;
import s40.e;
import javax.inject.Provider;
import v40.b;

public final class RedditIncognitoModeLeakReporter implements b
{
    public final Provider<e> a;
    
    @Inject
    public RedditIncognitoModeLeakReporter(final Provider<e> a) {
        f.f((Object)a, "eventSenderProvider");
        this.a = a;
    }
    
    public final void a(String string, final String s, final SessionMode sessionMode, final SessionMode sessionMode2, final String s2, final String s3, final boolean b) {
        f.f((Object)sessionMode, "originalSessionMode");
        f.f((Object)sessionMode2, "currentSessionMode");
        final StringBuilder sb = new StringBuilder();
        sb.append("sentIsNull:");
        final boolean b2 = true;
        sb.append(string == null);
        final String string2 = sb.toString();
        final StringBuilder k = a.k("receivedIsNull:");
        k.append(s == null && b2);
        final String string3 = k.toString();
        final StringBuilder i = a.k("match:");
        i.append(f.a((Object)string, (Object)s));
        string = i.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("fromView=");
        sb2.append(b);
        sb2.append(' ');
        sb2.append(string2);
        sb2.append(' ');
        sb2.append(string3);
        sb2.append(' ');
        sb2.append(string);
        this.c(sb2.toString(), sessionMode, sessionMode2, s2, s3);
    }
    
    public final void b(String string, final String s, final SessionMode sessionMode, final SessionMode sessionMode2, final String s2, final String s3, final boolean b) {
        f.f((Object)sessionMode, "originalSessionMode");
        f.f((Object)sessionMode2, "currentSessionMode");
        final StringBuilder sb = new StringBuilder();
        sb.append("sentIsNull:");
        final boolean b2 = true;
        sb.append(string == null);
        final String string2 = sb.toString();
        final StringBuilder k = a.k("receivedIsNull:");
        k.append(s == null);
        final String string3 = k.toString();
        boolean b3 = false;
        Label_0134: {
            if (string != null && s != null) {
                LoId.Companion.getClass();
                if (f.a((Object)LoId$a.a(string), (Object)LoId$a.a(s))) {
                    b3 = true;
                    break Label_0134;
                }
            }
            b3 = false;
        }
        final StringBuilder i = a.k("match:");
        boolean b4 = b2;
        if (!f.a((Object)string, (Object)s)) {
            b4 = (b3 && b2);
        }
        i.append(b4);
        string = i.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("fromView=");
        sb2.append(b);
        sb2.append(' ');
        sb2.append(string2);
        sb2.append(' ');
        sb2.append(string3);
        sb2.append(' ');
        sb2.append(string);
        this.c(sb2.toString(), sessionMode, sessionMode2, s2, s3);
    }
    
    public final void c(final String s, final SessionMode sessionMode, final SessionMode sessionMode2, final String s2, final String s3) {
        final SessionMode incognito = SessionMode.INCOGNITO;
        boolean b = true;
        final boolean b2 = sessionMode == incognito;
        if (sessionMode2 != incognito) {
            b = false;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("abm{");
        sb.append(b2);
        sb.append(" -> ");
        sb.append(b);
        sb.append('}');
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("leaked: ");
        sb2.append(s);
        sb2.append(" @[");
        sb2.append(s2);
        sb2.append(':');
        final String i = a.i(sb2, s3, "] ", string);
        RedditLogger.a.g((Throwable)new IncognitoLeakException(i));
        final Object value = this.a.get();
        f.e(value, "eventSenderProvider.get()");
        final e e = (e)value;
        final Event.Builder action_info = new Event.Builder().source("anon_mode").action("generate").noun("data_alert").action_info(new ActionInfo.Builder().reason(i).build());
        f.e((Object)action_info, "Builder()\n        .sourc\u2026      .build(),\n        )");
        e$a.b(e, action_info, (lw1.a)null, (AnalyticsPlatform)null, false, (String)null, (Boolean)null, 126);
    }
    
    @Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/data/events/detector/RedditIncognitoModeLeakReporter$IncognitoLeakException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class IncognitoLeakException extends RuntimeException
    {
        private final String message;
        
        public IncognitoLeakException(final String message) {
            f.f((Object)message, "message");
            super(message);
            this.message = message;
        }
        
        @Override
        public String getMessage() {
            return this.message;
        }
    }
}
