// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.welcomemessage;

import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import ak0.m;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/modtools/welcomemessage/WelcomeMessage;", "", "markdown", "", "richText", "buttonText", "isEnabled", "", "isRenderedOnJoin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getButtonText", "()Ljava/lang/String;", "()Z", "getMarkdown", "getRichText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class WelcomeMessage
{
    private final String buttonText;
    private final boolean isEnabled;
    private final boolean isRenderedOnJoin;
    private final String markdown;
    private final String richText;
    
    public WelcomeMessage(final String markdown, final String richText, final String buttonText, final boolean isEnabled, final boolean isRenderedOnJoin) {
        m.y(markdown, "markdown", richText, "richText", buttonText, "buttonText");
        this.markdown = markdown;
        this.richText = richText;
        this.buttonText = buttonText;
        this.isEnabled = isEnabled;
        this.isRenderedOnJoin = isRenderedOnJoin;
    }
    
    public final String component1() {
        return this.markdown;
    }
    
    public final String component2() {
        return this.richText;
    }
    
    public final String component3() {
        return this.buttonText;
    }
    
    public final boolean component4() {
        return this.isEnabled;
    }
    
    public final boolean component5() {
        return this.isRenderedOnJoin;
    }
    
    public final WelcomeMessage copy(final String s, final String s2, final String s3, final boolean b, final boolean b2) {
        f.f((Object)s, "markdown");
        f.f((Object)s2, "richText");
        f.f((Object)s3, "buttonText");
        return new WelcomeMessage(s, s2, s3, b, b2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WelcomeMessage)) {
            return false;
        }
        final WelcomeMessage welcomeMessage = (WelcomeMessage)o;
        return f.a((Object)this.markdown, (Object)welcomeMessage.markdown) && f.a((Object)this.richText, (Object)welcomeMessage.richText) && f.a((Object)this.buttonText, (Object)welcomeMessage.buttonText) && this.isEnabled == welcomeMessage.isEnabled && this.isRenderedOnJoin == welcomeMessage.isRenderedOnJoin;
    }
    
    public final String getButtonText() {
        return this.buttonText;
    }
    
    public final String getMarkdown() {
        return this.markdown;
    }
    
    public final String getRichText() {
        return this.richText;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.buttonText, a.f(this.richText, this.markdown.hashCode() * 31, 31), 31);
        final int isEnabled = this.isEnabled ? 1 : 0;
        int n = 1;
        int n2 = isEnabled;
        if (isEnabled != 0) {
            n2 = 1;
        }
        final int isRenderedOnJoin = this.isRenderedOnJoin ? 1 : 0;
        if (isRenderedOnJoin == 0) {
            n = isRenderedOnJoin;
        }
        return (f + n2) * 31 + n;
    }
    
    public final boolean isEnabled() {
        return this.isEnabled;
    }
    
    public final boolean isRenderedOnJoin() {
        return this.isRenderedOnJoin;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("WelcomeMessage(markdown=");
        k.append(this.markdown);
        k.append(", richText=");
        k.append(this.richText);
        k.append(", buttonText=");
        k.append(this.buttonText);
        k.append(", isEnabled=");
        k.append(this.isEnabled);
        k.append(", isRenderedOnJoin=");
        return s0.o(k, this.isRenderedOnJoin, ')');
    }
}
