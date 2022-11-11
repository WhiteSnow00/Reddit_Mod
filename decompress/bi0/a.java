// 
// Decompiled by Procyon v0.6.0
// 

package bi0;

import com.reddit.events.builders.BaseEventBuilder;
import com.reddit.events.nsfw.NsfwEventBuilder;
import com.reddit.events.nsfw.NsfwEventBuilder$Noun;
import com.reddit.events.nsfw.NsfwEventBuilder$Action;
import com.reddit.events.nsfw.NsfwEventBuilder$Source;
import javax.inject.Inject;
import l40.e;

public final class a
{
    public final e a;
    
    @Inject
    public a(final e a) {
        sg2.e.f((Object)a, "eventSender");
        this.a = a;
    }
    
    public static /* synthetic */ void g(final a a, final NsfwEventBuilder$Source nsfwEventBuilder$Source, final NsfwEventBuilder$Action nsfwEventBuilder$Action, final NsfwEventBuilder$Noun nsfwEventBuilder$Noun) {
        a.f(nsfwEventBuilder$Source, nsfwEventBuilder$Action, nsfwEventBuilder$Noun, null, null, null);
    }
    
    public final void a() {
        g(this, NsfwEventBuilder$Source.POPUP, NsfwEventBuilder$Action.CLICK, NsfwEventBuilder$Noun.NSFW_DIALOG);
    }
    
    public final void b() {
        g(this, NsfwEventBuilder$Source.POPUP, NsfwEventBuilder$Action.DISMISS, NsfwEventBuilder$Noun.NSFW_DIALOG);
    }
    
    public final void c(final String s, final String s2, final boolean b) {
        this.f(NsfwEventBuilder$Source.SEARCH, NsfwEventBuilder$Action.CLICK, NsfwEventBuilder$Noun.SEARCH_NSFW_18_SETTING, b, s2, s);
    }
    
    public final void d(final String s, final String s2, final boolean b) {
        this.f(NsfwEventBuilder$Source.SEARCH, NsfwEventBuilder$Action.DISMISS, NsfwEventBuilder$Noun.SEARCH_NSFW_18_SETTING, b, s2, s);
    }
    
    public final void e(final String s, final String s2, final boolean b) {
        this.f(NsfwEventBuilder$Source.SEARCH, NsfwEventBuilder$Action.VIEW, NsfwEventBuilder$Noun.SEARCH_NSFW_18_SETTING, b, s2, s);
    }
    
    public final void f(final NsfwEventBuilder$Source nsfwEventBuilder$Source, final NsfwEventBuilder$Action nsfwEventBuilder$Action, final NsfwEventBuilder$Noun nsfwEventBuilder$Noun, final Boolean b, final String s, final String s2) {
        final NsfwEventBuilder nsfwEventBuilder = new NsfwEventBuilder(this.a);
        sg2.e.f((Object)nsfwEventBuilder$Source, "source");
        ((BaseEventBuilder)nsfwEventBuilder).F(nsfwEventBuilder$Source.getValue());
        sg2.e.f((Object)nsfwEventBuilder$Action, "action");
        ((BaseEventBuilder)nsfwEventBuilder).a(nsfwEventBuilder$Action.getValue());
        sg2.e.f((Object)nsfwEventBuilder$Noun, "noun");
        ((BaseEventBuilder)nsfwEventBuilder).u(nsfwEventBuilder$Noun.getValue());
        nsfwEventBuilder.d0.typeahead_active(b);
        nsfwEventBuilder.e0 = sg2.e.a((Object)b, (Object)Boolean.TRUE);
        nsfwEventBuilder.d0.query(s2);
        nsfwEventBuilder.e0 = (s2 != null);
        if (s != null) {
            ((BaseEventBuilder)nsfwEventBuilder).k(s);
        }
        ((BaseEventBuilder)nsfwEventBuilder).D();
    }
}
